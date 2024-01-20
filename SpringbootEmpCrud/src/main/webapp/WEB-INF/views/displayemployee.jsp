<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1>Employee Details</h1>
<table border="2">
  <tr >
     <th>Employee id</th>
     <th>Employee name</th>
     <th> email</th>
     <th>salary</th>
     <th>action</th>
  </tr>
  <c:forEach var="e" items="${elist}">
     <tr>
       <td>${e.id}</td>
       <td>${e.name}</td>
       <td>${e.email}</td>
       <td>${e.salary}</td>
       <td><a href="delete/${e.id}">delete</a>
       /
       <a href="edit/${e.id}">edit</a></td>
     </tr>
  </c:forEach>
</table>
<a href="addemployee">Add new Employee</a>

</body>
</html>