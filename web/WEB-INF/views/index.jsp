<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<form method="get" action="calculator">
    <h1>calculator</h1>
    <table>
        <tr>
            <td><input type="text" name="firstOperand"></td>
            <td><input type="text" name="secondOperand"></td>
        </tr>
        <tr>
            <td><input type="submit" name="operator" value="add(+)">+</td>
            <td><input type="submit" name="operator" value="sub(-)">-</td>
            <td><input type="submit" name="operator" value="multi(*)">*</td>
            <td><input type="submit" name="operator" value="div(/)">/</td>

        </tr>

    </table>
    <h2>${result}</h2>
</form>

</body>
</html>