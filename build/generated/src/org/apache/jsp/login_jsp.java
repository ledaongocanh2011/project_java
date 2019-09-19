package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/layout/head.jsp");
    _jspx_dependants.add("/layout/js.jsp");
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
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <title>Moon Cake</title>\n");
      out.write("    <link rel=\"stylesheet\" href=\"public/css/bootstrap.min.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"public/awe/font-awesome/css/font-awesome.min.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"public/OwlCarousel/dist/assets/owl.carousel.min.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"public/OwlCarousel/dist/assets/owl.theme.default.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"public/css/style.css\">\n");
      out.write("    <link rel=\"icon\" href=\"public/img/logo/logo.png\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"public/css/products.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"public/css/filling_cake.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"public/css/detail.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"public/css/news.css\">\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("    <link rel=\"stylesheet\" href=\"public/css/login.css\">\n");
      out.write("    <body>\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <button type=\"button\" class=\"btn btn-warning float-right mt-5\"><a href=\"index.html\">Trang chủ</a></button>\n");
      out.write("            <div class=\"row justify-content-center\">\n");
      out.write("                <div class=\"col-4 align-self-center login mt-5\">\n");
      out.write("                    <h1 class=\"text-center font-weight-light text-uppercase text-secondary\">bảng đăng nhập</h1>\n");
      out.write("                    <form action=\"\" method=\"post\" class=\"pt-4\">\n");
      out.write("                        <fieldset class=\"form-group\">\n");
      out.write("                            <label for=\"email\">Email:</label>\n");
      out.write("                            <input type=\"text\" class=\"form-control\" id=\"email\" name=\"email\" placeholder=\"Nhập Email\">\n");
      out.write("                        </fieldset>\n");
      out.write("                        <fieldset class=\"form-group\">\n");
      out.write("                            <label for=\"password\">Mật khẩu:</label>\n");
      out.write("                            <input type=\"password\" class=\"form-control\" id=\"password\" name=\"password\" placeholder=\"Nhập mật khẩu\">\n");
      out.write("                        </fieldset>\n");
      out.write("                        <p class=\"text-center\">\n");
      out.write("                            <button class=\"btn btn-primary text-uppercase btn-block\" type=\"submit\" name=\"login\" onclick=\"\">đăng nhập</button>\n");
      out.write("                        </p>\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<script src=\"public/js/jquery-3.3.1.slim.min.js\"></script>\n");
      out.write("<script src=\"public/js/popper.min.js\"></script>\n");
      out.write("<script src=\"public/js/bootstrap.min.js\"></script>\n");
      out.write("<script src=\"public/OwlCarousel/dist/owl.carousel.min.js\"></script>\n");
      out.write("<script >\n");
      out.write("    $(document).ready(function () {\n");
      out.write("        $('.owl-carousel').owlCarousel({\n");
      out.write("            loop: true,\n");
      out.write("            margin: 10,\n");
      out.write("            responsiveClass: true,\n");
      out.write("            responsive: {\n");
      out.write("                0: {\n");
      out.write("                    items: 1,\n");
      out.write("                    nav: true\n");
      out.write("                },\n");
      out.write("                600: {\n");
      out.write("                    items: 2,\n");
      out.write("                    nav: false\n");
      out.write("                },\n");
      out.write("                1000: {\n");
      out.write("                    items: 4,\n");
      out.write("                    nav: true,\n");
      out.write("                    loop: false,\n");
      out.write("                    margin: 20\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("        });\n");
      out.write("    })\n");
      out.write("</script>\n");
      out.write("<script>\n");
      out.write("    $(document).ready(function () {\n");
      out.write("        $('.search').click(function () {\n");
      out.write("            $('#search-header').slideToggle(\"slow\");\n");
      out.write("        });\n");
      out.write("    });\n");
      out.write("</script>");
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
