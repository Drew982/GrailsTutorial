<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Admin Services</title>
    <style>
        table {
            border: 3px solid black;
            border-collapse: collapse;
        }

        td {
            border: 2px solid black;
        }

        tr:nth-child(odd){
            background-color: greenyellow;
        }

        tr:nth-child(even){
            background-color: coral;
        }

        .button {
            color: white;

            font-weight: bold;

            height: 50px;
            width: 75px;
        }

        .update {
            background-color: green;
        }

        .delete {
            background-color: red;
        }
    </style>
</head>

<body>

%{--<ul>--}%
    %{--<g:each in="${users}"><!--"for/each" loop; *. shows username within array -- makes list of item after *.-->--}%
        %{--<li>--}%
            %{--${it.username} <!--"it" represents each individual iteration; ".username" shows only username within array-->--}%
        %{--</li>--}%
    %{--</g:each>--}%
%{--</ul>--}%

<table>
    <tr>
        <th>Action</th>
        <th>ID</th>
        <th>Username</th>
        <th>Age</th>
        <th>Height</th>
    </tr>
    <g:each in="${users}">
        <tr>
            <td>
                <button class="update button">Update</button>
                <button class="delete button">Delete</button>
            </td>
            <td>
                ${it.id}
            </td>
            <td>
                ${it.username}
            </td>
            <td>
                ${it.age}
            </td>
            <td>
                ${it.height}
            </td>
        </tr>
    </g:each>
</table>
</body>
</html>