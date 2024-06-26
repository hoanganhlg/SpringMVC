<%--
  Created by IntelliJ IDEA.
  User: 63200346
  Date: 6/25/2024
  Time: 3:12 PM
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
    <title>Register page</title>
    <link rel="stylesheet" type="text/css" href="/Mini-project-springmvc/getResource/css/listEmployee.css">
</head>
<body>
<fieldset>
    <legend>Employee Management</legend>
    <div class="filter">
        <label for="team">Team</label>
        <select name="team" id="team">
            <option value="A">A</option>
            <option value="B">B</option>
            <option value="-">Other</option>
        </select>
        <label for="project">Project</label>
        <select name="project" id="project">
            <option value="A">A</option>
            <option value="B">B</option>
            <option value="-">Other</option>
        </select>
        <label for="status">Status</label>
        <select name="status" id="status">
            <option value="A">A</option>
            <option value="B">B</option>
            <option value="-">Other</option>
        </select>
        <label for="fromdate">Start date</label>
        <input type="date" id="fromdate" name="fromdate" required>
        <input type="date" id="todate" name="todate" required>
    </div>
    <div class="search">
        <input type="search" id="searchBar" name="searchBar" required>
        <button>Search</button>
    </div>
</fieldset>
<div class="crudButtons">
    <label>Total</label>
    <button>New</button>
    <button>Delete</button>
</div>
<div>
    <table>
        <thead>
        <tr>
            <th></th>
            <th>STT</th>
            <th>EmpID</th>
            <th>Name</th>
            <th>Gender</th>
            <th>Birthday</th>
            <th>Phone</th>
            <th>Email</th>
            <th>Address</th>
            <th>Team</th>
            <th>Project</th>
            <th>Project Leader</th>
            <th>Start date</th>
            <th>Status</th>
            <th>Action</th>
        </tr>
        </thead>
    </table>
</div>
<script type="text/javascript" src="/Mini-project-springmvc/getResource/js/listEmployee.js" ></script>
</body>
</html>
