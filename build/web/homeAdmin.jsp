<%-- 
    Document   : productAdmin
    Created on : Sep 17, 2019, 11:54:42 PM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <%@include file="admin/layoutAdmin/headAdmin.jsp" %>
    <body>
        <%@include file="admin/layoutAdmin/navAdmin.jsp" %>
        <div class="page">
            <%@include file="admin/layoutAdmin/menuAdmin.jsp" %>
            <div class="container"> 
                <div class="table-responsive">
                    <div class="table-responsive">
                    <button type="button" class="btn btn-info float-right mt-4 mb-4"><a href="" class="text-dark">Thêm</a></button>
                    <table class="table table-striped">
                        <thead>
                            <tr>
                                <th>id</th>
                                <th class="text-center">Tài khoản</th>
                                <th class="text-center">Cấp độ</th>
                                <th class="text-center">Trạng thái</th>
                                <th class="text-center">Thao tác</th>
                            </tr>
                        </thead>
                        <tbody>
                            <tr>
                                <th scope="row">1</th>
                                <td class="text-center">Ngoc Anh</td>
                                <td class="text-center">admin</td>
                                <td class="text-center">đang hoạt động</td>
                                <td class="text-center">
                                    <button type="button" class="btn btn-success"><a href="" class="text-light">sửa</a></button>
                                    <button type="button" class="btn btn-warning"><a href="" class="text-dark">xóa</a></button>
                                </td>
                            </tr>
                        </tbody>
                    </table>
                </div>
                </div>
            </div>
        </div>
        <%@include file="admin/layoutAdmin/jsAdmin.jsp" %>
    </body>
</html>
