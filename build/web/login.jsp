<%-- 
    Document   : login
    Created on : Jan 11, 2022, 5:01:21 PM
    Author     : guan.kiat
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="Login" method="POST">
            <table>
                <tr>
                    <td>Username:</td>
                    <td><input type="text" name="x" size="20"></td>
                </tr>
                <tr>
                    <td>Balance:</td>
                    <td><input type="text" name="y" size="20"></td>
                </tr>
            </table>
            <p><input type="submit" value="Login"></p>
        </form>
    </body>
</html>
