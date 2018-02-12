<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>

<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

<script
	src="https://ajax.googleapis.com/ajax/libs/angularjs/1.6.4/angular.min.js"></script>
<style>
body {
	background-image: url(resources/images/bg1.jpg);
}

h2 {
	text-align: center;
}

table {
	width: 40%;
	margin: 50px;
}

#footer-row1 {
	margin-top: 80px;
	padding: 20px;
	background-image: bg1.jpg;
	bottom: 0;
	align: center;
}

.copyright {
	text-align: center;
	color: Black;
	font-size: 13px;
}
</style>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<title>SUPPLIER CRUD PAGE</title>
</head>

<script>
	var app = angular.module('myApp', []);
	app.controller('productCtrl', function($scope, $http) {
		$scope.names = $
		{
			productList
		}
	});
</script>
<body>
	<div class="row">

		<nav class="navbar navbar-default">
		<div class="container-fluid">
			<div class="navbar-header">
				<a class="navbar-brand" href="#">Furniture Shopping</a>
			</div>
			<ul class="nav navbar-nav">
				<li><a href="homeuser">Home </a></li>
				<li><a href="">Bedroom </a></li>
				<li><a href="kitchen">Kitchen</a></li>
				<li><a href="bar">Bar </a></li>
				<li><a href="hall">Hall </a></li>
			</ul>
			<ul class="nav navbar-nav navbar-right">
				<li><a href=""> <span class="glyphicon glyphicon-user">
							<b style="color: blue">${user}</b></a> </span></li>
				<li class="active"><a href="cart"> <span
						class="glyphicon glyphicon-shopping-cart"></span> Cart
				</a></li>
				<li><a href="logout"> <span
						class="glyphicon glyphicon-log-out"></span> Logout
				</a></li>
			</ul>
		</div>
		</nav>
	</div>

<center><h2>User Cart</h2></center>


</body>
<div id="footer-row1">
		<h4 class="copyright">&copy This Page Owner is Aravind</h4>
</body>
</html>

