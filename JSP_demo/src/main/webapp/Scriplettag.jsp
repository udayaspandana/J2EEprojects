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
    
   int a=10;
   int b=20;    ///declaration 
   int sum=a+b;
   
   if(sum>20)
   {
	   out.print(sum);    //exprestion 
   }
   else{
	   
	   out.print("else block executed");
   }
   
   %>    //this tag is Scriplettag

</body>
</html>