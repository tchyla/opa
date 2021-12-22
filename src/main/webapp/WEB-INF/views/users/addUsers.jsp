<%--
  Created by IntelliJ IDEA.
  User: tomek
  Date: 19.12.2021
  Time: 13:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Users add</title>
</head>
<body>
<form:form method="post" modelAttribute="users">
    <label for="name">Imię</label>
    <form:input path="name"/>
    <form:errors path="name"/><br/>
    <label for="surname">Nazwisko</label>
    <form:input path="surname"/>
    <form:errors path="surname"/><br/>
    <label for="email">E-mail</label>
    <form:input path="email"/>
    <form:errors path="email"/><br/>
    <label for="phone">Telefon</label>
    <form:input path="phone"/>
    <form:errors path="phone"/><br/>
    <input type="submit" value="Save">
</form:form>

</body>
</html>
