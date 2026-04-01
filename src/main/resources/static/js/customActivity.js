var connection = new Postmonger.Session();
var payload = {};
var schemaFields = [];
var journeyMeta = {};
var mobileNumberBinding = ""; // {{Event.xxx."fieldName"}} expression from journey defaults

// State Tracking
var currentStep = 1;
var selectedChannel = "";
var lastFocusedElement = null; // To know where to insert {{Field}}

// --- POSTMONGER LISTENERS ---

connection.on('requestedSchema', function(data) {
    if (data.schema) schemaFields = data.schema;
    renderFields(schemaFields);
    if (currentStep === 2) validateStep2();
});

connection.on('requestedInteraction', function(interaction) {
    console.log('requestedInteraction full payload:', JSON.stringify(interaction, null, 2));
    journeyMeta.journeyName = interaction.name;
    journeyMeta.journeyVersion = interaction.version;
    journeyMeta.journeyKey = interaction.key;

    var defaults = interaction.defaults;
    if (defaults && defaults.mobileNumber && defaults.mobileNumber.length > 0) {
        mobileNumberBinding = defaults.mobileNumber[0];
    } else {
        mobileNumberBinding = "";
    }

    renderMobilePhoneInfo();
});

connection.on('initActivity', function(data) {
    if (data) payload = data;

    // Parse existing configuration
    var inArgs = [];
    if (payload['arguments'] && payload['arguments'].execute && payload['arguments'].execute.inArguments) {
        inArgs = payload['arguments'].execute.inArguments;
    }
    var config = {};

    // Build config map: each inArgument is { name, type, value }
    $.each(inArgs, function(i, arg) {
        config[arg.name] = arg.value;
    });

    // 1. Restore Channel
    if (config._channel) {
        selectedChannel = config._channel;
        $('#channel-select').val(selectedChannel);
    }

    // 2. Restore Fields (Decoding [[ ]] back to {{ }})
    if (selectedChannel === 'push') {
        if (config._messageTitleAm) $('#msg-title-am').val(config._messageTitleAm);
        if (config._messageTitleEn) $('#msg-title-en').val(config._messageTitleEn);
        if (config._messageTemplateAm) $('#msg-template-am').val(config._messageTemplateAm);
        if (config._messageTemplateEn) $('#msg-template-en').val(config._messageTemplateEn);
    } else {
        if (config._messageTemplate) $('#msg-template').val(config._messageTemplate);
    }
    if (config._viberMessageTemplate) $('#viber-msg-template').val(config._viberMessageTemplate);

    // 3. Restore Images
    if (config._images) {
        // config._images might be a JSON string or array depending on how it was saved.
        // Assuming Array for cleanliness in this example.
        var imgs = Array.isArray(config._images) ? config._images : JSON.parse(config._images || "[]");
        imgs.forEach(url => addImageRow(url));
    }

    // 4. Restore Buttons
    if (config._buttons) {
        var btns = Array.isArray(config._buttons) ? config._buttons : JSON.parse(config._buttons || "[]");
        btns.forEach(btn => addButtonRow(btn));
    }

    // If we have a saved channel, skip step 1 and go directly to step 2.
    if (config._channel) {
        goToStep(2);
    } else {
        validateStep1();
    }
});

// Navigation Handler
connection.on('clickedNext', function() {
    if (currentStep === 1) {
        // Validation
        selectedChannel = $('#channel-select').val();
        if (!selectedChannel) {
            connection.trigger('updateButton', { button: 'next', enabled: false });
            return;
        }

        // Move to Step 2
        goToStep(2);
    } else {
        // We are on Step 2 -> Save and Close
        save();
    }
});

connection.on('clickedBack', function() {
    goToStep(1);
});

// --- FUNCTIONS ---

function buildArgument(key, type, value) {
    var result = {
        "name": key,
        "type": type,
        "value": value
    };
    return result;
}

function goToStep(step) {
    currentStep = step;
    $('.step-container').removeClass('active');
    $('#step' + step).addClass('active');

    if (step === 2) {
        // Disable Done immediately so it cannot be clicked before validateStep2 runs
        connection.trigger('updateButton', { button: 'next', text: 'done', visible: true, enabled: false });
    }

    setTimeout(function() {
        if (step === 1) {
            // UI: Show "Next", Hide "Back"
            connection.trigger('updateButton', { button: 'next', text: 'next', visible: true, enabled: true });
            connection.trigger('updateButton', { button: 'back', visible: false });
        } else {
            // Setup Step 2 UI based on Channel
            setupStep2UI();
            // UI: Show "Done", Show "Back"
            connection.trigger('updateButton', { button: 'back', visible: true });
        }
    }, 100); // 100ms delay gives SFMC time to finish its "loading" animation

    connection.trigger('ready');
}

function validateStep1() {
    var val = $('#channel-select').val();
    connection.trigger('updateButton', { button: 'next', text: 'next', visible: true, enabled: !!val });
    connection.trigger('updateButton', { button: 'back', visible: false });
}

function getTemplateError(text) {
    // Structural check: strip valid [[word]] tokens, then no [[ or ]] should remain.
    var cleaned = text.replace(/\[\[\w+\]\]/g, '');
    if (/\[\[|\]\]/.test(cleaned)) return 'Message template invalid: Unbalanced brackets';

    // Skip field-name validation until the schema has loaded to avoid false errors on reopen
    if (schemaFields.length > 0) {
        var validNames = [];
        $.each(schemaFields, function(i, field) {
            var name = field.name || field.key;
            if (!name.startsWith('_') && !name.startsWith('Interaction.')) validNames.push(name);
        });

        var re = /\[\[(\w+)\]\]/g, match, unknown = [];
        while ((match = re.exec(text)) !== null) {
            if (validNames.indexOf(match[1]) === -1) unknown.push(match[1]);
        }

        if (unknown.length === 1) {
            return 'Message template invalid: Field ' + unknown[0] + ' not found in input data fields';
        } else if (unknown.length > 1) {
            return 'Message template invalid: Fields ' + unknown.join(', ') + ' not found in input data fields';
        }
    }

    return null;
}

function validateTemplate(textareaId, errorId) {
    var text = $(textareaId).val().trim();
    var error = text ? getTemplateError(text) : null;
    var $err = $(errorId);
    if (error) {
        $err.text(error).removeClass('hidden');
    } else {
        $err.addClass('hidden');
    }
    return text !== '' && !error;
}

function validateStep2() {
    var needsPhone = (selectedChannel === 'sms' || selectedChannel === 'viber_sms');
    var phoneOk = !needsPhone || !!mobileNumberBinding;

    var templateOk = selectedChannel === 'push' || validateTemplate('#msg-template', '#msg-template-error');

    var viberTemplateOk = selectedChannel !== 'viber_sms' || validateTemplate('#viber-msg-template', '#viber-msg-template-error');

    var pushAmTitleOk = selectedChannel !== 'push' || validateTemplate('#msg-title-am', '#msg-title-am-error');
    var pushAmOk = selectedChannel !== 'push' || validateTemplate('#msg-template-am', '#msg-template-am-error');
    var pushEnTitleOk = selectedChannel !== 'push' || validateTemplate('#msg-title-en', '#msg-title-en-error');
    var pushEnOk = selectedChannel !== 'push' || validateTemplate('#msg-template-en', '#msg-template-en-error');

    connection.trigger('updateButton', { button: 'next', text: 'done', visible: true, enabled: phoneOk && templateOk && viberTemplateOk && pushAmTitleOk && pushAmOk && pushEnTitleOk && pushEnOk });
}

function setupStep2UI() {
    if (selectedChannel === 'push') {
        $('#mobile-phone-info').addClass('hidden');
    } else {
        renderMobilePhoneInfo();
    }

    // Reset Visibility
    $('#group-push-am-title, #group-push-en-title, #group-viber-template, #group-images, #group-buttons, #group-push-am-template, #group-push-en-template').addClass('hidden');
    $('#group-template').removeClass('hidden');
    $('#msg-template-label').html('<abbr class="slds-required" title="required">* </abbr>Message template');

    if (selectedChannel === 'sms') {
        // Just Template
    }
    else if (selectedChannel === 'viber_sms') {
        $('#msg-template-label').html('<abbr class="slds-required" title="required">* </abbr>SMS message template');
        $('#group-viber-template').removeClass('hidden');
        $('#group-images').removeClass('hidden');
        $('#group-buttons').removeClass('hidden');
    }
    else if (selectedChannel === 'push') {
        $('#group-template').addClass('hidden');
        $('#group-push-am-title').removeClass('hidden');
        $('#group-push-am-template').removeClass('hidden');
        $('#group-push-en-title').removeClass('hidden');
        $('#group-push-en-template').removeClass('hidden');
        $('#group-images').removeClass('hidden');
        $('#group-buttons').removeClass('hidden');
    }

    validateStep2();
}

// --- DYNAMIC WIDGETS ---

function addImageRow(value) {
    var $container = $('#image-list-container');
    var id = Date.now();

    var html = `
        <div class="dynamic-item" id="img-row-${id}">
            <div class="remove-btn" onclick="$('#img-row-${id}').remove()">Remove</div>
            <label class="slds-form-element__label">Image URL</label>
            <input type="text" class="slds-input img-input" value="${value}" placeholder="https://..." oninput="updatePreview(this)">
            <img src="${value}" class="img-preview ${value ? '' : 'hidden'}">
        </div>
    `;
    $container.append(html);
}

window.updatePreview = function(input) {
    var url = $(input).val();
    var $img = $(input).siblings('.img-preview');
    if(url) {
        $img.attr('src', url).removeClass('hidden');
    } else {
        $img.addClass('hidden');
    }
};

function addButtonRow(data) {
    var $container = $('#button-list-container');
    if ($container.children().length >= 2) {
        alert("Maximum 2 buttons allowed.");
        return;
    }

    var id = Date.now();
    var title = data.title || "";
    var url = data.url || "";
    var tracked = data.track ? "checked" : "";

    // Note: Title and URL inputs have class 'inject-target' so we can insert variables into them
    var html = `
        <div class="dynamic-item button-row" id="btn-row-${id}">
            <div class="remove-btn" onclick="$('#btn-row-${id}').remove()">Remove</div>

            <div class="slds-form-element">
                <label class="slds-form-element__label">Button Title</label>
                <input type="text" class="slds-input btn-title inject-target" value="${title}">
            </div>

            <div class="slds-form-element slds-m-top_x-small">
                <label class="slds-form-element__label">Button URL</label>
                <input type="text" class="slds-input btn-url inject-target" value="${url}">
            </div>

            <div class="slds-form-element slds-m-top_x-small">
                <label class="slds-checkbox">
                    <input type="checkbox" class="btn-track" ${tracked}>
                    <span class="slds-checkbox__label">
                        <span class="slds-checkbox_faux"></span>
                        <span class="slds-form-element__label">Track Clicks</span>
                    </span>
                </label>
            </div>
        </div>
    `;
    $container.append(html);
}

// --- FIELD INJECTION ---

function renderMobilePhoneInfo() {
    var $box = $('#mobile-phone-info');
    if (!mobileNumberBinding) {
        $box.removeClass('hidden mobile-ok').addClass('mobile-missing');
        $box.html('<strong>Mobile Phone field:</strong> not configured in Journey settings');
    } else {
        // Extract field name from e.g. {{Event.DEAudience-xxx."test_phone_num"}}
        var match = /\."([^"]+)"\}\}$/.exec(mobileNumberBinding);
        var fieldName = match ? match[1] : mobileNumberBinding;
        $box.removeClass('hidden mobile-missing').addClass('mobile-ok');
        $box.html('<strong>Mobile Phone field:</strong> ' + fieldName);
    }
}

function renderFields(fields) {
    var $list = $('#field-list');
    $list.empty();
    if (!fields.length) $list.html("No fields found.");

    $.each(fields, function(i, field) {
        var fieldName = field.name || field.key;
        if (fieldName.startsWith('_') || fieldName.startsWith('Interaction.')) return;

        var $chip = $('<div class="field-chip"></div>').text(fieldName);
        $chip.click(function() {
            insertAtCursor(fieldName);
        });
        $list.append($chip);
    });
}

function insertAtCursor(text) {
    if (!lastFocusedElement) {
        // Default to message template if nothing clicked yet
        lastFocusedElement = $('#msg-template');
    }

    var $input = lastFocusedElement;
    var currentVal = $input.val();
    var start = $input[0].selectionStart || currentVal.length;
    var end = $input[0].selectionEnd || currentVal.length;

    var txtToAdd = "[[" + text + "]]";
    $input.val(currentVal.substring(0, start) + txtToAdd + currentVal.substring(end));
    $input.focus();
}

// --- SAVING ---

function save() {
    var inArgs = [];

    console.log("Saving data. Payload before: ", JSON.stringify(payload, null, 2));

    // 1. Channel
    inArgs.push(buildArgument("_channel", "plain", selectedChannel));

    // 2. Common Fields
    if (selectedChannel === 'push') {
        inArgs.push(buildArgument("_messageTemplateAm", "plain", $('#msg-template-am').val()));
        inArgs.push(buildArgument("_messageTemplateEn", "plain", $('#msg-template-en').val()));
    } else {
        inArgs.push(buildArgument("_messageTemplate", "plain", $('#msg-template').val()));
    }

    // 3. Conditional Fields
    if (selectedChannel === 'push') {
        inArgs.push(buildArgument("_messageTitleAm", "plain", $('#msg-title-am').val()));
        inArgs.push(buildArgument("_messageTitleEn", "plain", $('#msg-title-en').val()));
    }

    if (selectedChannel === 'viber_sms') {
        var rawViberTemplate = $('#viber-msg-template').val();
        inArgs.push(buildArgument("_viberMessageTemplate", "plain", rawViberTemplate));
    }

    if (selectedChannel === 'viber_sms' || selectedChannel === 'push') {
        // Collect Images
        var images = [];
        $('.img-input').each(function() {
            var val = $(this).val();
            if(val) images.push(val);
        });
        inArgs.push(buildArgument("_images", "images", images)); // Backend will receive List<String>

        // Collect Buttons
        var buttons = [];
        $('.button-row').each(function() {
            var $row = $(this);
            buttons.push({
                title: $row.find('.btn-title').val(),
                url: $row.find('.btn-url').val(),
                track: $row.find('.btn-track').is(':checked')
            });
        });
        inArgs.push(buildArgument("_buttons", "buttons", buttons));
        //inArgs.push({ "buttons": buttons }); // Backend will receive List<Map>
    }

    // 4. Schema Mapping (Data Binding)
    // We add entry data schema fields to inArguments so SFMC resolves them if used in {{ }}.
    // Skip _-prefixed fields — those are output parameters from upstream activities and must
    // not be forwarded, otherwise SFMC rejects the activity with an invalid argument error.
    $.each(schemaFields, function(i, field) {
        var name = field.name || field.key;
        if (name.startsWith('_') || name.startsWith('Interaction.')) return;
        inArgs.push(buildArgument(name, "plain", "{{" + field.key + "}}"));
    });

    // 5. Phone number from journey defaults
    if (mobileNumberBinding) {
        inArgs.push(buildArgument("_phoneNumber", "plain", mobileNumberBinding));
    }

    // 6. Metadata
    if (journeyMeta.journeyName) inArgs.push(buildArgument("_journeyName", "plain", journeyMeta.journeyName));
    if (journeyMeta.journeyVersion) inArgs.push(buildArgument("_journeyVersion", "plain", journeyMeta.journeyVersion));
    inArgs.push(buildArgument("_activityName", "plain", payload.name || ""));

    // UPDATE PAYLOAD
    if (!payload['arguments']) payload['arguments'] = {};
    if (!payload['arguments'].execute) payload['arguments'].execute = {};

    payload['arguments'].execute.inArguments = inArgs;
    payload['metaData'].isConfigured = true;

    console.log("Saving data. Payload after: ", JSON.stringify(payload, null, 2));

    connection.trigger('updateActivity', payload);
}

// --- INITIALIZATION ---

$(window).ready(function() {
    connection.trigger('ready');
    connection.trigger('requestTokens');
    connection.trigger('requestEndpoints');
    connection.trigger('requestSchema');
    connection.trigger('requestInteraction');

    // Default UI state
    $('#channel-select').change(validateStep1);

    // Track focus for variable injection
    $(document).on('focus', '.inject-target', function() {
        lastFocusedElement = $(this);
    });

    // Live validation for required fields
    $('#msg-template, #viber-msg-template, #msg-title-am, #msg-title-en, #msg-template-am, #msg-template-en').on('input', function() {
        if (currentStep === 2) validateStep2();
    });

    // Add Image Logic
    $('#btn-add-image').click(function() { addImageRow(""); });

    // Add Button Logic
    $('#btn-add-button').click(function() { addButtonRow({}); });
});
