<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<style>
table, th , td {
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
<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.6.4/angular.min.js"></script>
<title>Insert title here</title>
</head>
<body>



<div ng-app="myApp" ng-controller="customersCtrl"> 


<!-- SEaerch box -->

<p>SEARCH</p>

<p><input type="text" ng-model="test"></p>

<!-- Table data -->
<table>
  <tr ng-repeat="x in names | filter:test">
    <td>{{ x.pname }}</td>
    <td>{{ x.price }}</td>
  </tr>
</table>

</div>

<script>
var app = angular.module('myApp', []);
app.controller('customersCtrl', function($scope, $http) {
  $scope.names =${product}
});
</script>






</body>
</html>