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
<c:url var="edit_url" value="/WEB-INF/views/titles/editTitles.jsp"/>
<form:form method="post" modelAttribute="titles" action="${edit_url}">
    <form:hidden path="id"/>
    <form:input path="titleName"/>
    <form:errors path="titleName"/><br/>
    <form:input path="director"/>
    <form:errors path="director"/><br/>
    <form:input path="duration"/>
    <form:errors path="duration"/><br/>
    <form:input path="interacts"/>
    <form:errors path="interacts"/><br/>
    <input type="submit" value="Save">
</form:form>
</body>
</html>
