<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Update User Form</title>
</head>
<body>
<g:form name="UpdateForm" url="[controller: 'user', action: 'update']">
    <label>ID</label>
    <g:textField name="id" value="${params.id}" readonly="true"/>
    <br>
    <label>Age</label>
    <g:textField name="age" placeholder="Age"/>
    <br>
    <g:actionSubmit value="Submit" action="update"/>
</g:form>
</body>
</html>