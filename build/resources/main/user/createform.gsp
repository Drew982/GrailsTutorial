<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>User Form</title>
</head>
<body>
<g:form name="CreateForm" url="[controller: 'user', action: 'admin']">
    <label>Username</label>
    <g:textField name="username" placeholder="Username"/>
    <br>
    <label>Age</label>
    <g:textField name="age" placeholder="Age"/>
    <br>
    <label>Height</label>
    <g:textField name="height" placeholder="Height"/>
    <br>
    <g:actionSubmit value="Submit" action="create"/>
</g:form>
</body>
</html>