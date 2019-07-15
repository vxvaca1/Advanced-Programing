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
        <% double radio,result;
            radio = Double.parseDouble(request.getParameter("radio"));
            result = radio * Math.PI;
        %>
        <%="El perimeter del circle: "+ result %>
        
        
    </body>
</html>
