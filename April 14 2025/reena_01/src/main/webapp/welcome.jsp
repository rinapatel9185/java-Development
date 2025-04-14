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
	
		String f_name = request.getParameter("f_name");
		String l_name = request.getParameter("l_name");
		String dob = request.getParameter("dob");
	
	%>

	<h1>User Information !</h1>
	
	<table border="1" cellspacing="0" cellpadding="10">
		
		<tr>
			<td>First Name</td>
			<td>
				<% out.print(f_name); %>
			</td>
		</tr>
		<tr>
			<td>Last Name</td>
			<td><% out.print(l_name); %></td>
		</tr>
		<tr>
			<td>Date of Birth</td>
			<td><% out.print(dob); %></td>
		</tr>
		
		</form>
	</table>

</body>
</html>