<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Create Cookies Example</title>
</head>
<body>
   <%
    Cookie myCookie = new Cookie("username","Riya");
    myCookie.setMaxAge(24*60*60);
    response.addCookie(myCookie);
   %>
   <h2>Cookie create successful</h2>
</body>
</html>