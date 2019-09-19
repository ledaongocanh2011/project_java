<%-- 
    Document   : login
    Created on : Sep 18, 2019, 12:14:09 AM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <%@include file="layout/head.jsp" %>
    <link rel="stylesheet" href="public/css/login.css">
    <body>
        <div class="container">
            <div>
                <button type="button" class="btn btn-warning float-right mt-5"><a href="index.jsp">Trang chủ</a></button>
            </div>
            <div class="row justify-content-center">
                <div class="col-4 align-self-center login mt-5">
                    <h1 class="text-center font-weight-light text-uppercase text-secondary">bảng đăng nhập</h1>
                    <form action="" method="post" class="pt-4">
                        <fieldset class="form-group">
                            <label for="email">Email:</label>
                            <input type="text" class="form-control" id="email" name="email" placeholder="Nhập Email">
                        </fieldset>
                        <fieldset class="form-group">
                            <label for="password">Mật khẩu:</label>
                            <input type="password" class="form-control" id="password" name="password" placeholder="Nhập mật khẩu">
                        </fieldset>
                        <p class="text-center">
                            <button class="btn btn-primary text-uppercase btn-block" type="submit" name="login" onclick="">đăng nhập</button>
                        </p>
                    </form>
                </div>
            </div>
        </div>
        <%@include file="layout/js.jsp" %>
    </body>
</html>
