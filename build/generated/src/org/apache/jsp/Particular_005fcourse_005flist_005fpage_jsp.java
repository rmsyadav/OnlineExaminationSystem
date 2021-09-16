package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.swing.JOptionPane;

public final class Particular_005fcourse_005flist_005fpage_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>TODO supply a title</title>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"Style/Navbar.css\"> \n");
      out.write("        <script type=\"text/javascript\" src=\"Script/jquery.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"Script/Form_validation.js\"></script>\n");
      out.write("         <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js\"></script>\n");
      out.write("  <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js\"></script>\n");
      out.write("  <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js\"></script>\n");
      out.write("  <style>\n");
      out.write("      body{\n");
      out.write("          margin:0px;\n");
      out.write("          border: 0px;\n");
      out.write("          padding-top: 60px;\n");
      out.write("      }\n");
      out.write("      .card{\n");
      out.write("            box-shadow: 10px 10px 10px 10px;\n");
      out.write("            margin: 10px;\n");
      out.write("            padding: 10px;\n");
      out.write("           \n");
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
      out.write("\n");
      out.write("        </style>\n");
      out.write("        <script>\n");
      out.write("      $(document).ready(function(){\n");
      out.write("           \n");
      out.write("           $(\"button\").click(function(){\n");
      out.write("              \n");
      out.write("              var setid=$(this).val();\n");
      out.write("              var coursename=$(\"#coursename\").val();\n");
      out.write("              window.location=\"TakeTestPage.jsp?coursename=\"+coursename+\"&setid=\"+setid;     \n");
      out.write("           \n");
      out.write("             }); \n");
      out.write("        });\n");
      out.write("\n");
      out.write("        </script>  \n");
      out.write("\n");
      out.write("    </head>\n");
      out.write(" <body>\n");
      out.write("     ");

       String coursename=request.getParameter("coursename");
       JOptionPane.showMessageDialog(null,coursename);
     
     
      out.write("\n");
      out.write("     <input type=\"hidden\" id=\"coursename\" value=\"");
      out.print(coursename);
      out.write("\">  \n");
      out.write("   <nav class=\"navbar navbar-expand-sm fixed-top\" >\n");
      out.write("            <div class=\"navbar-brand\" asp-area=\"\" asp-controller=\"Home\" >Welcome! ");
      out.print((String)session.getAttribute("username"));
      out.write("</div>\n");
      out.write("             \n");
      out.write("            <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#collapsibleNavbar\">\n");
      out.write("                 <span class=\"navbar-toggler-icon\" style=\"color:white\"></span>\n");
      out.write("            </button>    \n");
      out.write("     <div class=\"collapse navbar-collapse\" id=\"collapsibleNavbar\">\n");
      out.write("           <ul class=\"navbar-nav ml-auto\">\n");
      out.write("               <li class=\"nav-item\">\n");
      out.write("                <button type=\"button\" class=\"btn btn-success btn-sm\">\n");
      out.write("                    <span class=\"glyphicon glyphicon-log-out\"></span> Back To Course\n");
      out.write("                </button>\n");
      out.write("            </li>\n");
      out.write("             <li class=\"nav-item\">\n");
      out.write("                <button type=\"button\" class=\"btn btn-danger btn-sm\">\n");
      out.write("                    <span class=\"glyphicon glyphicon-log-out\"></span> Log out\n");
      out.write("                </button>\n");
      out.write("            </li>\n");
      out.write("            \n");
      out.write("          </ul>\n");
      out.write("  </div>   \n");
      out.write("                \n");
      out.write("                \n");
      out.write("                \n");
      out.write("                \n");
      out.write("            </div> \n");
      out.write("        </nav>\n");
      out.write("    <div class=\"container-fluid\">\n");
      out.write("      <div class=\"row\">\n");
      out.write("         <div  class=\"col-md-4\">\n");
      out.write("           <div class='card'>\n");
      out.write("               <a href=\"https://source.unsplash.com/user/erondu/400x300/?d\"><img src=\"");
      out.print("./Images/"+coursename);
      out.write("\" height=\"300\" width=\"375\"> </img></a>\n");
      out.write("             <div class=\"card-body\">\n");
      out.write("               <h4 class=\"card-title\">JAVA SET1</h4>\n");
      out.write("               <p class=\"card-text\">Total Question:25</p>\n");
      out.write("               <button class=\"btn btn-primary\" value=\"1\">Choose Set</button>\n");
      out.write("\n");
      out.write("             </div>\n");
      out.write("           </div>\n");
      out.write("              \n");
      out.write("           \n");
      out.write("            \n");
      out.write("          </div>\n");
      out.write("          <div  class=\"col-md-4\">\n");
      out.write("            <div class='card'>\n");
      out.write("           <a href=\"https://source.unsplash.com/user/erondu/400x300/?d\"><img src=\"");
      out.print("./Images/"+coursename);
      out.write("\" height=\"300\" width=\"375\"> </img></a>\n");
      out.write("             <div class=\"card-body\">\n");
      out.write("               <h4 class=\"card-title\">JAVA SET2</h4>\n");
      out.write("               <p class=\"card-text\">Total Question:20</p>\n");
      out.write("               <button class=\"btn btn-primary\" value=\"2\">Choose Set</button>\n");
      out.write("\n");
      out.write("             </div>\n");
      out.write("            </div>\n");
      out.write("          \n");
      out.write("          </div>\n");
      out.write("          <div  class=\"col-md-4\">\n");
      out.write("          <div class=\"card\">\n");
      out.write("          <a href=\"https://source.unsplash.com/user/erondu/400x300/?d\"><img src=\"");
      out.print("./Images/"+coursename);
      out.write("\" height=\"300\" width=\"375\"> </img></a> \n");
      out.write("           <div class=\"card-body\">\n");
      out.write("               <h4 class=\"card-title\">JAVA SET3</h4>\n");
      out.write("               <p class=\"card-text\">Total Question:20</p>\n");
      out.write("               <button class=\"btn btn-primary\" value=\"3\">Choose Set</button>\n");
      out.write("\n");
      out.write("             </div>\n");
      out.write("          </div>\n");
      out.write("          </div>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"row\">\n");
      out.write("          <div  class=\"col-md-4\">\n");
      out.write("          <div class='card'>\n");
      out.write("              <a href=\"https://source.unsplash.com/user/erondu/400x300/?d\"><img src=\"");
      out.print("./Images/"+coursename);
      out.write("\" height=\"300\" width=\"375\"> </img></a> \n");
      out.write("            <div class=\"card-body\">\n");
      out.write("               <h4 class=\"card-title\">JAVA SET4</h4>\n");
      out.write("               <p class=\"card-text\">Total Question:20</p>\n");
      out.write("               <button class=\"btn btn-primary\" value=\"4\">Choose Set</button>\n");
      out.write("\n");
      out.write("             </div>\n");
      out.write("          </div>\n");
      out.write("          </div>\n");
      out.write("          <div  class=\"col-md-4\">\n");
      out.write("          <div class='card'>\n");
      out.write("          <a href=\"https://source.unsplash.com/user/erondu/400x300/?d\"><img src=\"");
      out.print("./Images/"+coursename);
      out.write("\" height=\"300\" width=\"375\"> </img></a> \n");
      out.write("           <div class=\"card-body\">\n");
      out.write("               <h4 class=\"card-title\">JAVA SET5</h4>\n");
      out.write("               <p class=\"card-text\">Total Question:25</p>\n");
      out.write("               <button class=\"btn btn-primary\" value=\"5\">Choose Set</button>\n");
      out.write("\n");
      out.write("             </div>\n");
      out.write("          </div>\n");
      out.write("          </div>\n");
      out.write("          <div  class=\"col-md-4\">\n");
      out.write("          <div class='card'>\n");
      out.write("          <a href=\"https://source.unsplash.com/user/erondu/400x300/?d\"><img src=\"");
      out.print("./Images/"+coursename);
      out.write("\" height=\"300\" width=\"375\"> </img></a>\n");
      out.write("            <div class=\"card-body\">\n");
      out.write("               <h4 class=\"card-title\">JAVA SET6</h4>\n");
      out.write("               <p class=\"card-text\">Total Question:15</p>\n");
      out.write("               <button class=\"btn btn-primary\" value=\"6\">Choose Set</button>\n");
      out.write("\n");
      out.write("             </div>\n");
      out.write("          </div>\n");
      out.write("          </div>\n");
      out.write("      </div>\n");
      out.write("    </div> \n");
      out.write(" </body>\n");
      out.write("</html>\n");
      out.write("\n");
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
