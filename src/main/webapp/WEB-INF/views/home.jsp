<%--
  Created by IntelliJ IDEA.
  User: tomek
  Date: 22.12.2021
  Time: 10:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Strona główna</title>

</head>
<body>
<p><a href="<c:url value="/shows"/>">Lista spektakli</a></p>
<p><a href="<c:url value="/actors"/>">Lista aktorów</a></p>
<p><a href="<c:url value="/titles"/>">Lista tytułów</a></p>
<p><a href="<c:url value="/characters"/>">Lista ról</a></p>
<p><a href="<c:url value="/stages"/>">Lista scen</a></p>
<p><a href="<c:url value="/contract"/>">Lista rodzajów umów</a></p>
<p><a href="<c:url value="/users"/>">Lista użytkowników</a></p>
</body>
</html>
