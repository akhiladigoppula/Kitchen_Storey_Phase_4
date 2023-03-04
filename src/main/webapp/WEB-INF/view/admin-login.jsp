<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Admin Login</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
<link rel="stylesheet" href="urlconfig/css/admin-login1.css">
</head>
<body>
<a href="/KitchenStorey"><h5 id="back">&#60Back</h5></a>
<div>
<h2>Admin Login</h2><br>

<form:form action="adminHomePage" method="post" modelAttribute="admin">
<form:input path="name" placeholder="Admin Name"/><br><br>
<form:password path="password" placeholder="Password"/><br><br>
<form:errors path="check" cssClass="error"></form:errors>
<input type="submit" value="Log In" class="btn btn-success" id="submit">
</form:form>
</div>
</body>
</html>