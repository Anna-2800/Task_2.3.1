<%--
  Created by IntelliJ IDEA.
  User: boyko_va
  Date: 29.10.2020
  Time: 13:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>USERS</title>
</head>
<body>

<h2>Users</h2>
<table>
    <tr>
        <th>id</th>
        <th>name</th>
        <th>lastname</th>
        <th>age</th>
        <th>programming language</th>
        <th>action</th>
    </tr>
    <c:forEach var="user" items="${usersList}">
        <tr>
        <td>${user.id}</td>
        <td>${user.name}</td>
        <td>${user.lastname}</td>
        <td>${user.age}</td>
        <td>${user.programmingLanguage}</td>
        <td>
        <a href="/edit/${user.id}">edit</a>
        <a href="/delete/${user.id}">delete</a>
        </td>
        </tr>
        </c:forEach>
</table>

<h2>Add</h2>
<c:url value="/add" var="add"/>
<a href="${add}">Add new user</a>
</body>
</html>
