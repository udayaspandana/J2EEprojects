<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>



   <%!  
    int b=20;
    int cube(int a)
    {                      //declaration tag
     return a*a*a;
    }
     %>
     
     
     <%= "cube of given number:"+cube(b) %>   //expression tag

</body>
</html>