<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Desserts Manager</title>
<link rel="stylesheet" href="urlconfig/css/desserts-manager.css">
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
</head>

<body>
<a href="homeAdmin"><h4 id="back">&#60Back</h4></a>
<h1>Desserts Manager</h1>
<table border=1>
<thead><tr>
<th>Name</th>
<th>Description</th>
<th>Price  (in ₹)</th>
<th>Image</th>
<th>Delete Desserts</th>
</tr></thead>
<c:forEach var="desserts" items="${desserts}">
<tr>
<td>${desserts.name}</td>
<td>${desserts.desc}</td>
<td>${desserts.price}</td>
<td><img src="${desserts.image}" height=150 width=150></td>
<td><button class="btn btn-danger" onclick="location.href='deleteDesserts?id=${desserts.id}'">Delete</button></td>
</tr>
</c:forEach>
<tr><td rowspan="2" colspan="5"><div align="center"><button id="add" class="btn btn-primary" onclick="location.href='addDesserts'">Add Desserts</button></div><td>
</table>

</body>
</html>