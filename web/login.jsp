<!doctype html>
<html>
    <head>
    <meta charset="utf-8">
    <!-- utf-8 works for most cases -->
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <!-- Forcing initial-scale shouldn't be necessary -->
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <!-- Use the latest (edge) version of IE rendering engine -->
    <title>Luxur</title>
    <!-- The title tag shows in email notifications, like Android 4.4. -->
    <!-- Please use an inliner tool to convert all CSS to inline as inpage or external CSS is removed by email clients -->
    <!-- important in CSS is used to prevent the styles of currently inline CSS from overriding the ones mentioned in media queries when corresponding screen sizes are encountered -->

    <!-- CSS Reset -->
    <style type="text/css">
		
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
		
/* What it does: Remove spaces around the email design added by some email clients. */
      /* Beware: It can remove the padding / margin and add a background color to the compose a reply window. */
html,  body {
	margin: 0 !important;
	padding: 0 !important;
	height: 100% !important;
	width: 100% !important;
}
/* What it does: Stops email clients resizing small text. */
* {
	-ms-text-size-adjust: 100%;
	-webkit-text-size-adjust: 100%;
}
/* What it does: Forces Outlook.com to display emails full width. */
.ExternalClass {
	width: 100%;
}
/* What is does: Centers email on Android 4.4 */
div[style*="margin: 16px 0"] {
	margin: 0 !important;
}
/* What it does: Stops Outlook from adding extra spacing to tables. */
table,  td {
	mso-table-lspace: 0pt !important;
	mso-table-rspace: 0pt !important;
}
/* What it does: Fixes webkit padding issue. Fix for Yahoo mail table alignment bug. Applies table-layout to the first 2 tables then removes for anything nested deeper. */
table {
	border-spacing: 0 !important;
	border-collapse: collapse !important;
	table-layout: fixed !important;
	margin: 0 auto !important;
}
table table table {
	table-layout: auto;
}
/* What it does: Uses a better rendering method when resizing images in IE. */
img {
	-ms-interpolation-mode: bicubic;
}
/* What it does: Overrides styles added when Yahoo's auto-senses a link. */
.yshortcuts a {
	border-bottom: none !important;
}
/* What it does: Another work-around for iOS meddling in triggered links. */
a[x-apple-data-detectors] {
	color: inherit !important;
}
</style>

    <!-- Progressive Enhancements -->
    <style type="text/css">
        
        /* What it does: Hover styles for buttons */
        .button-td,
        .button-a {
            transition: all 100ms ease-in;
        }
        .button-td:hover,
        .button-a:hover {
            background: #555555 !important;
            border-color: #555555 !important;
        }

        /* Media Queries */
        @media screen and (max-width: 600px) {

            .email-container {
                width: 100% !important;
            }

            /* What it does: Forces elements to resize to the full width of their container. Useful for resizing images beyond their max-width. */
            .fluid,
            .fluid-centered {
                max-width: 100% !important;
                height: auto !important;
                margin-left: auto !important;
                margin-right: auto !important;
            }
            /* And center justify these ones. */
            .fluid-centered {
                margin-left: auto !important;
                margin-right: auto !important;
            }

            /* What it does: Forces table cells into full-width rows. */
            .stack-column,
            .stack-column-center {
                display: block !important;
                width: 100% !important;
                max-width: 100% !important;
                direction: ltr !important;
            }
            /* And center justify these ones. */
            .stack-column-center {
                text-align: center !important;
            }
        
            /* What it does: Generic utility class for centering. Useful for images, buttons, and nested tables. */
            .center-on-narrow {
                text-align: center !important;
                display: block !important;
                margin-left: auto !important;
                margin-right: auto !important;
                float: none !important;
            }
            table.center-on-narrow {
                display: inline-block !important;
            }
                
        }

    </style>
    </head>
    <body bgcolor="#e0e0e0" width="100%" style="margin: 0;" yahoo="yahoo">
    <table bgcolor="#e0e0e0" cellpadding="0" cellspacing="0" border="0" height="100%" width="100%" style="border-collapse:collapse;">
      <tr>
        <td><center style="width: 100%;">
            
            <!-- Visually Hidden Preheader Text : BEGIN -->
            <div style="display:none;font-size:1px;line-height:1px;max-height:0px;max-width:0px;opacity:0;overflow:hidden;mso-hide:all;font-family: sans-serif;"> (Optional) This text will appear in the inbox preview, but not the email body. </div>
            <!-- Visually Hidden Preheader Text : END --> 
            
            <!-- Email Header : BEGIN -->
            <table align="center" width="600" class="email-container">
            <tr>
                <td style="padding: 20px 0; text-align: center">&nbsp;</td>
              </tr>
          </table>
            <!-- Email Header : END --> 
            
            <!-- Email Body : BEGIN -->
            <table cellspacing="0" cellpadding="0" border="0" align="center" bgcolor="#ffffff" width="600" class="email-container">
            
            <!-- Hero Image, Flush : BEGIN -->
            <tr>
                <td class="full-width-image"><img src="images/Image_600x300.png" width="600" alt="alt_text" border="0" align="center" style="width: 100%; max-width: 600px; height: auto;"></td>
              </tr>
            <!-- Hero Image, Flush : END --> 
            
            <!-- 1 Column Text : BEGIN -->
            <tr>
                <td style="padding: 40px; text-align: center; font-family: sans-serif; font-size: 15px; mso-height-rule: exactly; line-height: 20px; color: #555555;"> Log-in as administrator <br>
               
                <br>
                
                <!-- Button : Begin -->
                 <input type="text" placeholder="Enter username" name="uname" required>
                <input type="password" placeholder="Enter password" name="pword" required>
                <table cellspacing="0" cellpadding="0" border="0" align="center" style="margin: auto">
                   <br>
                    <tr>
                    
                    
                    <td style="border-radius: 3px; background: #222222; text-align: center;" class="button-td"><a href="http://www.google.com" style="background: #222222; border: 15px solid #222222; padding: 0 10px;color: #ffffff; font-family: sans-serif; font-size: 13px; line-height: 1.1; text-align: center; text-decoration: none; display: block; border-radius: 3px; font-weight: bold;" class="button-a"> 
                      <!--[if mso]>&nbsp;&nbsp;&nbsp;&nbsp;<![endif]-->Log-in<!--[if mso]>&nbsp;&nbsp;&nbsp;&nbsp;<![endif]--> 
                      </a>
                      
                      </td>
                  </tr>
                  </table>
                
                <!-- Button : END --></td>
              </tr>
            <!-- 1 Column Text : BEGIN --> 
            
            <!-- Background Image with Text : BEGIN -->
            <tr>
                <td background="images/Image_600x230.png" bgcolor="#222222" valign="middle" style="text-align: center; background-position: center center !important; background-size: cover !important;"><!--[if gte mso 9]>
                    <v:rect xmlns:v="urn:schemas-microsoft-com:vml" fill="true" stroke="false" style="width:600px;height:175px; background-position: center center !important;">
                    <v:fill type="tile" src="assets/Responsive/Image_600x230.png" color="#222222" />
                    <v:textbox inset="0,0,0,0">
                    <![endif]-->
                
                <div>
                    <table align="center" border="0" cellpadding="0" cellspacing="0" width="100%">
                    <tr> </tr>
                  </table>
                  </div>
                
                <!--[if gte mso 9]>
                    </v:textbox>
                    </v:rect>
                    <![endif]--></td>
              </tr>
            <!-- Background Image with Text : END --> 
            
            <!-- Two Even Columns : BEGIN -->
            <tr>
                <td align="center" valign="top" style="padding: 10px;"><table cellspacing="0" cellpadding="0" border="0" width="100%">
                    <tr>
                    <td class="stack-column-center"><table cellspacing="0" cellpadding="0" border="0">
                        <tr>
                        <td style="padding: 10px; text-align: center">&nbsp;</td>
                      </tr>
                        <tr> </tr>
                      </table></td>
                    <td class="stack-column-center"><table cellspacing="0" cellpadding="0" border="0">
                        <tr>
                        <td style="padding: 10px; text-align: center">&nbsp;</td>
                      </tr>
                        <tr> </tr>
                      </table></td>
                  </tr>
                  </table></td>
              </tr>
            <!-- Two Even Columns : END --> 
            
            <!-- Three Even Columns : BEGIN -->
            <tr>
                <td align="center" valign="top" style="padding: 10px;"><table cellspacing="0" cellpadding="0" border="0" width="100%">
                    <tr>
                    <td width="33.33%" class="stack-column-center"><table cellspacing="0" cellpadding="0" border="0">
                        <tr>
                        <td style="padding: 10px; text-align: center">&nbsp;</td>
                      </tr>
                        <tr> </tr>
                      </table></td>
                    <td width="33.33%" class="stack-column-center"><table cellspacing="0" cellpadding="0" border="0">
                        <tr>
                        <td style="padding: 10px; text-align: center">&nbsp;</td>
                      </tr>
                        <tr> </tr>
                      </table></td>
                    <td width="33.33%" class="stack-column-center"><table cellspacing="0" cellpadding="0" border="0">
                        <tr>
                        <td style="padding: 10px; text-align: center">&nbsp;</td>
                      </tr>
                        <tr> </tr>
                      </table></td>
                  </tr>
                  </table></td>
              </tr>
            <!-- Three Even Columns : END --> 
            
            <!-- Thumbnail Left, Text Right : BEGIN -->
            <tr>
                <td dir="ltr" align="center" valign="top" width="100%" style="padding: 10px;"><table align="center" border="0" cellpadding="0" cellspacing="0" width="100%">
                    <tr>
                    <td width="33.33%" class="stack-column-center"><table align="center" border="0" cellpadding="0" cellspacing="0" width="100%">
                        <tr>
                        <td dir="ltr" valign="top" style="padding: 0 10px;">&nbsp;</td>
                      </tr>
                      </table></td>
                    <td width="66.66%" class="stack-column-center"><table align="center" border="0" cellpadding="0" cellspacing="0" width="100%">
                        <tr> </tr>
                      </table></td>
                  </tr>
                  </table></td>
              </tr>
            <!-- Thumbnail Left, Text Right : END --> 
            
            <!-- Thumbnail Right, Text Left : BEGIN -->
            <tr>
                <td dir="rtl" align="center" valign="top" width="100%" style="padding: 10px;"><table align="center" border="0" cellpadding="0" cellspacing="0" width="100%">
                    <tr>
<td width="66.66%" class="stack-column-center"><table align="center" border="0" cellpadding="0" cellspacing="0" width="100%">
                        <tr> </tr>
                      </table></td>
                  </tr>
                  </table></td>
              </tr>
            <!-- Thumbnail Right, Text Left : END -->
            
          </table>
            <!-- Email Body : END --> 
            
            <!-- Email Footer : BEGIN -->
            <table align="center" width="600" class="email-container">
            <tr>
              <td style="padding: 40px 10px;width: 100%;font-size: 12px; font-family: sans-serif; mso-height-rule: exactly; line-height:18px; text-align: center; color: #888888;"><webversion style="color:#cccccc; text-decoration:underline; font-weight: bold;"></webversion>
                <br>
                <br>
                <br>
<br>
                <br></td>
              </tr>
          </table>
            <!-- Email Footer : END -->
            
          </center></td>
      </tr>
    </table>
</body>
</html>
