<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<!DOCTYPE html>
<html lang="EN" xml:lang="en">
<head>

<title></title>
</head>
<div id="outer">
<jsp:include page="header.jsp"></jsp:include>


<div id="main">


<div id="box">
<body>
<form:form method="post" action="asave" modelAttribute="payregister">
<table>
<caption></caption>
<th></th>
<tr><td>Id:  </td><td><input type="text" name="id"/></td></tr>
	<tr><td><br></td></tr>
<tr><td>Branch:</td><td><select name="branch">
					<option>Select a Branch</option>
					<option>Hyderabad</option>
					<option>Pune</option>
					<option>Delhi</option>
					</select></td></tr>
					<tr><td><br></td></tr>
<tr><td>Username:  </td><td><input type="text" name="username"/></td></tr>
	<tr><td><br></td></tr>
	
<tr><td>Password:  </td><td><input type="password" name="userpass"/></td></tr>
	<tr><td><br></td></tr>
<tr><td>Date of Joining:</td><td><input type="text" name="dateofjoining"/></td></tr>
	<tr><td><br></td></tr>
<tr><td>Date of Birth:</td><td><input type="text" name="dateofbirth"/></td></tr>
	<tr><td><br></td></tr>
	<tr><td>Salary:</td><td><input type="text" name="salary"/></td></tr>
	<tr><td><br></td></tr>
		<tr><td></td><td><input type="submit" value="create" style="padding: 2"></td></tr>
	<tr><td><br></td></tr>
</table>
<div id="location" ></div>
</form:form>
</body>
</html>