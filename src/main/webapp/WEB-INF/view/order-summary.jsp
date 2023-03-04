<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Order Summary</title>
<link rel="stylesheet" href="urlconfig/css/os.css">

<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
</head>
<body>
<a href="reset"><h4 id="back">&#60Back</h4></a>
<br>
<h2 align="center">Congratulations!!!</h2>
<h3 align="center">You have Successfully placed an order</h3>
<h4 align="center">Order Summary</h4>
<table border=1>
<thead><tr>
<th>Name</th>
<th>Price  (in ₹)</th>
<th>Image</th>
</tr></thead>
<c:forEach var="item" items="${items}">
<tr>
<td>${item.value.name}</td>
<td>${item.value.price}</td>
<td><img src="${item.value.image}" height=150 width=150></td>
</tr>
</c:forEach>
<tr><td align="right">Total:</td>
<td colspan="2">${total}</td></tr>
<tr><td align="right">Payment Done by:</td>
<td colspan="2">${payment.chname}</td></tr>
<tr><td align="right">Delivery to:</td>
<td colspan="2">${customer.name}</td></tr>
<tr><td align="right">Email:</td>
<td colspan="2">${customer.email}</td></tr>
<tr><td align="right">Address:</td>
<td colspan="2">${customer.address}</td></tr>
<tr><td align="right">Mobile No.:</td>
<td colspan="2">${customer.mobile}</td></tr>
</table>
</body>
</html>