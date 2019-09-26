<%-- 
    Document   : filling_cake
    Created on : Sep 10, 2019, 8:54:12 AM
    Author     : Admin
--%>

<%@page import="model.products"%>
<%@page import="java.util.ArrayList"%>
<%@page import="model.filling_cake"%>
<%@page import="javax.sound.midi.Soundbank"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="SQL.connect_SQL"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    connect_SQL conn = new connect_SQL("root", "", "do_an_java");
    conn.getConnect();
    ArrayList<filling_cake> arr = conn.getFillingCake(-1);
    int type = 0;
    if (request.getParameter("type") == null) {
        type = 1;
    } else {
        String maloai = request.getParameter("type");
        type = Integer.parseInt(maloai);
    }
    ResultSet rs = conn.getPrType(type);

%>
<!DOCTYPE html>
<html>
    <%@include file="layout/head.jsp" %>
    <body>
        <%@include file="layout/header.jsp" %>
        <main>
            <div class="container">
                <div class="banner">
                    <img src="public/img/background/nen.jpg" alt="" class="img-fluid">
                </div>
                <div class="filling">
                    <div class="name pt-5">
                        <h3 class="text-center text-uppercase text text-light">các loại nhân</h3>
                        <div class="row pt-5">
                            <div class="col-6">
                                <div class="form-group">
                                    <form class="sb" action="fillingCake" method="post">
                                        <select name="type" id="inputState" class="form-control">
                                            <%                                                for (int i = 0; i < arr.size(); i++) {
                                            %>
                                            <option value="<% out.print(arr.get(i).getId()); %>"<% if( type == arr.get(i).getId() ){out.print("selected");} %> >
                                                <% out.print(arr.get(i).getTen_loai_nhan()); %>
                                                <%}%>
                                        </select>
                                    </form>
                                </div>
                            </div>
                            <div class="col-6">
                                <form class="form-inline float-right">
                                    <input class="form-control mr-sm-2" type="search" placeholder="Search" aria-label="Search">
                                    <button class="btn btn-outline-warning my-2 my-sm-0" type="submit">Search</button>
                                </form>
                            </div>
                        </div>
                    </div>
                    <div class="cake pt-5">
                        <div class="row">
                            <%
                                while (rs.next()) {
                                    {
                            %>

                            <div class="col-3">
                                <div class="card" style="width: 13rem">
                                    <a href="#">
                                        <img src="public/img/products/d1.png" alt="" class=" card-img-top" >
                                    </a>
                                    <div class="card-body">
                                        <h5 class="	text-center text-danger card-title"> <%=rs.getString("ten_san_pham") %></h5>
                                        <p class="card-text">100,000</p>
                                    </div>
                                </div>
                            </div>
                            <%
                                    }
                                }
                            %>
                        </div>
                    </div>
                </div>
                <%@include file="layout/partner.jsp" %>
            </div>
        </main>
        <%@include file="layout/footer.jsp" %>
        <%@include file="layout/js.jsp" %>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
        <script>
            $('select').change(function () {
                var val = $(this).children('option:selected').text();
//                window.location = "ajax";
                $.ajax({
                    url: 'fillingCake',
                    type: 'GET',
                    data: {name: val},
                    success: function (data) {
                        console.log(data);
                    }

                });
            });
            $('select').change(function () {
                $('.sb').submit();
            });
        </script>
    </body>
</html>
