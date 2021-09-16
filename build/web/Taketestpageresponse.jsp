<%-- 
    Document   : Taketestpageresponse
    Created on : 22 Nov, 2020, 2:14:46 PM
    Author     : Ramashankar kumar
--%>

<%@page import="Dao.ResultStoreDao"%>
<%@page import="javax.swing.JOptionPane"%>
<%@page import="Dao.QuestionStoreDao"%>
<%@page import="DTO.QuestionStore"%>
<%@page import="java.util.*"%>
<%@page import="DTO.ResultStore"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
        <%
           int rightanswer=0;
           int wronganswer=0;
           int unattemped=0;
           String[] val = request.getParameterValues("array[]");
           String coursename=request.getParameter("coursename");
           String setid=request.getParameter("setid");
           String username=(String)session.getAttribute("username");
           String userid=(String)session.getAttribute("userid");
           ArrayList<QuestionStore> array=QuestionStoreDao.getAllQuestionByLanguageAndId(coursename, setid);
           for(int i=0;i<val.length;i++)
           {
             if(val[i].equalsIgnoreCase("undefined")==false)
             {
                 if(array.get(i).getRightanswer().equalsIgnoreCase(val[i]))
                 {
                     rightanswer++;
                     
                 }
                 else{
                    wronganswer++;   
                 }
             }
             else{
                 unattemped++;
             }
           
           }
           
           int index=coursename.indexOf(".");
           String language=coursename.substring(0,index);
           ResultStore rs=new ResultStore(username,userid, rightanswer,wronganswer,Integer.parseInt(setid),language);
           boolean result=ResultStoreDao.SetResultOfStudent(rs);
           if(result==true)
           {   
           out.println("pass");
           }
           else
           {
             out.println("error");  
           }


           
           
        %>    
     
