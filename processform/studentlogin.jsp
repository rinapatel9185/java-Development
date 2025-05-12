<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
  <h2>User information</h2>
  <form action="Processformservlet" method="post">
   <label for="name">Name:</label>
   <input type="text" id="name" name="username" required>
   <br><br>
   <label for="email">Email:</label>
   <input type="email" id="email" name="userEmail" required>
   <br><br>
    <input type="submit" value="Submit">
  </form>
</body>
</html>