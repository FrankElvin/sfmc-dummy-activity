var connection = new Postmonger.Session();
var payload = {};

$(window).ready(function() {
    connection.trigger('ready');
    connection.trigger('requestTokens');
    connection.trigger('requestEndpoints');
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
