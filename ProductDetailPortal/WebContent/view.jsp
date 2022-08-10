<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 <table class="table" border=2>
  <thead>
    <tr>
    <th scope="col">Product ID</th>
      <th scope="col">Product Name</th>
      <th scope="col">Price</th>
      <th scope="col">Product Details</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      
      <td> <%=session.getAttribute("id")%></td>
      <td> <%=session.getAttribute("sname")%></td>
      <td> <%=session.getAttribute("price")%></td>
      <td> <%=session.getAttribute("detail")%></td>
      
    </tr>
  </tbody>
</table>
</body>
</html>