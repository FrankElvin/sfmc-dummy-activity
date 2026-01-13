var connection = new Postmonger.Session();
var payload = {};
var schemaFields = [];
var eventDefinitionKey = '';

$(window).ready(function() {
    connection.trigger('ready');
    connection.trigger('requestTokens');
    connection.trigger('requestEndpoints');

    // to request schema entry source
    connection.trigger('requestSchema')
});

// Helper: Render fields to UI
function renderFields(fields) {
    var $list = $('#field-list');
    $list.empty();

    if (fields.length === 0) {
        $list.html("No fields found.");
        return;
    }

    // Attempt to find the Event Key (e.g. "DEAudience-...")
    // It is usually hidden inside the field key structure like "EventKey.FieldName"
    // We will extract it cleanly during save, but here we just show names.
    $.each(fields, function(i, field) {
        // field.key usually looks like "EventKey.FieldName" or just "FieldName"
        // field.name is the clean name.
        var fieldName = field.name || field.key;

        // Exclude internal system fields if you want (optional)
        if(fieldName.startsWith("_")) return;

        var $chip = $('<div class="field-chip"></div>').text(fieldName);

        $chip.click(function() {
            insertAtCursor(fieldName);
        });

        $list.append($chip);
    });
}

// Helper: Insert text into textarea
function insertAtCursor(text) {
    var $txt = $("#message-template");
    var caretPos = $txt[0].selectionStart;
    var textAreaTxt = $txt.val();
    var txtToAdd = "[[" + text + "]]";

    $txt.val(textAreaTxt.substring(0, caretPos) + txtToAdd + textAreaTxt.substring(caretPos) );
    $txt.focus();
}


connection.on('requestedSchema', function(data) {
    console.log('schema requested');
    console.log(data);

    if (data.error) {
        console.error("Schema Error", data.error);
        $('#field-list').html('<p style="color:red">Could not load entry source.</p>');
        return;
    }

    // Logic to extract fields
    var fields = [];
    if (data.schema) {
        fields = data.schema;
    }

    schemaFields = fields; // Save for later use in 'save()'
    renderFields(fields);
});

connection.on('initActivity', function(data) {
    if (data) {
        payload = data;
    }

    // Retrieve previously saved template
    var inArgs = payload['arguments'].execute.inArguments;
    var savedTemplate = "";

    // Find the 'template' argument we saved previously
    $.each(inArgs, function(index, arg) {
        if (arg.messageTemplate) {
            savedTemplate = arg.messageTemplate;
        }
    });

    $('#message-template').val(savedTemplate);

    connection.trigger('updateButton', {
        button: 'next',
        text: 'done',
        visible: true
    });
});

connection.on('clickedNext', function() {
    var templateText = $('#message-template').val();

    // We will construct the inArguments list.
    // Requirement: "All Data Extension columns should be added as input parameters"

    var dynamicInArguments = [];

    // 1. Add the raw template string
    dynamicInArguments.push({ "messageTemplate": templateText });

    // 2. Add every field found in the schema
    $.each(schemaFields, function(i, field) {
        var fieldName = field.name;

        // Construct the Data Binding Key
        // If the schema key is full (e.g. "Event.DEKey.Email"), use it.
        // If it's just "Email", we need the root key.
        // Usually, `field.key` provided by Postmonger IS the binding key (e.g., "Event:DEKey.EmailAddress")

        // HOWEVER, standard syntax is {{Event.key.field}}
        // Postmonger schema usually returns `key` in a format that works directly if wrapped in {{}}.

        var value = "{{" + field.key + "}}";

        var obj = {};
        obj[fieldName] = value;
        dynamicInArguments.push(obj);
    });

    // Update Payload
    payload['arguments'].execute.inArguments = dynamicInArguments;

    payload['metaData'].isConfigured = true;

    connection.trigger('updateActivity', payload);
});
