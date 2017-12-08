<%-- 
    Document   : index
    Created on : Dec 8, 2017, 6:27:52 PM
    Author     : Justine Clemente
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<style>
/* Full-width input fields */
input[type=text], input[type=password] {
	width: 70%;
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
<title>Bootstrap eCommerce Template</title>

<!-- Bootstrap -->
<link rel="stylesheet" href="bootstrap.css">

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
      <a class="navbar-brand" href="#">Name of Brand</a> </div>
    
    <!-- Collect the nav links, forms, and other content for toggling -->
    <div class="collapse navbar-collapse">
      <ul class="nav navbar-nav">
        <li class="active"><a href="#">My Cart <span class="sr-only">(current)</span></a> </li>
        <li><a href="#">Shoes</a> </li>
        <li><a href="#">Clothes</a> </li>
      </ul>
      <form class="navbar-form navbar-right" role="search">
        <div class="form-group"> </div>
        <button type="submit" class="btn btn-default">Log-in</button>
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
            <div class="carousel-caption"> Carousel caption 1. Here goes slide description. Lorem ipsum dolor set amet. </div>
          </div>
          <div class="item active"> <img class="img-responsive" src="images/1920x500(2).gif" alt="thumb">
            <div class="carousel-caption"> Carousel caption 2. Here goes slide description. Lorem ipsum dolor set amet. </div>
          </div>
          <div class="item"> <img class="img-responsive" src="images/1920x500(3).gif" alt="thumb">
            <div class="carousel-caption"> Carousel caption 3. Here goes slide description. Lorem ipsum dolor set amet. </div>
          </div>
        </div>
        <a class="left carousel-control" href="#carousel1" data-slide="prev"><span class="icon-prev"></span></a> <a class="right carousel-control" href="#carousel1" data-slide="next"><span class="icon-next"></span></a></div>
    </div>
  </div>
  <hr>
</div>
<div class="container">
  <div class="row">
    <div class="col-lg-4 col-md-4 col-sm-4 col-xs-4">
      <div class="row">
        <div class="col-lg-2 col-md-3 col-sm-3 col-xs-2"><img class="img-circle" alt="Free Shipping" src="images/40X40.gif"></div>
        <div class="col-lg-6 col-md-9 col-sm-9 col-xs-9">
          <h4>Free Shipping</h4>
        </div>
      </div>
    </div>
    <div class="col-lg-4 col-md-4 col-sm-4 col-xs-4">
      <div class="row">
        <div class="col-lg-2 col-md-3 col-sm-3 col-xs-2"><img class="img-circle" alt="Free Shipping" src="images/40X40.gif"></div>
        <div class="col-lg-6 col-md-9 col-sm-9 col-xs-9">
          <h4>100% Authentic</h4>
        </div>
      </div>
    </div>
    <div class="col-lg-4 col-md-4 col-sm-4 col-xs-4">
      <div class="row">
        <div class="col-lg-2 col-md-3 col-sm-3 col-xs-2"><img class="img-circle" alt="Free Shipping" src="images/40X40.gif"></div>
        <div class="col-lg-6 col-md-9 col-sm-9 col-xs-9">
          <h4>Affordable Prices</h4>
        </div>
      </div>
    </div>
  </div>
</div>
<hr>
<h2 class="text-center">RECOMMENDED PRODUCTS</h2>
<hr>
<div class="container">
  <div class="row text-center">
    <div class="col-sm-4 col-md-4 col-lg-4 col-xs-6">
      <div class="thumbnail"> <img src="images/400X200.gif" alt="Thumbnail Image 1" class="img-responsive">
        <div class="caption">
          <h3>Product</h3>
          <p>Lorem ipsum dolor sit amet, consectetur adipisicing.</p>
          <p>
            <button class="btn btn-primary" role="button" onclick="document.getElementById('id01').style.display='block'"><span class="glyphicon glyphicon-shopping-cart" aria-hidden="true"></span>Add to Cart</button>
          <div id="id01" class="modal"> <span onclick="document.getElementById('id01').style.display='none'" class="close" title="Close Modal">&times;</span>
            <form class="modal-content animate" action="/action_page.php">
              <div class="containermodal"> 
                <!-- <label><b>Email</b></label> --><br>
                <p></p>
                <input type="text" placeholder="Enter first name" name="fname" required>
                <input type="text" placeholder="Enter last name" name="lname" required>
                <input type="text" placeholder="Enter Email" name="email" required>
                <input type="text" placeholder="Enter Mobile Number" name="mobnum" required>
                <input type="text" placeholder="Instructions for Seller" name="instructions">
                <div>
                  <select class="selectbox">
                    <option value="xs">Extra Small</option>
                    <option value="s">Small</option>
                    <option value="m">Medium</option>
                    <option value="l">Large</option>
                    <option value="xl">XL</option>
                  </select>
                  <select class="selectbox">
                    <option value="1">1</option>
                    <option value="2">2</option>
                    <option value="3">3</option>
                    <option value="4">4</option>
                    <option value="5">5</option>    
                    <option value="6">6</option>
                    <option value="7">7</option>
                    <option value="8">8</option>
                    <option value="9">9</option>
                    <option value="10">10</option>
                  </select>
                </div>
                <!-- <input type="checkbox" checked="checked"> Remember me -->
               <button> Add to Cart</button>
              </div>
                   <p>By creating an account you agree to our <a href="#">Terms & Privacy</a>.</p>
            </form>
          </div>
          <script>

var modal = document.getElementById('id01');


window.onclick = function(event) {
    if (event.target == modal) {
        modal.style.display = "none";
    }
}
</script>
          </p>
        </div>
      </div>
    </div>
    <div class="col-sm-4 col-md-4 col-lg-4 col-xs-6">
      <div class="thumbnail"> <img src="images/400X200(2).gif" alt="Thumbnail Image 1" class="img-responsive">
        <div class="caption">
          <h3>Product</h3>
          <p>Lorem ipsum dolor sit amet, consectetur adipisicing.</p>
          <p> <button class="btn btn-primary" role="button" onclick="document.getElementById('id02').style.display='block'"><span class="glyphicon glyphicon-shopping-cart" aria-hidden="true"></span>Add to Cart</button>
          <div id="id02" class="modal"> <span onclick="document.getElementById('id02').style.display='none'" class="close" title="Close Modal">&times;</span>
            <form class="modal-content animate" action="/action_page.php">
              <div class="containermodal"> 
                <!-- <label><b>Email</b></label> --><br>
                <p></p>
                <input type="text" placeholder="Enter first name" name="fname" required>
                <input type="text" placeholder="Enter last name" name="lname" required>
                <input type="text" placeholder="Enter Email" name="email" required>
                <input type="text" placeholder="Enter Mobile Number" name="mobnum" required>
                <input type="text" placeholder="Instructions for Seller" name="instructions">
                <div>
                  <select class="selectbox">
                    <option value="volvo">Extra Small</option>
                    <option value="volvo">Small</option>
                    <option value="saab">Medium</option>
                    <option value="mercedes">Large</option>
                    <option value="audi">XL</option>
                  </select>
                </div>
                 <button> Add to Cart</button>
                <!-- <input type="checkbox" checked="checked"> Remember me -->
               
              
              </div>
                   <p>By creating an account you agree to our <a href="#">Terms & Privacy</a>.</p>
            </form>
          </div>
          <script>

var modal = document.getElementById('id02');


window.onclick = function(event) {
    if (event.target == modal) {
        modal.style.display = "none";
    }
}
</script> </p>
        </div>
      </div>
    </div>
    <div class="col-sm-4 col-md-4 col-lg-4 col-xs-6">
      <div class="thumbnail"> <img src="images/400X200(3).gif" alt="Thumbnail Image 1" class="img-responsive">
        <div class="caption">
          <h3>Product</h3>
          <p>Lorem ipsum dolor sit amet, consectetur adipisicing.</p>
          <p> <button class="btn btn-primary" role="button" onclick="document.getElementById('id03').style.display='block'"><span class="glyphicon glyphicon-shopping-cart" aria-hidden="true"></span>Add to Cart</button>
          <div id="id03" class="modal"> <span onclick="document.getElementById('id03').style.display='none'" class="close" title="Close Modal">&times;</span>
            <form class="modal-content animate" action="/action_page.php">
              <div class="containermodal"> 
                <!-- <label><b>Email</b></label> --><br>
                <p></p>
                <input type="text" placeholder="Enter first name" name="fname" required>
                <input type="text" placeholder="Enter last name" name="lname" required>
                <input type="text" placeholder="Enter Email" name="email" required>
                <input type="text" placeholder="Enter Mobile Number" name="mobnum" required>
                <input type="text" placeholder="Instructions for Seller" name="instructions">
                <div>
                  <select class="selectbox">
                    <option value="volvo">Extra Small</option>
                    <option value="volvo">Small</option>
                    <option value="saab">Medium</option>
                    <option value="mercedes">Large</option>
                    <option value="audi">XL</option>
                  </select>
                </div>
                <!-- <input type="checkbox" checked="checked"> Remember me -->
                 <button> Add to Cart</button>
                <p>By creating an account you agree to our <a href="#">Terms & Privacy</a>.</p>
              </div>
            </form>
          </div>
          <script>

var modal = document.getElementById('id03');


window.onclick = function(event) {
    if (event.target == modal) {
        modal.style.display = "none";
    }
}
</script> </p>
        </div>
      </div>
    </div>
    <div class="col-sm-4 col-md-4 col-lg-4 col-xs-6 hidden-lg hidden-md hidden-sm">
      <div class="thumbnail"> <img src="images/400X200.gif" alt="Thumbnail Image 1" class="img-responsive">
        <div class="caption">
          <h3>Product</h3>
          <p>Lorem ipsum dolor sit amet, consectetur adipisicing.</p>
          <p><a href="#" class="btn btn-primary" role="button"><span class="glyphicon glyphicon-shopping-cart" aria-hidden="true"></span> Add to Cart</a></p>
        </div>
      </div>
    </div>
  </div>
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
          <div class="media-left"> <a href="#"> <img class="media-object" src="images/100X125.gif" alt="placeholder image"> </a> </div>
          <div class="media-body">
            <h4 class="media-heading">100X125.gif</h4>
            Lorem ipsum dolor sit amet, consectetur adipisicing elit. Facilis, vitae doloremque voluptatum doloribus neque assumenda velit sapiente quas aliquam ratione. Sed possimus corporis dolorum optio eaque in asperiores soluta expedita! </div>
        </div>
        <div class="media">
          <div class="media-left"> <a href="#"> <img class="media-object" src="images/100X125 - Copy (4).gif" alt="placeholder image"> </a> </div>
          <div class="media-body">
            <h4 class="media-heading">100X125 - Copy (4).gif</h4>
            Lorem ipsum dolor sit amet, consectetur adipisicing elit. Velit, quasi doloribus non repellendus quae aperiam. Quos, eligendi itaque soluta ut dignissimos reprehenderit commodi laboriosam quis atque minus enim magnam delectus.</div>
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
          <div class="media-left"> <a href="#"> <img class="media-object" src="images/100X125 - Copy (2).gif" alt="placeholder image"></a></div>
          <div class="media-body">
            <h4 class="media-heading">100X125 - Copy (2).gif</h4>
            Lorem ipsum dolor sit amet, consectetur adipisicing elit. Sit, eos, et in quam laboriosam ipsum laudantium laborum provident nihil modi reprehenderit tempora voluptatum quasi non libero quaerat vel. Assumenda, officiis?</div>
        </div>
        <div class="media">
          <div class="media-left"> <a href="#"> <img class="media-object" src="images/100X125 - Copy (5).gif" alt="placeholder image"></a></div>
          <div class="media-body">
            <h4 class="media-heading">100X125 - Copy (5).gif</h4>
            Lorem ipsum dolor sit amet, consectetur adipisicing elit. Obcaecati, minus, praesentium dignissimos non provident et consectetur illo expedita aliquam laboriosam esse incidunt deleniti accusantium debitis voluptas. Non vitae quos dolorem.</div>
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
          <div class="media-left"> <a href="#"> <img class="media-object" src="images/100X125 - Copy (3).gif" alt="placeholder image"></a></div>
          <div class="media-body">
            <h4 class="media-heading">100X125 - Copy (3).gif</h4>
            Lorem ipsum dolor sit amet, consectetur adipisicing elit. Porro dolorum reprehenderit vitae omnis. Quidem, recusandae, magni ut perspiciatis nobis consequuntur ullam molestias molestiae obcaecati ea labore aspernatur modi. Impedit, fugit!</div>
        </div>
        <div class="media">
          <div class="media-left"> <a href="#"> <img class="media-object" src="images/100X125 - Copy (2).gif" alt="placeholder image"></a></div>
          <div class="media-body">
            <h4 class="media-heading">100X125 - Copy (6).gif</h4>
            Lorem ipsum dolor sit amet, consectetur adipisicing elit. Dolore, libero, ea itaque atque vero quidem esse optio minus tenetur dolorem delectus nemo fugit deserunt quibusdam veritatis assumenda obcaecati praesentium omnis!</div>
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
    <div class="row">
      <div class="col-xs-12">
        <p>Copyright © MyWebsite. All rights reserved.</p>
      </div>
    </div>
  </div>
</footer>
<!-- jQuery (necessary for Bootstrap's JavaScript plugins) --> 
<script src="jquery-1.11.3.min.js"></script> 
<!-- Include all compiled plugins (below), or include individual files as needed --> 
<script src="bootstrap.js"></script>
</body>
</html>
