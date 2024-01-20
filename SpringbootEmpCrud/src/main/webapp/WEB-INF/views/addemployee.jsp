<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
   <form action="insertemployee" method="post">
       Employee id : <input type="text" name="id" id="id"><br>
       Employee name : <input type="text" name="name" id="name"><br>
       Employee email: <input type="text" name="email" id="email"><br>
       Employee salary : <input type="text" name="salary" id="salary"><br>
       <button type="submit" name="btn" id="btn">Add new Employee</button>
   </form>
</body>
</html>