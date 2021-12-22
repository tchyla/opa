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
    <title>Titles edit</title>
</head>
<body>
<c:url var="edit_url" value="/editTitles"/>
<form:form method="post" modelAttribute="titles" action="${edit_url}">
    <form:hidden path="id"/>
    <label for="titleName">Tytuł spektaklu</label>
    <form:input path="titleName"/>
    <form:errors path="titleName"/><br/>
    <span id="titleName.errors">Niepoprawne dane. Nazwa roli powinna składać się z min. 2 liter.</span>
    <label for="director">Imię i nazwisko reżysera</label>
    <form:input path="director"/>
    <form:errors path="director"/><br/>
    <span id="director.errors">Niepoprawne dane. Imię i nazwisko reżysera powinno składać się z min. 2 liter.</span>
    <label for="duration">Czas trwania spektaklu (w minutach)</label>
    <form:input path="duration"/>
    <form:errors path="duration"/><br/>
    <span id="duration.errors">Niepoprawne dane. Minimalny czas trwania musi być większy niż 1.</span>
    <label for="interacts">Liczba przerw</label>
    <form:input path="interacts"/>
    <form:errors path="interacts"/><br/>
    <input type="submit" value="Save">
</form:form>
</body>
</html>
