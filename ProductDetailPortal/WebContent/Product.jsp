<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Product</title>
</head>
<body>
<form action="ProductRegistration.jsp">
Enter Product ID<Input type="text" name="id" required>
Enter Product Name<Input type="text" name="sname" required>
Enter Product Price<Input type="text" name="price" required>
Enter Product Details<input type="text" name="detail">
<input type="submit" value="submit">

</form>
<%
  if (request.getParameter("error") != null)
          out.println("<b>Your session has expired or is invalid input.</b><br>");
%>
</body>
</html>