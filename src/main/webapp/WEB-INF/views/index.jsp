<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
   
<!DOCTYPE html>
<html lang="EN" xmlns:th="http://www.thymeleaf.org">
	<head>
		<title>
			Welcome Page
		</title>
<style>
* {
	margin: 0;
	padding: 0;
}

a {
	text-decoration: underline;
	color: #383838;
}

a:hover {
	text-decoration: none;
}

body {
	font-size: 12pt;
	line-height: 1.8em;
	font-family: Arial, sans-serif;
	background: #dddddd;
	color: #656565;
}

br.clear {
	clear: both;
}

h1,h2,h3,h4 {
	text-transform: uppercase;
	font-weight: normal;
	letter-spacing: -1px;
}

h2,h3,h4 {
	margin-bottom: 1.5em;
	font-family: Arvo, serif;
	color: #000000;
}

strong {
	color: #000000;
}

img.left {
	float: left;
	margin: 0 20px 20px 0;
}

img.top {
	margin: 8px 0 20px 0;
}

p {
	margin-bottom: 1.25em;
}

ul {
	margin-bottom: 1.25em;
}

.date {
	background: #222222;
	color: #ffffff;
	font-size: 0.75em;
	padding: 2px;
	display: inline-block;
	width: 45px;
	text-align: center;
	margin-right: 1em;
}

.imageList {
	list-style: none;
}

.imageList li {
	clear: both;
}

.box {
	margin: 0 0 30px 0;
	overflow: hidden;
}

#bg1 {
	position: absolute;
	left: 0;
	top: 0;
	width: 100%;
	height: 542px;
	background: #ccc;
	z-index: 1;
	box-shadow: inset 0px 280px 60px 0px rgba(0,0,0,0.3);
}

#bg2 {
	position: absolute;
	left: 0;
	top: 0;
	width: 100%;
	height: 243px;
	background: #262626;
	z-index: 2;
	box-shadow: inset 0px 10px 60px 0px rgba(0,0,0,0.7);
}

#banner {
	position: relative;
	width: 1180px;
	height: 300px;
}

#banner .captions {
	position: absolute;
	right: 0;
	top: 105px;
	text-shadow: 2px 2px 0px rgba(0,0,0,1.0);
}

#banner .captions h2 {
	background: rgba(0,0,0,0.7);
	color: #ffffff;
	padding: 28px;
	margin: 0;
}

#banner .captions h3 {
	background: rgba(10,127,153,0.8);
	color: #ffffff;
	padding: 28px;
	margin: 0;
}

#content {
	width: 854px;
	margin: 0 0 0 270px;
	padding: 0;
}

#copyright {
	padding: 40px 0 80px 0;
	text-align: center;
	color: #777777;
}

#copyright a {
	position: relative;
	padding: 28px;
	height: 50px;
	background: #0a7f99;
	color: #ffffff;
	text-shadow: 2px 2px 2px rgba(0,0,0,0.5);
	box-shadow: inset 0px -40px 60px 0px #005B6D;
	border-bottom: solid 1px #003B47;
}

#header {
	position: relative;
	padding: 28px;
	height: 50px;
	background: #0a7f99;
	color: #ffffff;
	text-shadow: 2px 2px 2px rgba(0,0,0,0.5);
	box-shadow: inset 0px -40px 60px 0px #005B6D;
	border-bottom: solid 1px #003B47;
}

#logo {
	position: absolute;
	bottom: 0;
	left: 28px;
	height: 138px;
	line-height: 138px;
}

#logo a {
	text-decoration: none;
	color: #ffffff;
}

#logo h1 {
	font-size: 2.25em;
	font-family: Arvo, serif;
}

#main {
	position: relative;
	padding: 0px 28px 0px 28px;
	width: 1124px;
}

#main ul {
	list-style: none;
}

#main ul li {
	padding: 8px 0 8px 0;
	border-top: solid 1px #d1d1d1;
}

#main ul li.first {
	padding-top: 0;
	border-top: 0;
}

#nav {
	top: 0;
	left: 0;
	padding: 0 28px 0 28px;
	width: 1124px;
	height: 48px;
	line-height: 48px;
	margin: 0 0 28px 0;
	background: #007289;
	font-size: 0.9em;
	border-bottom: solid 1px #009FBF;
	border-top: solid 1px #1098B3;
	box-shadow: inset 0px -10px 40px 0px #005B6D;
}

#nav a {
	text-decoration: none;
	text-transform: uppercase;
	color: #ffffff;
}

#nav ul {
	list-style: none;
}

#nav ul li {
	display: inline;
	padding: 0 12px 0 12px;
}

#nav ul li.first {

	padding-left: 0
}

#outer {
	z-index: 3;
	width: 1180px;
	margin: -10 60px 10 60px;
	background: #ffffff;
	box-shadow: 0px 0px 60px 0px rgba(0,0,0,0.2);
}

#search {
	position: absolute;
	bottom: 0;
	right: 28px;
	height: 138px;
	line-height: 138px;
}

#search input.text {
	padding: 10px 40px 10px 10px;
	background: #ffffff url(images/search.png) top right no-repeat;
	border: 0;
	width: 250px;
	color: #777;
}

#sidebar {
	width: 250px;
	float: left;
	padding: 0;
}
#right {
	width :400px;
	padding: 5,5,5,5;
	float:right;

	
}
#location{
	width: 400px;
	padding:5,5,5,5;

}
#bottom{
	width: 400px;
	padding:5,5,5,5;
		height:100px;
	
}
#find{
width: 400px;
	padding:5,5,5,5;
	height:700px;
}
#getgeninfo{
	width: 1080px;
	padding:5,5,5,5;
	float:center;
		height:200px;
}
.v{
text-align:center;
}





</style>

	</head>
	<body>
	<div id="header">
			
				<div id="logo">
					<h1> 
						Payment Billing System 
					</h1>
				</div>	
		</div>
			<div id="banner">
			<div class="captions">
					<h2><a href="index">Log out</a></h2>
				</div>	
				<img alt="my1 image" src="https://www.northpropertygroup.co.uk/wp-content/uploads/Halo-Manchester-City-Centre-1000x300.jpg">							
			</div>	
	<div class="v">		
	<a href="admin"><strong>Login As Administrator</strong></a><br>
	<a href="studentlogin"><strong>Login As Student</strong></a>
	</div>
	<form action="loginprocess" modelAttribute="payregister" >
					<table>
					<caption></caption>
					<th></th>
					<tr><td style="color:navy;"><strong> Login Form</strong></td></tr>
					<tr><td><br></td></tr>
					<tr><td>Branch:</td><td><select name="branch">
					<option>Select a Branch</option>
					<option>Hyderabad</option>
					<option>Pune</option>
					<option>Delhi</option>
					</select></td></tr>
					<tr><td><br></td></tr>
					<tr><td>User Name:</td><td><input type="text" name="username"/></td></tr>
								<tr><td><br></td></tr>
					<tr><td>Password:</td><td><input type="password" name="userpass"/></td></tr>	
							<tr><td><br></td></tr>
					<tr><td>      </td><td><input type="submit" value="Sign in"></td></tr>
					</table>
					</form>		
	
	
	
	</body>
	</html>