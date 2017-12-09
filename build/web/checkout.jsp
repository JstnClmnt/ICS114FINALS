<!DOCTYPE html>
<html lang="en">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<style>
/* Full-width input fields */
input[type=text], input[type=password] {
	width: 100%;
	padding: 12px 20px;
	margin: 8px 0;
	display: inline-block;
	border: 1px solid #ccc;
	box-sizing: border-box;
}
	.selectbox{
		width: 20%;
	padding: 12px 20px;
	margin: 8px 0;
	display: inline-block;
	border: 1px solid #ccc;
	box-sizing: border-box;
	}
/* Set a style for all buttons */

.containermodal {
	padding: 5px;
}
/* The Modal (background) */
.modal {
	display: none; /* Hidden by default */
	position: fixed; /* Stay in place */
	z-index: 1; /* Sit on top */
	left: 0;
	top: 0;
	width: 100%; /* Full width */
	height: 100%; /* Full height */
	overflow: auto; /* Enable scroll if needed */
	background-color: rgb(0,0,0); /* Fallback color */
	background-color: rgba(0,0,0,0.4); /* Black w/ opacity */
	padding-top: 60px;
}
/* Modal Content/Box */
.modal-content {
	background-color: #fefefe;
	margin: 5% auto 15% auto; /* 5% from the top, 15% from the bottom and centered */
	border: 1px solid #888;
	width: 80%; /* Could be more or less, depending on screen size */
}
</style>
<link href="animate.css" rel="stylesheet" type="text/css">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Luxur</title>

<!-- Bootstrap -->
<link rel="stylesheet" href="category1/bootstrap.css">

<!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
<!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>
<body>
<nav>
  <div class="container"> 
    
    <!-- Brand and toggle get grouped for better mobile display -->
    <div class="navbar-header">
      <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false"> <span class="sr-only">Toggle navigation</span> <span class="icon-bar"></span> <span class="icon-bar"></span> <span class="icon-bar"></span> </button>
      <a class="navbar-brand" href="#">LUXER</a> </div>
    
    <!-- Collect the nav links, forms, and other content for toggling -->
    <div class="collapse navbar-collapse">
      <ul class="nav navbar-nav">
        <li class="active"><a href="cart.jsp">My Cart <span class="sr-only">(current)</span></a> </li>
        <li><form action="Store" method="POST">
            <button type="submit" class="btn btn-default">Store</button>
            </form>
      </ul>
      <form action="login.jsp" method="POST" class="navbar-form navbar-right" role="search">
        <div class="form-group"> </div>
        <button type="submit" class="btn btn-default">Log-in</button>
      </form>
      <form action="Search" method="POST" class="navbar-form navbar-right" role="search">
        <div class="form-group">
          <input name="search" type="text" class="form-control" placeholder="Search for Products">
        </div>
        <button type="submit" class="btn btn-default">Submit</button>
      </form>
      <form class="navbar-form navbar-right" role="search" action="Reference" method="POST">
        <div class="form-group">
                <input type="text" name="referencenumber" class="form-control" placeholder="Look for Reference #">
        </div>
        <button type="submit" class="btn btn-default">Submit</button>
      </form>
      <ul class="nav navbar-nav navbar-right hidden-sm">
        <li> </li>
        <li class="dropdown">
          <ul class="dropdown-menu">
            <li><a href="#">Action</a> </li>
            <li><a href="#">Another action</a> </li>
            <li><a href="#">Something else here</a> </li>
            <li role="separator" class="divider"></li>
            <li><a href="#">Separated link</a> </li>
          </ul>
        </li>
      </ul>
    </div>
    <!-- /.navbar-collapse --> 
    
  </div>
  <!-- /.container-fluid --> 
  
</nav>
<div class="container">
  <div class="row">
    <div class="col-xs-12 col-sm-12 col-md-12 col-lg-12">
      <div id="carousel1" class="carousel slide">
        <ol class="carousel-indicators">
          <li data-target="#carousel1" data-slide-to="0" class="active"> </li>
          <li data-target="#carousel1" data-slide-to="1" class=""> </li>
          <li data-target="#carousel1" data-slide-to="2" class=""> </li>
        </ol>
        <div class="carousel-inner">
          <div class="item"> <img class="img-responsive" src="images/1920x500(1).gif" alt="thumb">
            <div class="carousel-caption"> Stocks are only limited. Get yours now! </div>
          </div>
          <div class="item active"> <img class="img-responsive" src="images/1920x500(2).gif" alt="thumb">
            <div class="carousel-caption"> Footware and clothing are up for grab! Get yours now! </div>
          </div>
          <div class="item"> <img class="img-responsive" src="images/1920x500(3).gif" alt="thumb">
            <div class="carousel-caption"> </div>
          </div>
        </div>
        <a class="left carousel-control" href="#carousel1" data-slide="prev"><span class="icon-prev"></span></a> <a class="right carousel-control" href="#carousel1" data-slide="next"><span class="icon-next"></span></a></div>
    </div>
  </div>
  <hr>
</div>
<div class="container">
    <form action="Checkout" method="POST">
<label> First name</label>
<input type="text" placeholder="Enter first name" name="firstname" required>
<label>Last name</label>
<input type="text" placeholder="Enter last name" name="lastname" required>
<label>Contact number</label>
<input type="text" placeholder="Enter contact number" name="contactnum" required>
<label>Address</label>
<input type="text" placeholder="Enter address" name="address" required>
<label>Email Address</label>
<input type="text" placeholder="Enter email address" name="emailaddress" required>
<label>Instructions to Seller</label>
<input type="text" placeholder="Enter message" name="comments">
<button> Proceed</button>
    </form>
 </div>
<hr>
<hr>
<div class="container">
			
				
                  
<div class="row text-center hidden-xs"> </div>
</div>

<hr>
<h2 class="text-center">FEATURED PRODUCTS</h2>
<hr>
<div class="container">
  <div class="row">
    <div class="col-lg-4 col-md-6">
      <div class="media-object-default">
        <div class="media">
          <div class="media-left"> <a href="#"> <img class="media-object" src="images/400x200(6).gif" alt="placeholder image"> </a> </div>
          <div class="media-body">
            <h4 class="media-heading">100X125.gif</h4>
            </div>
        </div>
        <div class="media">
          <div class="media-left"> <a href="#"> <img class="media-object" src="images/400x200(16).gif" alt="placeholder image"> </a> </div>
          <div class="media-body"> </div>
        </div>
        <div class="media">
          <div class="media-left"> <a href="#"> </a></div>
</div>
      </div>
    </div>
    <hr class="hidden-md hidden-lg">
    <div class="col-lg-4 col-md-6">
      <div class="media-object-default">
        <div class="media">
          <div class="media-left"> <a href="#"> <img class="media-object" src="images/400x200(3).gif" alt="placeholder image"></a></div>
          <div class="media-body">
            <h4 class="media-heading">100X125 - Copy (2).gif</h4>
            </div>
        </div>
        <div class="media">
          <div class="media-left"> <a href="#"> <img class="media-object" src="images/400x200(11).gif" alt="placeholder image"></a></div>
</div>
        <div class="media">
          <div class="media-left"> <a href="#"> </a></div>
</div>
      </div>
    </div>
    <hr class="hidden-lg">
    <div class="col-lg-4 col-md-12 hidden-md">
      <div class="media-object-default">
        <div class="media">
          <div class="media-left"> <a href="#"> <img class="media-object" src="images/400x200(9).gif" alt="placeholder image"></a></div>
          <div class="media-body">
            <h4 class="media-heading">100X125 - Copy (3).gif</h4>
       </div>
        </div>
        <div class="media">
          <div class="media-left"> <a href="#"> <img class="media-object" src="images/400x200(18).gif" alt="placeholder image"></a></div>
</div>
        <div class="media">
          <div class="media-left"> <a href="#"> </a></div>
</div>
      </div>
    </div>
  </div>
</div>
<hr>
<footer class="text-center">
  <div class="container">
    <div class="row"> </div>
  </div>
</footer>
<!-- jQuery (necessary for Bootstrap's JavaScript plugins) --> 
<script src="jquery-1.11.3.min.js"></script> 
<!-- Include all compiled plugins (below), or include individual files as needed --> 
<script src="bootstrap.js"></script>
</body>
</html>