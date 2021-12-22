<%--
  Created by IntelliJ IDEA.
  User: tomek
  Date: 20.12.2021
  Time: 01:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Titles add</title>
</head>
<body>
<form:form method="post" modelAttribute="titles">
    <label for="titleName">Tytuł spektaklu</label>
    <form:input path="titleName"/>
    <form:errors path="titleName"/><br/>
    <label for="director">Imię i nazwisko reżysera</label>
    <form:input path="director"/>
    <form:errors path="director"/><br/>
    <label for="duration">Czas trwania spektaklu (w minutach)</label>
    <form:input path="duration"/>
    <form:errors path="duration"/><br/>
    <label for="interacts">Liczba przerw</label>
    <form:input path="interacts"/>
    <form:errors path="interacts"/><br/>
    <input type="submit" value="Save">
</form:form>
</body>
</html>
