<%-- 
    Document   : js
    Created on : Sep 11, 2019, 10:53:38 AM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<script src="public/js/jquery-3.3.1.slim.min.js"></script>
<script src="public/js/popper.min.js"></script>
<script src="public/js/bootstrap.min.js"></script>
<script src="public/OwlCarousel/dist/owl.carousel.min.js"></script>
<script >
    $(document).ready(function () {
        $('.owl-carousel').owlCarousel({
            loop: true,
            margin: 10,
            responsiveClass: true,
            responsive: {
                0: {
                    items: 1,
                    nav: true
                },
                600: {
                    items: 2,
                    nav: false
                },
                1000: {
                    items: 4,
                    nav: true,
                    loop: false,
                    margin: 20
                }
            }
        });
    })
</script>
<script>
    $(document).ready(function () {
        $('.search').click(function () {
            $('#search-header').slideToggle("slow");
        });
    });
</script>