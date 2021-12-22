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
    <title>Stages</title>
</head>
<body>
<a href="<c:url value="addStages"/>">Dodaj nową scenę</a>
<table border="1">
    <thead>
    <th>Nr</th>
    <th>Nazwa sceny</th>
    </thead>
    <tbody>
    <c:forEach items="${stages}" var="stages">
        <tr>
            <td><c:out value="${stages.id}"/></td>
            <td><c:out value="${stages.stageName}"/></td>
            <td>
                <a href="<c:out value="editStages/${stages.id}"/>">Edytuj dane sceny</a>
                <a href="<c:out value="deleteStages/${stages.id}"/>">Usuń dane sceny</a>
                <a href="<c:out value="showOneStages/${stages.id}"/>">Pokaż dane sceny</a>
            </td>
        </tr>
    </c:forEach>
    </tbody>
</table>
<a href="<c:url value="/"/>">Strona główna</a>
</body>
</html>
