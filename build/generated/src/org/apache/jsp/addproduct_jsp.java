package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class addproduct_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_form_method_enctype_action_accept;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_file_name_label_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_s_form_method_enctype_action_accept = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_s_file_name_label_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_s_form_method_enctype_action_accept.release();
    _jspx_tagPool_s_file_name_label_nobody.release();
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
      response.setContentType("text/html; charset=US-ASCII");
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
      out.write("<!doctype html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("    <meta charset=\"utf-8\">\r\n");
      out.write("    <!-- utf-8 works for most cases -->\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("    <!-- Forcing initial-scale shouldn't be necessary -->\r\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("    <!-- Use the latest (edge) version of IE rendering engine -->\r\n");
      out.write("    <title>Luxur</title>\r\n");
      out.write("    <!-- The title tag shows in email notifications, like Android 4.4. -->\r\n");
      out.write("    <!-- Please use an inliner tool to convert all CSS to inline as inpage or external CSS is removed by email clients -->\r\n");
      out.write("    <!-- important in CSS is used to prevent the styles of currently inline CSS from overriding the ones mentioned in media queries when corresponding screen sizes are encountered -->\r\n");
      out.write("\r\n");
      out.write("    <!-- CSS Reset -->\r\n");
      out.write("    <style type=\"text/css\">\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tinput[type=text], input[type=password] {\r\n");
      out.write("\twidth: 70%;\r\n");
      out.write("\tpadding: 12px 20px;\r\n");
      out.write("\tmargin: 8px 0;\r\n");
      out.write("\tdisplay: inline-block;\r\n");
      out.write("\tborder: 1px solid #ccc;\r\n");
      out.write("\tbox-sizing: border-box;\r\n");
      out.write("}\r\n");
      out.write("\t.selectbox{\r\n");
      out.write("\t\twidth: 70%;\r\n");
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
      out.write("\t\t\r\n");
      out.write("/* What it does: Remove spaces around the email design added by some email clients. */\r\n");
      out.write("      /* Beware: It can remove the padding / margin and add a background color to the compose a reply window. */\r\n");
      out.write("html,  body {\r\n");
      out.write("\tmargin: 0 !important;\r\n");
      out.write("\tpadding: 0 !important;\r\n");
      out.write("\theight: 100% !important;\r\n");
      out.write("\twidth: 100% !important;\r\n");
      out.write("}\r\n");
      out.write("/* What it does: Stops email clients resizing small text. */\r\n");
      out.write("* {\r\n");
      out.write("\t-ms-text-size-adjust: 100%;\r\n");
      out.write("\t-webkit-text-size-adjust: 100%;\r\n");
      out.write("}\r\n");
      out.write("/* What it does: Forces Outlook.com to display emails full width. */\r\n");
      out.write(".ExternalClass {\r\n");
      out.write("\twidth: 100%;\r\n");
      out.write("}\r\n");
      out.write("/* What is does: Centers email on Android 4.4 */\r\n");
      out.write("div[style*=\"margin: 16px 0\"] {\r\n");
      out.write("\tmargin: 0 !important;\r\n");
      out.write("}\r\n");
      out.write("/* What it does: Stops Outlook from adding extra spacing to tables. */\r\n");
      out.write("table,  td {\r\n");
      out.write("\tmso-table-lspace: 0pt !important;\r\n");
      out.write("\tmso-table-rspace: 0pt !important;\r\n");
      out.write("}\r\n");
      out.write("/* What it does: Fixes webkit padding issue. Fix for Yahoo mail table alignment bug. Applies table-layout to the first 2 tables then removes for anything nested deeper. */\r\n");
      out.write("table {\r\n");
      out.write("\tborder-spacing: 0 !important;\r\n");
      out.write("\tborder-collapse: collapse !important;\r\n");
      out.write("\ttable-layout: fixed !important;\r\n");
      out.write("\tmargin: 0 auto !important;\r\n");
      out.write("}\r\n");
      out.write("table table table {\r\n");
      out.write("\ttable-layout: auto;\r\n");
      out.write("}\r\n");
      out.write("/* What it does: Uses a better rendering method when resizing images in IE. */\r\n");
      out.write("img {\r\n");
      out.write("\t-ms-interpolation-mode: bicubic;\r\n");
      out.write("}\r\n");
      out.write("/* What it does: Overrides styles added when Yahoo's auto-senses a link. */\r\n");
      out.write(".yshortcuts a {\r\n");
      out.write("\tborder-bottom: none !important;\r\n");
      out.write("}\r\n");
      out.write("/* What it does: Another work-around for iOS meddling in triggered links. */\r\n");
      out.write("a[x-apple-data-detectors] {\r\n");
      out.write("\tcolor: inherit !important;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("    <!-- Progressive Enhancements -->\r\n");
      out.write("    <style type=\"text/css\">\r\n");
      out.write("        \r\n");
      out.write("        /* What it does: Hover styles for buttons */\r\n");
      out.write("        .button-td,\r\n");
      out.write("        .button-a {\r\n");
      out.write("            transition: all 100ms ease-in;\r\n");
      out.write("        }\r\n");
      out.write("        .button-td:hover,\r\n");
      out.write("        .button-a:hover {\r\n");
      out.write("            background: #555555 !important;\r\n");
      out.write("            border-color: #555555 !important;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        /* Media Queries */\r\n");
      out.write("        @media screen and (max-width: 600px) {\r\n");
      out.write("\r\n");
      out.write("            .email-container {\r\n");
      out.write("                width: 100% !important;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            /* What it does: Forces elements to resize to the full width of their container. Useful for resizing images beyond their max-width. */\r\n");
      out.write("            .fluid,\r\n");
      out.write("            .fluid-centered {\r\n");
      out.write("                max-width: 100% !important;\r\n");
      out.write("                height: auto !important;\r\n");
      out.write("                margin-left: auto !important;\r\n");
      out.write("                margin-right: auto !important;\r\n");
      out.write("            }\r\n");
      out.write("            /* And center justify these ones. */\r\n");
      out.write("            .fluid-centered {\r\n");
      out.write("                margin-left: auto !important;\r\n");
      out.write("                margin-right: auto !important;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            /* What it does: Forces table cells into full-width rows. */\r\n");
      out.write("            .stack-column,\r\n");
      out.write("            .stack-column-center {\r\n");
      out.write("                display: block !important;\r\n");
      out.write("                width: 100% !important;\r\n");
      out.write("                max-width: 100% !important;\r\n");
      out.write("                direction: ltr !important;\r\n");
      out.write("            }\r\n");
      out.write("            /* And center justify these ones. */\r\n");
      out.write("            .stack-column-center {\r\n");
      out.write("                text-align: center !important;\r\n");
      out.write("            }\r\n");
      out.write("        \r\n");
      out.write("            /* What it does: Generic utility class for centering. Useful for images, buttons, and nested tables. */\r\n");
      out.write("            .center-on-narrow {\r\n");
      out.write("                text-align: center !important;\r\n");
      out.write("                display: block !important;\r\n");
      out.write("                margin-left: auto !important;\r\n");
      out.write("                margin-right: auto !important;\r\n");
      out.write("                float: none !important;\r\n");
      out.write("            }\r\n");
      out.write("            table.center-on-narrow {\r\n");
      out.write("                display: inline-block !important;\r\n");
      out.write("            }\r\n");
      out.write("                \r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("    </style>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body bgcolor=\"#e0e0e0\" width=\"100%\" style=\"margin: 0;\" yahoo=\"yahoo\">\r\n");
      out.write("    <table bgcolor=\"#e0e0e0\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\" height=\"100%\" width=\"100%\" style=\"border-collapse:collapse;\">\r\n");
      out.write("      <tr>\r\n");
      out.write("        <td><center style=\"width: 100%;\">\r\n");
      out.write("            \r\n");
      out.write("            <!-- Visually Hidden Preheader Text : BEGIN -->\r\n");
      out.write("            <div style=\"display:none;font-size:1px;line-height:1px;max-height:0px;max-width:0px;opacity:0;overflow:hidden;mso-hide:all;font-family: sans-serif;\"> (Optional) This text will appear in the inbox preview, but not the email body. </div>\r\n");
      out.write("            <!-- Visually Hidden Preheader Text : END --> \r\n");
      out.write("            \r\n");
      out.write("            <!-- Email Header : BEGIN -->\r\n");
      out.write("            <table align=\"center\" width=\"600\" class=\"email-container\">\r\n");
      out.write("            <tr>\r\n");
      out.write("                <td style=\"padding: 20px 0; text-align: center\">&nbsp;</td>\r\n");
      out.write("              </tr>\r\n");
      out.write("          </table>\r\n");
      out.write("            <!-- Email Header : END --> \r\n");
      out.write("            \r\n");
      out.write("            <!-- Email Body : BEGIN -->\r\n");
      out.write("            <table cellspacing=\"0\" cellpadding=\"0\" border=\"0\" align=\"center\" bgcolor=\"#ffffff\" width=\"600\" class=\"email-container\">\r\n");
      out.write("            \r\n");
      out.write("            <!-- Hero Image, Flush : BEGIN -->\r\n");
      out.write("            <tr>\r\n");
      out.write("                <td class=\"full-width-image\"><img src=\"images/Image_600x300.png\" width=\"600\" alt=\"alt_text\" border=\"0\" align=\"center\" style=\"width: 100%; max-width: 600px; height: auto;\"></td>\r\n");
      out.write("              </tr>\r\n");
      out.write("            <!-- Hero Image, Flush : END --> \r\n");
      out.write("            \r\n");
      out.write("            <!-- 1 Column Text : BEGIN -->\r\n");
      out.write("            <tr>\r\n");
      out.write("               \r\n");
      out.write("               \r\n");
      out.write("               \r\n");
      out.write("                <td style=\"padding: 40px; text-align: center; font-family: sans-serif; font-size: 15px; mso-height-rule: exactly; line-height: 20px; color: #555555;\"><br>\r\n");
      out.write("                <br>\r\n");
      out.write("                \r\n");
      out.write("                <!-- Button : Begin -->\r\n");
      out.write("                   ");
      if (_jspx_meth_s_form_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      out.write("                  <tr>\r\n");
      out.write("                  \r\n");
      out.write("                  \t<p> </p>\r\n");
      out.write("</tr>\r\n");
      out.write("                  \r\n");
      out.write("                   \r\n");
      out.write("<tr>\r\n");
      out.write("                  \t<br>\r\n");
      out.write("                  \t<button> Go back</button>\r\n");
      out.write("                  </tr>\r\n");
      out.write("                  \r\n");
      out.write("</table>\r\n");
      out.write("                \r\n");
      out.write("                <!-- Button : END --></td>\r\n");
      out.write("              </tr>\r\n");
      out.write("            <!-- 1 Column Text : BEGIN --> \r\n");
      out.write("            <!-- Background Image with Text : BEGIN -->\r\n");
      out.write("            <tr>\r\n");
      out.write("                <td background=\"images/Image_600x230.png\" bgcolor=\"#222222\" valign=\"middle\" style=\"text-align: center; background-position: center center !important; background-size: cover !important;\"><!--[if gte mso 9]>\r\n");
      out.write("                    <v:rect xmlns:v=\"urn:schemas-microsoft-com:vml\" fill=\"true\" stroke=\"false\" style=\"width:600px;height:175px; background-position: center center !important;\">\r\n");
      out.write("                    <v:fill type=\"tile\" src=\"assets/Responsive/Image_600x230.png\" color=\"#222222\" />\r\n");
      out.write("                    <v:textbox inset=\"0,0,0,0\">\r\n");
      out.write("                    <![endif]-->\r\n");
      out.write("                \r\n");
      out.write("                <div>\r\n");
      out.write("                    <table align=\"center\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\">\r\n");
      out.write("                    <tr> </tr>\r\n");
      out.write("                  </table>\r\n");
      out.write("                  </div>\r\n");
      out.write("                \r\n");
      out.write("                <!--[if gte mso 9]>\r\n");
      out.write("                    </v:textbox>\r\n");
      out.write("                    </v:rect>\r\n");
      out.write("                    <![endif]--></td>\r\n");
      out.write("              </tr>\r\n");
      out.write("            <!-- Background Image with Text : END --> \r\n");
      out.write("            \r\n");
      out.write("            <!-- Two Even Columns : BEGIN -->\r\n");
      out.write("            <tr>\r\n");
      out.write("                <td align=\"center\" valign=\"top\" style=\"padding: 10px;\"><table cellspacing=\"0\" cellpadding=\"0\" border=\"0\" width=\"100%\">\r\n");
      out.write("                    <tr>\r\n");
      out.write("                    <td class=\"stack-column-center\"><table cellspacing=\"0\" cellpadding=\"0\" border=\"0\">\r\n");
      out.write("                        <tr> </tr>\r\n");
      out.write("                        <tr> </tr>\r\n");
      out.write("                      </table></td>\r\n");
      out.write("</tr>\r\n");
      out.write("                  </table></td>\r\n");
      out.write("              </tr>\r\n");
      out.write("            <!-- Two Even Columns : END --> \r\n");
      out.write("            \r\n");
      out.write("            <!-- Three Even Columns : BEGIN -->\r\n");
      out.write("            <tr> </tr>\r\n");
      out.write("            <!-- Three Even Columns : END --> \r\n");
      out.write("            \r\n");
      out.write("            <!-- Thumbnail Left, Text Right : BEGIN -->\r\n");
      out.write("            <tr> </tr>\r\n");
      out.write("            <!-- Thumbnail Left, Text Right : END --> \r\n");
      out.write("            \r\n");
      out.write("            <!-- Thumbnail Right, Text Left : BEGIN -->\r\n");
      out.write("            <tr>\r\n");
      out.write("                <td dir=\"rtl\" align=\"center\" valign=\"top\" width=\"100%\" style=\"padding: 10px;\"><table align=\"center\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\">\r\n");
      out.write("                    <tr>\r\n");
      out.write("<td width=\"66.66%\" class=\"stack-column-center\"><table align=\"center\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\">\r\n");
      out.write("                        <tr> </tr>\r\n");
      out.write("                      </table></td>\r\n");
      out.write("                  </tr>\r\n");
      out.write("                  </table></td>\r\n");
      out.write("              </tr>\r\n");
      out.write("            <!-- Thumbnail Right, Text Left : END -->\r\n");
      out.write("            \r\n");
      out.write("          </table>\r\n");
      out.write("            <!-- Email Body : END --> \r\n");
      out.write("            \r\n");
      out.write("            <!-- Email Footer : BEGIN -->\r\n");
      out.write("            <table align=\"center\" width=\"600\" class=\"email-container\">\r\n");
      out.write("            <tr>\r\n");
      out.write("                <td style=\"padding: 40px 10px;width: 100%;font-size: 12px; font-family: sans-serif; mso-height-rule: exactly; line-height:18px; text-align: center; color: #888888;\"><webversion style=\"color:#cccccc; text-decoration:underline; font-weight: bold;\"></webversion>\r\n");
      out.write("                <br>\r\n");
      out.write("                <br>\r\n");
      out.write("                <br>\r\n");
      out.write("<br>\r\n");
      out.write("                <br></td>\r\n");
      out.write("              </tr>\r\n");
      out.write("          </table>\r\n");
      out.write("            <!-- Email Footer : END -->\r\n");
      out.write("            \r\n");
      out.write("          </center></td>\r\n");
      out.write("      </tr>\r\n");
      out.write("    </table>\r\n");
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

  private boolean _jspx_meth_s_form_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:form
    org.apache.struts2.views.jsp.ui.FormTag _jspx_th_s_form_0 = (org.apache.struts2.views.jsp.ui.FormTag) _jspx_tagPool_s_form_method_enctype_action_accept.get(org.apache.struts2.views.jsp.ui.FormTag.class);
    _jspx_th_s_form_0.setPageContext(_jspx_page_context);
    _jspx_th_s_form_0.setParent(null);
    _jspx_th_s_form_0.setAction("UploadFile");
    _jspx_th_s_form_0.setMethod("post");
    _jspx_th_s_form_0.setEnctype("multipart/form-data");
    _jspx_th_s_form_0.setDynamicAttribute(null, "accept", new String("image*/"));
    int _jspx_eval_s_form_0 = _jspx_th_s_form_0.doStartTag();
    if (_jspx_eval_s_form_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_form_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_form_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_form_0.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("                  <input type=\"text\" placeholder=\"Enter product name\" name=\"productname\" required>\r\n");
        out.write("                  <input type=\"text\" placeholder=\"Enter price\" name=\"productprice\" required>\r\n");
        out.write("                  <select class=\"selectbox\" name=\"category\"> \r\n");
        out.write("                  \t<option> Footwear </option>\r\n");
        out.write("                  \t<option> Clothing </option>\r\n");
        out.write("                  </select>\r\n");
        out.write("                  <p> </p>\r\n");
        out.write("                  \r\n");
        out.write("                \r\n");
        out.write("                <table cellspacing=\"0\" cellpadding=\"0\" border=\"0\" align=\"center\" style=\"margin: auto\">\r\n");
        out.write("                    <tr> </tr>\r\n");
        out.write("                  \t");
        if (_jspx_meth_s_file_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_form_0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                  \t<input type=\"submit\">\r\n");
        out.write("                  ");
        int evalDoAfterBody = _jspx_th_s_form_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_form_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_s_form_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_form_method_enctype_action_accept.reuse(_jspx_th_s_form_0);
      return true;
    }
    _jspx_tagPool_s_form_method_enctype_action_accept.reuse(_jspx_th_s_form_0);
    return false;
  }

  private boolean _jspx_meth_s_file_0(javax.servlet.jsp.tagext.JspTag _jspx_th_s_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:file
    org.apache.struts2.views.jsp.ui.FileTag _jspx_th_s_file_0 = (org.apache.struts2.views.jsp.ui.FileTag) _jspx_tagPool_s_file_name_label_nobody.get(org.apache.struts2.views.jsp.ui.FileTag.class);
    _jspx_th_s_file_0.setPageContext(_jspx_page_context);
    _jspx_th_s_file_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_form_0);
    _jspx_th_s_file_0.setLabel("File");
    _jspx_th_s_file_0.setName("file");
    int _jspx_eval_s_file_0 = _jspx_th_s_file_0.doStartTag();
    if (_jspx_th_s_file_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_file_name_label_nobody.reuse(_jspx_th_s_file_0);
      return true;
    }
    _jspx_tagPool_s_file_name_label_nobody.reuse(_jspx_th_s_file_0);
    return false;
  }
}
