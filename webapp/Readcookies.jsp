<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
  <%
    Cookie[] cookies =request.getCookies();
    if(cookies !=null){
    	for(Cookie c:cookies){
    		if(c.getName().equals("username")){
    			out.print("<h2>welcome back,"+c.getValue()+"!<h2>");
    		}
    	}	
    }
   %>
</body>
</html>