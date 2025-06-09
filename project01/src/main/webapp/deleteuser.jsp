<%@page import="p4n.UserDao"%>
<jsp:useBean id="u" class="p4n.User"></jsp:useBean>
<jsp:setProperty property="*" name="u"/>

<%
UserDao.delete(u);
response.sendRedirect("viewusers.jsp");
%>