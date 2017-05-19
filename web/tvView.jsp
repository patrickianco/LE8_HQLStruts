<%-- 
    Document   : tvView
    Created on : May 19, 2017, 11:40:55 PM
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
                            <td>Tile</td>
                            <td>Year</td>
                            <td>Season</td>

                        </tr>

                        <s:iterator value="listShows" var="sh">	
                            <tr>
                                <td><s:property value="show_id"/></td>
                                <td><s:property value="title"/></td>
                                <td><s:property value="show_year"/></td>
                                <td><s:property value="show_season"/></td>
                            </tr>
                        </s:iterator>	

                    </table>
        <s:form action="adminGoBack">
            <s:submit value="Go Back"/>
        </s:form>
    </body>
</html>
