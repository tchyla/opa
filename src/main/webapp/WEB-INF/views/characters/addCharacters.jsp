<%--
  Created by IntelliJ IDEA.
  User: tomek
  Date: 20.12.2021
  Time: 01:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Characters add</title>
</head>
<body>
<form:form method="post" modelAttribute="characters">
    <form:input path="characterName"/>
    <form:errors path="characterName"/><br/>
    <%--
    tu pole wyboru tytułu
    --%>
    <input type="submit" value="Save">
</form:form>
</body>
</html>
