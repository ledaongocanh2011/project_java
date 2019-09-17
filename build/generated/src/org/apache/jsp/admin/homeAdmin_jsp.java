package org.apache.jsp.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class homeAdmin_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("  <head>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    <title>Bootstrap Dashboard by Bootstrapious.com</title>\n");
      out.write("    <meta name=\"description\" content=\"\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("    <meta name=\"robots\" content=\"all,follow\">\n");
      out.write("    <!-- Bootstrap CSS-->\n");
      out.write("    <link rel=\"stylesheet\" href=\"vendor/bootstrap/css/bootstrap.min.css\">\n");
      out.write("    <!-- Font Awesome CSS-->\n");
      out.write("    <link rel=\"stylesheet\" href=\"vendor/font-awesome/css/font-awesome.min.css\">\n");
      out.write("    <!-- Fontastic Custom icon font-->\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/fontastic.css\">\n");
      out.write("    <!-- Google fonts - Roboto -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/css?family=Roboto:300,400,500,700\">\n");
      out.write("    <!-- jQuery Circle-->\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/grasp_mobile_progress_circle-1.0.0.min.css\">\n");
      out.write("    <!-- Custom Scrollbar-->\n");
      out.write("    <link rel=\"stylesheet\" href=\"vendor/malihu-custom-scrollbar-plugin/jquery.mCustomScrollbar.css\">\n");
      out.write("    <!-- theme stylesheet-->\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/style.default.css\" id=\"theme-stylesheet\">\n");
      out.write("    <!-- Custom stylesheet - for your changes-->\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/custom.css\">\n");
      out.write("    <!-- Favicon-->\n");
      out.write("    <link rel=\"shortcut icon\" href=\"img/favicon.ico\">\n");
      out.write("    <!-- Tweaks for older IEs--><!--[if lt IE 9]>\n");
      out.write("        <script src=\"https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js\"></script>\n");
      out.write("        <script src=\"https://oss.maxcdn.com/respond/1.4.2/respond.min.js\"></script><![endif]-->\n");
      out.write("  </head>\n");
      out.write("  <body>\n");
      out.write("    <!-- Side Navbar -->\n");
      out.write("    <nav class=\"side-navbar\">\n");
      out.write("      <div class=\"side-navbar-wrapper\">\n");
      out.write("        <!-- Sidebar Header    -->\n");
      out.write("        <div class=\"sidenav-header d-flex align-items-center justify-content-center\">\n");
      out.write("          <!-- User Info-->\n");
      out.write("          <div class=\"sidenav-header-inner text-center\"><img src=\"img/ban.jpg\" alt=\"person\" class=\"img-fluid rounded-circle\">\n");
      out.write("            <h2 class=\"h5\">LÊ ĐÀO NGỌC ANH</h2><span>Web Developer</span>\n");
      out.write("          </div>\n");
      out.write("          <!-- Small Brand information, appears on minimized sidebar-->\n");
      out.write("          <div class=\"sidenav-header-logo\"><a href=\"index.html\" class=\"brand-small text-center\"> <strong>B</strong><strong class=\"text-primary\">D</strong></a></div>\n");
      out.write("        </div>\n");
      out.write("        <!-- Sidebar Navigation Menus-->\n");
      out.write("        <div class=\"main-menu\">\n");
      out.write("          <h5 class=\"sidenav-heading\">Main</h5>\n");
      out.write("          <ul id=\"side-main-menu\" class=\"side-menu list-unstyled\">                  \n");
      out.write("            <li><a href=\"forms.html\"> <i class=\"icon-form\"></i>Quản lí sản phẩm</a></li>\n");
      out.write("            <li><a href=\"charts.html\"> <i class=\"fa fa-bar-chart\"></i>Quản lí loại bánh</a></li>\n");
      out.write("            <li><a href=\"tables.html\"> <i class=\"icon-grid\"></i>Quản lí loại nhân</a></li>\n");
      out.write("            <li><a href=\"tables.html\"> <i class=\"icon-grid\"></i>Quản lí tin tức</a></li>\n");
      out.write("            <li><a href=\"tables.html\"> <i class=\"icon-grid\"></i>Quản lí giỏ hàng</a></li>\n");
      out.write("            <li><a href=\"tables.html\"> <i class=\"icon-grid\"></i>Quản lí khách hàng</a></li>\n");
      out.write("            <li><a href=\"tables.html\"> <i class=\"icon-home\"></i>Quản lí admin</a></li>\n");
      out.write("            <li><a href=\"#exampledropdownDropdown\" aria-expanded=\"false\" data-toggle=\"collapse\"> <i class=\"icon-interface-windows\"></i>Example dropdown </a>\n");
      out.write("              <ul id=\"exampledropdownDropdown\" class=\"collapse list-unstyled \">\n");
      out.write("                <li><a href=\"#\">Page</a></li>\n");
      out.write("                <li><a href=\"#\">Page</a></li>\n");
      out.write("                <li><a href=\"#\">Page</a></li>\n");
      out.write("              </ul>\n");
      out.write("            </li>\n");
      out.write("            <li><a href=\"login.html\"> <i class=\"icon-interface-windows\"></i>Login page</a></li>\n");
      out.write("          </ul>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </nav>\n");
      out.write("    <div class=\"page\">\n");
      out.write("      <!-- navbar-->\n");
      out.write("      <header class=\"header\">\n");
      out.write("        <nav class=\"navbar\">\n");
      out.write("          <div class=\"container-fluid\">\n");
      out.write("            <div class=\"navbar-holder d-flex align-items-center justify-content-between\">\n");
      out.write("              <div class=\"navbar-header\"><a id=\"toggle-btn\" href=\"#\" class=\"menu-btn\"><i class=\"icon-bars\"> </i></a><a href=\"index.html\" class=\"navbar-brand\">\n");
      out.write("                  <div class=\"brand-text d-none d-md-inline-block\"></div></a></div>\n");
      out.write("              <ul class=\"nav-menu list-unstyled d-flex flex-md-row align-items-md-center\">\n");
      out.write("                <!-- Log out-->\n");
      out.write("                <li class=\"nav-item\"><a href=\"login.html\" class=\"nav-link logout\"> <span class=\"d-none d-sm-inline-block\">Logout</span><i class=\"fa fa-sign-out\"></i></a></li>\n");
      out.write("              </ul>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        </nav>\n");
      out.write("      </header>\n");
      out.write("    </div>\n");
      out.write("    <!-- JavaScript files-->\n");
      out.write("    <script src=\"vendor/jquery/jquery.min.js\"></script>\n");
      out.write("    <script src=\"vendor/popper.js/umd/popper.min.js\"> </script>\n");
      out.write("    <script src=\"vendor/bootstrap/js/bootstrap.min.js\"></script>\n");
      out.write("    <script src=\"js/grasp_mobile_progress_circle-1.0.0.min.js\"></script>\n");
      out.write("    <script src=\"vendor/jquery.cookie/jquery.cookie.js\"> </script>\n");
      out.write("    <script src=\"vendor/jquery-validation/jquery.validate.min.js\"></script>\n");
      out.write("    <script src=\"vendor/malihu-custom-scrollbar-plugin/jquery.mCustomScrollbar.concat.min.js\"></script>\n");
      out.write("    <!-- Main File-->\n");
      out.write("    <script src=\"js/front.js\"></script>\n");
      out.write("  </body>\n");
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
