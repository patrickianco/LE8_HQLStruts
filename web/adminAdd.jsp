<%-- 
    Document   : adminAdd
    Created on : May 19, 2017, 11:32:37 PM
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
        <s:form method="POST" action="adminAddUser">
            <s:textfield name="username" id="username" label="Username"/>
            <s:textfield name="password" id="password" label="Password"/>
            <s:select label="Choose your Role"
                      headerKey="-1" headerValue="Select Role"
                      list="roles"
                      name="role"
                      value="select"
                      id="selection"/>
            <s:submit value="Register"/>
        </s:form>
        <s:form action="adminGoBack">
            <s:submit value="Go Back"/>
        </s:form>
    </body>
</html>
