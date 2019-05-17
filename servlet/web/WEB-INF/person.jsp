<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<fmt:setLocale value="${sessionScope.locale}" />
<fmt:setBundle basename="ch.hesge.person" var="msg" />

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title><fmt:message key="person.titre" bundle="${msg}" /></title>
</head>
<body>
<h1><fmt:message key="person.titre" bundle="${msg}" /></h1>
<form>
    <label for="firstName"><fmt:message key="person.firstname.label" bundle="${msg}" /></label>
    <input type="text" id="firstName" name="firstName"/>
    <label for="lastName"><fmt:message key="person.lastname.label" bundle="${msg}" /></label>
    <input type="text" id="lastName" name="lastName">
    <input type="submit" value="<fmt:message key="person.submit.label" bundle="${msg}" />">
</form>
</body>
</html>