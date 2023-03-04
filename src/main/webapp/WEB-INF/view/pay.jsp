<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Payment</title>
<link rel="stylesheet" href="urlconfig/css/pay.css">
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
</head>
<body><br><br><br>
<h2 align="center">Credit Card Payment Gateway</h2>
<form:form modelAttribute="payment" action="ordersummary" method="post">
<form:input path="cardno" placeholder="Enter Card Number"/><br><br>
<form:input path="date" placeholder="MM/dd/YYYY"/>&nbsp;
<label>CVV:</label><form:input path="cvv"/><br><br>
<form:input path="chname" placeholder="Card Holder's Name"/>
<form:errors path="chname" cssClass="error"></form:errors><br><br>
<div align="center"><input type="submit" class="btn btn-success" value="Pay and Order"></div>
</form:form>
</body>
</html>