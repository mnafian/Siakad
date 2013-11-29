<%-- 
    Document   : dosen
    Created on : Nov 28, 2013, 5:06:03 AM
    Author     : wx-eth0
--%>

<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>

<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>

<html:html lang="true">
    <head>
        <meta charset="utf-8">
        <title>Halaman Utama Siakad UIN Malang</title>
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta name="description" content="">
        <meta name="author" content="">

        <!-- Le styles -->
        <link href="assets/css/bootstrap.css" rel="stylesheet">
        <link href="assets/css/bootstrap-responsive.css" rel="stylesheet">
        <link href="assets/css/custom.css" rel="stylesheet">
        <!-- HTML5 shim, for IE6-8 support of HTML5 elements -->
        <!--[if lt IE 9]>
          <script src="assets/js/html5shiv.js"></script>
        <![endif]-->

        <!-- Fav and touch icons -->
        <link rel="apple-touch-icon-precomposed" sizes="144x144" href="assets/ico/apple-touch-icon-144-precomposed.png">
        <link rel="apple-touch-icon-precomposed" sizes="114x114" href="assets/ico/apple-touch-icon-114-precomposed.png">
        <link rel="apple-touch-icon-precomposed" sizes="72x72" href="assets/ico/apple-touch-icon-72-precomposed.png">
        <link rel="apple-touch-icon-precomposed" href="assets/ico/apple-touch-icon-57-precomposed.png">
        <link rel="shortcut icon" href="assets/ico/back.png">
    </head>
    <body style="background: url('assets/img/back.png') repeat-x top left;">

        <div class="container">

            <div class="masthead">
                <div class="row-fluid">
                    <div class="span2" style="width: 9.53%;">
                        <img height="100" width="100" src="assets/img/uin.jpg" class="img-circle">
                    </div>
                    <div class="span8" style="width: 46.906%;">
                        <h3 class="muted" style="margin: 15px 0px;">Data Centre System UIN Maliki Malang</h3>
                    </div>
                </div>
                <hr>

                <div class="navbar navbar-inverse">
                    <div class="navbar-inner">
                        <div class="container">
                            <ul class="nav">
                                <li><a href="#">Home</a></li>
                                <li><a href="#">UIN Maliki Projects</a></li>
                                <li><a href="/Siakad/view.do">Students Record</a></li>
                                <li class="active"><a href="/Siakad/viewdosen.do">Lecturer Record</a></li>
                                <li><a href="#">Course Record</a></li>
                                <li><a href="#">Contact LPSI</a></li>
                            </ul>
                        </div>
                    </div>
                </div><!-- /.navbar -->
            </div>

            <!-- Jumbotron -->

            <div class="container">
                <div class="row-fluid">
                    <html:form method="post" action="/dosen.do">
                        <div class="span5">

                            <h4 class="form-signin-heading">Form Data Dosen</h4>
                            <input name="nip" type="text" class="input-block-level" placeholder="NIP">
                            <input name="nama" type="text" class="input-block-level" placeholder="Nama">
                            <select name="status" class="input-block-level">
                                <option class="input-block-level">--Status--</option>
                                <option class="input-block-level" value="Dosen Tetap">Dosen Tetap</option>
                                <option class="input-block-level" value="Dosen Honorer">Dosen Honorer</option>
                            </select>
                            <button class="btn btn-success" type="submit" name="tombol" value="simpan">Submit</button>
                            <button class="btn warning" type="reset">Reset</button>

                        </div>
                        <div class="span7">
                            <table class="table table-hover table-bordered">
                                <tr>
                                    <td> <b>NIP</b> </td>
                                    <td> <b>Nama</b> </td>
                                    <td> <b>Status</b> </td>
                                    <td> <b>Aksi</b> </td>
                                </tr>
                                <logic:notEmpty name="list1">
                                    <logic:iterate id="element" name="list1">
                                        <tr>
                                        <input type="hidden" name="id" value="<bean:write name="element" property="id"/>">
                                        <td> <bean:write name="element" property="nip"/> </td>
                                        <td> <bean:write name="element" property="nama"/> </td>
                                        <td> <bean:write name="element" property="status"/> </td>
                                        <td> 
                                            <button type="submit" class="btn btn-warning" name="tombol" value="update">Update</button>
                                            |
                                            <button type="submit" class="btn btn-danger" name="tombol" value="delete">Hapus</button>
                                        </td>
                                        </tr>
                                    </logic:iterate>
                                </logic:notEmpty>
                            </table>

                        </div>
                    </html:form>
                </div>

            </div>

            <!-- Example row of columns -->
            <div class="row-fluid">

            </div>

            <hr>

            <div class="footer">
                <p>&copy; Kelas Pemrograman Web B 2013</p>
            </div>

        </div> <!-- /container -->

        <!-- Le javascript
        ================================================== -->
        <!-- Placed at the end of the document so the pages load faster -->
        <script src="assets/js/jquery.js"></script>
        <script src="assets/js/bootstrap-transition.js"></script>
        <script src="assets/js/bootstrap-alert.js"></script>
        <script src="assets/js/bootstrap-modal.js"></script>
        <script src="assets/js/bootstrap-dropdown.js"></script>
        <script src="assets/js/bootstrap-scrollspy.js"></script>
        <script src="assets/js/bootstrap-tab.js"></script>
        <script src="assets/js/bootstrap-tooltip.js"></script>
        <script src="assets/js/bootstrap-popover.js"></script>
        <script src="assets/js/bootstrap-button.js"></script>
        <script src="assets/js/bootstrap-collapse.js"></script>
        <script src="assets/js/bootstrap-carousel.js"></script>
        <script src="assets/js/bootstrap-typeahead.js"></script>

    </body>
</html:html>
