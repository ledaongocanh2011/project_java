<%-- 
    Document   : header
    Created on : Sep 11, 2019, 10:48:28 AM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<header>
    <div class="container">
        <div class="top d-flex justify-content-center">
            <div class="logo">
                <a href="index.jsp"></a>
            </div>
            <div class="menu float-left ">
                <nav class="navbar navbar-expand-lg navbar-light">
                    <div class="collapse navbar-collapse " id="navbarNav">
                        <ul class="navbar-nav align-self-center text-uppercase">
                            <li class="nav-item active">
                                <a class="nav-link" href="index.jsp">Giới thiệu</a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link" href="products.jsp">Sản phẩm</a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link" href="filling_cake.jsp">Các loại nhân</a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link" href="news.jsp">Tin tức</a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link search"><i class="fa fa-search" aria-hidden="true"></i></a>
                            </li>
                            <li class="nav-item">
                                <ul>
                                    <li class="dropdown profile_details_drop">
                                        <a href="#" class="dropdown-toggle nav-link" data-toggle="dropdown"><i class="fa fa-user" aria-hidden="true"></i></a>
                                        <div class="mega-dropdown-menu">
                                            <div class="w3ls_vegetables">
                                                <ul class="dropdown-menu drp-mnu ">
                                                    <li>
                                                        <button type="button" class="btn text-white text-uppercase" data-toggle="modal" data-target="#login">
                                                            Đăng nhập
                                                        </button>
                                                    </li> 
                                                    <li><button type="button" class="btn text-white text-uppercase" data-toggle="modal" data-target="#registration">
                                                            Đăng kí
                                                        </button></li>
                                                </ul>
                                            </div>                  
                                        </div>	
                                    </li>
                                </ul>
                            </li>

                            <li class="nav-item">
                                <a class="nav-link" href="#"><img src="public/img/products/cart.png" alt=""></a>
                            </li>
                        </ul>
                    </div>
                </nav>
            </div>
            <div class="sear">
                <div class="container">
                    <form action="search.php" class="form-inline" id="search-header" method="get">
                        <input type="text" name="search" placeholder="Tìm kiếm..." class="form-control">
                        <button type="submit" class=" btn btn-success"><i class="fa fa-search"></i></button>
                    </form>
                </div>
            </div>
            <div class="modal fade" id="login" tabindex="-1" role="dialog" aria-labelledby="exampleModalScrollableTitle" aria-hidden="true">
                <div class="modal-dialog modal-dialog-scrollable" role="document">
                    <div class="modal-content">
                        <div class="modal-body">
                            <form method="post">
                                <h4 class="text-uppercase text-center">đăng nhập tài khoản</h4>
                                <div class="form-group">
                                    <label for="exampleInputEmail1">Email</label>
                                    <input type="email" name="email" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="Enter email">
                                </div>
                                <div class="form-group">
                                    <label for="exampleInputPassword1">Password</label>
                                    <input type="password" name="password" class="form-control" id="exampleInputPassword1" placeholder="Password">
                                </div>
                                <button name="dangnhap" type="submit" class="btn btn-primary">Đăng nhập</button>
                            </form>
                        </div>
                        <div class="modal-footer">
                            <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
                        </div>
                    </div>
                </div>
            </div>
            <div class="modal fade" id="registration" tabindex="-1" role="dialog" aria-labelledby="registration" aria-hidden="true">
                <div class="modal-dialog" role="document">
                    <div class="modal-content">
                        <div class="modal-body">
                            <form action="#" method="post">
                                <h4 class="text-uppercase text-center">đăng kí tài khoản</h4>
                                <div class="form-group">
                                    <label for="email">Email</label>
                                    <input type="email" name="email" class="form-control" id="abc" aria-describedby="emailHelp" placeholder="Enter email">
                                </div>
                                <div class="form-group">
                                    <label for="phone">Số điện thoại</label>
                                    <input type="text" name="phone" class="form-control" id="xyz" placeholder="nhập số điện thoại">
                                </div>
                                <div class="form-group">
                                    <label for="password">Mật khẩu</label>
                                    <input type="password" name="password" class="form-control" id="something" placeholder="mật khẩu">
                                </div>
                                <div class="form-group">
                                    <label for="address">Địa chỉ</label>
                                    <textarea name="address"  rows="5" class="form-control "></textarea>
                                </div>
                                <button name="dangki" type="submit" class="btn btn-primary">Đăng kí</button>
                            </form>
                        </div>
                        <div class="modal-footer">
                            <button type="button" name="dangki" class="btn btn-secondary" data-dismiss="modal">Close</button>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</header>
