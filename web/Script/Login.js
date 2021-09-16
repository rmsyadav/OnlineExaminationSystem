/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
var ajaxReq=new XMLHttpRequest();
var username,password,usertype;
var url;
$(document).ready(function()
{
    $("#loginbtn").click(function()
    {
        connect();
    });
});
function validate()
{
    userid=$("#userid").val();
    password=$("#password").val();
    var status=true;
    if(userid==="")
    {
        
        /*$("#username").after("<span id='error1'>Username Reqd!</span>");
        $("#error1").css("color","red");
        $("#error1").fadeOut(2000);
        */
        status= false;
    }
    else if(password==="")
    {
        /*
        $("#password").after("<span id='error2'>Password Reqd!</span>")
        $("#error2").css("color","red");
        $("#error2").fadeOut(2000);
        */
        status= false;
    }
    return status;
}
function connect()
{
    //alert("connect called");
    if(!validate())
    {
       
        return ;
    }
   
var mydata={userid:userid,password:password};
var request=$.post("Login_servlet",mydata,processresponse);
request.error(handleError);
}
function processresponse(responseText)
{
    
    
        var resp=responseText;
        
        var pagename;
        resp=resp.trim();
        if(resp.indexOf("jsessionid")!==-1)
        {
            //alert("inside success");
          $("#loginresult").html("Login Accepted!Redirecting to the HomeTest  Page!");
            url=resp;
            setTimeout(redirectuser,3000);
        }
        else if(resp==="error")
        {
            //alert("inside error");
            $("#loginresult").css("color","red");
            $("#loginresult").html("Login Rejected");
            //$("#loginresult").fadeOut(2000);
        }
        else
        {
            $("#loginresult").css("color","red");
            $("#loginresult").html("Some error occurred at the server. Try later"+resp);
            
        }
    }
    function handleError(xhr,textStatus)
    {
    
    if(textStatus==='error'){
        $("#loginresult").html("Error is "+xhr.status);
    }
}

function redirectuser()
{
        
        window.location=url;  
}

