<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="addTeacher">
	Enter id: <input type="text" name="id"><br>
	Enter name: <input type="text" name="name"><br>
	Enter technology: <input type="text" name="tech"><br>
	<input type="submit" value="AddTeacher"><br><br>
</form>
<form action="getTeacher">
	Enter id: <input type="text" name="id"><br>
	<input type="submit" value="Get Teacher"><br><br>
</form>
<form action="updateTeacher">
	Enter id: <input type="text" name="id"><br>
	Enter name: <input type="text" name="name"><br>
	Enter technology: <input type="text" name="tech"><br>
	<input type="submit" value="Update"><br><br>
</form>
<form action="deleteTeacher">
	Enter id: <input type="text" name="id"><br>
	<input type="submit" value="Delete"><br><br>
</form>
<!-- 
<form action="getAll">
	<input type="submit" value="Get All">
</form>
 -->
</body>
</html>