<%--
  Created by IntelliJ IDEA.
  User: tomek
  Date: 20.12.2021
  Time: 01:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Stages Show One</title>
</head>
<body>
<table border="1">
    <thead>
    <th>Nr</th>
    <th>Nazwa sceny</th>
    </thead>
    <tbody>
    <tr>
        <td><c:out value="${stages.id}"/></td>
        <td><c:out value="${stages.stageName}"/></td>
    </tr>
    </tbody>
</table>
<a href="<c:url value="/stages"/>">Lista scen</a>
</body>
</html>
