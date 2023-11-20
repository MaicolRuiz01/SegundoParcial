<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" 
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
</head>
<body>
	<div class="container mt-5">
        <h1>Login</h1>
        <form:form action="LoginServlet" method="post" modelAttribute="user" class="needs-validation" novalidate>
            <div class="form-group">
                <label for="username">Username:</label>
                <form:input path="username" id="username" class="form-control" required="true" />
                <div class="invalid-feedback">Please enter your username.</div>
            </div>
            <div class="form-group">
                <label for="password">Password:</label>
                <form:password path="password" id="password" class="form-control" required="true" />
                <div class="invalid-feedback">Please enter your password.</div>
            </div>
            <button type="submit" class="btn btn-primary">Login</button>
        </form:form>
    </div>
	
	

	

</body>
</html>