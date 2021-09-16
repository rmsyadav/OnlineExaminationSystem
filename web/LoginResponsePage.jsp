<%-- 
    Document   : LoginResponsePage
    Created on : 21 Nov, 2020, 3:46:02 PM
    Author     : Ramashankar kumar
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
  boolean result=(Boolean)request.getAttribute("result");
  String username=(String)request.getAttribute("username");
   String userid=(String)request.getAttribute("userid");
  if(result==true)
  {
    String url="AfterLoginHomePage.jsp;jsessionid="+session.getId();
    out.println(url);
    HttpSession sess=request.getSession();
    sess.setAttribute("username",username);
    sess.setAttribute("userid",userid);
    
    
  }
  else
    out.println("error");
%>
