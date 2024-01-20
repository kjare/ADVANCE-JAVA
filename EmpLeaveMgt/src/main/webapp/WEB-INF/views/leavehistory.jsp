<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

h1>Employee Details</h1>
<table border="2">
  <tr >
<!--      <th>Leave Id</th>
 -->     <th>Employee No</th>
     <th>start date</th>
     <th>end date</th>
     <th>leave type</th>
     <th>leave reason</th>
  </tr>
  <c:forEach var="e" items="${elist}">
     <tr>
       <td>${e.id}</td>
       <td>${e.name}</td>
       <td>${e.email}</td>
       <td>${e.salary}</td>
       
<%--        <!--  --><a href="edit/${e.id}">edit</a></td>
 --%>     </tr>
  </c:forEach>
</table>
<a href="index">back</a>


</body>
</html>