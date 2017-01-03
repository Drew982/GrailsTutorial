<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>myPage</title>
    <style>
        li:nth-child(2n) {
            color: red;
        }
        li:nth-child(odd) {
            color: blue;
        }
    </style>
</head>

<body>
%{--<h1>--}%
%{--This is a body!--}%
%{--${users} <!--used to access groovy model-->--}%
%{--</h1>--}%
<h1>Usernames</h1>
<ul>
<g:each in="${usernames}"><!--"for/each" loop; *. shows username within array -- makes list of item after *.-->
    <li>
        ${it} <!--"it" represents each individual iteration; ".username" shows only username within array-->
    </li>
</g:each>
</ul>
</body>
</html>