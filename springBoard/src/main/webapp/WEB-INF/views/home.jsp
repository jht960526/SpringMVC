<%--
  Created by IntelliJ IDEA.
  User: n2soft_remote
  Date: 25. 7. 7.
  Time: 오전 10:56
  To change this template use File | Settings | File Templates.
--%>
<!DOCTYPE html>
<!--
This is a starter template page. Use this page to start your new project from
scratch. This page gets rid of all links and provides the needed markup only.
-->
<html>
<%@ include file="include/head.jsp"%>
<body class="hold-transition skin-blue sidebar-mini">
<div class="wrapper">

    <!-- Main Header -->
    <%@ include file="include/top_menu.jsp"%>
    <!-- Left side column. contains the logo and sidebar -->
    <%@ include file="include/left_menu.jsp"%>

    <!-- Content Wrapper. Contains page content -->
    <div class="content-wrapper">
        <!-- Content Header (Page header) -->
        <section class="content-header">
            <h1>
                Page Header
                <small>Optional description</small>
            </h1>
            <ol class="breadcrumb">
                <li><a href="#"><i class="fa fa-dashboard"></i> Level</a></li>
                <li class="active">Here</li>
            </ol>
        </section>

        <!-- Main content -->
        <section class="content container-fluid">

            <!--------------------------
              | Your Page Content Here |
              -------------------------->

        </section>
        <!-- /.content -->
    </div>
    <!-- /.content-wrapper -->

    <!-- Main Footer -->
    <%@ include file="include/footer.jsp"%>

</div>
<!-- ./wrapper -->


<%@ include file="include/plugin_js.jsp"%>

</body>
</html>
