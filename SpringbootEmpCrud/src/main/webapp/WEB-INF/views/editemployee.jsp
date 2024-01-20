<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
   <form action="/employee/updateemployee" method="post">
       Employee id : <input type="text" name="id" id="id" value="${e.id}" readonly><br>
       Employee name : <input type="text" name="name" id="name" value="${e.name}"><br>
        Employee email: <input type="text" name="email" id="email" value="${e.email}"><br>
         Employee salary: <input type="text" name="salary" id="salary" value="${e.salary}"><br>
         <button type="submit" name="btn" id="btn">update Employee</button>
   </form>
</body>
</html>