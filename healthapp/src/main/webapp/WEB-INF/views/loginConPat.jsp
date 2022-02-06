<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%  
      String msg=(String) request.getAttribute("msg");
    
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h3><%=msg %></h3><br>
<form action="./book">
Book Appointment:<input type="submit" name="book"><br>
</form>
<form action="">
Update Profile:<input type="submit" name="update"><br>
</form>

</body>
</html>