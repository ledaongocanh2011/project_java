<%-- 
    Document   : filling_cake
    Created on : Sep 10, 2019, 8:54:12 AM
    Author     : Admin
--%>

<%@page import="javax.sound.midi.Soundbank"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="SQL.connect_SQL"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    connect_SQL conn = new connect_SQL("root", "", "do_an_java");
    conn.getConnect();
    ResultSet rs = conn.getFilling(1);
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
                                    <form action="action" method="post">
                                        <select name="adfasdfds" id="inputState" class="form-control">
                                            <%
                                                while (rs.next()) {
                                            %>
                                            <option selected value="<% out.print(rs.getString("id")); %>">
                                                <%
                                                    out.print(rs.getString("ten_loai_nhan"));
                                                %>
                                            </option>
                                            <!--<option>...</option>-->
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
                            <div class="col-3">
                                <div class="card" style="width: 13rem">
                                    <a href="#">
                                        <img src="public/img/products/d1.png" alt="" class=" card-img-top" >
                                    </a>
                                    <div class="card-body">
                                        <h5 class="	text-center text-danger card-title"> bánh dẻo</h5>
                                        <p class="card-text">100,000</p>
                                    </div>
                                </div>
                            </div>
                            <div class="col-3">
                                <div class="card" style="width: 13rem">
                                    <a href="#">
                                        <img src="public/img/products/d1.png" alt="" class=" card-img-top" >
                                    </a>
                                    <div class="card-body">
                                        <h5 class="	text-center text-danger card-title"> bánh dẻo</h5>
                                        <p class="card-text">100,000</p>
                                    </div>
                                </div>
                            </div>
                            <div class="col-3">
                                <div class="card" style="width: 13rem">
                                    <a href="#">
                                        <img src="public/img/products/d1.png" alt="" class=" card-img-top" >
                                    </a>
                                    <div class="card-body">
                                        <h5 class="	text-center text-danger card-title"> bánh dẻo</h5>
                                        <p class="card-text">100,000</p>
                                    </div>
                                </div>
                            </div>
                            <div class="col-3">
                                <div class="card" style="width: 13rem">
                                    <a href="#">
                                        <img src="public/img/products/d1.png" alt="" class=" card-img-top" >
                                    </a>
                                    <div class="card-body">
                                        <h5 class="	text-center text-danger card-title"> bánh dẻo</h5>
                                        <p class="card-text">100,000</p>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                <%@include file="layout/partner.jsp" %>
            </div>
        </main>
        <%@include file="layout/footer.jsp" %>
        <%@include file="layout/js.jsp" %>
    </body>
</html>
