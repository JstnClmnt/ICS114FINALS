package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class category_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("  <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\r\n");
      out.write("  <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\r\n");
      out.write("<style>\r\n");
      out.write("/* Full-width input fields */\r\n");
      out.write("input[type=text], input[type=password] {\r\n");
      out.write("\twidth: 70%;\r\n");
      out.write("\tpadding: 12px 20px;\r\n");
      out.write("\tmargin: 8px 0;\r\n");
      out.write("\tdisplay: inline-block;\r\n");
      out.write("\tborder: 1px solid #ccc;\r\n");
      out.write("\tbox-sizing: border-box;\r\n");
      out.write("}\r\n");
      out.write("\t.selectbox{\r\n");
      out.write("\t\twidth: 20%;\r\n");
      out.write("\tpadding: 12px 20px;\r\n");
      out.write("\tmargin: 8px 0;\r\n");
      out.write("\tdisplay: inline-block;\r\n");
      out.write("\tborder: 1px solid #ccc;\r\n");
      out.write("\tbox-sizing: border-box;\r\n");
      out.write("\t}\r\n");
      out.write("/* Set a style for all buttons */\r\n");
      out.write("\r\n");
      out.write(".containermodal {\r\n");
      out.write("\tpadding: 5px;\r\n");
      out.write("}\r\n");
      out.write("/* The Modal (background) */\r\n");
      out.write(".modal {\r\n");
      out.write("\tdisplay: none; /* Hidden by default */\r\n");
      out.write("\tposition: fixed; /* Stay in place */\r\n");
      out.write("\tz-index: 1; /* Sit on top */\r\n");
      out.write("\tleft: 0;\r\n");
      out.write("\ttop: 0;\r\n");
      out.write("\twidth: 100%; /* Full width */\r\n");
      out.write("\theight: 100%; /* Full height */\r\n");
      out.write("\toverflow: auto; /* Enable scroll if needed */\r\n");
      out.write("\tbackground-color: rgb(0,0,0); /* Fallback color */\r\n");
      out.write("\tbackground-color: rgba(0,0,0,0.4); /* Black w/ opacity */\r\n");
      out.write("\tpadding-top: 60px;\r\n");
      out.write("}\r\n");
      out.write("/* Modal Content/Box */\r\n");
      out.write(".modal-content {\r\n");
      out.write("\tbackground-color: #fefefe;\r\n");
      out.write("\tmargin: 5% auto 15% auto; /* 5% from the top, 15% from the bottom and centered */\r\n");
      out.write("\tborder: 1px solid #888;\r\n");
      out.write("\twidth: 80%; /* Could be more or less, depending on screen size */\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("<link href=\"animate.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"utf-8\">\r\n");
      out.write("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("<title>Bootstrap eCommerce Template</title>\r\n");
      out.write("\r\n");
      out.write("<!-- Bootstrap -->\r\n");
      out.write("<link rel=\"stylesheet\" href=\"bootstrap.css\">\r\n");
      out.write("\r\n");
      out.write("<!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->\r\n");
      out.write("<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->\r\n");
      out.write("<!--[if lt IE 9]>\r\n");
      out.write("      <script src=\"https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js\"></script>\r\n");
      out.write("      <script src=\"https://oss.maxcdn.com/respond/1.4.2/respond.min.js\"></script>\r\n");
      out.write("    <![endif]-->\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<nav>\r\n");
      out.write("  <div class=\"container\"> \r\n");
      out.write("    \r\n");
      out.write("    <!-- Brand and toggle get grouped for better mobile display -->\r\n");
      out.write("    <div class=\"navbar-header\">\r\n");
      out.write("      <button type=\"button\" class=\"navbar-toggle collapsed\" data-toggle=\"collapse\" data-target=\"#bs-example-navbar-collapse-1\" aria-expanded=\"false\"> <span class=\"sr-only\">Toggle navigation</span> <span class=\"icon-bar\"></span> <span class=\"icon-bar\"></span> <span class=\"icon-bar\"></span> </button>\r\n");
      out.write("      <a class=\"navbar-brand\" href=\"#\">LUXER</a> </div>\r\n");
      out.write("    \r\n");
      out.write("    <!-- Collect the nav links, forms, and other content for toggling -->\r\n");
      out.write("    <div class=\"collapse navbar-collapse\">\r\n");
      out.write("      <ul class=\"nav navbar-nav\">\r\n");
      out.write("        <li class=\"active\"><a href=\"#\">My Cart <span class=\"sr-only\">(current)</span></a> </li>\r\n");
      out.write("        <li><a href=\"#\">Shoes</a> </li>\r\n");
      out.write("        <li><a href=\"#\">Clothes</a> </li>\r\n");
      out.write("      </ul>\r\n");
      out.write("      <form class=\"navbar-form navbar-right\" role=\"search\">\r\n");
      out.write("        <div class=\"form-group\"> </div>\r\n");
      out.write("        <button type=\"submit\" class=\"btn btn-default\">Log-in</button>\r\n");
      out.write("      </form>\r\n");
      out.write("      <form class=\"navbar-form navbar-right\" role=\"search\">\r\n");
      out.write("        <div class=\"form-group\">\r\n");
      out.write("          <input type=\"text\" class=\"form-control\" placeholder=\"Search for Products\">\r\n");
      out.write("        </div>\r\n");
      out.write("        <button type=\"submit\" class=\"btn btn-default\">Submit</button>\r\n");
      out.write("      </form>\r\n");
      out.write("      <form class=\"navbar-form navbar-right\" role=\"search\">\r\n");
      out.write("        <div class=\"form-group\">\r\n");
      out.write("          <input type=\"text\" class=\"form-control\" placeholder=\"Look for Reference #\">\r\n");
      out.write("        </div>\r\n");
      out.write("        <button type=\"submit\" class=\"btn btn-default\">Submit</button>\r\n");
      out.write("      </form>\r\n");
      out.write("      <ul class=\"nav navbar-nav navbar-right hidden-sm\">\r\n");
      out.write("        <li> </li>\r\n");
      out.write("        <li class=\"dropdown\">\r\n");
      out.write("          <ul class=\"dropdown-menu\">\r\n");
      out.write("            <li><a href=\"#\">Action</a> </li>\r\n");
      out.write("            <li><a href=\"#\">Another action</a> </li>\r\n");
      out.write("            <li><a href=\"#\">Something else here</a> </li>\r\n");
      out.write("            <li role=\"separator\" class=\"divider\"></li>\r\n");
      out.write("            <li><a href=\"#\">Separated link</a> </li>\r\n");
      out.write("          </ul>\r\n");
      out.write("        </li>\r\n");
      out.write("      </ul>\r\n");
      out.write("    </div>\r\n");
      out.write("    <!-- /.navbar-collapse --> \r\n");
      out.write("  </div>\r\n");
      out.write("  <!-- /.container-fluid --> \r\n");
      out.write("</nav>\r\n");
      out.write("<div class=\"container\">\r\n");
      out.write("  <div class=\"row\">\r\n");
      out.write("    <div class=\"col-xs-12 col-sm-12 col-md-12 col-lg-12\">\r\n");
      out.write("      <div id=\"carousel1\" class=\"carousel slide\">\r\n");
      out.write("        <ol class=\"carousel-indicators\">\r\n");
      out.write("          <li data-target=\"#carousel1\" data-slide-to=\"0\" class=\"active\"> </li>\r\n");
      out.write("          <li data-target=\"#carousel1\" data-slide-to=\"1\" class=\"\"> </li>\r\n");
      out.write("          <li data-target=\"#carousel1\" data-slide-to=\"2\" class=\"\"> </li>\r\n");
      out.write("        </ol>\r\n");
      out.write("        <div class=\"carousel-inner\">\r\n");
      out.write("          <div class=\"item\"> <img class=\"img-responsive\" src=\"images/1920x500(1).gif\" alt=\"thumb\">\r\n");
      out.write("            <div class=\"carousel-caption\"> Stocks are only limited. Get yours now! </div>\r\n");
      out.write("          </div>\r\n");
      out.write("          <div class=\"item active\"> <img class=\"img-responsive\" src=\"images/1920x500(2).gif\" alt=\"thumb\">\r\n");
      out.write("            <div class=\"carousel-caption\"> Footware and clothing up for grabs! Enhance your wardrobe now. </div>\r\n");
      out.write("          </div>\r\n");
      out.write("          <div class=\"item\"> <img class=\"img-responsive\" src=\"images/1920x500(3).gif\" alt=\"thumb\">\r\n");
      out.write("            <div class=\"carousel-caption\"> </div>\r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <a class=\"left carousel-control\" href=\"#carousel1\" data-slide=\"prev\"><span class=\"icon-prev\"></span></a> <a class=\"right carousel-control\" href=\"#carousel1\" data-slide=\"next\"><span class=\"icon-next\"></span></a></div>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("  <hr>\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"container\">\r\n");
      out.write("  <div class=\"row\">\r\n");
      out.write("    <div class=\"col-lg-4 col-md-4 col-sm-4 col-xs-4\">\r\n");
      out.write("      <div class=\"row\">\r\n");
      out.write("        <div class=\"col-lg-2 col-md-3 col-sm-3 col-xs-2\"><img class=\"img-circle\" alt=\"Free Shipping\" src=\"images/40X40.gif\"></div>\r\n");
      out.write("        <div class=\"col-lg-6 col-md-9 col-sm-9 col-xs-9\">\r\n");
      out.write("          <h4>Cash on Delivery</h4>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"col-lg-4 col-md-4 col-sm-4 col-xs-4\">\r\n");
      out.write("      <div class=\"row\">\r\n");
      out.write("        <div class=\"col-lg-2 col-md-3 col-sm-3 col-xs-2\"><img class=\"img-circle\" alt=\"Free Shipping\" src=\"images/40X40.gif\"></div>\r\n");
      out.write("        <div class=\"col-lg-6 col-md-9 col-sm-9 col-xs-9\">\r\n");
      out.write("          <h4>No Fake Policy</h4>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"col-lg-4 col-md-4 col-sm-4 col-xs-4\">\r\n");
      out.write("      <div class=\"row\">\r\n");
      out.write("        <div class=\"col-lg-2 col-md-3 col-sm-3 col-xs-2\"><img class=\"img-circle\" alt=\"Free Shipping\" src=\"images/40X40.gif\"></div>\r\n");
      out.write("        <div class=\"col-lg-6 col-md-9 col-sm-9 col-xs-9\">\r\n");
      out.write("          <h4>Recognized </h4>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("</div>\r\n");
      out.write("<hr>\r\n");
      out.write("<h2 class=\"text-center\">Footwear and Clothing</h2>\r\n");
      out.write("<hr>\r\n");
      out.write("<div class=\"container\">\r\n");
      out.write("  <div class=\"row text-center\">\r\n");
      out.write("    <div class=\"col-sm-4 col-md-4 col-lg-4 col-xs-6\">\r\n");
      out.write("      <div class=\"thumbnail\"> <img src=\"images/400X200.gif\" alt=\"Thumbnail Image 1\" class=\"img-responsive\">\r\n");
      out.write("        <div class=\"caption\">\r\n");
      out.write("          <h3>Adidas - Yeezy Boost 350 V2 'Cream'</h3>\r\n");
      out.write("          <p>PHP 25750</p>\r\n");
      out.write("          <p>\r\n");
      out.write("            <button class=\"btn btn-primary\" role=\"button\" onclick=\"document.getElementById('id01').style.display='block'\"><span class=\"glyphicon glyphicon-shopping-cart\" aria-hidden=\"true\"></span>Add to Cart</button>\r\n");
      out.write("          \r\n");
      out.write("          </p>\r\n");
      out.write("          \r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"col-sm-4 col-md-4 col-lg-4 col-xs-6\">\r\n");
      out.write("      <div class=\"thumbnail\"> <img src=\"images/400X200(2).gif\" alt=\"Thumbnail Image 1\" class=\"img-responsive\">\r\n");
      out.write("        <div class=\"caption\">\r\n");
      out.write("          <h3>Adidas - Raf Simons Stan Smith </h3>\r\n");
      out.write("          <p>PHP 20000</p>\r\n");
      out.write("          <p> <button class=\"btn btn-primary\" role=\"button\" onclick=\"document.getElementById('id02').style.display='block'\"><span class=\"glyphicon glyphicon-shopping-cart\" aria-hidden=\"true\"></span>Add to Cart</button>\r\n");
      out.write("         </p>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    \r\n");
      out.write("    <div class=\"col-sm-4 col-md-4 col-lg-4 col-xs-6\">\r\n");
      out.write("      <div class=\"thumbnail\"> <img src=\"images/400X200(3).gif\" alt=\"Thumbnail Image 1\" class=\"img-responsive\">\r\n");
      out.write("        <div class=\"caption\">\r\n");
      out.write("          <h3>Adidas - Yeezy Powerphase Calabasas</h3>\r\n");
      out.write("          <p>PHP 30000</p>\r\n");
      out.write("          <p> <button class=\"btn btn-primary\" role=\"button\" onclick=\"document.getElementById('id03').style.display='block'\"><span class=\"glyphicon glyphicon-shopping-cart\" aria-hidden=\"true\"></span>Add to Cart</button>\r\n");
      out.write("          </p>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"col-sm-4 col-md-4 col-lg-4 col-xs-6 hidden-lg hidden-md hidden-sm\">\r\n");
      out.write("      <div class=\"thumbnail\"> <img src=\"images/400X200(4).gif\" alt=\"Thumbnail Image 1\" class=\"img-responsive\">\r\n");
      out.write("        <div class=\"caption\">\r\n");
      out.write("          <h3>Adidas - Yeezy Wave Runner</h3>\r\n");
      out.write("          <p>PHP 50000</p>\r\n");
      out.write("          <p><a href=\"#\" class=\"btn btn-primary\" role=\"button\"><span class=\"glyphicon glyphicon-shopping-cart\" aria-hidden=\"true\"></span> Add to Cart</a></p>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("  <div class=\"row text-center hidden-xs\"> </div>\r\n");
      out.write("</div>\r\n");
      out.write("<!-- -->\r\n");
      out.write("\r\n");
      out.write("<div class=\"container\">\r\n");
      out.write("  <div class=\"row text-center\">\r\n");
      out.write("    <div class=\"col-sm-4 col-md-4 col-lg-4 col-xs-6\">\r\n");
      out.write("      <div class=\"thumbnail\"> <img src=\"images/400X200(4).gif\" alt=\"Thumbnail Image 1\" class=\"img-responsive\">\r\n");
      out.write("        <div class=\"caption\">\r\n");
      out.write("          <h3>Adidas - Yeezy Wave Runner (Limited Stocks ONLY!)</h3>\r\n");
      out.write("          <p>PHP 50000</p>\r\n");
      out.write("          <p>\r\n");
      out.write("            <button class=\"btn btn-primary\" role=\"button\" onclick=\"document.getElementById('id04').style.display='block'\"><span class=\"glyphicon glyphicon-shopping-cart\" aria-hidden=\"true\"></span>Add to Cart</button>\r\n");
      out.write("          \r\n");
      out.write("          </p>\r\n");
      out.write("          \r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"col-sm-4 col-md-4 col-lg-4 col-xs-6\">\r\n");
      out.write("      <div class=\"thumbnail\"> <img src=\"images/400X200(5).gif\" alt=\"Thumbnail Image 1\" class=\"img-responsive\">\r\n");
      out.write("        <div class=\"caption\">\r\n");
      out.write("          <h3>Nike - Air Force 1 'Travis Scott'</h3>\r\n");
      out.write("          <p>PHP 25000</p>\r\n");
      out.write("          <p> <button class=\"btn btn-primary\" role=\"button\" onclick=\"document.getElementById('id05').style.display='block'\"><span class=\"glyphicon glyphicon-shopping-cart\" aria-hidden=\"true\"></span>Add to Cart</button>\r\n");
      out.write("        </p>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    \r\n");
      out.write("    <div class=\"col-sm-4 col-md-4 col-lg-4 col-xs-6\">\r\n");
      out.write("      <div class=\"thumbnail\"> <img src=\"images/400X200(6).gif\" alt=\"Thumbnail Image 1\" class=\"img-responsive\">\r\n");
      out.write("        <div class=\"caption\">\r\n");
      out.write("          <h3>Nike - Air Jordan 1 'Off White' (Limited Stocks ONLY!) </h3>\r\n");
      out.write("          <p>PHP 70000</p>\r\n");
      out.write("          <p> <button class=\"btn btn-primary\" role=\"button\" onclick=\"document.getElementById('id06').style.display='block'\"><span class=\"glyphicon glyphicon-shopping-cart\" aria-hidden=\"true\"></span>Add to Cart</button>\r\n");
      out.write("           </p>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"col-sm-4 col-md-4 col-lg-4 col-xs-6 hidden-lg hidden-md hidden-sm\">\r\n");
      out.write("      <div class=\"thumbnail\"> <img src=\"images/400X200.gif\" alt=\"Thumbnail Image 1\" class=\"img-responsive\">\r\n");
      out.write("        <div class=\"caption\">\r\n");
      out.write("          <h3>Product</h3>\r\n");
      out.write("          <p>Lorem ipsum dolor sit amet, consectetur adipisicing.</p>\r\n");
      out.write("          <p><a href=\"#\" class=\"btn btn-primary\" role=\"button\"><span class=\"glyphicon glyphicon-shopping-cart\" aria-hidden=\"true\"></span> Add to Cart</a></p>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("  <div class=\"row text-center hidden-xs\"> </div>\r\n");
      out.write("</div>\r\n");
      out.write("<!-- -->\r\n");
      out.write("\r\n");
      out.write("<div class=\"container\">\r\n");
      out.write("  <div class=\"row text-center\">\r\n");
      out.write("    <div class=\"col-sm-4 col-md-4 col-lg-4 col-xs-6\">\r\n");
      out.write("      <div class=\"thumbnail\"> <img src=\"images/400X200(7).gif\" alt=\"Thumbnail Image 1\" class=\"img-responsive\">\r\n");
      out.write("        <div class=\"caption\">\r\n");
      out.write("          <h3>Nike - Air Max 97 'Silver Bullet'</h3>\r\n");
      out.write("          <p>PHP 10000</p>\r\n");
      out.write("          <p>\r\n");
      out.write("            <button class=\"btn btn-primary\" role=\"button\" onclick=\"document.getElementById('id07').style.display='block'\"><span class=\"glyphicon glyphicon-shopping-cart\" aria-hidden=\"true\"></span>Add to Cart</button>\r\n");
      out.write("         \r\n");
      out.write("          </p>\r\n");
      out.write("          \r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"col-sm-4 col-md-4 col-lg-4 col-xs-6\">\r\n");
      out.write("      <div class=\"thumbnail\"> <img src=\"images/400X200(8).gif\" alt=\"Thumbnail Image 1\" class=\"img-responsive\">\r\n");
      out.write("        <div class=\"caption\">\r\n");
      out.write("          <h3>Nike - Air Vapormax 'CDG' (Limited Stocks ONLY!)</h3>\r\n");
      out.write("          <p>PHP 25000</p>\r\n");
      out.write("          <p> <button class=\"btn btn-primary\" role=\"button\" onclick=\"document.getElementById('id08').style.display='block'\"><span class=\"glyphicon glyphicon-shopping-cart\" aria-hidden=\"true\"></span>Add to Cart</button>\r\n");
      out.write("          </p>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    \r\n");
      out.write("    <div class=\"col-sm-4 col-md-4 col-lg-4 col-xs-6\">\r\n");
      out.write("      <div class=\"thumbnail\"> <img src=\"images/400X200(9).gif\" alt=\"Thumbnail Image 1\" class=\"img-responsive\">\r\n");
      out.write("        <div class=\"caption\">\r\n");
      out.write("          <h3>Nike - Blazer Mid 'Off White' (Limited Stocks ONLY!) </h3>\r\n");
      out.write("          <p>PHP 13000</p>\r\n");
      out.write("          <p> <button class=\"btn btn-primary\" role=\"button\" onclick=\"document.getElementById('id09').style.display='block'\"><span class=\"glyphicon glyphicon-shopping-cart\" aria-hidden=\"true\"></span>Add to Cart</button>\r\n");
      out.write("         </p>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"col-sm-4 col-md-4 col-lg-4 col-xs-6 hidden-lg hidden-md hidden-sm\">\r\n");
      out.write("      <div class=\"thumbnail\"> <img src=\"images/400X200.gif\" alt=\"Thumbnail Image 1\" class=\"img-responsive\">\r\n");
      out.write("        <div class=\"caption\">\r\n");
      out.write("          <h3>Product</h3>\r\n");
      out.write("          <p>Lorem ipsum dolor sit amet, consectetur adipisicing.</p>\r\n");
      out.write("          <p><a href=\"#\" class=\"btn btn-primary\" role=\"button\"><span class=\"glyphicon glyphicon-shopping-cart\" aria-hidden=\"true\"></span> Add to Cart</a></p>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("  <div class=\"row text-center hidden-xs\"> </div>\r\n");
      out.write("</div>\r\n");
      out.write(" <div class=\"col-sm-4 col-md-4 col-lg-4 col-xs-6\">\r\n");
      out.write("      <div class=\"thumbnail\"> <img src=\"images/400x200(10).gif\" alt=\"Thumbnail Image 1\" class=\"img-responsive\">\r\n");
      out.write("        <div class=\"caption\">\r\n");
      out.write("          <h3>Balenciaga - 'Sinners' T-Shirt</h3>\r\n");
      out.write("          <p>PHP 17000</p>\r\n");
      out.write("          <p>\r\n");
      out.write("            <button class=\"btn btn-primary\" role=\"button\" onclick=\"document.getElementById('id01').style.display='block'\"><span class=\"glyphicon glyphicon-shopping-cart\" aria-hidden=\"true\"></span>Add to Cart</button>\r\n");
      out.write("          \r\n");
      out.write("          </p>\r\n");
      out.write("          \r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"col-sm-4 col-md-4 col-lg-4 col-xs-6\">\r\n");
      out.write("      <div class=\"thumbnail\"> <img src=\"images/400x200(11).gif\" alt=\"Thumbnail Image 1\" class=\"img-responsive\">\r\n");
      out.write("        <div class=\"caption\">\r\n");
      out.write("          <h3>Fendi - Black Picasso John Boots Face Pullover </h3>\r\n");
      out.write("          <p>PHP 28000</p>\r\n");
      out.write("          <p> <button class=\"btn btn-primary\" role=\"button\" onclick=\"document.getElementById('id02').style.display='block'\"><span class=\"glyphicon glyphicon-shopping-cart\" aria-hidden=\"true\"></span>Add to Cart</button>\r\n");
      out.write("         </p>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    \r\n");
      out.write("    <div class=\"col-sm-4 col-md-4 col-lg-4 col-xs-6\">\r\n");
      out.write("      <div class=\"thumbnail\"> <img src=\"images/400x200(12).gif\" alt=\"Thumbnail Image 1\" class=\"img-responsive\">\r\n");
      out.write("        <div class=\"caption\">\r\n");
      out.write("          <h3>Gosha Rubchinskiy - Grey Sweatshirt</h3>\r\n");
      out.write("          <p>PHP 10000</p>\r\n");
      out.write("          <p> <button class=\"btn btn-primary\" role=\"button\" onclick=\"document.getElementById('id03').style.display='block'\"><span class=\"glyphicon glyphicon-shopping-cart\" aria-hidden=\"true\"></span>Add to Cart</button>\r\n");
      out.write("          </p>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"col-sm-4 col-md-4 col-lg-4 col-xs-6 hidden-lg hidden-md hidden-sm\">\r\n");
      out.write("      <div class=\"thumbnail\"> <img src=\"images/400X200(4).gif\" alt=\"Thumbnail Image 1\" class=\"img-responsive\">\r\n");
      out.write("        <div class=\"caption\">\r\n");
      out.write("          <h3>Adidas - Yeezy Wave Runner</h3>\r\n");
      out.write("          <p>PHP 50000</p>\r\n");
      out.write("          <p><a href=\"#\" class=\"btn btn-primary\" role=\"button\"><span class=\"glyphicon glyphicon-shopping-cart\" aria-hidden=\"true\"></span> Add to Cart</a></p>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("  <div class=\"row text-center hidden-xs\"> </div>\r\n");
      out.write("</div>\r\n");
      out.write("<!-- -->\r\n");
      out.write("\r\n");
      out.write("<div class=\"container\">\r\n");
      out.write("  <div class=\"row text-center\">\r\n");
      out.write("    <div class=\"col-sm-4 col-md-4 col-lg-4 col-xs-6\">\r\n");
      out.write("      <div class=\"thumbnail\"> <img src=\"images/400x200(13).gif\" alt=\"Thumbnail Image 1\" class=\"img-responsive\">\r\n");
      out.write("        <div class=\"caption\">\r\n");
      out.write("          <h3>Gucci - Blue & Red Exit 32 Inchiostro Vest</h3>\r\n");
      out.write("          <p>PHP 29000</p>\r\n");
      out.write("          <p>\r\n");
      out.write("            <button class=\"btn btn-primary\" role=\"button\" onclick=\"document.getElementById('id04').style.display='block'\"><span class=\"glyphicon glyphicon-shopping-cart\" aria-hidden=\"true\"></span>Add to Cart</button>\r\n");
      out.write("          \r\n");
      out.write("          </p>\r\n");
      out.write("          \r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"col-sm-4 col-md-4 col-lg-4 col-xs-6\">\r\n");
      out.write("      <div class=\"thumbnail\"> <img src=\"images/400x200(14).gif\" alt=\"Thumbnail Image 1\" class=\"img-responsive\">\r\n");
      out.write("        <div class=\"caption\">\r\n");
      out.write("          <h3>Helmut Lang - 'Austria' T-Shirt</h3>\r\n");
      out.write("          <p>PHP 7000</p>\r\n");
      out.write("          <p> <button class=\"btn btn-primary\" role=\"button\" onclick=\"document.getElementById('id05').style.display='block'\"><span class=\"glyphicon glyphicon-shopping-cart\" aria-hidden=\"true\"></span>Add to Cart</button>\r\n");
      out.write("        </p>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    \r\n");
      out.write("    <div class=\"col-sm-4 col-md-4 col-lg-4 col-xs-6\">\r\n");
      out.write("      <div class=\"thumbnail\"> <img src=\"images/400x200(15).gif\" alt=\"Thumbnail Image 1\" class=\"img-responsive\">\r\n");
      out.write("        <div class=\"caption\">\r\n");
      out.write("          <h3>PLAY by Comme des Garcons - Grey Patch Hoodie </h3>\r\n");
      out.write("          <p>PHP 15000</p>\r\n");
      out.write("          <p> <button class=\"btn btn-primary\" role=\"button\" onclick=\"document.getElementById('id06').style.display='block'\"><span class=\"glyphicon glyphicon-shopping-cart\" aria-hidden=\"true\"></span>Add to Cart</button>\r\n");
      out.write("           </p>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"col-sm-4 col-md-4 col-lg-4 col-xs-6 hidden-lg hidden-md hidden-sm\">\r\n");
      out.write("      <div class=\"thumbnail\"> <img src=\"images/400X200.gif\" alt=\"Thumbnail Image 1\" class=\"img-responsive\">\r\n");
      out.write("        <div class=\"caption\">\r\n");
      out.write("          <h3>Product</h3>\r\n");
      out.write("          <p>Lorem ipsum dolor sit amet, consectetur adipisicing.</p>\r\n");
      out.write("          <p><a href=\"#\" class=\"btn btn-primary\" role=\"button\"><span class=\"glyphicon glyphicon-shopping-cart\" aria-hidden=\"true\"></span> Add to Cart</a></p>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("  <div class=\"row text-center hidden-xs\"> </div>\r\n");
      out.write("</div>\r\n");
      out.write("<!-- -->\r\n");
      out.write("\r\n");
      out.write("<div class=\"container\">\r\n");
      out.write("  <div class=\"row text-center\">\r\n");
      out.write("    <div class=\"col-sm-4 col-md-4 col-lg-4 col-xs-6\">\r\n");
      out.write("      <div class=\"thumbnail\"> <img src=\"images/400x200(16).gif\" alt=\"Thumbnail Image 1\" class=\"img-responsive\">\r\n");
      out.write("        <div class=\"caption\">\r\n");
      out.write("          <h3>PLAY by Comme des Garcons - White Patch Shirt</h3>\r\n");
      out.write("          <p>PHP 13500</p>\r\n");
      out.write("          <p>\r\n");
      out.write("            <button class=\"btn btn-primary\" role=\"button\" onclick=\"document.getElementById('id07').style.display='block'\"><span class=\"glyphicon glyphicon-shopping-cart\" aria-hidden=\"true\"></span>Add to Cart</button>\r\n");
      out.write("         \r\n");
      out.write("          </p>\r\n");
      out.write("          \r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"col-sm-4 col-md-4 col-lg-4 col-xs-6\">\r\n");
      out.write("      <div class=\"thumbnail\"> <img src=\"images/400x200(17).gif\" alt=\"Thumbnail Image 1\" class=\"img-responsive\">\r\n");
      out.write("        <div class=\"caption\">\r\n");
      out.write("          <h3>Prade - Beige & Grey Shetland Village Sweater</h3>\r\n");
      out.write("          <p>PHP 40750</p>\r\n");
      out.write("          <p> <button class=\"btn btn-primary\" role=\"button\" onclick=\"document.getElementById('id08').style.display='block'\"><span class=\"glyphicon glyphicon-shopping-cart\" aria-hidden=\"true\"></span>Add to Cart</button>\r\n");
      out.write("          </p>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    \r\n");
      out.write("    <div class=\"col-sm-4 col-md-4 col-lg-4 col-xs-6\">\r\n");
      out.write("      <div class=\"thumbnail\"> <img src=\"images/400x200(18).gif\" alt=\"Thumbnail Image 1\" class=\"img-responsive\">\r\n");
      out.write("        <div class=\"caption\">\r\n");
      out.write("          <h3>Vetements - Reversible Bomber Jacket  </h3>\r\n");
      out.write("          <p>PHP 109000</p>\r\n");
      out.write("          <p> <button class=\"btn btn-primary\" role=\"button\" onclick=\"document.getElementById('id09').style.display='block'\"><span class=\"glyphicon glyphicon-shopping-cart\" aria-hidden=\"true\"></span>Add to Cart</button>\r\n");
      out.write("         </p>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"col-sm-4 col-md-4 col-lg-4 col-xs-6 hidden-lg hidden-md hidden-sm\">\r\n");
      out.write("      <div class=\"thumbnail\"> <img src=\"images/400X200.gif\" alt=\"Thumbnail Image 1\" class=\"img-responsive\">\r\n");
      out.write("        <div class=\"caption\">\r\n");
      out.write("          <h3>Product</h3>\r\n");
      out.write("          <p>Lorem ipsum dolor sit amet, consectetur adipisicing.</p>\r\n");
      out.write("          <p><a href=\"#\" class=\"btn btn-primary\" role=\"button\"><span class=\"glyphicon glyphicon-shopping-cart\" aria-hidden=\"true\"></span> Add to Cart</a></p>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("  <div class=\"row text-center hidden-xs\"> </div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- -->\r\n");
      out.write("<hr>\r\n");
      out.write("<hr>\r\n");
      out.write("<div class=\"container\"> </div>\r\n");
      out.write("<hr>\r\n");
      out.write("<footer class=\"text-center\">\r\n");
      out.write("  <div class=\"container\">\r\n");
      out.write("    <div class=\"row\">\r\n");
      out.write("      <div class=\"col-xs-12\"> </div>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("</footer>\r\n");
      out.write("<!-- jQuery (necessary for Bootstrap's JavaScript plugins) --> \r\n");
      out.write("<script src=\"jquery-1.11.3.min.js\"></script> \r\n");
      out.write("<!-- Include all compiled plugins (below), or include individual files as needed --> \r\n");
      out.write("<script src=\"bootstrap.js\"></script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
