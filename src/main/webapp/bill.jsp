<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Facturas</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" 
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
</head>
<body>
	<div class="container mt-4">
        <h1>List of Bills</h1>
        <table class="table table-bordered">
            <thead class="thead-dark">
                <tr>
                    <th>ID</th>
                    <th>Date</th>
                    <th>User ID</th>
                    <th>Value</th>
                    <th>Type</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach var="bill" items="${bills}">
                    <tr>
                        <td>${bill.id}</td>
                        <td>${bill.date_bill}</td>
                        <td>${bill.userId}</td>
                        <td>${bill.value}</td>
                        <td>${bill.type}</td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
    </div>


</body>
</html>