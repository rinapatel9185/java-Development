<%@page import="p4n.UserDao"%>
<jsp:useBean id="u" class="p4n.User"></jsp:useBean>
<jsp:setProperty property="*" name="u"/>

<%
int i=UserDao.save(u);
if(i>0){
response.sendRedirect("adduser-success.jsp");
}else{
response.sendRedirect("adduser-error.jsp");
}
%>