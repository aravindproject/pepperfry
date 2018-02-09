<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

<title>Category Edit</title>
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
</head>
<body>


<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="#">PepperFry.Com</a>
    </div>
    <ul class="nav navbar-nav">
      <li ><a href="adminHome">Home</a></li>
      <li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown" href="#">Page 1 <span class="caret"></span></a>
        <ul class="dropdown-menu">
          <li><a href="product">Add Product</a></li>
          <li><a href="listAllProducts">View All Products</a></li>
          <li><a href="product">Update Product Details</a></li>
        <li><a href="product">Delete Product</a></li>

        </ul>
      </li>
      <li><a href="addSupplier">Supplier</a></li>
      <li class="active"><a href="addCategory">Category</a></li>
    </ul>
  </div>
</nav> 


	<h2>ADD Category</h2>
	<br>
	<div align="center">
		<form:form method="POST" action="saveCategory">
			<table>
				<tr>
					<td><form:label path="cid" cssStyle="padding:10px">Category ID &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp:</form:label></td>
					<td><form:input path="cid" cssStyle="width:60%"
							value="${category.cid}" readonly="true" /></td>
				</tr>
				<tr>
					<td><form:label path="cname" cssStyle="padding:10px">Category Name &nbsp&nbsp&nbsp&nbsp:</form:label></td>
					<td><form:input path="cname" cssStyle="width:60%"
							value="${category.cname}" /></td>
				</tr>

				<tr>
					<td><form:label path="description" cssStyle="padding:10px">Description &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp:</form:label></td>
					<td><form:input path="description" cssStyle="width:60%"
							value="${category.description}" /></td>
				</tr>
			</table>
			<br>
			<br>
			<input type="submit" value="Submit" />
			<input name="reset" type="reset" />
		</form:form>
	</div>
	<div align="center">
		<c:if test="${!empty categories}">
			<table align="center" border="1">
				<tr>
					<th>Category ID</th>
					<th>Category Name</th>
					<th>description</th>
					<th>EDIT/DELETE</th>
				</tr>

				<c:forEach items="${categories}" var="category">
					<tr>
						<td><c:out value="${category.cid}" /></td>
						<td><c:out value="${category.cname}" /></td>
						<td><c:out value="${category.description}" /></td>
						<td align="center"><a
							href="editCategory?categoryCId=${category.cid}">Edit</a> | <a
							href="deleteCategory?categoryCId=${category.cid}">Delete</a></td>
					</tr>
				</c:forEach>
			</table>
		</c:if>
	</div>
	<div id="footer-row1">
		<h4 class="copyright">&copy This Page Owner is Aravind</h4>
</body>
</html>