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
    <title>Users</title>
</head>
<body>
<a href="<c:url value="/WEB-INF/views/users/addUsers.jsp"/>">"Dodaj nowego użytkownika</a>
<table border="1">
    <thead>
    <th>id</th>
    <th>name</th>
    <th>surname</th>
    <th>email</th>
    <th>phone</th>
    </thead>
    <tbody>
    <c:forEach items="${users}" var="users">
        <tr>
            <td><c:out value="${users.id}"/></td>
            <td><c:out value="${users.name}"/></td>
            <td><c:out value="${users.surname}"/></td>
            <td><c:out value="${users.email}"/></td>
            <td><c:out value="${users.phone}"/></td>
            <td>
                <a href="<c:out value="/users/editUsers/${users.id}"/>">Edytuj dane użytkownika</a>
                <a href="<c:out value="/users/deleteUsers/${users.id}"/>">Usuń dane użytkownika</a>
                <a href="<c:out value="/users/showOneUsers/${users.id}"/>">Pokaż dane użytkownika</a>
            </td>
        </tr>
    </c:forEach>
    </tbody>
</table>

</body>
</html>
