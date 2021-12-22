<%--
  Created by IntelliJ IDEA.
  User: tomek
  Date: 19.12.2021
  Time: 13:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Actors add</title>
</head>
<body>
<form:form method="post" modelAttribute="actors">
    <label for="name">Imię</label>
    <form:input path="name"/>
    <form:errors path="name"/><br/>
    <span id="name.errors">Niepoprawne dane. Imię powinno składać się z min. 2 liter.</span>
    <label for="surname">Nazwisko</label>
    <form:input path="surname"/>
    <form:errors path="surname"/><br/>
    <span id="surname.errors">Niepoprawne dane. Nazwisko powinno składać się z min. 2 liter.</span>
    <label for="email">E-mail</label>
    <form:input path="email"/>
    <form:errors path="email"/><br/>
    <span id="email.errors">Niepoprawny format adresu e-mail [przykład poprawnego adresu: example@example.pl] lub taki e-mail istnieje już w bazie.</span>
    <label for="phone">Telefon</label>
    <form:input path="phone"/>
    <form:errors path="phone"/><br/>
    <span id="phone.errors">Niepoprawny format numeru telefonu.</span>
    <input type="submit" value="Save">
</form:form>

</body>
</html>
