<%-- 
    Document   : Logout_Handling
    Created on : 6 Dec, 2020, 2:07:22 AM
    Author     : Ramashankar kumar
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
   session.invalidate();
   response.sendRedirect("HomePage.html");
  
%>