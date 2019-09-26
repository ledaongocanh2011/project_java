<%-- 
    Document   : index
    Created on : Sep 10, 2019, 8:07:22 AM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <jsp:include page="layout/head.jsp" />
    <body>
        <jsp:include page="layout/header.jsp" />
        <jsp:include page="layout/nav.jsp" />
        <main>
            <div class="container">
                <div class="collection">
                    <div class="show">
                        <h3 class="text-uppercase text-center title pt-5">bộ sưu tập Phú quý đoàn viên</h3>
                    </div>
                    <div class="owl-carousel owl-theme pt-4">
                        <div class="item">
                            <div class="card" style="width: 13rem">
                                <a href="detail.jsp">
                                    <img src="public/img/products/d1.png" alt="" class=" card-img-top" >
                                </a>
                                <div class="card-body">
                                    <h5 class="	text-center text-danger card-title"> bánh dẻo</h5>
                                    <p class="card-text">100,000</p>
                                </div>
                            </div>
                        </div>
                        <div class="item">
                            <div class="card" style="width: 13rem">
                                <a href="detail.jsp">
                                    <img src="public/img/products/n2.png" alt="" class="img-fluid card-img-top">
                                </a>
                                <div class="card-body">
                                    <h5 class="	text-center text-danger card-title"> bánh dẻo</h5>
                                    <p class="card-text">100,000</p>
                                </div>
                            </div>
                        </div>
                        <div class="item">
                            <div class="card" style="width: 13rem">
                                <a href="detail.jsp">
                                    <img src="public/img/products/n4.png" alt="" class="img-fluid">
                                </a>
                                <div class="card-body">
                                    <h5 class="	text-center text-danger card-title"> bánh dẻo</h5>
                                    <p class="card-text">100,000</p>
                                </div>
                            </div>
                        </div>
                        <div class="item" style="width: 13rem">
                            <div class="card">
                                <a href="detail.jsp">
                                    <img src="public/img/products/n1.png" alt="" class="img-fluid">
                                </a>
                                <div class="card-body">
                                    <h5 class="	text-center text-danger card-title"> bánh dẻo</h5>
                                    <p class="card-text">100,000</p>
                                </div>
                            </div>
                        </div>
                        <div class="item">
                            <div class="card"  style="width: 13rem">
                                <a href="detail.jsp">
                                    <img src="public/img/products/d2.jpg" alt="" class="img-fluid">
                                </a>
                                <div class="card-body">
                                    <h5 class="	text-center text-danger card-title"> bánh dẻo</h5>
                                    <p class="card-text">100,000</p>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="news">
                    <h3 class="text-center pt-5">Thiên là trời, lương trong lương thiện, thiện lương nhằm hướng đến giá trị cao nhất trong cuộc sống</h3>
                    <h3 class="text-center text-uppercase title pt-3 text-warning">chân - thiện - mỹ</h3>
                    <div class="row pb-5 pt-5">
                        <div class="col-6">
                            <a href="news.jsp"><img src="public/img/news/news1.png" alt="" class="img-fluid"></a>
                        </div>
                        <div class="col-6">
                            <h4 class="text-uppercase pt-5 text-warning text-center">Chân thành mang tết yêu thương</h4>
                            <h4 class="paragraph pt-5">Hơn ai hết xuất thân từ vùng quê, từ nhỏ tôi đã yêu đã hiểu đã quý trọng cái không khí tết trung thu, đã biết nó không phải chỉ là một dịp lễ hội một năm có 1 lần mà là một 1 lần đó người ta nhận được gì và cho đi những gì ...</h4>
                            <button type="button" class="btn btn-warning mt-5"><a href="news.jsp" class="text-dark">Đọc thêm</a></button>
                        </div>
                        <div class="col-6">
                            <h4 class="text-uppercase pt-5 text-warning text-center">Thiện tâm thiện ý sức khỏe người dùng</h4>
                            <h4 class="paragraph pt-5">Làm trong ngành nhà hàng khách sạn nên từ lâu tôi đã rất kĩ tính với chất lượng món ăn, khi tôi học nấu ăn tôi cũng đòi hỏi rất khắt khe ở mình, có thể tạm chấp nhận nấu chưa ngon nhưng tuyệt nhiên không cho mình cẩu thả về chất lượng… </h4>
                            <button type="button" class="btn btn-warning mt-5"><a href="news.jsp" class="text-dark">Đọc thêm</a></button>
                        </div>
                        <div class="col-6">
                            <a href="news.jsp"><img src="public/img/news/news2.png" alt="" class="img-fluid"></a>
                        </div>
                    </div>
                </div>
                <div class="review_pies">
                    <div class="bgc  pb-5">
                        <h3 class="text-center text-uppercase pt-5 text-light">
                            Bánh nướng truyền thống
                        </h3>
                        <h4 class="text-center pt-4 pb-5 text-warning slogan">
                            Hòa quyện đất trời - Hương vị truyền thống - Tuổi thơ ùa về - Gia đình sung túc
                        </h4>
                        <div class="row ">
                            <div class="col-4 pies">
                                <a href="products.jsp">
                                    <img src="public/img/products/banh-nuong-1.jpg" alt="" class="" style="width: 88%">
                                </a>
                            </div>
                            <div class="col-4 pies ">
                                <a href="products.jsp">
                                    <img src="public/img/products/banh-nuong-2.jpg" alt="" class="img-fluid" style="width: 88%">
                                </a>
                            </div>
                            <div class="col-4 pies">
                                <a href="products.jsp">
                                    <img src="public/img/products/banh-nuong-3.jpg" alt="" class="img-fluid" style="width: 88%">
                                </a>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="flexible_cake ">
                    <div class="bgc pb-5">
                        <h3 class="text-center text-uppercase pt-5 text-light">
                            Bánh dẻo truyền thống
                        </h3>
                        <h4 class="text-center pt-4 pb-5 text-warning">
                            Dịu thơm hương bưởi - Bùi bùi nhân đậu - Deo dẻo vỏ nếp - Hạnh phúc tràn đầy
                        </h4>
                        <div class="row ">
                            <div class="col-4 pies">
                                <a href="products.jsp">
                                    <img src="public/img/products/banh-deo-1.jpg" alt="" class="" style="width: 88%">
                                </a>
                            </div>
                            <div class="col-4 pies ">
                                <a href="products.jsp">
                                    <img src="public/img/products/banh-deo-2.jpg" alt="" class="img-fluid" style="width: 88%">
                                </a>
                            </div>
                            <div class="col-4 pies">
                                <a href="products.jsp">
                                    <img src="public/img/products/banh-deo-3.jpg" alt="" class="img-fluid" style="width:88%">
                                </a>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="judge">
                    <div class="row pt-5 pb-5">
                        <div class="col-5">
                            <h3 class="text-uppercase text-center mb-5">cam kết với khách hàng</h3>
                            <h5 class="pb-3"><i class="fa fa-check-square-o text-danger" aria-hidden="true"></i> Bánh được làm 100% không hóa chất</h5>
                            <h5 class="pb-3"><i class="fa fa-check-square-o text-danger" aria-hidden="true"></i> Độ mềm dẻo của vỏ bánh hoàn toàn không dùng nước tro</h5>
                            <h5 class="pb-3" ><i class="fa fa-check-square-o  text-danger" aria-hidden="true"></i> Sử dụng máy hút chân không nhằm tăng thời gian sử dụng bánh</h5>
                            <h5 class="pb-3"><i class="fa fa-check-square-o text-danger" aria-hidden="true"></i> Bánh được làm theo từng mẻ đặt hàng, tuyệt đối không có bánh cũ, bánh quá hạn</h5>
                            <h5 class="pb-3"><i class="fa fa-check-square-o text-danger" aria-hidden="true"></i> Hoàn tiền 100% nếu phát hiện bánh lỗi khi mua về</h5>
                        </div>
                        <div class="col-7">
                            <h3 class="text-uppercase text-center mb-5">cảm nhận của khách hàng</h3>
                            <div id="judge" class="carousel slide" data-ride="carousel">
                                <ol class="carousel-indicators">
                                    <li data-target="#judge" data-slide-to="0" class="active"></li>
                                    <li data-target="#judge" data-slide-to="1"></li>
                                    <li data-target="#judge" data-slide-to="2"></li>
                                </ol>
                                <div class="carousel-inner customer">
                                    <div class="carousel-item active">
                                        <h5>Chị Lan Anh ( Nhân viên kinh doanh – Quận 3, TPHCM )</h5>
                                        <h6 class="">
                                            Nhà mình thì ai cũng thích ăn bánh trung thu nhưng giờ thấy báo đài nói hết cái này đến cái khác về vệ sinh thực phẩm cũng ngán lắm nhất là quy trình làm bánh trung thu, thèm thì thèm nhưng sợ sợ. Bữa hổm được chị trong công ty đem cái bánh lên cho ăn, chị nói bánh Long Đình này gần nhà chị làm nên sạch sẽ lắm tại chị hay qua nhà đó chơi và thấy chị chủ làm bằng tay từ sơ chế đến chế biến. Vậy là từ đó mình cũng đặt mua tại Mona Cake luôn vừa ngon vừa đảm bảo vệ sinh.
                                        </h6>
                                    </div>
                                    <div class="carousel-item">
                                        <h5>Chị Nguyễn Ngọc Lan Thi ( Nhân viên kế toán – Quận 9, TPHCM )</h5>
                                        <h6>Công ty mình từ xưa giờ vẫn đặt bánh Long Đình để tặng khách hàng, mình là người đi đặt riết rồi quen chị chủ luôn, chị là người rất kĩ tính nên bánh vừa ngon vừa sạch đặc biệt là hộp bánh rất tinh tế và trang nhã, tặng khách chưa ăn người ta đã khen rồi.</h6>
                                    </div>
                                    <div class="carousel-item">
                                        <h5>Chị Nguyễn Bích Lan ( Bán hàng – Gò Vấp, TPHCM )</h5>
                                        <h6>Trung thu năm ngoái mình đặt bánh ở Long Đình để bán cho khách, vì là bánh nhà làm nên mình không mua nhiều chỉ đặt vài hộp được thì mình đặt tiếp, mà thấy bán cũng chạy lắm. Nhớ tuần trung thu năm ngoái mình đem ra bao nhiêu là bán hết bấy nhiêu và chủ yếu là khách cũ đã mua thấy ngon nên quay lại.</h6>
                                    </div>
                                </div>
                                <a class="carousel-control-prev" href="#judge" role="button" data-slide="prev">
                                    <span class="carousel-control-prev-icon" aria-hidden="true"></span>
                                    <span class="sr-only">Previous</span>
                                </a>
                                <a class="carousel-control-next" href="#judge" role="button" data-slide="next">
                                    <span class="carousel-control-next-icon" aria-hidden="true"></span>
                                    <span class="sr-only">Next</span>
                                </a>
                            </div>
                        </div>
                    </div>
                </div>
                <jsp:include page="layout/partner.jsp" />
            </div>
        </main>
        <jsp:include page="layout/footer.jsp" />
        <jsp:include page="layout/js.jsp" />
    </body>
</html>
