<%--
  Created by IntelliJ IDEA.
  User: tomek
  Date: 20.12.2021
  Time: 01:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Characters Show One</title>
</head>
<body>
<table border="1">
    <thead>
    <th>Nr</th>
    <th>Rola</th>
    </thead>
    <tbody>
    <tr>
        <td><c:out value="${characters.id}"/></td>
        <td><c:out value="${characters.characterName}"/></td>
        <%--
        tu pole z jakiego tytułu
        --%>
    </tr>
    </tbody>
</table>
<a href="<c:url value="/characters"/>">Lista ról</a>
</body>
</html>
