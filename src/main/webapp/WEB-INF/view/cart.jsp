<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Cart</title>
<link rel="stylesheet" href="urlconfig/css/cart.css">
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
</head>

<body>
<a href="order"><h4 id="back">&#60Back</h4></a>
<h1>Cart</h1>
<table border=1>
<thead><tr>
<th>Name</th>
<th>Description</th>
<th>Price  (in ₹)</th>
<th>Image</th>
<th>Cancel Item</th>
</tr></thead>
<c:forEach var="item" items="${cartitems}">
<tr>
<td>${item.value.name}</td>
<td>${item.value.desc}</td>
<td>${item.value.price}</td>
<td><img src="${item.value.image}" height=150 width=150></td>
<td><button class="btn btn-danger" onclick="location.href='cancelitem?index=${item.key}'">Cancel</button></td>
</tr>
</c:forEach>
<tr><td colspan="2" align="right">Total:</td>
<td colspan="2">${total}</td></tr>
<tr><td rowspan="2" colspan="4"><div align="center"><button id="add" class="btn btn-primary" onclick="location.href='proceed'">Proceed</button></div><td>
</table>

</body>
</html>