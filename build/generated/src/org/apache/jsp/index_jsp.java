package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <title>Halaman Utama Siakad UIN Malang</title>\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <meta name=\"description\" content=\"\">\n");
      out.write("        <meta name=\"author\" content=\"\">\n");
      out.write("\n");
      out.write("        <!-- Le styles -->\n");
      out.write("        <link href=\"assets/css/bootstrap.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"assets/css/bootstrap-responsive.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"assets/css/custom.css\" rel=\"stylesheet\">\n");
      out.write("        <!-- HTML5 shim, for IE6-8 support of HTML5 elements -->\n");
      out.write("        <!--[if lt IE 9]>\n");
      out.write("          <script src=\"assets/js/html5shiv.js\"></script>\n");
      out.write("        <![endif]-->\n");
      out.write("\n");
      out.write("        <!-- Fav and touch icons -->\n");
      out.write("        <link rel=\"apple-touch-icon-precomposed\" sizes=\"144x144\" href=\"assets/ico/apple-touch-icon-144-precomposed.png\">\n");
      out.write("        <link rel=\"apple-touch-icon-precomposed\" sizes=\"114x114\" href=\"assets/ico/apple-touch-icon-114-precomposed.png\">\n");
      out.write("        <link rel=\"apple-touch-icon-precomposed\" sizes=\"72x72\" href=\"assets/ico/apple-touch-icon-72-precomposed.png\">\n");
      out.write("        <link rel=\"apple-touch-icon-precomposed\" href=\"assets/ico/apple-touch-icon-57-precomposed.png\">\n");
      out.write("        <link rel=\"shortcut icon\" href=\"assets/ico/back.png\">\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body style=\"background: url('assets/img/back.png') repeat-x top left;\">\n");
      out.write("\n");
      out.write("        <div class=\"container\">\n");
      out.write("\n");
      out.write("            <div class=\"masthead\">\n");
      out.write("                <div class=\"row-fluid\">\n");
      out.write("                    <div class=\"span2\">\n");
      out.write("                        <img height=\"100\" width=\"100\" src=\"assets/img/uin.jpg\" class=\"img-circle\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"span10\" style=\"width: 46.906%;\">\n");
      out.write("                        <h3 class=\"muted\" style=\"margin: 15px 0px;\">Siakad (Sistem Informasi Akademik) UIN Maliki Malang</h3>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <hr>\n");
      out.write("\n");
      out.write("                <div class=\"navbar navbar-inverse\">\n");
      out.write("                    <div class=\"navbar-inner\">\n");
      out.write("                        <div class=\"container\">\n");
      out.write("                            <ul class=\"nav\">\n");
      out.write("                                <li class=\"active\"><a href=\"index.jsp\">Home</a></li>\n");
      out.write("                                <li><a href=\"#\">UIN Maliki Projects</a></li>\n");
      out.write("                                <li><a href=\"#\">Lecturer Column</a></li>\n");
      out.write("                                <li><a href=\"#\">About</a></li>\n");
      out.write("                                <li><a href=\"#\">Contact LPSI</a></li>\n");
      out.write("                            </ul>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div><!-- /.navbar -->\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <!-- Jumbotron -->\n");
      out.write("            <div class=\"jumbotron\">\n");
      out.write("                <div class=\"container\">\n");
      out.write("\n");
      out.write("                    <form method=\"post\" class=\"form-signin\" action=\"/Siakad/login.do\">\n");
      out.write("                        <h2 class=\"form-signin-heading\">Please sign in</h2>\n");
      out.write("                        <input name=\"id\" type=\"text\" class=\"input-block-level\" placeholder=\"Your Id\">\n");
      out.write("                        <input name=\"pass\" type=\"password\" class=\"input-block-level\" placeholder=\"Password\">\n");
      out.write("                        <select class=\"input-block-level\">\n");
      out.write("                            <option>--Level--</option>\n");
      out.write("                            <option value=\"Admin\">Admin</option>\n");
      out.write("                            <option value=\"Admin\">Dosen</option>\n");
      out.write("                            <option value=\"Admin\">Mahasiswa</option>\n");
      out.write("                        </select>\n");
      out.write("                        <label class=\"checkbox\">\n");
      out.write("                            <input type=\"checkbox\" value=\"remember-me\"> Remember me\n");
      out.write("                        </label>\n");
      out.write("                        <button class=\"btn btn-large btn-success\" type=\"submit\">Sign in</button>\n");
      out.write("                        <button class=\"btn btn-large btn-warning\" type=\"reset\">Reset</button>\n");
      out.write("                    </form>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <hr>\n");
      out.write("\n");
      out.write("            <!-- Example row of columns -->\n");
      out.write("            <div class=\"row-fluid\">\n");
      out.write("                <div class=\"span6\">\n");
      out.write("                    <h2>Lecturer Column</h2>\n");
      out.write("                    <p>Donec id elit non mi porta gravida at eget metus. Fusce dapibus, tellus ac cursus commodo, tortor mauris condimentum nibh, ut fermentum massa justo sit amet risus. Etiam porta sem malesuada magna mollis euismod. Donec sed odio dui. </p>\n");
      out.write("                    <p><a class=\"btn\" href=\"#\">View details &raquo;</a></p>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"span6\">\n");
      out.write("                    <h2>Students Column</h2>\n");
      out.write("                    <p>Donec id elit non mi porta gravida at eget metus. Fusce dapibus, tellus ac cursus commodo, tortor mauris condimentum nibh, ut fermentum massa justo sit amet risus. Etiam porta sem malesuada magna mollis euismod. Donec sed odio dui. </p>\n");
      out.write("                    <p><a class=\"btn\" href=\"#\">View details &raquo;</a></p>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <hr>\n");
      out.write("\n");
      out.write("            <div class=\"footer\">\n");
      out.write("                <p>&copy; Kelas Pemrograman Web B 2013</p>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </div> <!-- /container -->\n");
      out.write("\n");
      out.write("        <!-- Le javascript\n");
      out.write("        ================================================== -->\n");
      out.write("        <!-- Placed at the end of the document so the pages load faster -->\n");
      out.write("        <script src=\"assets/js/jquery.js\"></script>\n");
      out.write("        <script src=\"assets/js/bootstrap-transition.js\"></script>\n");
      out.write("        <script src=\"assets/js/bootstrap-alert.js\"></script>\n");
      out.write("        <script src=\"assets/js/bootstrap-modal.js\"></script>\n");
      out.write("        <script src=\"assets/js/bootstrap-dropdown.js\"></script>\n");
      out.write("        <script src=\"assets/js/bootstrap-scrollspy.js\"></script>\n");
      out.write("        <script src=\"assets/js/bootstrap-tab.js\"></script>\n");
      out.write("        <script src=\"assets/js/bootstrap-tooltip.js\"></script>\n");
      out.write("        <script src=\"assets/js/bootstrap-popover.js\"></script>\n");
      out.write("        <script src=\"assets/js/bootstrap-button.js\"></script>\n");
      out.write("        <script src=\"assets/js/bootstrap-collapse.js\"></script>\n");
      out.write("        <script src=\"assets/js/bootstrap-carousel.js\"></script>\n");
      out.write("        <script src=\"assets/js/bootstrap-typeahead.js\"></script>\n");
      out.write("\n");
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
