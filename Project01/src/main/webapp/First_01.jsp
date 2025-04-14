<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<style>
  
</style>
<body>
   <h1>Login information</h1>
   <form action="connect.jsp">
     <table class="login">
        <tr>
          <td>First Name</td>
 			<td><input type="text" name="f_name"></td>       
        </tr>
        <tr>
           <td>LAST Name</td>
 			<td><input type="text" name="l_name"></td>     
        </tr>
        <tr>
           <td>DOB</td>
 			<td><input type="date" name="dob"></td>        
        </tr>
        
 			<td colspan="2"><input type="Submit" name="submit"></td>
     </table>
   </form>
</body>
</html>