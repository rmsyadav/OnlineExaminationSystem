<%-- 
    Document   : ResultShowPage
    Created on : 22 Nov, 2020, 4:50:52 PM
    Author     : Ramashankar kumar
--%>
<%@page import="javax.swing.JOptionPane"%>
<%@page import="Dao.ResultStoreDao"%>
<%@page import="DTO.ResultStore"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
        <link rel="stylesheet" type="text/css" href="Style/Navbar.css"> 
        <script type="text/javascript" src="Script/jquery.js"></script>
        <script type="text/javascript" src="Script/Form_validation.js"></script>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
        <style>
        body{
          margin:0px;
          border: 0px;
          padding-top: 90px;
          }          
      
        #sub{
         background-color:#2196F3;        
         display: flex;
         align-items: center;
         justify-content: center;
         box-shadow:10px 10px 10px 10px;
           }
       .card{
            box-shadow: 10px 10px 10px 10px;
            margin: auto;
            padding: 10px;
                                 
            }
            .card-header{
              box-shadow: 5px 5px 5px 5px;  
            }
            .card-body{
              box-shadow: 3px 3px 3px 3px;  
            }
           .card-footer{
              box-shadow: 1px 1px 1px 1px;  
            }

             
      .container-fluid{
          display: flex;
          justify-content: center;
          flex-direction: row;
      }
      #question{
         box-shadow:5px 5px 5px 5px;  
         padding: 5px;
      }
      table,tr,td,th{
          border: 1px solid black;
      }

        </style>
        <script>
            $(document).ready(function(){
    
             $("#logout").click(function(){
       
             window.location='Logout_Handling.jsp' ;
      }); 
    
});
        </script>
    </head>
<body>
        <% 
        String user=(String)session.getAttribute("username");
        String userid=(String)session.getAttribute("userid");
        String language=request.getParameter("language");
        String setid=request.getParameter("setid");
        String totalqno=request.getParameter("totalqno");
        ResultStore rs=ResultStoreDao.getResultByLanguageAndId(userid, language, setid);
        int unatempt=Integer.parseInt(totalqno)-(rs.getTotalrightanswer()+rs.getTotalwronganswer());
        
        double percentage=(double)rs.getTotalrightanswer()/Integer.parseInt(totalqno)*100;
         %>
       <nav class="navbar navbar-expand-sm fixed-top" >
       <div class="navbar-brand" asp-area="" asp-controller="Home" >Welcome! <%=(String)session.getAttribute("username")%></div>
             
            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#collapsibleNavbar">
                 <span class="navbar-toggler-icon" style="color:white"></span>
            </button>    
       <div class="collapse navbar-collapse" id="collapsibleNavbar">
           <ul class="navbar-nav ml-auto">
            <li class="nav-item">
                <button type="button" class="btn btn-danger btn-sm">
                    <a href="AfterLoginHomePage.jsp"><span class="glyphicon glyphicon-log-out">Back To course</span></a>
                </button>

             </li>

             <li class="nav-item">
                <button type="button" class="btn btn-danger btn-sm" id="logout">
                    <span class="glyphicon glyphicon-log-out"></span> Log out
                </button>

             </li>
            
             </ul>
          </div>            
        </div> 
      </nav>
   <div class="container-fluid">
        
        <div class="row">
             <div class='col-sm-12'>
                   <div class="card text-center">
                       <div class="card-header" style='font-weight:50px;font-family: sans-serif;font-style: bold;color: green'><h4 class="card-header">Scorcard</h4></div>
                       <div class="card-header">
                        <div class="table-responsive-sm">   
                          <table class="table table-hover table-dark">
                               <thead>
                                   <tr>
                                       
                               <th>Coursename</th><th>SETNAME</th><th>TotalRightAnswer</th><th>TotalWrongAnswer</th><th>UnAttempt</th><th>TotalPercentage</th>                                   
                                   </tr>
                                </thead> 
                           </table>
                          </div>      
                       </div>
                       <div class="card-body">
                           <table class="table table-hover table-dark">
                               
                                <tbody>
                                  <tr>
                                     
                                      <td><%=rs.getLanguage().toUpperCase()%></td>
                                     <td>SET<%=setid%></td>
                                      <td><%=rs.getTotalrightanswer()%></td>
                                      <td><%=rs.getTotalwronganswer()%></td>
                                      <td><%=unatempt%></td>
                                      <td><%=percentage%></td>
                                  </tr>
                               </tbody>
                         </table>
                        
                          
                       </div>
                       <div class="card-footer text-muted">Copy@Right Online Eximination Sytem</div>
</div>
                  
              </div>
        </div>
      </div>
    </body>
</html>
