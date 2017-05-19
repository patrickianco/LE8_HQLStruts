<%-- 
    Document   : adminView
    Created on : May 19, 2017, 11:33:37 PM
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
        <table class = "table1" border ="1">
                        
                        <tr>

                            <td>ID</td>
                            <td>Username</td>
                            <td>Password</td>
                            <td>Role</td>

                        </tr>

                        <s:iterator value="listUsers" var="u">	
                            <tr>
                                <td><s:property value="id"/></td>
                                <td><s:property value="username"/></td>
                                <td><s:property value="password"/></td>
                                <td><s:property value="role"/></td>
                            </tr>
                        </s:iterator>	

                    </table>
        <s:form action="adminGoBack">
            <s:submit value="Go Back"/>
        </s:form>
    </body>
</html>
