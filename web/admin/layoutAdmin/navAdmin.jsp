<%-- 
    Document   : navAdmin
    Created on : Sep 17, 2019, 6:29:46 PM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<nav class="side-navbar">
    <div class="side-navbar-wrapper">
        <div class="sidenav-header d-flex align-items-center justify-content-center">
            <div class="sidenav-header-inner text-center"><img src="admin/img/ban.jpg" alt="person" class="img-fluid rounded-circle">
                <h2 class="h5">LÊ ĐÀO NGỌC ANH</h2><span>Web Developer</span>
            </div>
            <div class="sidenav-header-logo"><a href="index.html" class="brand-small text-center"> <strong>B</strong><strong class="text-primary">D</strong></a></div>
        </div>
        <div class="main-menu">
            <h5 class="sidenav-heading">Main</h5>
            <ul id="side-main-menu" class="side-menu list-unstyled">                  
                <li><a href="productAdmin.jsp"> <i class="icon-form"></i>Quản lí sản phẩm</a></li>
                <li><a href="categoriesAdmin.jsp"> <i class="icon-grid"></i>Quản lí loại bánh</a></li>
                <li><a href="fillingCakeAdmin.jsp"> <i class="icon-grid"></i>Quản lí loại nhân</a></li>
                <li><a href="newsAdmin.jsp"> <i class="icon-grid"></i>Quản lí tin tức</a></li>
                <li><a href="customerAdmin.jsp"> <i class="icon-grid"></i>Quản lí khách hàng</a></li>
                <li><a href="cartAdmin.jsp"> <i class="fa fa-bar-chart"></i>Quản lí giỏ hàng</a></li>
                <li><a href="homeAdmin.jsp"> <i class="icon-home"></i>Quản lí admin</a></li>
            </ul>
        </div>
    </div>
</nav>
