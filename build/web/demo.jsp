<%-- 
    Document   : demo
    Created on : Sep 10, 2019, 9:38:59 AM
        Author     : Admin
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="SQL.connect_SQL"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    connect_SQL conn = new connect_SQL("root", "", "qlcafe");
    conn.getConnect();
//ResultSet rs = conn.getData("ban"); 
//    ResultSet rs = conn.getData(4, "ban", 2);
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1 align="center">Demo lấy danh sách dữ liệu từ db</h1>
        <a href="abc" >Thêm bàn </a>
        <table border="1" align="center">
            <tr>
                <th width="200px">Tên bàn </th>
                <th width="200px">Mã bàn</th>
                <th width="200px">Mã bàn</th>
                <th width="200px">Sửa</th>
                <th width="200px">Xoá</th>
            </tr>
            <% while (rs.next()) { %>
            <tr>
                <td><% out.println(rs.getString(2)); %></td>
                <td><% out.println(rs.getString(3)); %></td>
                <td><% out.println(rs.getString(2)); %></td>
                <td><a href="abc?Name=9">Sửa</a></td>
                <td><a href="demo">Xoá</a></td>
            </tr>
            <% }%>
        </table>
    </body>
</html>
