<%-- 
    Document   : detail
    Created on : Sep 17, 2019, 10:36:29 AM
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
                <div class="banner">
                    <img src="public/img/background/nen.jpg" alt="" class="img-fluid">
                </div>
                <div class="row detail">
                    <div class="col-5">
                        <img src="public/img/products/d1.png" alt="" style="width:70%" class="pt-5 pb-5">
                    </div>
                    <div class="col-7">
                        <h3 class="text-center text-uppercase pt-5 text-light">tên sản phẩm</h3>
                        <h4 class="pt-4 text-light">giá sản phẩm: </h4>
                        <p class="pt-4 text-light">Lorem ipsum dolor sit amet, consectetur adipisicing elit. Vel, hic consectetur quam odio assumenda. Voluptatibus optio facilis ullam quas, amet quidem nobis pariatur maxime sit. Nemo neque reiciendis, sequi dolores!</p>
                        <a href="#">
                            <button type="submit" class="btn btn-outline-secondary text-center mt-4" style="width: 50%">
                                <i class="fa fa-shopping-cart" aria-hidden="true">thêm vào giỏ hàng</i>
                            </button>
                        </a>
                    </div>
                </div>
                <%@include file="layout/partner.jsp" %>
            </div>
        </main>
        <%@include file="layout/footer.jsp" %>
        <%@include file="layout/js.jsp" %>
    </body>
</html>
