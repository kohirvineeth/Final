<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="EN" xml:lang="en">
<head>
<title>
			Search
		</title>

</head>

<body>
<div id="outer">
<jsp:include page="header.jsp"></jsp:include>


<body width="100">

<div id="main">

<div id="box">

<form  action="showstudent"  modelAttribute="stud">
Find:-
<input type="text" name="name" placeholder="Student Name"></input>
<input type="submit" value="Search">
<div id="right" ></div>

<div id="location" ></div>
</form>

<div id="bottom" ></div>
<div id="getgeninfo"></div>
</div>

</div>

</body>



</div>
</body>
</html>