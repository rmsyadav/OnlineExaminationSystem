package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.swing.JOptionPane;
import Dao.ResultStoreDao;
import DTO.ResultStore;

public final class ResultShowPage_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"Style/Navbar.css\"> \n");
      out.write("        <script type=\"text/javascript\" src=\"Script/jquery.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"Script/Form_validation.js\"></script>\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js\"></script>\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js\"></script>\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js\"></script>\n");
      out.write("        <style>\n");
      out.write("        body{\n");
      out.write("          margin:0px;\n");
      out.write("          border: 0px;\n");
      out.write("          padding-top: 90px;\n");
      out.write("          }          \n");
      out.write("      \n");
      out.write("        #sub{\n");
      out.write("         background-color:#2196F3;        \n");
      out.write("         display: flex;\n");
      out.write("         align-items: center;\n");
      out.write("         justify-content: center;\n");
      out.write("         box-shadow:10px 10px 10px 10px;\n");
      out.write("           }\n");
      out.write("       .card{\n");
      out.write("            box-shadow: 10px 10px 10px 10px;\n");
      out.write("            margin: auto;\n");
      out.write("            padding: 10px;\n");
      out.write("                                 \n");
      out.write("            }\n");
      out.write("            .card-header{\n");
      out.write("              box-shadow: 5px 5px 5px 5px;  \n");
      out.write("            }\n");
      out.write("            .card-body{\n");
      out.write("              box-shadow: 3px 3px 3px 3px;  \n");
      out.write("            }\n");
      out.write("           .card-footer{\n");
      out.write("              box-shadow: 1px 1px 1px 1px;  \n");
      out.write("            }\n");
      out.write("\n");
      out.write("             \n");
      out.write("      .container-fluid{\n");
      out.write("          display: flex;\n");
      out.write("          justify-content: center;\n");
      out.write("          flex-direction: row;\n");
      out.write("      }\n");
      out.write("      #question{\n");
      out.write("         box-shadow:5px 5px 5px 5px;  \n");
      out.write("         padding: 5px;\n");
      out.write("      }\n");
      out.write("      table,tr,td,th{\n");
      out.write("          border: 1px solid black;\n");
      out.write("      }\n");
      out.write("\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("<body>\n");
      out.write("        ");
 
        String user=(String)session.getAttribute("username");
        String userid=(String)session.getAttribute("userid");
        String language=request.getParameter("language");
        String setid=request.getParameter("setid");
        String totalqno=request.getParameter("totalqno");
        ResultStore rs=ResultStoreDao.getResultByLanguageAndId(userid, language, setid);
        int unatempt=Integer.parseInt(totalqno)-(rs.getTotalrightanswer()+rs.getTotalwronganswer());
        
        double percentage=(double)rs.getTotalrightanswer()/Integer.parseInt(totalqno)*100;
         
      out.write("\n");
      out.write("       <nav class=\"navbar navbar-expand-sm fixed-top\" >\n");
      out.write("       <div class=\"navbar-brand\" asp-area=\"\" asp-controller=\"Home\" >Welcome! ");
      out.print((String)session.getAttribute("username"));
      out.write("</div>\n");
      out.write("             \n");
      out.write("            <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#collapsibleNavbar\">\n");
      out.write("                 <span class=\"navbar-toggler-icon\" style=\"color:white\"></span>\n");
      out.write("            </button>    \n");
      out.write("       <div class=\"collapse navbar-collapse\" id=\"collapsibleNavbar\">\n");
      out.write("           <ul class=\"navbar-nav ml-auto\">\n");
      out.write("            <li class=\"nav-item\">\n");
      out.write("                <button type=\"button\" class=\"btn btn-success btn-sm\">\n");
      out.write("                    <span class=\"glyphicon glyphicon-log-out\"></span>Back To Courses\n");
      out.write("                </button>\n");
      out.write("             </li>\n");
      out.write("\n");
      out.write("             <li class=\"nav-item\">\n");
      out.write("                <button type=\"button\" class=\"btn btn-danger btn-sm\">\n");
      out.write("                    <span class=\"glyphicon glyphicon-log-out\"></span> Log out\n");
      out.write("                </button>\n");
      out.write("             </li>\n");
      out.write("            \n");
      out.write("             </ul>\n");
      out.write("          </div>            \n");
      out.write("        </div> \n");
      out.write("      </nav>\n");
      out.write("   <div class=\"container-fluid\">\n");
      out.write("        \n");
      out.write("        <div class=\"row\">\n");
      out.write("             <div class='col-sm-12'>\n");
      out.write("                   <div class=\"card text-center\">\n");
      out.write("                       <div class=\"card-header\" style='font-weight:50px;font-family: sans-serif;font-style: bold;color: green'><h4 class=\"card-header\">Scorcard</h4></div>\n");
      out.write("                       <div class=\"card-header\">\n");
      out.write("                        <div class=\"table-responsive-sm\">   \n");
      out.write("                          <table class=\"table table-hover table-dark\">\n");
      out.write("                               <thead>\n");
      out.write("                                   <tr>\n");
      out.write("                                       \n");
      out.write("                               <th>Coursename</th><th>SETNAME</th><th>TotalRightAnswer</th><th>TotalWrongAnswer</th><th>UnAttempt</th><th>TotalPercentage</th>                                   \n");
      out.write("                                   </tr>\n");
      out.write("                                </thead> \n");
      out.write("                           </table>\n");
      out.write("                          </div>      \n");
      out.write("                       </div>\n");
      out.write("                       <div class=\"card-body\">\n");
      out.write("                           <table class=\"table table-hover table-dark\">\n");
      out.write("                               \n");
      out.write("                                <tbody>\n");
      out.write("                                  <tr>\n");
      out.write("                                     \n");
      out.write("                                      <td>");
      out.print(rs.getLanguage().toUpperCase());
      out.write("</td>\n");
      out.write("                                     <td>SET");
      out.print(setid);
      out.write("</td>\n");
      out.write("                                      <td>");
      out.print(rs.getTotalrightanswer());
      out.write("</td>\n");
      out.write("                                      <td>");
      out.print(rs.getTotalwronganswer());
      out.write("</td>\n");
      out.write("                                      <td>");
      out.print(unatempt);
      out.write("</td>\n");
      out.write("                                      <td>");
      out.print(percentage);
      out.write("</td>\n");
      out.write("                                  </tr>\n");
      out.write("                               </tbody>\n");
      out.write("                         </table>\n");
      out.write("                        \n");
      out.write("                          \n");
      out.write("                       </div>\n");
      out.write("                       <div class=\"card-footer text-muted\">Copy@Right Online Eximination Sytem</div>\n");
      out.write("</div>\n");
      out.write("                  \n");
      out.write("              </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
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
