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
    <title>Titles Show One</title>
</head>
<body>
<table border="1">
    <thead>
    <th>Nr</th>
    <th>Tytuł spektaklu</th>
    <th>Imię i nazwisko reżysera</th>
    <th>Czas trwania spektaklu (w minutach)</th>
    <th>Liczba przerw</th>
    </thead>
    <tbody>
    <tr>
        <td><c:out value="${titles.id}"/></td>
        <td><c:out value="${titles.titleName}"/></td>
        <td><c:out value="${titles.director}"/></td>
        <td><c:out value="${titles.duration}"/></td>
        <td><c:out value="${titles.interacts}"/></td>
    </tr>
    </tbody>
</table>
</body>
</html>
