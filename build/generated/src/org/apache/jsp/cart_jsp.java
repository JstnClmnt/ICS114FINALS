package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class cart_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
    _jspx_tagPool_c_if_test.release();
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("  <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\r\n");
      out.write("  <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\r\n");
      out.write("<style>\r\n");
      out.write("/* Full-width input fields */\r\n");
      out.write("input[type=text], input[type=password] {\r\n");
      out.write("\twidth: 100%;\r\n");
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
      out.write("<title>Luxur</title>\r\n");
      out.write("\r\n");
      out.write("<!-- Bootstrap -->\r\n");
      out.write("<link rel=\"stylesheet\" href=\"../web/bootstrap.css\">\r\n");
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
      out.write("        <li class=\"active\"><a href=\"#\">My cart <span class=\"sr-only\">(current)</span></a> </li>\r\n");
      out.write("        <li><a href=\"#\">Shoes</a> </li>\r\n");
      out.write("        <li><a href=\"#\">Clothes</a> </li>\r\n");
      out.write("        \r\n");
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
      out.write("    \r\n");
      out.write("  </div>\r\n");
      out.write("  <!-- /.container-fluid --> \r\n");
      out.write("  \r\n");
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
      out.write("            <div class=\"carousel-caption\"> Footware and clothing are up for grab! Get yours now! </div>\r\n");
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
      out.write("   \r\n");
      out.write("   <!-- JSTL HERE @ JUSTINE -->\r\n");
      out.write("  <table>\r\n");
      out.write("\r\n");
      out.write("    \r\n");
      out.write("            \r\n");
      out.write("            ");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("        </table>\r\n");
      out.write("\t  <button> Proceed to cart </button>\r\n");
      out.write("</div>\r\n");
      out.write("<hr>\r\n");
      out.write("<hr>\r\n");
      out.write("<div class=\"container\">\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("                  \r\n");
      out.write("<div class=\"row text-center hidden-xs\"> </div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<hr>\r\n");
      out.write("<h2 class=\"text-center\">FEATURED PRODUCTS</h2>\r\n");
      out.write("<hr>\r\n");
      out.write("<div class=\"container\">\r\n");
      out.write("  <div class=\"row\">\r\n");
      out.write("    <div class=\"col-lg-4 col-md-6\">\r\n");
      out.write("      <div class=\"media-object-default\">\r\n");
      out.write("        <div class=\"media\">\r\n");
      out.write("          <div class=\"media-left\"> <a href=\"#\"> <img class=\"media-object\" src=\"images/400x200(6).gif\" alt=\"placeholder image\"> </a> </div>\r\n");
      out.write("          <div class=\"media-body\">\r\n");
      out.write("            <h4 class=\"media-heading\">100X125.gif</h4>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"media\">\r\n");
      out.write("          <div class=\"media-left\"> <a href=\"#\"> <img class=\"media-object\" src=\"images/400x200(16).gif\" alt=\"placeholder image\"> </a> </div>\r\n");
      out.write("          <div class=\"media-body\"> </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"media\">\r\n");
      out.write("          <div class=\"media-left\"> <a href=\"#\"> </a></div>\r\n");
      out.write("</div>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <hr class=\"hidden-md hidden-lg\">\r\n");
      out.write("    <div class=\"col-lg-4 col-md-6\">\r\n");
      out.write("      <div class=\"media-object-default\">\r\n");
      out.write("        <div class=\"media\">\r\n");
      out.write("          <div class=\"media-left\"> <a href=\"#\"> <img class=\"media-object\" src=\"images/400x200(3).gif\" alt=\"placeholder image\"></a></div>\r\n");
      out.write("          <div class=\"media-body\">\r\n");
      out.write("            <h4 class=\"media-heading\">100X125 - Copy (2).gif</h4>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"media\">\r\n");
      out.write("          <div class=\"media-left\"> <a href=\"#\"> <img class=\"media-object\" src=\"images/400x200(11).gif\" alt=\"placeholder image\"></a></div>\r\n");
      out.write("</div>\r\n");
      out.write("        <div class=\"media\">\r\n");
      out.write("          <div class=\"media-left\"> <a href=\"#\"> </a></div>\r\n");
      out.write("</div>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <hr class=\"hidden-lg\">\r\n");
      out.write("    <div class=\"col-lg-4 col-md-12 hidden-md\">\r\n");
      out.write("      <div class=\"media-object-default\">\r\n");
      out.write("        <div class=\"media\">\r\n");
      out.write("          <div class=\"media-left\"> <a href=\"#\"> <img class=\"media-object\" src=\"images/400x200(9).gif\" alt=\"placeholder image\"></a></div>\r\n");
      out.write("          <div class=\"media-body\">\r\n");
      out.write("            <h4 class=\"media-heading\">100X125 - Copy (3).gif</h4>\r\n");
      out.write("       </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"media\">\r\n");
      out.write("          <div class=\"media-left\"> <a href=\"#\"> <img class=\"media-object\" src=\"images/400x200(18).gif\" alt=\"placeholder image\"></a></div>\r\n");
      out.write("</div>\r\n");
      out.write("        <div class=\"media\">\r\n");
      out.write("          <div class=\"media-left\"> <a href=\"#\"> </a></div>\r\n");
      out.write("</div>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("</div>\r\n");
      out.write("<hr>\r\n");
      out.write("<footer class=\"text-center\">\r\n");
      out.write("  <div class=\"container\">\r\n");
      out.write("    <div class=\"row\"> </div>\r\n");
      out.write("  </div>\r\n");
      out.write("</footer>\r\n");
      out.write("<!-- jQuery (necessary for Bootstrap's JavaScript plugins) --> \r\n");
      out.write("<script src=\"../web/jquery-1.11.3.min.js\"></script> \r\n");
      out.write("<!-- Include all compiled plugins (below), or include individual files as needed --> \r\n");
      out.write("<script src=\"../web/bootstrap.js\"></script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
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

  private boolean _jspx_meth_c_if_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent(null);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${not empty userList}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write(" \r\n");
        out.write("                ");
        if (_jspx_meth_c_forEach_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("            ");
        int evalDoAfterBody = _jspx_th_c_if_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
    return false;
  }

  private boolean _jspx_meth_c_forEach_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_0);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${userList}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("user");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                    \r\n");
          out.write("                    <tr class=\"table\">\r\n");
          out.write("                        \r\n");
          out.write("                        <td>\r\n");
          out.write("                               <td class=\"data\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${hfdf}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>        \r\n");
          out.write("                        </td>          \r\n");
          out.write("                    </tr>\r\n");
          out.write("                    \r\n");
          out.write("                ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }
}
