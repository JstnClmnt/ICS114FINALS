package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("  <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\n");
      out.write("  <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("<style>\n");
      out.write("/* Full-width input fields */\n");
      out.write("input[type=text], input[type=password] {\n");
      out.write("\twidth: 70%;\n");
      out.write("\tpadding: 12px 20px;\n");
      out.write("\tmargin: 8px 0;\n");
      out.write("\tdisplay: inline-block;\n");
      out.write("\tborder: 1px solid #ccc;\n");
      out.write("\tbox-sizing: border-box;\n");
      out.write("}\n");
      out.write("\t.selectbox{\n");
      out.write("\t\twidth: 20%;\n");
      out.write("\tpadding: 12px 20px;\n");
      out.write("\tmargin: 8px 0;\n");
      out.write("\tdisplay: inline-block;\n");
      out.write("\tborder: 1px solid #ccc;\n");
      out.write("\tbox-sizing: border-box;\n");
      out.write("\t}\n");
      out.write("/* Set a style for all buttons */\n");
      out.write("\n");
      out.write(".containermodal {\n");
      out.write("\tpadding: 5px;\n");
      out.write("}\n");
      out.write("/* The Modal (background) */\n");
      out.write(".modal {\n");
      out.write("\tdisplay: none; /* Hidden by default */\n");
      out.write("\tposition: fixed; /* Stay in place */\n");
      out.write("\tz-index: 1; /* Sit on top */\n");
      out.write("\tleft: 0;\n");
      out.write("\ttop: 0;\n");
      out.write("\twidth: 100%; /* Full width */\n");
      out.write("\theight: 100%; /* Full height */\n");
      out.write("\toverflow: auto; /* Enable scroll if needed */\n");
      out.write("\tbackground-color: rgb(0,0,0); /* Fallback color */\n");
      out.write("\tbackground-color: rgba(0,0,0,0.4); /* Black w/ opacity */\n");
      out.write("\tpadding-top: 60px;\n");
      out.write("}\n");
      out.write("/* Modal Content/Box */\n");
      out.write(".modal-content {\n");
      out.write("\tbackground-color: #fefefe;\n");
      out.write("\tmargin: 5% auto 15% auto; /* 5% from the top, 15% from the bottom and centered */\n");
      out.write("\tborder: 1px solid #888;\n");
      out.write("\twidth: 80%; /* Could be more or less, depending on screen size */\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("<link href=\"animate.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("<head>\n");
      out.write("<meta charset=\"utf-8\">\n");
      out.write("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("<title>Bootstrap eCommerce Template</title>\n");
      out.write("\n");
      out.write("<!-- Bootstrap -->\n");
      out.write("<link rel=\"stylesheet\" href=\"bootstrap.css\">\n");
      out.write("\n");
      out.write("<!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->\n");
      out.write("<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->\n");
      out.write("<!--[if lt IE 9]>\n");
      out.write("      <script src=\"https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js\"></script>\n");
      out.write("      <script src=\"https://oss.maxcdn.com/respond/1.4.2/respond.min.js\"></script>\n");
      out.write("    <![endif]-->\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<nav>\n");
      out.write("  <div class=\"container\"> \n");
      out.write("    \n");
      out.write("    <!-- Brand and toggle get grouped for better mobile display -->\n");
      out.write("    <div class=\"navbar-header\">\n");
      out.write("      <button type=\"button\" class=\"navbar-toggle collapsed\" data-toggle=\"collapse\" data-target=\"#bs-example-navbar-collapse-1\" aria-expanded=\"false\"> <span class=\"sr-only\">Toggle navigation</span> <span class=\"icon-bar\"></span> <span class=\"icon-bar\"></span> <span class=\"icon-bar\"></span> </button>\n");
      out.write("      <a class=\"navbar-brand\" href=\"#\">Name of Brand</a> </div>\n");
      out.write("    \n");
      out.write("    <!-- Collect the nav links, forms, and other content for toggling -->\n");
      out.write("    <div class=\"collapse navbar-collapse\">\n");
      out.write("      <ul class=\"nav navbar-nav\">\n");
      out.write("        <li class=\"active\"><a href=\"#\">My Cart <span class=\"sr-only\">(current)</span></a> </li>\n");
      out.write("        <li><a href=\"#\">Shoes</a> </li>\n");
      out.write("        <li><a href=\"#\">Clothes</a> </li>\n");
      out.write("      </ul>\n");
      out.write("      <form class=\"navbar-form navbar-right\" role=\"search\">\n");
      out.write("        <div class=\"form-group\"> </div>\n");
      out.write("        <button type=\"submit\" class=\"btn btn-default\">Log-in</button>\n");
      out.write("      </form>\n");
      out.write("      <ul class=\"nav navbar-nav navbar-right hidden-sm\">\n");
      out.write("        <li> </li>\n");
      out.write("        <li class=\"dropdown\">\n");
      out.write("          <ul class=\"dropdown-menu\">\n");
      out.write("            <li><a href=\"#\">Action</a> </li>\n");
      out.write("            <li><a href=\"#\">Another action</a> </li>\n");
      out.write("            <li><a href=\"#\">Something else here</a> </li>\n");
      out.write("            <li role=\"separator\" class=\"divider\"></li>\n");
      out.write("            <li><a href=\"#\">Separated link</a> </li>\n");
      out.write("          </ul>\n");
      out.write("        </li>\n");
      out.write("      </ul>\n");
      out.write("    </div>\n");
      out.write("    <!-- /.navbar-collapse --> \n");
      out.write("  </div>\n");
      out.write("  <!-- /.container-fluid --> \n");
      out.write("</nav>\n");
      out.write("<div class=\"container\">\n");
      out.write("  <div class=\"row\">\n");
      out.write("    <div class=\"col-xs-12 col-sm-12 col-md-12 col-lg-12\">\n");
      out.write("      <div id=\"carousel1\" class=\"carousel slide\">\n");
      out.write("        <ol class=\"carousel-indicators\">\n");
      out.write("          <li data-target=\"#carousel1\" data-slide-to=\"0\" class=\"active\"> </li>\n");
      out.write("          <li data-target=\"#carousel1\" data-slide-to=\"1\" class=\"\"> </li>\n");
      out.write("          <li data-target=\"#carousel1\" data-slide-to=\"2\" class=\"\"> </li>\n");
      out.write("        </ol>\n");
      out.write("        <div class=\"carousel-inner\">\n");
      out.write("          <div class=\"item\"> <img class=\"img-responsive\" src=\"images/1920x500(1).gif\" alt=\"thumb\">\n");
      out.write("            <div class=\"carousel-caption\"> Carousel caption 1. Here goes slide description. Lorem ipsum dolor set amet. </div>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"item active\"> <img class=\"img-responsive\" src=\"images/1920x500(2).gif\" alt=\"thumb\">\n");
      out.write("            <div class=\"carousel-caption\"> Carousel caption 2. Here goes slide description. Lorem ipsum dolor set amet. </div>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"item\"> <img class=\"img-responsive\" src=\"images/1920x500(3).gif\" alt=\"thumb\">\n");
      out.write("            <div class=\"carousel-caption\"> Carousel caption 3. Here goes slide description. Lorem ipsum dolor set amet. </div>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("        <a class=\"left carousel-control\" href=\"#carousel1\" data-slide=\"prev\"><span class=\"icon-prev\"></span></a> <a class=\"right carousel-control\" href=\"#carousel1\" data-slide=\"next\"><span class=\"icon-next\"></span></a></div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("  <hr>\n");
      out.write("</div>\n");
      out.write("<div class=\"container\">\n");
      out.write("  <div class=\"row\">\n");
      out.write("    <div class=\"col-lg-4 col-md-4 col-sm-4 col-xs-4\">\n");
      out.write("      <div class=\"row\">\n");
      out.write("        <div class=\"col-lg-2 col-md-3 col-sm-3 col-xs-2\"><img class=\"img-circle\" alt=\"Free Shipping\" src=\"images/40X40.gif\"></div>\n");
      out.write("        <div class=\"col-lg-6 col-md-9 col-sm-9 col-xs-9\">\n");
      out.write("          <h4>Free Shipping</h4>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"col-lg-4 col-md-4 col-sm-4 col-xs-4\">\n");
      out.write("      <div class=\"row\">\n");
      out.write("        <div class=\"col-lg-2 col-md-3 col-sm-3 col-xs-2\"><img class=\"img-circle\" alt=\"Free Shipping\" src=\"images/40X40.gif\"></div>\n");
      out.write("        <div class=\"col-lg-6 col-md-9 col-sm-9 col-xs-9\">\n");
      out.write("          <h4>100% Authentic</h4>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"col-lg-4 col-md-4 col-sm-4 col-xs-4\">\n");
      out.write("      <div class=\"row\">\n");
      out.write("        <div class=\"col-lg-2 col-md-3 col-sm-3 col-xs-2\"><img class=\"img-circle\" alt=\"Free Shipping\" src=\"images/40X40.gif\"></div>\n");
      out.write("        <div class=\"col-lg-6 col-md-9 col-sm-9 col-xs-9\">\n");
      out.write("          <h4>Affordable Prices</h4>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("<hr>\n");
      out.write("<h2 class=\"text-center\">RECOMMENDED PRODUCTS</h2>\n");
      out.write("<hr>\n");
      out.write("<div class=\"container\">\n");
      out.write("  <div class=\"row text-center\">\n");
      out.write("    <div class=\"col-sm-4 col-md-4 col-lg-4 col-xs-6\">\n");
      out.write("      <div class=\"thumbnail\"> <img src=\"images/400X200.gif\" alt=\"Thumbnail Image 1\" class=\"img-responsive\">\n");
      out.write("        <div class=\"caption\">\n");
      out.write("          <h3>Product</h3>\n");
      out.write("          <p>Lorem ipsum dolor sit amet, consectetur adipisicing.</p>\n");
      out.write("          <p>\n");
      out.write("            <button class=\"btn btn-primary\" role=\"button\" onclick=\"document.getElementById('id01').style.display='block'\"><span class=\"glyphicon glyphicon-shopping-cart\" aria-hidden=\"true\"></span>Add to Cart</button>\n");
      out.write("          <div id=\"id01\" class=\"modal\"> <span onclick=\"document.getElementById('id01').style.display='none'\" class=\"close\" title=\"Close Modal\">&times;</span>\n");
      out.write("            <form class=\"modal-content animate\" action=\"/action_page.php\">\n");
      out.write("              <div class=\"containermodal\"> \n");
      out.write("                <!-- <label><b>Email</b></label> --><br>\n");
      out.write("                <p></p>\n");
      out.write("                <input type=\"text\" placeholder=\"Enter first name\" name=\"fname\" required>\n");
      out.write("                <input type=\"text\" placeholder=\"Enter last name\" name=\"lname\" required>\n");
      out.write("                <input type=\"text\" placeholder=\"Enter Email\" name=\"email\" required>\n");
      out.write("                <input type=\"text\" placeholder=\"Enter Mobile Number\" name=\"mobnum\" required>\n");
      out.write("                <input type=\"text\" placeholder=\"Instructions for Seller\" name=\"instructions\">\n");
      out.write("                <div>\n");
      out.write("                  <select class=\"selectbox\">\n");
      out.write("                    <option value=\"xs\">Extra Small</option>\n");
      out.write("                    <option value=\"s\">Small</option>\n");
      out.write("                    <option value=\"m\">Medium</option>\n");
      out.write("                    <option value=\"l\">Large</option>\n");
      out.write("                    <option value=\"xl\">XL</option>\n");
      out.write("                  </select>\n");
      out.write("                  <select class=\"selectbox\">\n");
      out.write("                    <option value=\"1\">1</option>\n");
      out.write("                    <option value=\"2\">2</option>\n");
      out.write("                    <option value=\"3\">3</option>\n");
      out.write("                    <option value=\"4\">4</option>\n");
      out.write("                    <option value=\"5\">5</option>    \n");
      out.write("                    <option value=\"6\">6</option>\n");
      out.write("                    <option value=\"7\">7</option>\n");
      out.write("                    <option value=\"8\">8</option>\n");
      out.write("                    <option value=\"9\">9</option>\n");
      out.write("                    <option value=\"10\">10</option>\n");
      out.write("                  </select>\n");
      out.write("                </div>\n");
      out.write("                <!-- <input type=\"checkbox\" checked=\"checked\"> Remember me -->\n");
      out.write("               <button> Add to Cart</button>\n");
      out.write("              </div>\n");
      out.write("                   <p>By creating an account you agree to our <a href=\"#\">Terms & Privacy</a>.</p>\n");
      out.write("            </form>\n");
      out.write("          </div>\n");
      out.write("          <script>\n");
      out.write("\n");
      out.write("var modal = document.getElementById('id01');\n");
      out.write("\n");
      out.write("\n");
      out.write("window.onclick = function(event) {\n");
      out.write("    if (event.target == modal) {\n");
      out.write("        modal.style.display = \"none\";\n");
      out.write("    }\n");
      out.write("}\n");
      out.write("</script>\n");
      out.write("          </p>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"col-sm-4 col-md-4 col-lg-4 col-xs-6\">\n");
      out.write("      <div class=\"thumbnail\"> <img src=\"images/400X200(2).gif\" alt=\"Thumbnail Image 1\" class=\"img-responsive\">\n");
      out.write("        <div class=\"caption\">\n");
      out.write("          <h3>Product</h3>\n");
      out.write("          <p>Lorem ipsum dolor sit amet, consectetur adipisicing.</p>\n");
      out.write("          <p> <button class=\"btn btn-primary\" role=\"button\" onclick=\"document.getElementById('id02').style.display='block'\"><span class=\"glyphicon glyphicon-shopping-cart\" aria-hidden=\"true\"></span>Add to Cart</button>\n");
      out.write("          <div id=\"id02\" class=\"modal\"> <span onclick=\"document.getElementById('id02').style.display='none'\" class=\"close\" title=\"Close Modal\">&times;</span>\n");
      out.write("            <form class=\"modal-content animate\" action=\"/action_page.php\">\n");
      out.write("              <div class=\"containermodal\"> \n");
      out.write("                <!-- <label><b>Email</b></label> --><br>\n");
      out.write("                <p></p>\n");
      out.write("                <input type=\"text\" placeholder=\"Enter first name\" name=\"fname\" required>\n");
      out.write("                <input type=\"text\" placeholder=\"Enter last name\" name=\"lname\" required>\n");
      out.write("                <input type=\"text\" placeholder=\"Enter Email\" name=\"email\" required>\n");
      out.write("                <input type=\"text\" placeholder=\"Enter Mobile Number\" name=\"mobnum\" required>\n");
      out.write("                <input type=\"text\" placeholder=\"Instructions for Seller\" name=\"instructions\">\n");
      out.write("                <div>\n");
      out.write("                  <select class=\"selectbox\">\n");
      out.write("                    <option value=\"volvo\">Extra Small</option>\n");
      out.write("                    <option value=\"volvo\">Small</option>\n");
      out.write("                    <option value=\"saab\">Medium</option>\n");
      out.write("                    <option value=\"mercedes\">Large</option>\n");
      out.write("                    <option value=\"audi\">XL</option>\n");
      out.write("                  </select>\n");
      out.write("                </div>\n");
      out.write("                 <button> Add to Cart</button>\n");
      out.write("                <!-- <input type=\"checkbox\" checked=\"checked\"> Remember me -->\n");
      out.write("               \n");
      out.write("              \n");
      out.write("              </div>\n");
      out.write("                   <p>By creating an account you agree to our <a href=\"#\">Terms & Privacy</a>.</p>\n");
      out.write("            </form>\n");
      out.write("          </div>\n");
      out.write("          <script>\n");
      out.write("\n");
      out.write("var modal = document.getElementById('id02');\n");
      out.write("\n");
      out.write("\n");
      out.write("window.onclick = function(event) {\n");
      out.write("    if (event.target == modal) {\n");
      out.write("        modal.style.display = \"none\";\n");
      out.write("    }\n");
      out.write("}\n");
      out.write("</script> </p>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"col-sm-4 col-md-4 col-lg-4 col-xs-6\">\n");
      out.write("      <div class=\"thumbnail\"> <img src=\"images/400X200(3).gif\" alt=\"Thumbnail Image 1\" class=\"img-responsive\">\n");
      out.write("        <div class=\"caption\">\n");
      out.write("          <h3>Product</h3>\n");
      out.write("          <p>Lorem ipsum dolor sit amet, consectetur adipisicing.</p>\n");
      out.write("          <p> <button class=\"btn btn-primary\" role=\"button\" onclick=\"document.getElementById('id03').style.display='block'\"><span class=\"glyphicon glyphicon-shopping-cart\" aria-hidden=\"true\"></span>Add to Cart</button>\n");
      out.write("          <div id=\"id03\" class=\"modal\"> <span onclick=\"document.getElementById('id03').style.display='none'\" class=\"close\" title=\"Close Modal\">&times;</span>\n");
      out.write("            <form class=\"modal-content animate\" action=\"/action_page.php\">\n");
      out.write("              <div class=\"containermodal\"> \n");
      out.write("                <!-- <label><b>Email</b></label> --><br>\n");
      out.write("                <p></p>\n");
      out.write("                <input type=\"text\" placeholder=\"Enter first name\" name=\"fname\" required>\n");
      out.write("                <input type=\"text\" placeholder=\"Enter last name\" name=\"lname\" required>\n");
      out.write("                <input type=\"text\" placeholder=\"Enter Email\" name=\"email\" required>\n");
      out.write("                <input type=\"text\" placeholder=\"Enter Mobile Number\" name=\"mobnum\" required>\n");
      out.write("                <input type=\"text\" placeholder=\"Instructions for Seller\" name=\"instructions\">\n");
      out.write("                <div>\n");
      out.write("                  <select class=\"selectbox\">\n");
      out.write("                    <option value=\"volvo\">Extra Small</option>\n");
      out.write("                    <option value=\"volvo\">Small</option>\n");
      out.write("                    <option value=\"saab\">Medium</option>\n");
      out.write("                    <option value=\"mercedes\">Large</option>\n");
      out.write("                    <option value=\"audi\">XL</option>\n");
      out.write("                  </select>\n");
      out.write("                </div>\n");
      out.write("                <!-- <input type=\"checkbox\" checked=\"checked\"> Remember me -->\n");
      out.write("                 <button> Add to Cart</button>\n");
      out.write("                <p>By creating an account you agree to our <a href=\"#\">Terms & Privacy</a>.</p>\n");
      out.write("              </div>\n");
      out.write("            </form>\n");
      out.write("          </div>\n");
      out.write("          <script>\n");
      out.write("\n");
      out.write("var modal = document.getElementById('id03');\n");
      out.write("\n");
      out.write("\n");
      out.write("window.onclick = function(event) {\n");
      out.write("    if (event.target == modal) {\n");
      out.write("        modal.style.display = \"none\";\n");
      out.write("    }\n");
      out.write("}\n");
      out.write("</script> </p>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"col-sm-4 col-md-4 col-lg-4 col-xs-6 hidden-lg hidden-md hidden-sm\">\n");
      out.write("      <div class=\"thumbnail\"> <img src=\"images/400X200.gif\" alt=\"Thumbnail Image 1\" class=\"img-responsive\">\n");
      out.write("        <div class=\"caption\">\n");
      out.write("          <h3>Product</h3>\n");
      out.write("          <p>Lorem ipsum dolor sit amet, consectetur adipisicing.</p>\n");
      out.write("          <p><a href=\"#\" class=\"btn btn-primary\" role=\"button\"><span class=\"glyphicon glyphicon-shopping-cart\" aria-hidden=\"true\"></span> Add to Cart</a></p>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("  <div class=\"row text-center hidden-xs\"> </div>\n");
      out.write("</div>\n");
      out.write("<hr>\n");
      out.write("<h2 class=\"text-center\">FEATURED PRODUCTS</h2>\n");
      out.write("<hr>\n");
      out.write("<div class=\"container\">\n");
      out.write("  <div class=\"row\">\n");
      out.write("    <div class=\"col-lg-4 col-md-6\">\n");
      out.write("      <div class=\"media-object-default\">\n");
      out.write("        <div class=\"media\">\n");
      out.write("          <div class=\"media-left\"> <a href=\"#\"> <img class=\"media-object\" src=\"images/100X125.gif\" alt=\"placeholder image\"> </a> </div>\n");
      out.write("          <div class=\"media-body\">\n");
      out.write("            <h4 class=\"media-heading\">100X125.gif</h4>\n");
      out.write("            Lorem ipsum dolor sit amet, consectetur adipisicing elit. Facilis, vitae doloremque voluptatum doloribus neque assumenda velit sapiente quas aliquam ratione. Sed possimus corporis dolorum optio eaque in asperiores soluta expedita! </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"media\">\n");
      out.write("          <div class=\"media-left\"> <a href=\"#\"> <img class=\"media-object\" src=\"images/100X125 - Copy (4).gif\" alt=\"placeholder image\"> </a> </div>\n");
      out.write("          <div class=\"media-body\">\n");
      out.write("            <h4 class=\"media-heading\">100X125 - Copy (4).gif</h4>\n");
      out.write("            Lorem ipsum dolor sit amet, consectetur adipisicing elit. Velit, quasi doloribus non repellendus quae aperiam. Quos, eligendi itaque soluta ut dignissimos reprehenderit commodi laboriosam quis atque minus enim magnam delectus.</div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"media\">\n");
      out.write("          <div class=\"media-left\"> <a href=\"#\"> </a></div>\n");
      out.write("</div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("    <hr class=\"hidden-md hidden-lg\">\n");
      out.write("    <div class=\"col-lg-4 col-md-6\">\n");
      out.write("      <div class=\"media-object-default\">\n");
      out.write("        <div class=\"media\">\n");
      out.write("          <div class=\"media-left\"> <a href=\"#\"> <img class=\"media-object\" src=\"images/100X125 - Copy (2).gif\" alt=\"placeholder image\"></a></div>\n");
      out.write("          <div class=\"media-body\">\n");
      out.write("            <h4 class=\"media-heading\">100X125 - Copy (2).gif</h4>\n");
      out.write("            Lorem ipsum dolor sit amet, consectetur adipisicing elit. Sit, eos, et in quam laboriosam ipsum laudantium laborum provident nihil modi reprehenderit tempora voluptatum quasi non libero quaerat vel. Assumenda, officiis?</div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"media\">\n");
      out.write("          <div class=\"media-left\"> <a href=\"#\"> <img class=\"media-object\" src=\"images/100X125 - Copy (5).gif\" alt=\"placeholder image\"></a></div>\n");
      out.write("          <div class=\"media-body\">\n");
      out.write("            <h4 class=\"media-heading\">100X125 - Copy (5).gif</h4>\n");
      out.write("            Lorem ipsum dolor sit amet, consectetur adipisicing elit. Obcaecati, minus, praesentium dignissimos non provident et consectetur illo expedita aliquam laboriosam esse incidunt deleniti accusantium debitis voluptas. Non vitae quos dolorem.</div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"media\">\n");
      out.write("          <div class=\"media-left\"> <a href=\"#\"> </a></div>\n");
      out.write("</div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("    <hr class=\"hidden-lg\">\n");
      out.write("    <div class=\"col-lg-4 col-md-12 hidden-md\">\n");
      out.write("      <div class=\"media-object-default\">\n");
      out.write("        <div class=\"media\">\n");
      out.write("          <div class=\"media-left\"> <a href=\"#\"> <img class=\"media-object\" src=\"images/100X125 - Copy (3).gif\" alt=\"placeholder image\"></a></div>\n");
      out.write("          <div class=\"media-body\">\n");
      out.write("            <h4 class=\"media-heading\">100X125 - Copy (3).gif</h4>\n");
      out.write("            Lorem ipsum dolor sit amet, consectetur adipisicing elit. Porro dolorum reprehenderit vitae omnis. Quidem, recusandae, magni ut perspiciatis nobis consequuntur ullam molestias molestiae obcaecati ea labore aspernatur modi. Impedit, fugit!</div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"media\">\n");
      out.write("          <div class=\"media-left\"> <a href=\"#\"> <img class=\"media-object\" src=\"images/100X125 - Copy (2).gif\" alt=\"placeholder image\"></a></div>\n");
      out.write("          <div class=\"media-body\">\n");
      out.write("            <h4 class=\"media-heading\">100X125 - Copy (6).gif</h4>\n");
      out.write("            Lorem ipsum dolor sit amet, consectetur adipisicing elit. Dolore, libero, ea itaque atque vero quidem esse optio minus tenetur dolorem delectus nemo fugit deserunt quibusdam veritatis assumenda obcaecati praesentium omnis!</div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"media\">\n");
      out.write("          <div class=\"media-left\"> <a href=\"#\"> </a></div>\n");
      out.write("</div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("<hr>\n");
      out.write("<footer class=\"text-center\">\n");
      out.write("  <div class=\"container\">\n");
      out.write("    <div class=\"row\">\n");
      out.write("      <div class=\"col-xs-12\">\n");
      out.write("        <p>Copyright © MyWebsite. All rights reserved.</p>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</footer>\n");
      out.write("<!-- jQuery (necessary for Bootstrap's JavaScript plugins) --> \n");
      out.write("<script src=\"jquery-1.11.3.min.js\"></script> \n");
      out.write("<!-- Include all compiled plugins (below), or include individual files as needed --> \n");
      out.write("<script src=\"bootstrap.js\"></script>\n");
      out.write("</body>\n");
      out.write("</html>\n");
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