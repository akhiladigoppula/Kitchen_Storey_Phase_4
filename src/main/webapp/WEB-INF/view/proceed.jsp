<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Proceed Page</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
<link rel="stylesheet" href="urlconfig/css/proceed.css">
</head>
<body>
<h2>Enter Customer Details</h2>
<form:form modelAttribute="customer" action="pay" method="post">
<form:input path="name" placeholder="Your Name"/>
<form:errors path="name" cssClass="error"></form:errors><br><br>
<form:input path="email" placeholder="Your Email"/>
<form:errors path="email" cssClass="error"></form:errors><br><br>
<form:textarea path="address" placeholder="Your Address"/>
<form:errors path="address" cssClass="error"></form:errors><br><br>
<form:input path="mobile" placeholder="Your Mobile No."/>
<form:errors path="mobile" cssClass="error"></form:errors><br><br>
<div align="center"><input type="submit" class="btn btn-success" value="Confirm and Pay"></div>
</form:form>
</body>
</html>