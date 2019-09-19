<%-- 
    Document   : detail
    Created on : Sep 17, 2019, 10:36:29 AM
    Author     : Admin
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="SQL.connect_SQL"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    connect_SQL conn = new connect_SQL("root", "", "do_an_java");
    conn.getConnect();
    ResultSet rs = conn.getNews(2);
%>
<!DOCTYPE html>
<html>
    <%@include file="layout/head.jsp" %>
    <body>
        <%@include file="layout/header.jsp" %>
        <main>
            <div class="container">
                <div class="news-content">
                    <%while (rs.next()) {%>
                    <h3 class="text-center text-uppercase pt-5"><%=rs.getString("tieu_de")%></h3>s
                    <p class="text-center pb-5"><%=rs.getString("tom_tat")%></p>
                    <div class="row justify-content-center">
                        <div class="col-6  align-self-center">
                            <img src="public/img/news/<%=rs.getString("hinh_anh")%>" alt="" class="img-fluid ">
                        </div>
                    </div>
                    <p class="pt-5 pb-5 pl-3"><%=rs.getString("noi_dung")%></p>
                    <%}%>
                </div>
            </div>
        </main>
        <%@include file="layout/footer.jsp" %>
        <%@include file="layout/js.jsp" %>
    </body>
</html>
