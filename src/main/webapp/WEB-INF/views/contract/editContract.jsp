<%--
  Created by IntelliJ IDEA.
  User: tomek
  Date: 19.12.2021
  Time: 13:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Contract edit</title>
</head>
<body>
<c:url var="edit_url" value="/editContract"/>
<form:form method="post" modelAttribute="contract" action="${edit_url}">
    <form:hidden path="id"/>
    <label for="name">Rodzaj umowy</label>
    <form:input path="name"/>
    <form:errors path="name"/><br/>
    <input type="submit" value="Save">
</form:form>

</body>
</html>
