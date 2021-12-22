<%--
  Created by IntelliJ IDEA.
  User: tomek
  Date: 20.12.2021
  Time: 01:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Shows add</title>
</head>
<body>
<form:form method="post" modelAttribute="shows">
    <label for="dateTime">Data i godzina spektaklu:</label>
    <form:input type="date" path="dateTime"/>
    <form:errors path="dateTime"/><br/>
    <label for="titles">Wybierz tytuł spektaklu:</label>
    <form:select path="titles">
        <form:option value="0" label="--Please Select--"/>
        <form:options itemLabel="titleName" itemValue="id" items="${titles}"/>
    </form:select>
    <form:errors path="titles"/><br/>
    <input type="submit" value="Save">
</form:form>
</body>
</html>
