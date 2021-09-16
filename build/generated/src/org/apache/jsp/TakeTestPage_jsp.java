package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Dao.QuestionStoreDao;
import DTO.QuestionStore;
import java.util.*;

public final class TakeTestPage_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("         <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"Style/Navbar.css\"> \n");
      out.write("        <script type=\"text/javascript\" src=\"Script/jquery.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"Script/Form_validation.js\"></script>\n");
      out.write("         <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js\"></script>\n");
      out.write("         <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js\"></script>\n");
      out.write("         <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js\"></script>\n");
      out.write("         <script>\n");
      out.write("                 $(document).ready(function(){\n");
      out.write("                  $(\"#button1\").click(function(){\n");
      out.write("                 //var totalqno=$(\"#totalqno\").val();\n");
      out.write("              \n");
      out.write("                  alert(\"hello\");\n");
      out.write("                 var str=\"answer1,answer2,answer3,answer4\";\n");
      out.write("                 var array=[]1,2,3,4];\n");
      out.write("                 mydata={array:array};\n");
      out.write("                 alert(\"hello\");\n");
      out.write("                $.post(\"Taketestpageresponse.jsp\",mydata,processresponse);\n");
      out.write("               //window.location=\"Taketestpageresponse.jsp?myarray=\"+array;\n");
      out.write("                request.error(handleError);\n");
      out.write("       }); \n");
      out.write(" }); \n");
      out.write(" function processresponse(responseText)\n");
      out.write("{\n");
      out.write("    \n");
      out.write("    \n");
      out.write("        /*var resp=responseText;\n");
      out.write("        var pagename;\n");
      out.write("        resp=resp.trim();\n");
      out.write("        if(resp.indexOf(\"jsessionid\")!==-1)\n");
      out.write("        {\n");
      out.write("            //alert(\"inside success\");\n");
      out.write("          $(\"#loginresult\").html(\"Login Accepted!Redirecting to the HomeTest  Page!\");\n");
      out.write("            url=resp;\n");
      out.write("            setTimeout(redirectuser,3000);\n");
      out.write("        }\n");
      out.write("        else if(resp===\"error\")\n");
      out.write("        {\n");
      out.write("            //alert(\"inside error\");\n");
      out.write("            $(\"#loginresult\").css(\"color\",\"red\");\n");
      out.write("            $(\"#loginresult\").html(\"Login Rejected\");\n");
      out.write("            //$(\"#loginresult\").fadeOut(2000);\n");
      out.write("        }\n");
      out.write("        else\n");
      out.write("        {\n");
      out.write("            $(\"#loginresult\").css(\"color\",\"red\");\n");
      out.write("            $(\"#loginresult\").html(\"Some error occurred at the server. Try later\"+resp);\n");
      out.write("            \n");
      out.write("        }\n");
      out.write("      */  \n");
      out.write("    }\n");
      out.write("    function handleError(xhr,textStatus)\n");
      out.write("    {\n");
      out.write("    \n");
      out.write("    if(textStatus==='error'){\n");
      out.write("        $(\"#loginresult\").html(\"Error is \"+xhr.status);\n");
      out.write("    }\n");
      out.write("}\n");
      out.write("\n");
      out.write("function redirectuser()\n");
      out.write("{\n");
      out.write("        alert(\"url:\"+url);\n");
      out.write("        window.location=url;  \n");
      out.write("}\n");
      out.write("\n");
      out.write("         </script>\n");
      out.write("        \n");
      out.write("     <style>\n");
      out.write("         body{\n");
      out.write("          margin:0px;\n");
      out.write("          border: 0px;\n");
      out.write("          padding-top: 90px;\n");
      out.write("          }          \n");
      out.write("      #button1{\n");
      out.write("                \n");
      out.write("                box-shadow:10px 10px 10px 10px;\n");
      out.write("                width: 250px;\n");
      out.write("         }\n");
      out.write("      \n");
      out.write("      #sub {\n");
      out.write("  background-color:#2196F3;        \n");
      out.write("  display: flex;\n");
      out.write("  align-items: center;\n");
      out.write("  justify-content: center;\n");
      out.write("  box-shadow:10px 10px 10px 10px;\n");
      out.write("}\n");
      out.write("      .card{\n");
      out.write("            box-shadow: 10px 10px 10px 10px;\n");
      out.write("            margin: auto;\n");
      out.write("            padding: 10px;\n");
      out.write("            max-width: 800px;\n");
      out.write("                      \n");
      out.write("      }\n");
      out.write("      .card img{\n");
      out.write("            margin:auto;\n");
      out.write("           box-shadow:3px 3px 3px 3px gray; \n");
      out.write("      }\n");
      out.write("      .card-body{\n");
      out.write("        \n");
      out.write("           box-shadow:5px 5px 5px 5px; \n");
      out.write("      }\n");
      out.write("     \n");
      out.write("      .container-fluid{\n");
      out.write("          display: flex;\n");
      out.write("          justify-content: center;\n");
      out.write("          flex-direction: row;\n");
      out.write("      }\n");
      out.write("      #question{\n");
      out.write("         box-shadow:5px 5px 5px 5px;  \n");
      out.write("         padding: 5px;\n");
      out.write("      }\n");
      out.write("      \n");
      out.write("     \n");
      out.write("             </style>\n");
      out.write("            \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("         ");
 
      String user=(String)session.getAttribute("username");
     
     
     
      out.write("\n");
      out.write("   <nav class=\"navbar navbar-expand-sm fixed-top\" >\n");
      out.write("       <div class=\"navbar-brand\" asp-area=\"\" asp-controller=\"Home\" >Welcome! ");
      out.print((String)session.getAttribute("username"));
      out.write("</div>\n");
      out.write("             \n");
      out.write("            <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#collapsibleNavbar\">\n");
      out.write("                 <span class=\"navbar-toggler-icon\" style=\"color:white\"></span>\n");
      out.write("            </button>    \n");
      out.write("     <div class=\"collapse navbar-collapse\" id=\"collapsibleNavbar\">\n");
      out.write("           <ul class=\"navbar-nav ml-auto\">\n");
      out.write("             <li class=\"nav-item\">\n");
      out.write("                <button type=\"button\" class=\"btn btn-success btn-sm\" style=\"width:100px\">\n");
      out.write("                    <span class=\"glyphicon glyphicon-log-out\"></span>20:10:00\n");
      out.write("                </button>\n");
      out.write("            </li>  \n");
      out.write("             <li class=\"nav-item\">\n");
      out.write("                <button type=\"button\" class=\"btn btn-danger btn-sm\">\n");
      out.write("                    <span class=\"glyphicon glyphicon-log-out\"></span> Log out\n");
      out.write("                </button>\n");
      out.write("            </li>\n");
      out.write("            \n");
      out.write("          </ul>\n");
      out.write("       </div>            \n");
      out.write("    </div> \n");
      out.write("  </nav>\n");
      out.write("        ");

           String coursename=request.getParameter("coursename");
           String setid=request.getParameter("setid");
            ArrayList<QuestionStore> array=QuestionStoreDao.getAllQuestionByLanguageAndId(coursename.trim(), setid.trim());
         
                     
         
      out.write(" \n");
      out.write("         \n");
      out.write("    <div class=\"container-fluid\">\n");
      out.write("        \n");
      out.write("      <div class=\"row\">\n");
      out.write("          <div class='col-sm-12'>\n");
      out.write("                   <div class='card'>\n");
      out.write("                       <div class='card-body'>\n");
      out.write("                           <div id='sub'>\n");
      out.write("                              <h4 id='header'>Good Luck! You Attempted 10/0</h4> \n");
      out.write("                           </div> \n");
      out.write("                           \n");
      out.write("                       </div>\n");
      out.write("                   </div>\n");
      out.write("           </div> \n");
      out.write("         \n");
      out.write("                 \n");
      out.write("           \n");
      out.write("               ");

                 for(int i=0;i<10;i++)
                 {
                     out.println("<div class='col-sm-12'>");
                     out.println("<div class='card'>");
                     out.println("<div id='question'><h4>"+(i+1)+"."+array.get(i).getQuestion()+"</h4></div>");
                     out.println("<div class='card-body'>");
                     out.println("<input type='radio' name='"+(i+1)+"' value='winter'><label for='male'>Bytecode is executed by JVM</label><br>");
                     out.println("<input type='radio' name='"+(i+1)+"' value='spring'>><label for='male'>The applet makes the Java code secure and portable</label><br>");
                     out.println("<input type='radio' name='"+(i+1)+"' value='summer'><label for='male'>Use of exception handling</label><br>");
                     out.println(" <input type='radio' name='"+(i+1)+"' value='autumn'><label for='male'>Dynamic binding between objects</label><br>");
                     out.println("</div>");
                     out.println("</div>");
                     out.println("</div>");
                 }
                 
               
               
      out.write("  \n");
      out.write("               <div class='col-sm-12'>\n");
      out.write("                   <div class='card'>\n");
      out.write("                       <div class='card-body'>\n");
      out.write("                           <div id='sub'>\n");
      out.write("                               <button id='button1' class=\"btn btn-success\">Submit</button> \n");
      out.write("                           </div> \n");
      out.write("                           \n");
      out.write("                       </div>\n");
      out.write("                   </div>\n");
      out.write("               </div>\n");
      out.write("             </div>\n");
      out.write("              \n");
      out.write("          </div>\n");
      out.write("          </div> \n");
      out.write("      </div>\n");
      out.write("    </div>    \n");
      out.write("              \n");
      out.write("           \n");
      out.write("            \n");
      out.write("          </div>\n");
      out.write("\n");
      out.write("         <h1>");
      out.print(coursename+setid);
      out.write("</h1>\n");
      out.write("         ");

             for(int i=0;i<array.size();i++)
             {
                 out.println("<h1></h1>");
             }
         
      out.write("    \n");
      out.write("         \n");
      out.write("         \n");
      out.write("         \n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
