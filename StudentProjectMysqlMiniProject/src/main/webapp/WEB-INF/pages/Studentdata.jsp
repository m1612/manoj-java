<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1 style="color: green;">WELCOM STUDENT PAGE </h1>

<form action="studentvalue" method="post" >
<pre>
 NAME ::<input type="text" name="sName">
 EMAIL ::<input type="text" name="sEmail">
  MOBILE ::<input type="text" name="snumber">
  GENDER ::<input type="radio" name="sGender" value="male"> Male<br>
  <input type="radio" name="sgender" value="female"> Female<br>
  <input type="radio" name="sgender" value="other"> Other
 COURSE :: <select name="sCourse" >
 <option value="">--select-- </option>
 <option value="JAVA">core java </option>
 <option value="jdbc,servlet,jsp">ADV VAJA </option>
 <option value=" SPRING,SPRING BOOT">SPRING </option>
 <option value=" microservice,Spring boot">MICROSERVICE</option>
 <option value="html css javascript">HTML </option>
 <option value="git,maven,svn..">TOOLS</option>
 <option value=" oracle,mysql.subsql,mongodb.. ">DATABACE</option>
 </select>
 <input type="submit" value="submit kara">
</pre>
</form>
<h2 style="color:orange;">${msg}</h2>
</body>
</html>