<%--
  Created by IntelliJ IDEA.
  User: tomek
  Date: 20.12.2021
  Time: 01:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Stages edit</title>
</head>
<body>
<c:url var="edit_url" value="/WEB-INF/views/stages/editStages.jsp"/>
<form:form method="post" modelAttribute="stages" action="${edit_url}">
    <form:hidden path="id"/>
    <form:input path="stageName"/>
    <form:errors path="stageName"/><br/>
    <input type="submit" value="Save">
</form:form>
</body>
</html>
