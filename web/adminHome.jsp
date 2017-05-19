<%-- 
    Document   : adminHome
    Created on : May 19, 2017, 11:24:18 PM
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
        
        <s:form action="adminAdd">
            <s:submit value="Add Users"/>
        </s:form>
        
        <s:form action="adminView">
            <s:submit value="View Users"/>
        </s:form>
        
        <s:form action="tvAdd">
            <s:submit value="Add Shows"/>
        </s:form>
        
        <s:form action="showView">
            <s:submit value="View Shows"/>
        </s:form>
        
        <s:form action="Logout">
            <s:submit value="Logout"/>
        </s:form>
    </body>
</html>
