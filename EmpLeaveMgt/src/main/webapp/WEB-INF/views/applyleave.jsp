<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="/index/applyleave/insertleavedetails/" method="post">
<h1>APPLY LEAVE PAGE</h1>
 	Employee no : <input type="text" name="empno" id="empno"><br>
 	Start date : <input type="date" name="startdate" id="startdate"><br>
 	end date : <input type="date" name="enddate" id="enddate"><br>
 	
 	Leave type : <for label="leavetype"></label>
 	<select>
 	<option>Earned leave</option>
 	 <option>Loss of  Pay</option>
 	</select>
 	<br>
 	Leave reason : <for label="leavereason"></label>
 	<select>
 	<option>Personal</option>
 	 <option>Sick</option>
 	 <option>Ritual</option>
 	  <option>Out of station</option>
 	 
 	 
 	</select>
 	<button type="submit">submit</button>
 	
</form>
</body>
</html>