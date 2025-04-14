<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>

</style>
</head>
<body>

	<h1>Login Information !</h1>
	
	<table border="1" cellspacing="0" cellpadding="10">
		<form action="welcome.jsp">
		<tr>
			<td>First Name</td>
			<td><input type="text" name="f_name"></td>
		</tr>
		<tr>
			<td>Last Name</td>
			<td><input type="text" name="l_name"></td>
		</tr>
		<tr>
			<td>Date of Birth</td>
			<td><input type="date" name="dob"></td>
		</tr>
		<tr>
			
			<td colspan="2"><input type="Submit" name="submit"></td>
		</tr>
		</form>
	</table>

</body>
</html>