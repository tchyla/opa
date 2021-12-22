<%--
  Created by IntelliJ IDEA.
  User: tomek
  Date: 20.12.2021
  Time: 01:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Characters</title>
</head>
<body>
<a href="<c:url value="addCharacters"/>">Dodaj nową rolę</a>
<table border="1">
    <thead>
    <th>Nr</th>
    <th>Rola</th>
    </thead>
    <tbody>
    <c:forEach items="${characters}" var="characters">
        <tr>
            <td><c:out value="${characters.id}"/></td>
            <td><c:out value="${characters.characterName}"/></td>
                <%--
                tu pole z jakiego tytułu
                --%>
            <td>
                <a href="<c:out value="editCharacters/${characters.id}"/>">Edytuj dane roli</a>
                <a href="<c:out value="deleteCharacters/${characters.id}"/>">Usuń dane roli</a>
                <a href="<c:out value="showOneCharacters/${characters.id}"/>">Pokaż dane roli</a>
            </td>
        </tr>
    </c:forEach>
    </tbody>
</table>
<a href="<c:url value="/"/>"Strona główna</a>
</body>
</html>
