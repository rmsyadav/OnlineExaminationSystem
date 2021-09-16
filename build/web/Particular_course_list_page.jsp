<%-- 
    Document   : Particular_course_list_page
    Created on : 20 Nov, 2020, 1:05:17 PM
    Author     : Ramashankar kumar
--%>

<%@page import="javax.swing.JOptionPane"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
    <head>
        <title>TODO supply a title</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
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
              
              var setid=$(this).val();
              var coursename=$("#coursename").val();
              var coursenam=$(this).val();
              if(coursenam=="logout")
              {
               window.location='Logout_Handling.jsp' ;   
              }
              else{
                  window.location="TakeTestPage.jsp?coursename="+coursename+"&setid="+setid;   
              }
                
           
             }); 
        });

        </script>  

    </head>
 <body>
     <%
       String coursename=request.getParameter("coursename");
       
     
     %>
     <input type="hidden" id="coursename" value="<%=coursename%>">  
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
               <a href="https://source.unsplash.com/user/erondu/400x300/?d"><img src="<%="./Images/"+coursename%>" height="300" width="375"> </img></a>
             <div class="card-body">
               <h4 class="card-title">JAVA SET1</h4>
               <p class="card-text">Total Question:25</p>
               <button class="btn btn-primary" value="1">Choose Set</button>

             </div>
           </div>
              
           
            
          </div>
          <div  class="col-md-4">
            <div class='card'>
           <a href="https://source.unsplash.com/user/erondu/400x300/?d"><img src="<%="./Images/"+coursename%>" height="300" width="375"> </img></a>
             <div class="card-body">
               <h4 class="card-title">JAVA SET2</h4>
               <p class="card-text">Total Question:20</p>
               <button class="btn btn-primary" value="2">Choose Set</button>

             </div>
            </div>
          
          </div>
          <div  class="col-md-4">
          <div class="card">
          <a href="https://source.unsplash.com/user/erondu/400x300/?d"><img src="<%="./Images/"+coursename%>" height="300" width="375"> </img></a> 
           <div class="card-body">
               <h4 class="card-title">JAVA SET3</h4>
               <p class="card-text">Total Question:20</p>
               <button class="btn btn-primary" value="3">Choose Set</button>

             </div>
          </div>
          </div>
      </div>
      <div class="row">
          <div  class="col-md-4">
          <div class='card'>
              <a href="https://source.unsplash.com/user/erondu/400x300/?d"><img src="<%="./Images/"+coursename%>" height="300" width="375"> </img></a> 
            <div class="card-body">
               <h4 class="card-title">JAVA SET4</h4>
               <p class="card-text">Total Question:20</p>
               <button class="btn btn-primary" value="4">Choose Set</button>

             </div>
          </div>
          </div>
          <div  class="col-md-4">
          <div class='card'>
          <a href="https://source.unsplash.com/user/erondu/400x300/?d"><img src="<%="./Images/"+coursename%>" height="300" width="375"> </img></a> 
           <div class="card-body">
               <h4 class="card-title">JAVA SET5</h4>
               <p class="card-text">Total Question:25</p>
               <button class="btn btn-primary" value="5">Choose Set</button>

             </div>
          </div>
          </div>
          <div  class="col-md-4">
          <div class='card'>
          <a href="https://source.unsplash.com/user/erondu/400x300/?d"><img src="<%="./Images/"+coursename%>" height="300" width="375"> </img></a>
            <div class="card-body">
               <h4 class="card-title">JAVA SET6</h4>
               <p class="card-text">Total Question:15</p>
               <button class="btn btn-primary" value="6">Choose Set</button>

             </div>
          </div>
          </div>
      </div>
    </div> 
 </body>
</html>

