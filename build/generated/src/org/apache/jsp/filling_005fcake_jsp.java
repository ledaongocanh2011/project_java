package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.sound.midi.Soundbank;
import java.sql.ResultSet;
import SQL.connect_SQL;

public final class filling_005fcake_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(4);
    _jspx_dependants.add("/layout/head.jsp");
    _jspx_dependants.add("/layout/header.jsp");
    _jspx_dependants.add("/layout/partner.jsp");
    _jspx_dependants.add("/layout/footer.jsp");
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
      out.write("\n");
      out.write("\n");
      out.write("\n");

    connect_SQL conn = new connect_SQL("root", "", "do_an_java");
    conn.getConnect();
    ResultSet rs = conn.getFilling(1);

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
      out.write("    <link rel=\"stylesheet\" href=\"public/css/cart.css\">\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<header>\n");
      out.write("    <div class=\"container\">\n");
      out.write("        <div class=\"top d-flex justify-content-center\">\n");
      out.write("            <div class=\"logo\">\n");
      out.write("                <a href=\"index.jsp\"></a>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"menu float-left \">\n");
      out.write("                <nav class=\"navbar navbar-expand-lg navbar-light\">\n");
      out.write("                    <div class=\"collapse navbar-collapse \" id=\"navbarNav\">\n");
      out.write("                        <ul class=\"navbar-nav align-self-center text-uppercase\">\n");
      out.write("                            <li class=\"nav-item active\">\n");
      out.write("                                <a class=\"nav-link\" href=\"index.jsp\">Giới thiệu</a>\n");
      out.write("                            </li>\n");
      out.write("                            <li class=\"nav-item\">\n");
      out.write("                                <a class=\"nav-link\" href=\"products.jsp\">Sản phẩm</a>\n");
      out.write("                            </li>\n");
      out.write("                            <li class=\"nav-item\">\n");
      out.write("                                <a class=\"nav-link\" href=\"filling_cake.jsp\">Các loại nhân</a>\n");
      out.write("                            </li>\n");
      out.write("                            <li class=\"nav-item\">\n");
      out.write("                                <a class=\"nav-link\" href=\"news.jsp\">Tin tức</a>\n");
      out.write("                            </li>\n");
      out.write("                            <li class=\"nav-item\">\n");
      out.write("                                <a class=\"nav-link search\"><i class=\"fa fa-search\" aria-hidden=\"true\"></i></a>\n");
      out.write("                            </li>\n");
      out.write("                            <li class=\"nav-item\">\n");
      out.write("                                <ul>\n");
      out.write("                                    <li class=\"dropdown profile_details_drop\">\n");
      out.write("                                        <a href=\"#\" class=\"dropdown-toggle nav-link\" data-toggle=\"dropdown\"><i class=\"fa fa-user\" aria-hidden=\"true\"></i></a>\n");
      out.write("                                        <div class=\"mega-dropdown-menu\">\n");
      out.write("                                            <div class=\"w3ls_vegetables\">\n");
      out.write("                                                <ul class=\"dropdown-menu drp-mnu \">\n");
      out.write("                                                    <li>\n");
      out.write("                                                        <button type=\"button\" class=\"btn text-white text-uppercase\" data-toggle=\"modal\" data-target=\"#login\">\n");
      out.write("                                                            Đăng nhập\n");
      out.write("                                                        </button>\n");
      out.write("                                                    </li> \n");
      out.write("                                                    <li><button type=\"button\" class=\"btn text-white text-uppercase\" data-toggle=\"modal\" data-target=\"#registration\">\n");
      out.write("                                                            Đăng kí\n");
      out.write("                                                        </button></li>\n");
      out.write("                                                </ul>\n");
      out.write("                                            </div>                  \n");
      out.write("                                        </div>\t\n");
      out.write("                                    </li>\n");
      out.write("                                </ul>\n");
      out.write("                            </li>\n");
      out.write("\n");
      out.write("                            <li class=\"nav-item\">\n");
      out.write("                                <a class=\"nav-link\" href=\"#\"><img src=\"public/img/products/cart.png\" alt=\"\"></a>\n");
      out.write("                            </li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                </nav>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"sear\">\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <form action=\"search.php\" class=\"form-inline\" id=\"search-header\" method=\"get\">\n");
      out.write("                        <input type=\"text\" name=\"search\" placeholder=\"Tìm kiếm...\" class=\"form-control\">\n");
      out.write("                        <button type=\"submit\" class=\" btn btn-success\"><i class=\"fa fa-search\"></i></button>\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"modal fade\" id=\"login\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"exampleModalScrollableTitle\" aria-hidden=\"true\">\n");
      out.write("                <div class=\"modal-dialog modal-dialog-scrollable\" role=\"document\">\n");
      out.write("                    <div class=\"modal-content\">\n");
      out.write("                        <div class=\"modal-body\">\n");
      out.write("                            <form method=\"post\">\n");
      out.write("                                <h4 class=\"text-uppercase text-center\">đăng nhập tài khoản</h4>\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <label for=\"exampleInputEmail1\">Email</label>\n");
      out.write("                                    <input type=\"email\" name=\"email\" class=\"form-control\" id=\"exampleInputEmail1\" aria-describedby=\"emailHelp\" placeholder=\"Enter email\">\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <label for=\"exampleInputPassword1\">Password</label>\n");
      out.write("                                    <input type=\"password\" name=\"password\" class=\"form-control\" id=\"exampleInputPassword1\" placeholder=\"Password\">\n");
      out.write("                                </div>\n");
      out.write("                                <button name=\"dangnhap\" type=\"submit\" class=\"btn btn-primary\">Đăng nhập</button>\n");
      out.write("                            </form>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"modal-footer\">\n");
      out.write("                            <button type=\"button\" class=\"btn btn-secondary\" data-dismiss=\"modal\">Close</button>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"modal fade\" id=\"registration\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"registration\" aria-hidden=\"true\">\n");
      out.write("                <div class=\"modal-dialog\" role=\"document\">\n");
      out.write("                    <div class=\"modal-content\">\n");
      out.write("                        <div class=\"modal-body\">\n");
      out.write("                            <form action=\"#\" method=\"post\">\n");
      out.write("                                <h4 class=\"text-uppercase text-center\">đăng kí tài khoản</h4>\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <label for=\"email\">Email</label>\n");
      out.write("                                    <input type=\"email\" name=\"email\" class=\"form-control\" id=\"abc\" aria-describedby=\"emailHelp\" placeholder=\"Enter email\">\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <label for=\"phone\">Số điện thoại</label>\n");
      out.write("                                    <input type=\"text\" name=\"phone\" class=\"form-control\" id=\"xyz\" placeholder=\"nhập số điện thoại\">\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <label for=\"password\">Mật khẩu</label>\n");
      out.write("                                    <input type=\"password\" name=\"password\" class=\"form-control\" id=\"something\" placeholder=\"mật khẩu\">\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <label for=\"address\">Địa chỉ</label>\n");
      out.write("                                    <textarea name=\"address\"  rows=\"5\" class=\"form-control \"></textarea>\n");
      out.write("                                </div>\n");
      out.write("                                <button name=\"dangki\" type=\"submit\" class=\"btn btn-primary\">Đăng kí</button>\n");
      out.write("                            </form>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"modal-footer\">\n");
      out.write("                            <button type=\"button\" name=\"dangki\" class=\"btn btn-secondary\" data-dismiss=\"modal\">Close</button>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</header>\n");
      out.write("\n");
      out.write("        <main>\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"banner\">\n");
      out.write("                    <img src=\"public/img/background/nen.jpg\" alt=\"\" class=\"img-fluid\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"filling\">\n");
      out.write("                    <div class=\"name pt-5\">\n");
      out.write("                        <h3 class=\"text-center text-uppercase text text-light\">các loại nhân</h3>\n");
      out.write("                        <div class=\"row pt-5\">\n");
      out.write("                            <div class=\"col-6\">\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <select name=\"adfasdfds\" id=\"inputState\" class=\"form-control\">\n");
      out.write("                                        ");

                                            while (rs.next()) {
                                        
      out.write("\n");
      out.write("                                        <option selected value=\"");
 out.print(rs.getString("id")); 
      out.write("\">\n");
      out.write("                                            ");

                                                out.print(rs.getString("ten_loai_nhan"));
                                            
      out.write("\n");
      out.write("                                        </option>\n");
      out.write("                                        <!--<option>...</option>-->\n");
      out.write("                                        ");
}
      out.write("\n");
      out.write("                                    </select>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-6\">\n");
      out.write("                                <form class=\"form-inline float-right\">\n");
      out.write("                                    <input class=\"form-control mr-sm-2\" type=\"search\" placeholder=\"Search\" aria-label=\"Search\">\n");
      out.write("                                    <button class=\"btn btn-outline-warning my-2 my-sm-0\" type=\"submit\">Search</button>\n");
      out.write("                                </form>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"cake pt-5\">\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"col-3\">\n");
      out.write("                                <div class=\"card\" style=\"width: 13rem\">\n");
      out.write("                                    <a href=\"#\">\n");
      out.write("                                        <img src=\"public/img/products/d1.png\" alt=\"\" class=\" card-img-top\" >\n");
      out.write("                                    </a>\n");
      out.write("                                    <div class=\"card-body\">\n");
      out.write("                                        <h5 class=\"\ttext-center text-danger card-title\"> bánh dẻo</h5>\n");
      out.write("                                        <p class=\"card-text\">100,000</p>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-3\">\n");
      out.write("                                <div class=\"card\" style=\"width: 13rem\">\n");
      out.write("                                    <a href=\"#\">\n");
      out.write("                                        <img src=\"public/img/products/d1.png\" alt=\"\" class=\" card-img-top\" >\n");
      out.write("                                    </a>\n");
      out.write("                                    <div class=\"card-body\">\n");
      out.write("                                        <h5 class=\"\ttext-center text-danger card-title\"> bánh dẻo</h5>\n");
      out.write("                                        <p class=\"card-text\">100,000</p>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-3\">\n");
      out.write("                                <div class=\"card\" style=\"width: 13rem\">\n");
      out.write("                                    <a href=\"#\">\n");
      out.write("                                        <img src=\"public/img/products/d1.png\" alt=\"\" class=\" card-img-top\" >\n");
      out.write("                                    </a>\n");
      out.write("                                    <div class=\"card-body\">\n");
      out.write("                                        <h5 class=\"\ttext-center text-danger card-title\"> bánh dẻo</h5>\n");
      out.write("                                        <p class=\"card-text\">100,000</p>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-3\">\n");
      out.write("                                <div class=\"card\" style=\"width: 13rem\">\n");
      out.write("                                    <a href=\"#\">\n");
      out.write("                                        <img src=\"public/img/products/d1.png\" alt=\"\" class=\" card-img-top\" >\n");
      out.write("                                    </a>\n");
      out.write("                                    <div class=\"card-body\">\n");
      out.write("                                        <h5 class=\"\ttext-center text-danger card-title\"> bánh dẻo</h5>\n");
      out.write("                                        <p class=\"card-text\">100,000</p>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<div class=\"partner pb-5\">\n");
      out.write("    <h3 class=\"text-uppercase text-center title pt-5 text-warning\">khách hàng của chúng tôi</h3>\n");
      out.write("    <div class=\"owl-carousel owl-theme pt-4\">\n");
      out.write("        <div class=\"item\"  style=\"width: 10rem\">\n");
      out.write("            <img src=\"public/img/partner/canon.png\" alt=\"\" class=\"img-fluid\">\n");
      out.write("        </div>\n");
      out.write("        <div class=\"item\" style=\"width: 9rem\">\n");
      out.write("            <img src=\"public/img/partner/fpt.png\" alt=\"\" class=\"img-fluid\">\n");
      out.write("        </div>\n");
      out.write("        <div class=\"item\"  style=\"width: 9rem\">\n");
      out.write("            <img src=\"public/img/partner/techcombank.png\" alt=\"\" class=\"img-fluid\">\n");
      out.write("        </div>\n");
      out.write("        <div class=\"item\" style=\"width: 8rem\">\n");
      out.write("            <img src=\"public/img/partner/vincom.png\" alt=\"\" class=\"img-fluid\">\n");
      out.write("        </div>\n");
      out.write("        <div class=\"item\"  style=\"width: 10rem\">\n");
      out.write("            <img src=\"public/img/partner/canon.png\" alt=\"\" class=\"img-fluid\">\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </main>\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<footer>\n");
      out.write("    <div class=\"container\">\n");
      out.write("        <div class=\"contact\">\n");
      out.write("            <div class=\"row pt-5 bg\">\n");
      out.write("                <div class=\"col-6\">\n");
      out.write("                    <h3 class=\"text-center text-uppercase text-light pb-5\">liên hệ với chúng tôi</h3>\n");
      out.write("                    <h4 class=\"pb-4\">\n");
      out.write("                        <i class=\"fa fa-map-marker\" aria-hidden=\"true\"></i>\n");
      out.write("                        Bánh trung thu Long Đình là sản phẩm của Nhà hàng Long Đình\n");
      out.write("                    </h4>\n");
      out.write("                    <h4 class=\"pb-4\">\n");
      out.write("                        <i class=\"fa fa-university\" aria-hidden=\"true\"></i>\n");
      out.write("                        Địa chỉ: 64B, Quán Sứ, Hà Nội\n");
      out.write("                    </h4>\n");
      out.write("                    <h4 class=\"pb-4\">\n");
      out.write("                        <i class=\"fa fa-comments\" aria-hidden=\"true\"></i>\n");
      out.write("                        Địa chỉ thư điện tử : longdinh@gmail.com - longdinh@longdinh.media\n");
      out.write("                    </h4>\n");
      out.write("                    <h4 class=\"pb-4\">\n");
      out.write("                        <i class=\"fa fa-phone-square\" aria-hidden=\"true\"></i>\n");
      out.write("                        Tel: 024 394 29166 - 024 394 29168\n");
      out.write("                    </h4>\n");
      out.write("                    <h4 class=\"pb-4\">\n");
      out.write("                        <i class=\"fa fa-volume-control-phone\" aria-hidden=\"true\"></i>HOTLINE:0902 286 286\n");
      out.write("                    </h4>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-6 pl-5\">\n");
      out.write("                    <iframe src=\"https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d3724.177528695655!2d105.84294131424525!3d21.02558149326427!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x3135ab96ca7c5b79%3A0x6e992e32f7d4a774!2zNjRCIFF1w6FuIFPhu6ksIFRy4bqnbiBIxrBuZyDEkOG6oW8sIEhvw6BuIEtp4bq_bSwgSMOgIE7hu5lpLCBWaeG7h3QgTmFt!5e0!3m2!1svi!2s!4v1567842317939!5m2!1svi!2s\" width=\"500\" height=\"450\" frameborder=\"0\" style=\"border:0;\" allowfullscreen=\"\"></iframe>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"make text-center\">\n");
      out.write("            <p>&copy; Copyright by NgocAnh. Reserve all by <a href=\"#\"><strong>Longdinh.com</strong></a></p>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</footer>\n");
      out.write("\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<div class=\"partner pb-5\">\n");
      out.write("    <h3 class=\"text-uppercase text-center title pt-5 text-warning\">khách hàng của chúng tôi</h3>\n");
      out.write("    <div class=\"owl-carousel owl-theme pt-4\">\n");
      out.write("        <div class=\"item\"  style=\"width: 10rem\">\n");
      out.write("            <img src=\"public/img/partner/canon.png\" alt=\"\" class=\"img-fluid\">\n");
      out.write("        </div>\n");
      out.write("        <div class=\"item\" style=\"width: 9rem\">\n");
      out.write("            <img src=\"public/img/partner/fpt.png\" alt=\"\" class=\"img-fluid\">\n");
      out.write("        </div>\n");
      out.write("        <div class=\"item\"  style=\"width: 9rem\">\n");
      out.write("            <img src=\"public/img/partner/techcombank.png\" alt=\"\" class=\"img-fluid\">\n");
      out.write("        </div>\n");
      out.write("        <div class=\"item\" style=\"width: 8rem\">\n");
      out.write("            <img src=\"public/img/partner/vincom.png\" alt=\"\" class=\"img-fluid\">\n");
      out.write("        </div>\n");
      out.write("        <div class=\"item\"  style=\"width: 10rem\">\n");
      out.write("            <img src=\"public/img/partner/canon.png\" alt=\"\" class=\"img-fluid\">\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
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
