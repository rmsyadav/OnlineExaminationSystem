<%-- 
    Document   : AfterLoginHomePage
    Created on : 9 Nov, 2020, 11:39:19 AM
    Author     : Ramashankar kumar
--%>

<%@page import="javax.swing.JOptionPane"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
    <head>
        <title>TODO supply a title</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
        <link rel="stylesheet" type=" text/css" href="Style/Navbar.css"> 
        <script type="text/javascript" src="Script/jquery.js"></script>
        <script type="text/javascript" src="Script/Form_validation.js"></script>
         <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
  <style>
      body{
          margin:0px;
          border: 0px;
          padding-top: 60px;
      }
      .card{
            box-shadow: 10px 10px 10px 10px;
            margin: 10px;
            padding: 10px;
           
      }
      .card img{
            margin:auto;
           box-shadow:3px 3px 3px 3px gray; 
      }
      .card-body{
        
           box-shadow:5px 5px 5px 5px; 
      }
     

        </style>
        <script>
            $(document).ready(function(){
           
           $("button").click(function(){
              
              var coursename=$(this).val();
              if(coursename=="logout")
              {
                 window.location='Logout_Handling.jsp';  
              }
              else
              {
              window.location="Particular_course_list_page.jsp?coursename="+coursename;     
              }
             }); 
             
        });

        </script>  
    </head>
 <body>
     <% 
      String user=(String)session.getAttribute("username");
      
     
     %>
   <nav class="navbar navbar-expand-sm fixed-top" >
       <div class="navbar-brand" asp-area="" asp-controller="Home" >Welcome! <%=(String)session.getAttribute("username")%></div>
             
            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#collapsibleNavbar">
                 <span class="navbar-toggler-icon" style="color:white"></span>
            </button>    
     <div class="collapse navbar-collapse" id="collapsibleNavbar">
           <ul class="navbar-nav ml-auto">
             <li class="nav-item">
                <button type="button" class="btn btn-danger btn-sm" value="logout">
                    <span class="glyphicon glyphicon-log-out"></span> Log out
                </button>
            </li>
          </ul>
     </div>   
                
                
                
                
            </div> 
        </nav>
    <div class="container-fluid">
      <div class="row">
         <div  class="col-md-4">
           <div class='card'>
           <a href="https://source.unsplash.com/user/erondu/400x300/?a"><img src="./Images/javascript.jpg" height="300" width="375"></img></a> 
             <div class="card-body">
               <h4 class="card-title">JAVASCRIPT PRACTICE</h4>
               <p class="card-text">Javascript Quiz Practice</p>
               <button class="btn btn-primary" value="javascript.jpg">Choose Set</button>
             </div>
           </div>
              
           
            
          </div>
          <div  class="col-md-4">
            <div class='card'>
            <a href="https://source.unsplash.com/user/erondu/400x300/?b"><img src="./Images/html.png" height="300" width="375"></img></a>
             <div class="card-body">
               <h4 class="card-title">HTML PRACTICE</h4>
               <p class="card-text">Html Quiz Practice</p>
               <button  class="btn btn-primary"  value="html.png">Choose Set</button>
             </div>
            </div>
          
          </div>
          <div  class="col-md-4">
          <div class="card">
          <a href="https://source.unsplash.com/user/erondu/400x300/?c"><img src="./Images/css.jpg" height="300" width="375"></img></a> 
           <div class="card-body">
               <h4 class="card-title">CSS PRACTICE</h4>
               <p class="card-text">Css Quiz Practice</p>
               <button class="btn btn-primary" value="css.jpg">Choose Set</button>
             </div>
          </div>
          </div>
      </div>
      <div class="row">
          <div  class="col-md-4">
          <div class='card'>
              <a href="https://source.unsplash.com/user/erondu/400x300/?d"><img src="./Images/java.jpg" height="300" width="375"> </img></a> 
            <div class="card-body">
               <h4 class="card-title">JAVA PRACTICE</h4>
               <p class="card-text">Java Quiz Practice</p>
              <button class="btn btn-primary" value="java.jpg">Choose Set</button>
             </div>
          </div>
          </div>
          <div  class="col-md-4">
          <div class='card'>
          <a href="https://source.unsplash.com/user/erondu/400x300/?e"><img src="./Images/Python.jpg" height="300" width="375"></img></a> 
           <div class="card-body">
               <h4 class="card-title">PYTHON PRACTICE</h4>
               <p class="card-text">Python Quiz Practice</p>
              <button class="btn btn-primary"  value="Python.jpg">Choose Set</button>
             </div>
          </div>
          </div>
          <div  class="col-md-4">
          <div class='card'>
          <a href="https://source.unsplash.com/user/erondu/400x300/?f"><img src="./Images/C_language.jpg" height="300" width="375"></img></a> 
            <div class="card-body">
               <h4 class="card-title">C LANGUAGE</h4>
               <p class="card-text">C Language Quiz Practice</p>
               <button class="btn btn-primary" value="C_language.jpg">Choose Set</button>
             </div>
          </div>
          </div>
      </div>
    </div> 
 </body>
</html>

