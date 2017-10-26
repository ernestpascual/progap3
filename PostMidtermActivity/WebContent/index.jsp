<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style>
h3{
font-family: 'Montserrat', sans-serif;
color: white;
padding: 0px;
}
body{
font-family: 'Montserrat', sans-serif;
color:white;}
</style>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Booky Store</title>
</head>
<body>
<jsp:include page="header.jsp"/>
<fieldset>
<legend>BOOKY STORE</legend>
<form action="login.action" method="post">
<p> Username:
	<input type="text" name="user" id="user" size="20">
	</p>
<p> Password:
	<input type="password" name="pass" id="pass" size="20">
	</p>
	<p> 
	<input type="submit" value = "Login"/>&nbsp;&nbsp;&nbsp;
	<input type="reset"/>
</p>	
	</form>
	</fieldset>
	<jsp:include page="footer.jsp"/>
</body>
</html>