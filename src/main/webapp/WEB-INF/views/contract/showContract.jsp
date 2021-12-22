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
    <title>Contracts</title>
</head>
<body>
<a href="<c:url value="addContract"/>">Dodaj nowy rodzaj umowy</a>
<table border="1">
    <thead>
    <th>Nr</th>
    <th>Rodzaj umowy</th>
    </thead>
    <tbody>
    <c:forEach items="${contract}" var="contract">
        <tr>
            <td><c:out value="${contract.id}"/></td>
            <td><c:out value="${contract.name}"/></td>
            <td>
                <a href="<c:out value="editContract/${contract.id}"/>">Edytuj rodzaj umowy</a>
                <a href="<c:out value="deleteContract/${contract.id}"/>">Usuń rodzaj umowy</a>
                <a href="<c:out value="showOneContract/${contract.id}"/>">Pokaż rodzaj umowy</a>
            </td>
        </tr>
    </c:forEach>
    </tbody>
</table>

</body>
</html>
