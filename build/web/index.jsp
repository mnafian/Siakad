<!DOCTYPE html>
<html lang="en">
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
                    <div class="span2">
                        <img height="100" width="100" src="assets/img/uin.jpg" class="img-circle">
                    </div>
                    <div class="span10" style="width: 46.906%;">
                        <h3 class="muted" style="margin: 15px 0px;">Siakad (Sistem Informasi Akademik) UIN Maliki Malang</h3>
                    </div>
                </div>
                <hr>

                <div class="navbar navbar-inverse">
                    <div class="navbar-inner">
                        <div class="container">
                            <ul class="nav">
                                <li class="active"><a href="index.jsp">Home</a></li>
                                <li><a href="#">UIN Maliki Projects</a></li>
                                <li><a href="#">Lecturer Column</a></li>
                                <li><a href="#">About</a></li>
                                <li><a href="#">Contact LPSI</a></li>
                            </ul>
                        </div>
                    </div>
                </div><!-- /.navbar -->
            </div>

            <!-- Jumbotron -->
            <div class="jumbotron">
                <div class="container">

                    <form method="post" class="form-signin" action="/Siakad/login.do">
                        <h2 class="form-signin-heading">Please sign in</h2>
                        <input name="id" type="text" class="input-block-level" placeholder="Your Id">
                        <input name="pass" type="password" class="input-block-level" placeholder="Password">
                        <select class="input-block-level">
                            <option>--Level--</option>
                            <option value="Admin">Admin</option>
                            <option value="Admin">Dosen</option>
                            <option value="Admin">Mahasiswa</option>
                        </select>
                        <label class="checkbox">
                            <input type="checkbox" value="remember-me"> Remember me
                        </label>
                        <button class="btn btn-large btn-success" type="submit">Sign in</button>
                        <button class="btn btn-large btn-warning" type="reset">Reset</button>
                    </form>

                </div>
            </div>

            <hr>

            <!-- Example row of columns -->
            <div class="row-fluid">
                <div class="span6">
                    <h2>Lecturer Column</h2>
                    <p>Donec id elit non mi porta gravida at eget metus. Fusce dapibus, tellus ac cursus commodo, tortor mauris condimentum nibh, ut fermentum massa justo sit amet risus. Etiam porta sem malesuada magna mollis euismod. Donec sed odio dui. </p>
                    <p><a class="btn" href="#">View details &raquo;</a></p>
                </div>
                <div class="span6">
                    <h2>Students Column</h2>
                    <p>Donec id elit non mi porta gravida at eget metus. Fusce dapibus, tellus ac cursus commodo, tortor mauris condimentum nibh, ut fermentum massa justo sit amet risus. Etiam porta sem malesuada magna mollis euismod. Donec sed odio dui. </p>
                    <p><a class="btn" href="#">View details &raquo;</a></p>
                </div>
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
</html>
