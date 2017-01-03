<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Admin Services</title>
</head>

<body>

<ul>
    <g:each in="${users}"><!--"for/each" loop; *. shows username within array -- makes list of item after *.-->
        <li>
            ${it.username} <!--"it" represents each individual iteration; ".username" shows only username within array-->
        </li>
    </g:each>
</ul>
</body>
</html>