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
    <title>Titles</title>
</head>
<body>
<a href="<c:url value="/WEB-INF/views/titles/addTitles.jsp"/>">"Dodaj nowy tytuł</a>
<table border="1">
    <thead>
    <th>id</th>
    <th>titleName</th>
    <th>director</th>
    <th>duration</th>
    <th>interacts</th>
    </thead>
    <tbody>
    <c:forEach items="${titles}" var="titles">
        <tr>
            <td><c:out value="${titles.id}"/></td>
            <td><c:out value="${titles.titleName}"/></td>
            <td><c:out value="${titles.director}"/></td>
            <td><c:out value="${titles.duration}"/></td>
            <td><c:out value="${titles.interacts}"/></td>
            <td>
                <a href="<c:out value="/titles/editTitles/${titles.id}"/>">Edytuj dane aktora</a>
                <a href="<c:out value="/titles/deleteTitles/${titles.id}"/>">Usuń dane aktora</a>
                <a href="<c:out value="/titles/showOneTitles/${titles.id}"/>">Pokaż dane aktora</a>
            </td>
        </tr>
    </c:forEach>
    </tbody>
</table>

</body>
</html>
