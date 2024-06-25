<%--
  Created by IntelliJ IDEA.
  User: 63200346
  Date: 6/25/2024
  Time: 8:35 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="s"%>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Login page</title>
<%--    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/login.css" type="text/css">--%>
<%--    <link  href="<c:url value="/css/login.css"/>" rel="stylesheet" type="text/css">--%>
    <link rel="stylesheet" type="text/css" href="/Mini-project-springmvc/getResource/css/login.css">
</head>
<body>
<div class="login-container">
    <form action="/checkLogin.html" method="post">
        <fieldset>
            <legend>Login</legend>
            <div class="login-info">
                <label for="username">Username</label>
                <input type="text" id="username" name="username" required>
                <label for="password">Password</label>
                <input type="password" id="password" name="password" required>
            </div>
            <button type="submit" >LOG IN
            </button>
            <p>Not yet registered? <a href="#">Sign up</a></p>
        </fieldset>
    </form>
</div>
<script type="text/javascript" src="/Mini-project-springmvc/getResource/js/login.js" ></script>
</body>
</html>
