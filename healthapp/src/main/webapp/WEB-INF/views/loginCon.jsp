<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%
       String msg=(String) request.getAttribute("msg");
    
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body>
<%=msg %><br>

<form action="/appointments">
Check Appointments<input type="submit" name="appointments"><br>
</form>
<form action="./update">
Update Profile<input type="submit" name="update"><br>
</form>
<form action="./logout">
Logout<input type="submit" name="logout">
</form>


</body>
</html>