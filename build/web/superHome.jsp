<%-- 
    Document   : superHome
    Created on : May 18, 2017, 2:08:37 AM
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
        
        <s:form action="superAdd">
            <s:submit value="Add Users"/>
        </s:form>
        
        <s:form action="superView">
            <s:submit value="View Users"/>
        </s:form>
        
        <s:form action="Logout">
            <s:submit value="Logout"/>
        </s:form>
    </body>
</html>
