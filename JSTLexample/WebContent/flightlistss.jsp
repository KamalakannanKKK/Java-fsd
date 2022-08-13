<%@ page import = "java.io.*,java.util.*,java.sql.*"%>
<%@ page import = "javax.servlet.http.*,javax.servlet.*" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/sql" prefix = "sql"%>
<%
		String f = request.getParameter("from");
		String t = request.getParameter("to");
		String d = request.getParameter("departure");
		
		
	%>
<html>
   <head>
      <title>JSTL sql:query Tag</title>
   </head>

   <body>
      <sql:setDataSource var = "snapshot" driver = "com.mysql.jdbc.Driver"
         url = "jdbc:mysql://localhost/flightaway"
         user = "root"  password = "pass123"/>

         <sql:query dataSource = "${snapshot}" var = "result">
            SELECT * from flights where fromf='"+f+"' and tof='"+t+"' and datef='"+d+"'";
         </sql:query>
 
      <table border = "1" width = "100%">
         <tr>
            <th>ID</th>
            <th>Flight Name</th>
            <th>Departure Date</th>
            <th>Time</th>
            <th>price(1 Person)</th>
         </tr>
         
         <c:forEach var = "row" items = "${result.rows}">
            <tr>
               <td> <c:out value = "${row.id}"/></td>
               <td> <c:out value = "${row.name}"/></td>
               <td> <c:out value = "${row.datef}"/></td>
               <td> <c:out value = "${row.timef}"/></td>
                <td> <c:out value = "${row.price}"/></td>
            </tr>
         </c:forEach>
      </table>

   </body>
</html>