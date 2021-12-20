<%--
  Created by IntelliJ IDEA.
  User: tomek
  Date: 18.12.2021
  Time: 19:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Actors</title>
</head>
<body>
<a href="<c:url value="addActors"/>">Dodaj nowego aktora</a>
<table border="1">
    <thead>
    <th>id</th>
    <th>name</th>
    <th>surname</th>
    <th>email</th>
    <th>phone</th>
    <th>full time actor</th>
    </thead>
    <tbody>
    <c:forEach items="${actors}" var="actors">
        <tr>
        <td><c:out value="${actors.id}"/></td>
        <td><c:out value="${actors.name}"/></td>
        <td><c:out value="${actors.surname}"/></td>
        <td><c:out value="${actors.email}"/></td>
        <td><c:out value="${actors.phone}"/></td>
        <td><c:out value="${actors.fullTimeActor}"/></td>
            <td>
                <a href="<c:out value="editActors/${actors.id}"/>">Edytuj dane aktora</a>
                <a href="<c:out value="deleteActors/${actors.id}"/>">Usuń dane aktora</a>
                <a href="<c:out value="showOneActors/${actors.id}"/>">Pokaż dane aktora</a>
            </td>
        </tr>
    </c:forEach>
    </tbody>
</table>

</body>
</html>
