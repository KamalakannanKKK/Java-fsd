<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		String name = request.getParameter("sname");
		String detail = request.getParameter("detail");
		int id = Integer. parseInt(request. getParameter("id"));
		int price = Integer. parseInt(request. getParameter("price"));
		if (name == null || name.equals("") || id == 0 ) {
			response.sendRedirect("Product.jsp?error=1");
		} else {

			session.setAttribute("sname", name);
			session.setAttribute("id", id);
			session.setAttribute("detail", detail);
			session.setAttribute("price",price);
			response.sendRedirect("view.jsp");
		}
	%>


	<a href="view.jsp">View Product Details</a>
</body>
</html>