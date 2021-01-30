<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false" %>
    
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1 style="color: blue;">welcome Student data page</h1>
<c:choose>
		<c:when test="${!empty list }">
<table border="1"> 
   <tr>
     <th>STUDENT ID</th>
     <th>STUDENT NAME</th>
     <th>STUDENT EMAIL</th>
     <th>STUDENT NUMBER</th>
     <th>STUDENT GENDER</th>
     <th>STUDENT COURSE</th>
     <th>STUDENT COURSE FEES</th>
     <th>STUDENT PAGE EDIT / DELETE</th>
     </tr>

     <c:forEach var="ob" items="${list}">
     <tr>
         <td>${ob.stdid}</td>
         <td>${ob.sName}</td>
         <td>${ob.sEmail}</td>
         <td>${ob.snumber}</td>
         <td>${ob.sGender}</td>
         <td>${ob.sCourse}</td>
         <td>${ob.sCourseFees}</td>
         	<td>
				<a href="delete?stdid=${ob.stdid}">DELETE</a> | 
				<a href="edit?stdid=${ob.stdid}">EDIT</a>
			</td>
         </tr>     
     </c:forEach>
</table>
	</c:when>
		<c:otherwise>
			<h1 style="color: red; text-align: center">No Records Found</h1>
		</c:otherwise>
	</c:choose>
${msg}
</body>
</html>