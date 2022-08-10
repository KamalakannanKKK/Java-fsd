<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

      <table class="table">
  <thead>
    <tr>
      <th scope="col">Name</th>
      <th scope="col">time</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <br>
      <td> <%=session.getAttribute("name")%></td>
      <td> <% java.util.Date de = new java.util.Date();
                out.println(de.toString()); %></td>

    </tr>
  </tbody>
</table>

</body>
</html>