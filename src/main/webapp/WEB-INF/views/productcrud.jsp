<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
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
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<title>SUPPLIER CRUD PAGE</title>
</head>
<body>
	<!-- Admin Menu -->

<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="#">PepperFry.Com</a>
    </div>
    <ul class="nav navbar-nav">
      <li ><a href="adminHome">Home</a></li>
      <li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown" href="#">Product<span class="caret"></span></a>
        <ul class="dropdown-menu">
          <li><a href="product">Add Product</a></li>
          <li><a href="listAllProducts">View All Products</a></li>
          <li ><a href="product">Update Product Details</a></li>
        <li><a href="product">Delete Product</a></li>

        </ul>
      </li>
      <li><a href="addSupplier">Supplier</a></li>
      <li><a href="addCategory">Category</a></li>
    </ul>
  </div>
</nav> 
	<h2>ADD PRODUCT</h2>
	<br>
	<div align="center">
		<form:form method="POST" action="saveProduct" enctype="multipart/form-data" >
			<table>
				<tr>
					<td><form:label path="pid" cssStyle="padding:10px">Product Id &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp:</form:label></td>
					<td><form:input path="pid" cssStyle="width:60%"
							value="${product.pid}" /></td>
				</tr>

				<tr>
					<td><form:label path="pname" cssStyle="padding:10px">Product Name &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp:</form:label></td>
					<td><form:input path="pname" cssStyle="width:60%"
							value="${product.pname}" /></td>
				</tr>
				<tr>
					<td><form:label path="description" cssStyle="padding:10px">Product Description :</form:label></td>
					<td><form:input path="description" cssStyle="width:60%"
							value="${product.description}" /></td>
				</tr>
				<tr>
					<td><form:label path="price" cssStyle="padding:10px">Price :</form:label></td>
					<td><form:input path="price" cssStyle="width:60%"
							value="${product.price}" /></td>
				</tr>
				<tr>
					<td><form:label path="supplierId" cssStyle="padding:10px">Supplier :</td></form:label>
					<td><select path="supplierId" name="supplierId" cssStyle="width:60%">
					<c:forEach items="${supplierList}" var="supplier"><option value="${supplier.supplierId}">${supplier.supplierName}</option>
					</c:forEach>
					</select>
					</td>
				</tr>
				<tr>
					<td><form:label path="cid" cssStyle="padding:10px">Category :</td></form:label>
					<td><select path="cid" name="cid" cssStyle="width:60%">
					<c:forEach items="${categoryList}" var="category"><option value="${category.cid}">${category.cname}</option>
					</c:forEach>
					</select>
					</td>
				</tr>
				<tr>
				<td><form:label path="image" cssStyle="padding:10px">Select Image :</form:label></td>
			    <td><form:input type="file" name="image" path="image"/></td>
				</tr>
			</table>
			<br>
			<br>
			<input type="submit" value="Submit" />
			<input name="reset" type="reset" />
		</form:form>
	</div>
	
	<div align="center">	
	 <c:if test="${!empty productList}">
 <table align="center" border="1">
  <tr>
  <th>Product ID</th>
   <th>Supplier ID</th>
   <th>Category ID</th>
   <th>Product Name</th>
   <th>Product Description</th>
   <th>Price</th>
   <th>EDIT/DELETE</th>
  </tr>
  <c:forEach items="${productList}" var="product">
   <tr>
    <td><c:out value="${product.pid}"/></td>
   <td><c:out value="${product.supplierId}"/></td>
   <td><c:out value="${product.cid}"/></td>
    <td><c:out value="${product.pname}"/></td>
    <td><c:out value="${product.description}"/></td>
    <td><c:out value="${product.price}"/></td>
    <td align="center"><a href="editProduct?productPid=${product.pid}">Edit</a> | <a href="deleteProduct?productPid=${product.pid}">Delete</a></td>
   </tr>
  </c:forEach>
 </table>
</c:if>
</div>

	<div id="footer-row1">
		<h4 class="copyright"> &copy This Page Owner is Aravind</h4>
	</div>
</body>
</html>

