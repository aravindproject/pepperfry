<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
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


</head>
<body></body>

<!-- Admin Menu -->

<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="#">PepperFry.Com</a>
    </div>
    <ul class="nav navbar-nav">
      <li class="active"><a href="adminHome">Home</a></li>
      <li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown" href="#">Product<span class="caret"></span></a>
        <ul class="dropdown-menu">
          <li><a href="product">Add Product</a></li>
          <li><a href="listAllProducts">View All Products</a></li>
          <li><a href="product">Update Product Details</a></li>
        <li><a href="product">Delete Product</a></li>

        </ul>
      </li>
      <li><a href="addSupplier">Supplier</a></li>
      <li><a href="addCategory">Category</a></li>
    </ul>
  </div>
</nav> 

	<h2> ADD SUPPLIER </h2>	
	<br>
	<div align="center">
     <form:form method="POST" action="saveSupplier">
		<table>
			<tr>
				<td><form:label path="supplierId" cssStyle="padding:10px">Supplier Id &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp:</form:label></td>
				<td><form:input path="supplierId" cssStyle="width:60%" value="${supplier.supplierId}" /></td>
			</tr>
			
			<tr>
				<td><form:label path="supplierName" cssStyle="padding:10px">Supplier Name &nbsp&nbsp&nbsp&nbsp&nbsp:</form:label></td>
				<td><form:input path="supplierName" cssStyle="width:60%" value="${supplier.supplierName}" /></td>
			</tr>
			
			<tr>
				<td><form:label path="supplierAddress" cssStyle="padding:10px">Supplier Address :</form:label></td>
				<td><form:input path="supplierAddress" cssStyle="width:60%" value="${supplier.supplierAddress}" /></td>
			</tr>
		</table>
		<br><br>
		<input type="submit" value="Submit" />
		<input name="reset" type="reset" />
	</form:form>
	</div>
	
	 
<div align="center">	
	 <c:if test="${!empty suppliers}">
 <table align="center" border="1">
  <tr>
   <th>Supplier ID</th>
   <th>Supplier Name</th>
   <th>Address</th>
   <th>EDIT/DELETE</th>
  </tr>
  <c:forEach items="${suppliers}" var="supplier">
   <tr>
    <td><c:out value="${supplier.supplierId}"/></td>
    <td><c:out value="${supplier.supplierName}"/></td>
    <td><c:out value="${supplier.supplierAddress}"/></td>
    <td align="center"><a href="editSupplier?supplierId=${supplier.supplierId}">Edit</a> | <a href="deleteSupplier?supplierId=${supplier.supplierId}">Delete</a></td>
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

