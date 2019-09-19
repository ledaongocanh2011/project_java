<%-- 
    Document   : cart
    Created on : Sep 18, 2019, 9:48:00 AM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <%@include file="layout/head.jsp" %>
    <body>
        <%@include file="layout/header.jsp" %>
        <main>
            <div class="container">
                <div class="cartDetail">
                    <div class="row  text-light text-center pt-5 pb-5">
                        <div class="col-2">
                            <h5>Ảnh</h5>
                        </div>
                        <div class="col-4">
                            <h5>Tên sản phẩm</h5>
                        </div>
                        <div class="col-2">
                            <h5>Số lượng</h5>
                        </div>
                        <div class="col-2">
                            <h5>Đơn giá</h5>
                        </div>
                        <div class="col-2">
                            <h5>Thao tác</h5>
                        </div>
                    </div>
                    <div class="row text-center text-light">
                        <div class="col-2">
                            <img src="public/img/products/n1.png" alt="" width="130" class="pl-4">
                        </div>
                        <div class="col-4">
                            <h6>Tên sản phẩm</h6>
                        </div>
                        <div class="col-2">
                            <h6>Số lượng</h6>
                        </div>
                        <div class="col-2">
                            <h6>Đơn giá</h6>
                        </div>
                        <div class="col-2">
                            <h4><a href="#">xóa</a></h4>
                        </div>
                    </div>
                    <h3 class="pt-5 pb-5 ml-5 text-light">Tổng tiền hàng :</h3>
                    <button class="btn btn-outline-warning ml-5 mb-5" type="submit" style="width: 250px">mua hàng</button>
                </div>
                <%@include file="layout/partner.jsp" %>
            </div>
        </main>
        <%@include file="layout/footer.jsp" %>
        <%@include file="layout/js.jsp" %>
    </body>
</html>
