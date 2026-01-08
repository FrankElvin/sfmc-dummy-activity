var connection = new Postmonger.Session();
var payload = {};

const dataExtensionFound = '#data-extension-schema-found';
const dataExtensionFieldList = '#data-extension-field-list';

$(window).ready(function() {
    connection.trigger('ready');
    connection.trigger('requestTokens');
    connection.trigger('requestEndpoints');
});

function extractFieldName(field) {
    let index = field.key.lastIndexOf('.');
    return field.key.substring(index + 1);
}

connection.on('requestedSchema', function(data) {
    schema = data['schema'];

    let schemaPresent = schema !== undefined && schema.length > 0;
    $(dataExtensionFound).toggle(schemaPresent);
    if (!schemaPresent) {
        return;
    }

    for (let i in schema) {
        let field = schema[i];
        let fieldName = extractFieldName(field);
        $(dataExtensionFieldList).append('<li>%' + fieldName + '%</li>');
    }
});

connection.on('initActivity', function(data) {
    if (data) {
        payload = data;
    }

    var inArguments = (payload['arguments'] && payload['arguments'].execute && payload['arguments'].execute.inArguments)
                      ? payload['arguments'].execute.inArguments
                      : [];

    // Pre-fill input if editing existing activity
    $.each(inArguments, function(index, arg) {
        if (arg.myStringParam) {
            $('#custom-param').val(arg.myStringParam);
        }
    });

    connection.trigger('updateButton', {
        button: 'next',
        text: 'done',
        visible: true
    });
});

connection.on('clickedNext', function() {
    var value = $('#custom-param').val();

    // Prepare payload for the backend
    payload['arguments'].execute.inArguments = [
        { "myStringParam": value },
        { "emailAddress": "{{Contact.Attribute.EmailAddress}}" }
    ];

    payload['metaData'].isConfigured = true;

    connection.trigger('updateActivity', payload);
});
