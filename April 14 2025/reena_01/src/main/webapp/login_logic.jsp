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
		
		String u_name = request.getParameter("username");
		String u_password = request.getParameter("password");
		
		String username_Main = "cwpc";
		String password_Main = "cwpc@123";
		
		if(u_name.equals(username_Main) && u_password.equals(password_Main)){
			
			response.sendRedirect("Home.jsp");
			
		}else{
			response.sendRedirect("error.jsp");
		}
		
	
	%>
	
	
</body>
</html>