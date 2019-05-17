<%@ page contentType="text/html;charset=UTF-8"  %>
<html>
<head>
    <title>Authenticate</title>
</head>
<body>
    <h1>Authenticate</h1>
    <form method=post action="j_security_check"> <!-- ${pageContext.request.contextPath}/subfix/nonnon/ouioui -->
        <input type="text" name= "j_username" />
        <input type="password" name= "j_password" />
        <input type="submit" value="Login" />
    </form>

</body>
</html>


