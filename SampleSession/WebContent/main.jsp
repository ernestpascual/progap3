<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="model.User" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<!--  
forward to page to calling the controller, controlling the attribute page
 -->
 <%
 User vuser = (User) session.getAttribute("username");
 if (vuser != null) out.println("User: " + vuser.getUsername());
 
 %> <br>
<a href="Controller?page=page2"> Go to page 2</a>
<a href="Controller?page=logout">LOG OUT</a>
</body>
</html>