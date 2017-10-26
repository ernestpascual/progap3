<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<style>
.tg  {border-collapse:collapse;border-spacing:0;}
.tg td{font-family:Arial, sans-serif;font-size:14px;padding:10px 5px;border-style:solid;border-width:1px;overflow:hidden;word-break:normal;}
.tg th{font-family:Arial, sans-serif;font-size:14px;font-weight:normal;padding:10px 5px;border-style:solid;border-width:1px;overflow:hidden;word-break:normal;}
.tg .tg-yw4l{vertical-align:top}

body{
font-family: 'Montserrat', sans-serif;
color: white;
text-align: center;
}
a{
color: white;
}
</style>
<title>Booky Store</title>
</head>
<body>
<jsp:include page="header.jsp"/>
<center>
<table class="tg">
  <tr>
    <th class="tg-031e">Categories</th>
    <th class="tg-yw4l">Title</th>
    <th class="tg-yw4l">Author</th>
    <th class="tg-yw4l">Description</th>
    <th class="tg-yw4l">Quantity</th>
    <th class="tg-yw4l">Price</th>
  </tr>
  <tr>
    <td class="tg-yw4l">Non-Fiction</td>
    <td class="tg-yw4l">Alibaba</td>
    <td class="tg-yw4l">Duncan Clark</td>
    <td class="tg-yw4l">Biography of Jack Ma</td>
    <td class="tg-yw4l">5</td>
    <td class="tg-yw4l">250.00 PHP</td>
  </tr>
  <tr>
    <td class="tg-yw4l">Non-Fiction</td>
    <td class="tg-yw4l">Crush It!</td>
    <td class="tg-yw4l">Gary Vaynerchuck</td>
    <td class="tg-yw4l">How to crush it!</td>
    <td class="tg-yw4l">3</td>
    <td class="tg-yw4l">750.00 PHP</td>
  </tr>
  <tr>
    <td class="tg-yw4l">Fiction</td>
    <td class="tg-yw4l">Harry Potter and The Cursed Child</td>
    <td class="tg-yw4l">J. K. Rowling</td>
    <td class="tg-yw4l">Latest installment</td>
    <td class="tg-yw4l">10</td>
    <td class="tg-yw4l">550.00 PHP</td>
  </tr>
  <tr>
    <td class="tg-yw4l">Fiction</td>
    <td class="tg-yw4l">Romeo and Juliet</td>
    <td class="tg-yw4l">William Shakespeare</td>
    <td class="tg-yw4l">Star-crossed Lovers</td>
    <td class="tg-yw4l">2</td>
    <td class="tg-yw4l">230.00 PHP</td>
  </tr>
</table>
<a href="index.jsp">LOGOUT</a>
</center>
<jsp:include page="footer.jsp"/>
</body>
</html>