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
		String driver = application.getInitParameter("drivername");
		out.println(driver);
	%>
	<%
		Integer PageCounter = (Integer) application.getAttribute("firstPageCounter");

		if (PageCounter == null) {
			PageCounter = 1;
		} else {
			PageCounter += 1;
		}
		application.setAttribute("PageCounter", PageCounter);
	%>
	<%=application.getAttribute("username")%>
	<%=application.getAttribute("PageCounter")%>
</body>
</html>