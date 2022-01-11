<%-- 
    Document   : error
    Created on : Jan 11, 2022, 4:48:47 PM
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
        <h1>Sorry <%= request.getParameter("x") %>, wrong password!</h1>
    </body>
</html>
