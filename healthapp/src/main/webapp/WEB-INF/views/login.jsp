<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Login for the Doctors</h1>
<form action="./loginForDoc" method="post">
Enter the id<input type="text" name="id"><br>
Enter the password<input type="text" name="password"><br>
<input type="submit" name="submit">

</form>
<h1>Login for the Patients</h1>
<form action="./loginForPat">
Enter the AadharNumber<input type="text" name="aadharNumber"><br>
Enter the password<input type="text" name="password"><br>
<input type="submit" name="submit">

</form>

</body>
</html>