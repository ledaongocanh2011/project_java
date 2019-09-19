package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class homeAdmin_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(4);
    _jspx_dependants.add("/admin/layoutAdmin/headAdmin.jsp");
    _jspx_dependants.add("/admin/layoutAdmin/navAdmin.jsp");
    _jspx_dependants.add("/admin/layoutAdmin/menuAdmin.jsp");
    _jspx_dependants.add("/admin/layoutAdmin/jsAdmin.jsp");
  }

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
      out.write("    ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    <title>Bootstrap Dashboard by Bootstrapious.com</title>\n");
      out.write("    <meta name=\"description\" content=\"\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("    <meta name=\"robots\" content=\"all,follow\">\n");
      out.write("    <!-- Bootstrap CSS-->\n");
      out.write("    <link rel=\"stylesheet\" href=\"admin/vendor/bootstrap/css/bootstrap.min.css\">\n");
      out.write("    <!-- Font Awesome CSS-->\n");
      out.write("    <link rel=\"stylesheet\" href=\"admin/vendor/font-awesome/css/font-awesome.min.css\">\n");
      out.write("    <!-- Fontastic Custom icon font-->\n");
      out.write("    <link rel=\"stylesheet\" href=\"admin/css/fontastic.css\">\n");
      out.write("    <!-- Google fonts - Roboto -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/css?family=Roboto:300,400,500,700\">\n");
      out.write("    <!-- jQuery Circle-->\n");
      out.write("    <link rel=\"stylesheet\" href=\"admin/css/grasp_mobile_progress_circle-1.0.0.min.css\">\n");
      out.write("    <!-- Custom Scrollbar-->\n");
      out.write("    <link rel=\"stylesheet\" href=\"admin/vendor/malihu-custom-scrollbar-plugin/jquery.mCustomScrollbar.css\">\n");
      out.write("    <!-- theme stylesheet-->\n");
      out.write("    <link rel=\"stylesheet\" href=\"admin/css/style.default.css\" id=\"theme-stylesheet\">\n");
      out.write("    <!-- Custom stylesheet - for your changes-->\n");
      out.write("    <link rel=\"stylesheet\" href=\"admin/css/custom.css\">\n");
      out.write("    <!-- Favicon-->\n");
      out.write("    <link rel=\"shortcut icon\" href=\"admin/img/favicon.ico\">\n");
      out.write("    <!-- Tweaks for older IEs--><!--[if lt IE 9]>\n");
      out.write("        <script src=\"https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js\"></script>\n");
      out.write("        <script src=\"https://oss.maxcdn.com/respond/1.4.2/respond.min.js\"></script><![endif]-->\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<nav class=\"side-navbar\">\n");
      out.write("    <div class=\"side-navbar-wrapper\">\n");
      out.write("        <div class=\"sidenav-header d-flex align-items-center justify-content-center\">\n");
      out.write("            <div class=\"sidenav-header-inner text-center\"><img src=\"admin/img/ban.jpg\" alt=\"person\" class=\"img-fluid rounded-circle\">\n");
      out.write("                <h2 class=\"h5\">LÊ ĐÀO NGỌC ANH</h2><span>Web Developer</span>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"sidenav-header-logo\"><a href=\"index.html\" class=\"brand-small text-center\"> <strong>B</strong><strong class=\"text-primary\">D</strong></a></div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"main-menu\">\n");
      out.write("            <h5 class=\"sidenav-heading\">Main</h5>\n");
      out.write("            <ul id=\"side-main-menu\" class=\"side-menu list-unstyled\">                  \n");
      out.write("                <li><a href=\"productAdmin.jsp\"> <i class=\"icon-form\"></i>Quản lí sản phẩm</a></li>\n");
      out.write("                <li><a href=\"categoriesAdmin.jsp\"> <i class=\"icon-grid\"></i>Quản lí loại bánh</a></li>\n");
      out.write("                <li><a href=\"fillingCakeAdmin.jsp\"> <i class=\"icon-grid\"></i>Quản lí loại nhân</a></li>\n");
      out.write("                <li><a href=\"newsAdmin.jsp\"> <i class=\"icon-grid\"></i>Quản lí tin tức</a></li>\n");
      out.write("                <li><a href=\"tables.html\"> <i class=\"icon-grid\"></i>Quản lí khách hàng</a></li>\n");
      out.write("                <li><a href=\"charts.html\"> <i class=\"fa fa-bar-chart\"></i>Quản lí giỏ hàng</a></li>\n");
      out.write("                <li><a href=\"admin.jsp\"> <i class=\"icon-home\"></i>Quản lí admin</a></li>\n");
      out.write("                <li><a href=\"login.html\"> <i class=\"icon-interface-windows\"></i>Login page</a></li>\n");
      out.write("            </ul>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</nav>\n");
      out.write("\n");
      out.write("        <div class=\"page\">\n");
      out.write("            ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<header class=\"header\">\n");
      out.write("    <nav class=\"navbar\">\n");
      out.write("        <div class=\"container-fluid\">\n");
      out.write("            <div class=\"navbar-holder d-flex align-items-center justify-content-between\">\n");
      out.write("                <div class=\"navbar-header\">\n");
      out.write("                    <a id=\"toggle-btn\" href=\"#\" class=\"menu-btn\">\n");
      out.write("                        <i class=\"icon-bars\"></i>\n");
      out.write("                    </a>\n");
      out.write("                    <a href=\"index.html\" class=\"navbar-brand\">\n");
      out.write("                        <div class=\"brand-text d-none d-md-inline-block\"></div>\n");
      out.write("                    </a>\n");
      out.write("                </div>\n");
      out.write("                <ul class=\"nav-menu list-unstyled d-flex flex-md-row align-items-md-center\">\n");
      out.write("                    <li class=\"nav-item\"><a href=\"login.html\" class=\"nav-link logout\"> <span class=\"d-none d-sm-inline-block\">Logout</span><i class=\"fa fa-sign-out\"></i></a></li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </nav>\n");
      out.write("</header>\n");
      out.write("\n");
      out.write("            <div class=\"container\"> \n");
      out.write("                <div class=\"table-responsive\">\n");
      out.write("                    <div class=\"table-responsive\">\n");
      out.write("                    <button type=\"button\" class=\"btn btn-info float-right mt-4 mb-4\">Thêm</button>\n");
      out.write("                    <table class=\"table table-striped\">\n");
      out.write("                        <thead>\n");
      out.write("                            <tr>\n");
      out.write("                                <th>id</th>\n");
      out.write("                                <th class=\"text-center\">Tài khoản</th>\n");
      out.write("                                <th class=\"text-center\">Cấp độ</th>\n");
      out.write("                                <th class=\"text-center\">Trạng thái</th>\n");
      out.write("                                <th class=\"text-center\">Thao tác</th>\n");
      out.write("                            </tr>\n");
      out.write("                        </thead>\n");
      out.write("                        <tbody>\n");
      out.write("                            <tr>\n");
      out.write("                                <th scope=\"row\">1</th>\n");
      out.write("                                <td class=\"text-center\">Ngoc Anh</td>\n");
      out.write("                                <td class=\"text-center\">admin</td>\n");
      out.write("                                <td class=\"text-center\">đang hoạt động</td>\n");
      out.write("                                <td class=\"text-center\">\n");
      out.write("                                    <button type=\"button\" class=\"btn btn-success\">sửa</button>\n");
      out.write("                                    <button type=\"button\" class=\"btn btn-warning\">xóa</button>\n");
      out.write("                                </td>\n");
      out.write("                            </tr>\n");
      out.write("                        </tbody>\n");
      out.write("                    </table>\n");
      out.write("                </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<script src=\"admin/vendor/jquery/jquery.min.js\"></script>\n");
      out.write("<script src=\"admin/vendor/popper.js/umd/popper.min.js\"></script>\n");
      out.write("<script src=\"adminvendor/bootstrap/js/bootstrap.min.js\"></script>\n");
      out.write("<script src=\"admin/js/grasp_mobile_progress_circle-1.0.0.min.js\"></script>\n");
      out.write("<script src=\"admin/vendor/jquery.cookie/jquery.cookie.js\"></script>\n");
      out.write("<script src=\"admin/vendor/jquery-validation/jquery.validate.min.js\"></script>\n");
      out.write("<script src=\"admin/vendor/malihu-custom-scrollbar-plugin/jquery.mCustomScrollbar.concat.min.js\"></script>\n");
      out.write("<!-- Main File-->\n");
      out.write("<script src=\"admin/js/front.js\"></script>\n");
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
