<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="model.User" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>HI</title>
</head>
<body>
 <%
 User vuser = (User) session.getAttribute("username");
 if (vuser != null) out.println("User: " + vuser.getUsername());
 
 %>  is my nigga
 <a href="Controller?page=logout"> LOGOUT</a>
 

</body>
</html>