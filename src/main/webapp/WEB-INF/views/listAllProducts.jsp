<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<style>
table, th, td {
	border: 1px solid grey;
	border-collapse: collapse;
	padding: 5px;
}

table tr:nth-child(odd) {
	background-color: #f1f1f1;
}

table tr:nth-child(even) {
	background-color: #ffffff;
}
</style>
<script
	src="https://ajax.googleapis.com/ajax/libs/angularjs/1.6.4/angular.min.js"></script>
<title>Insert title here</title>
</head>
<body>

	<nav class="navbar navbar-inverse">
	<div class="container-fluid">
		<div class="navbar-header">
			<a class="navbar-brand" href="#">PepperFry.Com</a>
		</div>
		<ul class="nav navbar-nav">
			<li><a href="adminHome">Home</a></li>
			<li class="dropdown"><a class="dropdown-toggle"
				data-toggle="dropdown" href="#">Product <span class="caret"></span></a>
				<ul class="dropdown-menu">
					<li class="active"><a href="product">Add Product</a></li>
					<li><a href="listAllProducts">View All Products</a></li>
					<li><a href="product">Update Product Details</a></li>
					<li><a href="product">Delete Product</a></li>

				</ul></li>
			<li><a href="addSupplier">Supplier</a></li>
			<li><a href="addCategory">Category</a></li>
		</ul>
	</div>
	</nav>



	<div ng-app="myApp" ng-controller="customersCtrl">


		<!-- SEaerch box -->



		<div class="row">

			<div class="col-xs-1">
				<label for="ex1">Search Product</label>
			</div>

			<div class="col-xs-3">
				<input type="text" ng-model="test" class="form-control input-sm">
			</div>

		</div>


		<div class="container">
			<!-- Table data -->
			<h2>Search result:</h2>
			<table class="table table-hover">

				<thead>
					<tr>
						<th>Product Name</th>
						<th>Product Description</th>
						<th>Product Price</th>
						<th>Product Image</th>
					</tr>
				</thead>
				<tbody>

					<tr ng-repeat="x in names | filter:test">
						<td>{{ x.pname }}</td>
						<td>{{ x.description }}</td>
						<td>{{ x.price }}</td>
						<td><img src="resources/images/{{x.pid}}.jpg"  class="img-thumbnail" alt="{{x.pid}}" width="100" height="100"> </td>
					</tr>

				</tbody>
			</table>

		</div>
		<!-- container table ends here -->

	</div>

	<script>
		var app = angular.module('myApp', []);
		app.controller('customersCtrl', function($scope, $http) {
			$scope.names = ${product}
		});
	</script>






</body>
</html>