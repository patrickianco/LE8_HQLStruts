<%-- 
    Document   : index
    Created on : May 18, 2017, 1:56:41 AM
    Author     : Patrick Ian Co
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%@ taglib uri = "/struts-tags" prefix = "s"%>
        
        <s:form name="Login" method="POST" action="Login">
            <s:textfield name="username" label="Username"/>
            <s:textfield name="password" label="Password"/>
            <s:submit value="Login"/>
        </s:form>
    </body>
</html>
