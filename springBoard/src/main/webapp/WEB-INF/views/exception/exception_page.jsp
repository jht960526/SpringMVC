<%--
  Created by IntelliJ IDEA.
  User: n2soft_remote
  Date: 25. 7. 8.
  Time: 오후 2:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="../include/head.jsp" %>
<html>
<body class="hold-transition skin-green-light sidebar-mini" oncopy="return false" oncut="return false" onpaste="return false">
<div class="wrapper">

    <%@ include file="../include/top_menu.jsp" %>
    <%@ include file="../include/left_menu.jsp" %>

    <div class="content-wrapper">
        <section class="content-header">
            <h1>
                예외 발생
                <small>스프링연습예제</small>
            </h1>
            <ol class="breadcrumb">
                <li><a href="#"><i class="fa fa-dashboard"></i> board</a></li>
                <li class="active">exception</li>
            </ol>
        </section>

        <%-- Main content --%>
        <section class="content container-fluid">

            <div class="col-lg-12">
                <p>Exception : ${errorClass}</p>
                <p>Method : ${errorMethod}</p>
                <p>Message : ${errorMessage}</p>
                <p>Cause : ${errorCause}</p>
            </div>

        </section>
    </div>

    <%@ include file="../include/footer.jsp" %>

</div>

<%@ include file="../include/plugin_js.jsp" %>
</body>
</html>

