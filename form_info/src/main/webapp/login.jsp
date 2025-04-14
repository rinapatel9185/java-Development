<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
  <style> 
    .log{
     height:40px;
     width:40px;
     margin-left:20px;
     font-family:verdana;
    }
  </style>
</head>
<body>
   <h1>Login Now !</h1>
   <form action="login01.jsp"class="log">
   <div class="login"></div>
    <label>User_name</label>
    <input type="text" name="username">
    <label>Password</label>
    <input type="text" name="password">
    <input type="submit" name="submit">
   </form>
</body>
</html>