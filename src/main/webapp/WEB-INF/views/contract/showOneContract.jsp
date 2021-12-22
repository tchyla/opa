<%--
  Created by IntelliJ IDEA.
  User: tomek
  Date: 19.12.2021
  Time: 14:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Contract Show One</title>
</head>
<body>
<table border="1">
    <thead>
    <th>Nr</th>
    <th>Rodzaj umowy</th>
    </thead>
    <tbody>
    <tr>
        <td><c:out value="${contract.id}"/></td>
        <td><c:out value="${contract.name}"/></td>
    </tr>
    </tbody>
</table>
</body>
</html>
