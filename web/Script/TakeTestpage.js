/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
$(document).ready(function(){
 $("#button1").click(function(){
         //var totalqno=$("#totalqno").val();
              
    
    var array=['answer1','answer2','answer3','answer4'];
    $.post("Taketestpageresponse.jsp",array,processresponse);
   //window.location="Taketestpageresponse.jsp?myarray="+array;
            
 
 
 
 
 });   
    
    
    
    
    
    
    
    
});

