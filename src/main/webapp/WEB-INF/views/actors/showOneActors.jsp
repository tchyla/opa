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
    <title>Actors Show One</title>
</head>
<body>
<table border="1">
    <thead>
    <th>Nr</th>
    <th>Imię</th>
    <th>Nazwisko</th>
    <th>E-mail</th>
    <th>Telefon</th>
    </thead>
    <tbody>
    <tr>
        <td><c:out value="${actors.id}"/></td>
        <td><c:out value="${actors.name}"/></td>
        <td><c:out value="${actors.surname}"/></td>
        <td><c:out value="${actors.email}"/></td>
        <td><c:out value="${actors.phone}"/></td>
    </tr>
    </tbody>
</table>
</body>
</html>
