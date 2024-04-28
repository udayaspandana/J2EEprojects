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
  int num=Integer.parseInt(request.getParameter("number"));
  if(num>0)
	  out.print(num);
  else
	  response.sendRedirect("third.jsp"); 
		  
 %>

</body>
</html>