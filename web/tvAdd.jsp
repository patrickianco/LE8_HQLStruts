<%-- 
    Document   : tvAdd
    Created on : May 19, 2017, 11:40:49 PM
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
        <%@ taglib prefix="s" uri="/struts-tags" %>
        <s:form method="POST" action="adminAddShow">
            <s:textfield name="title" id="title" label="Title"/>
            <s:textfield name="year" id="year" label="Year"/>
            <s:textfield name="season" id="season" label="Season"/>
            <s:submit value="Register"/>
        </s:form>
        <s:form action="adminGoBack">
            <s:submit value="Go Back"/>
        </s:form>
    </body>
</html>
