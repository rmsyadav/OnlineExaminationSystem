<%-- 
    Document   : TakeTestPage
    Created on : 20 Nov, 2020, 9:55:21 PM
    Author     : Ramashankar kumar
--%>

<%@page import="Dao.QuestionStoreDao"%>
<%@page import="DTO.QuestionStore"%>
<%@page import="java.util.*"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
         <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
        <link rel="stylesheet" type="text/css" href="Style/Navbar.css"> 
        <script type="text/javascript" src="Script/jquery.js"></script>
        <script type="text/javascript" src="Script/Form_validation.js"></script>
         <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
         <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
         <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
         <script>
             var totalqno;
             var coursename;
             var setid;
              $(document).ready(function(){
                   $("#logout").click(function(){
                  
                   window.location='Logout_Handling.jsp' ;
                 }); 
                $("#button1").click(function(){
                 var array=[];
                 totalqno=$("#totalqno").val();
                 coursename=$("#coursename").val();
                 setid=$("#setid").val();
                 for(var i=0;i<totalqno;i++)
                 {
                    var radval=$('input[name="'+(i+1)+'"]:checked').val(); 
                     if(typeof radval==="undefined")
                    {
                      array[i]="undefined";
                      

                    }
                    else
                    {
                      array[i]=radval;  
                    }
                 }
               
               var mydata={array:array,coursename:coursename,setid:setid};
               alert("hello");
                var request=$.post("Taketestpageresponse.jsp",mydata,processresponse);
               //request.error(handleError);
                
           });
      });
  function processresponse(responseText)
   {
      var resp=responseText;

      resp=resp.trim(); 
     
    if(resp==='pass')
    { 
       
     $("#result").html("Seccufully Done Your Test");
     $("#result1").html("You Now Riderct To Result Score");
     $("#result1").fadeOut(3000);
     setTimeout(redirectuser,3000);
    }
    else{
       $("#result").html("Something error!"); 
    }
    
  }
function handleError(xhr,textStatus)
    {
    
     if(textStatus==='error'){
        $("#result").html("Error is "+xhr.status);
    }
   }

  function redirectuser()
   {
        
        window.location="ResultShowPage.jsp?language="+coursename+"&setid="+setid+"&totalqno="+totalqno;  
   }
  </script>
   <style>
         body{
          margin:0px;
          border: 0px;
          padding-top: 90px;
          }          
        #button1
           {
                
                box-shadow:10px 10px 10px 10px;
                width: 250px;
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
            max-width: 800px;
                      
      }
      .card img{
            margin:auto;
           box-shadow:3px 3px 3px 3px gray; 
      }
      .card-body{
        
           box-shadow:5px 5px 5px 5px; 
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
      
     
             </style>
            
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
                <button type="button" class="btn btn-success btn-sm" style="width:100px">
                    <span class="glyphicon glyphicon-log-out"></span>20:10:00
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
        <%
           String coursename=request.getParameter("coursename");
           String setid=request.getParameter("setid");
           ArrayList<QuestionStore> array=QuestionStoreDao.getAllQuestionByLanguageAndId(coursename.trim(), setid.trim());
         
                     
         %> 
         <input type='hidden' value='<%=coursename%>' id='coursename'>>
         <input type='hidden' value='<%=setid%>' id='setid'>
         <input type="hidden" value='<%=array.size()%>' id="totalqno">
    <div class="container-fluid">
        
      <div class="row">
          <div class='col-sm-12'>
                   <div class='card'>
                       <div class='card-body'>
                           <div id='sub'>
                              <h4 id='header'>Good Luck! You Attempted 10/0</h4> 
                           </div> 
                           
                       </div>
                   </div>
           </div> 
         
                 
           
               <%
                 for(int i=0;i<10;i++)
                 {
                     out.println("<div class='col-sm-12'>");
                     out.println("<div class='card'>");
                     out.println("<div id='question'><h4>"+(i+1)+"."+array.get(i).getQuestion()+"</h4></div>");
                     out.println("<div class='card-body'>");
                     out.println("<input type='radio' name='"+(i+1)+"' value='answer1'><label for='male'>"+array.get(i).getAnswer1()+"</label><br>");
                     out.println("<input type='radio' name='"+(i+1)+"' value='answer2'>><label for='male'>"+array.get(i).getAnswer2()+"</label><br>");
                     out.println("<input type='radio' name='"+(i+1)+"' value='answer3'><label for='male'>"+array.get(i).getAnswer3()+"</label><br>");
                     out.println(" <input type='radio' name='"+(i+1)+"'value='answer4'><label for='male'>"+array.get(i).getAnswer4()+"</label><br>");
                     out.println("</div>");
                     out.println("</div>");
                     out.println("</div>");
                 }
                 
               
               %>  
               <div class='col-sm-12'>
                   <div class='card'>
                       
                       <div class='card-body'>
                           <div id='sub'>
                               <button id='button1' class="btn btn-success">Submit</button> 
                        </div> 
                           <span id='result'></span>
                           <span id='result1'></span>
                       </div>
                   </div>
               </div>
             </div>
              
          </div>
          </div> 
      </div>
    </div>    
              
           
            
          </div>

       
    </body>
</html>
