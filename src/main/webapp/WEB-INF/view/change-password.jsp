<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Change Password</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<link rel="stylesheet" href="urlconfig/css/change-password2.css">
</head>

<body>
<a href="homeAdmin"><h4 id="back">&#60Back</h4></a>
<div id="form">
<form:form action="changePasswordCheck" method="post" modelAttribute="cp">
<h1 id="welcome">Change Password</h1>
<form:password path="oldPassword" placeholder="Old Password"/><br>
<form:errors path="oldPassword" cssClass="error"></form:errors><br>
<form:password path="newPassword" placeholder="New Password"/><br>
<form:errors path="newPassword" cssClass="error"></form:errors><br>
<input type="submit" class="btn btn-success" id="cpbutton" value="Change Password">
</form:form>
</div>
</body>
</html>