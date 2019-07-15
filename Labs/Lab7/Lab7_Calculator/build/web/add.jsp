<%-- 
    Document   : add
    Created on : 22-may-2019, 12:27:47
    Author     : Xavier
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Adition</h1>
        <%="<h1> The sum is: "+(Integer.parseInt(request.getParameter("t1"))+Integer.parseInt(request.getParameter("t2")))+"</h1>"%>
        <%--
        <?php 
            $num1=$_GET('num1');
            $num2=$_GET('num2');
            $sum=$num1 + $num2;
            
            echo $num1 . "+" . $num2 " = " . $sum; 
            
        ?> --%>
    </body>
</html>
