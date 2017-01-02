<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>myPage</title>
</head>
<body>
%{--<h1>--}%
    %{--This is a body!--}%
    %{--${users} <!--used to access groovy model-->--}%
%{--</h1>--}%

<g:each in="${users*.username}"> <!--"for/each" loop; *. shows username within array -- makes list of item after *.-->
<h1>
    ${it} <!--"it" represents each individual iteration; ".username" shows only username within array-->
</h1>
</g:each>
</body>
</html>