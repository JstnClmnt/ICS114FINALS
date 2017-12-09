<%-- 
    Document   : userorders
    Created on : Dec 9, 2017, 11:49:30 AM
    Author     : Justine Clemente
--%>

<%@ taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page import="bean.Products"%>
<%@page import="bean.Orders"%>
<%@page import="bean.Users"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!doctype html>
<html>
    <head>
    <meta charset="utf-8">
    <!-- utf-8 works for most cases -->
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <!-- Forcing initial-scale shouldn't be necessary -->
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <!-- Use the latest (edge) version of IE rendering engine -->
    <title>LUXUR</title>
    <!-- The title tag shows in email notifications, like Android 4.4. -->
    <!-- Please use an inliner tool to convert all CSS to inline as inpage or external CSS is removed by email clients -->
    <!-- important in CSS is used to prevent the styles of currently inline CSS from overriding the ones mentioned in media queries when corresponding screen sizes are encountered -->

    <!-- CSS Reset -->
    <style type="text/css">
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
   <table>
                    <tr>
                        <th class="cart1"><center>First Name</center></th> 
                        <th class="cart1"><center>Last Name</center></th>
                        <th class="cart1"><center>Address</center></th>
                        <th class="cart1"><center>Mobile Number</center></th>
                        <th class="cart1"><center>Email Address</center></th>
                        <th class="cart1"><center>Comments</center></th>
                        <th class="cart1"><center>Price</center></th>
                        <th class="cart1"><center>Reference Number</center></th>
                        <th class="cart1"><center>Orders</center></th>
                    </tr>
                    <tr class="cart2">
                    <c:forEach var="customer" items="${all}">
                        <td>
                            <center>
                                <p>${customer.firstname}</p>
                            </center>
                        </td>   
                        <td>
                            <center>
                                <p>${customer.lastname}</p>
                            </center>
                        </td>
                        <td>
                            <center>
                                <p>${customer.address}</p>
                            </center>
                        </td>
                        <td>
                            <center>
                                <p>${customer.mobilenumber}</p>
                            </center>
                        </td>
                                                <td>
                            <center>
                                <p>${customer.emailadd}</p>
                            </center>
                        </td>
                                                <td>
                            <center>
                                <p>${customer.comments}</p>
                            </center>
                        </td>
                            <center>
                                <p>${customer.price}</p>
                            </center>
                        </td>
                            <center>
                                <p>${customer.referencenumber}</p>
                            </center>
                        </td>
                        <td>
                            <table>
                                    <tr>
                                        <th class="cart1"><center>Product</center></th> 
                                        <th class="cart1"><center>Product Name</center></th>
                                        <th class="cart1"><center>Product Price</center></th>
                                        <th class="cart1"><center>Product Quantity</center></th>
                                        <th class="cart1"><center>Total Price</center></th>
                                    </tr>
                                    <c:forEach items="${customer.orders}" var="order" >
                                    <tr class="cart2">
                                        <td>
                                            <center>
                                            <img src="images/${order.imagepic}" class="img-responsive img-rounded" height="100px" width="100px">
                                            </center>
                                        </td>
                                        <td>
                                            <center>
                                            ${order.productname}
                                            </center>
                                        </td>
                                        <td>
                                            <center>
                                            ${order.price}
                                            </center>
                                        </td>
                                        <td>
                                            <center>
                                            ${order.quantity}
                                            </center>
                                        </td>
                                        <td>
                                            <center>

                                            ${order.totalprice}

                                            </center>
                                        </td>
                                    </tr>
                                    </c:forEach>
                                </table>
                        </td>
                        <td>
                            <form action="Deliver" method="POST">
                            <center>
                                    <button type="submit" class="img-rounded stuff2" name="deliver" value="${customer.referencenumber}">DELIVER</button>
                            </center>
                            </form>
                        </td>
                    </tr>
                </c:forEach>
                </table>
</body>
</html>