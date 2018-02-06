<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>

	<h2> ADD SUPPLIER </h2>	
	<br>
	<div align="center">
     <form:form method="POST" action="saveSupplier">
		<table>
			<tr>
				<td><form:label path="id" cssStyle="padding:10px">Supplier Id &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp:</form:label></td>
				<td><form:input path="id" cssStyle="width:60%" value="${supplier.id}" /></td>
			</tr>
			
			<tr>
				<td><form:label path="name" cssStyle="padding:10px">Supplier Name &nbsp&nbsp&nbsp&nbsp&nbsp:</form:label></td>
				<td><form:input path="name" cssStyle="width:60%" value="${supplier.name}" /></td>
			</tr>
			
			<tr>
				<td><form:label path="address" cssStyle="padding:10px">Supplier Address :</form:label></td>
				<td><form:input path="address" cssStyle="width:60%" value="${supplier.address}" /></td>
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
    <td><c:out value="${supplier.id}"/></td>
    <td><c:out value="${supplier.name}"/></td>
    <td><c:out value="${supplier.address}"/></td>
    <td align="center"><a href="editSupplier?supplierId=${supplier.id}">Edit</a> | <a href="deleteSupplier?supplierId=${supplier.id}">Delete</a></td>
   </tr>
  </c:forEach>
 </table>
</c:if>
</div>
	<div id="footer-row1">
	     <h4 class="copyright"> &copy This Page Owner is BalaG</h4>
	 </div>
 </body>
</html>

