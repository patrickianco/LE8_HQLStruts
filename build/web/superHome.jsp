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
        
        <s:form action="Logout">
            <s:submit value="Logout"/>
        </s:form>
        
        <table>
            <tr>
                <th>ID</th>
                <th>Username</th>
                <th>Password</th>
                <th>Role</th>
            </tr>
            <s:iterator value="user">
                <tr>
                    <td><s:property value="user_id"/></td>
                    <td><s:property value="username"/></td>
                    <td><s:property value="password"/></td>
                    <td><s:property value="role"/></td>
                </tr>
            </s:iterator>
        </table>
    </body>
</html>
