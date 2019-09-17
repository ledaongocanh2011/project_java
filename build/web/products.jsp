<%-- 
    Document   : products
    Created on : Sep 10, 2019, 8:52:56 AM
    Author     : Admin
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="SQL.connect_SQL"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    connect_SQL conn = new connect_SQL("root", "", "do_an_java");
    conn.getConnect();
    ResultSet rs = conn.getData("products", 1);
    ResultSet rs1 = conn.getData("products", 2);
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
                <div class="product ">
                    <div class="name pt-5 pb-5">
                        <h3 class="text-center text-uppercase text text-light">các loại sản phẩm</h3>
                    </div>
                    <div class="categories">
                        <button class="tablink text-uppercase text-light" onclick="openCategories('pies', this, '')" id="defaultOpen">Bánh nướng</button>
                        <button class="tablink text-uppercase text-light" onclick="openCategories('flexible_cake', this, '')">Bánh dẻo</button>
                        <div id="pies" class="tabcontent"> 
                            <!--// bánh nướng-->
                            <div class="cake pt-5">
                                <div class="row">
                                    <% while (rs.next()) {%>
                                    <div class="col-3">     
                                        <div class="card" style="width: 13rem">
                                            <a href="#">
                                                <img src="public/img/products/<%= rs.getString("hinh_anh")%>" alt="" class=" card-img-top" >
                                            </a>
                                            <div class="card-body">
                                                <h5 class="text-center text-danger card-title"><%= rs.getString("ten_san_pham")%></h5>
                                                <p class="card-text text-danger"><%= rs.getDouble("gia_san_pham")%></p>
                                            </div>
                                        </div>
                                    </div>
                                    <%}%>
                                </div>
                            </div>
                        </div>
                        <div id="flexible_cake" class="tabcontent"> 
                            <!--bánh dẻo-->
                            <div class="cake pt-5">
                                <div class="row">
                                    <% while (rs1.next()) {%>
                                    <div class="col-3">     
                                        <div class="card" style="width: 13rem">
                                            <a href="#">
                                                <img src="public/img/products/<%= rs1.getString("hinh_anh")%>" alt="" class=" card-img-top img-fluid" >
                                            </a>
                                            <div class="card-body">
                                                <h5 class="text-center text-danger card-title"><%= rs1.getString("ten_san_pham")%></h5>
                                                <p class="card-text text-danger"><%= rs1.getDouble("gia_san_pham")%></p>
                                            </div>
                                        </div>
                                    </div>
                                    <%}%>         
                                </div>
                            </div>
                        </div>
                    </div>
                    <%@include file="layout/partner.jsp" %>
                </div>
            </div>
        </main>
        <%@include file="layout/footer.jsp" %>
        <%@include file="layout/js.jsp" %>
        <script>
            function openCategories(cityName, elmnt, color) {
                var i, tabcontent, tablinks;
                tabcontent = document.getElementsByClassName("tabcontent");
                for (i = 0; i < tabcontent.length; i++) {
                    tabcontent[i].style.display = "none";
                }
                tablinks = document.getElementsByClassName("tablink");
                for (i = 0; i < tablinks.length; i++) {
                    tablinks[i].style.backgroundColor = "";
                }
                document.getElementById(cityName).style.display = "block";
                elmnt.style.backgroundColor = color;
            }
            // Get the element with id="defaultOpen" and click on it
            document.getElementById("defaultOpen").click();
        </script>
    </body>
</html>
