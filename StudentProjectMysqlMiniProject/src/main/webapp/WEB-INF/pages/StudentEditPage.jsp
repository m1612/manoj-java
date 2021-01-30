<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib prefix="spr" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h3> STUDENT EDIT PAGE </h3>

<spr:form action="#" method="get" modelAttribute="studentedit">
ID     <spr:input path="stdid" readonly="true"/>
NAME   <spr:input path="sName"/>
EMAIL  <spr:input path="sEmail"/>
NUMBER <spr:input path="snumber"/>
<%-- GENDER ::<spr:input type="radio" name="sGender" value="male"> Male</spr:option> --%>
<%--   <spr:input type="radio" name="sGender" value="female"> Female</spr:option>  --%>
<%--   <spr:input type="radio" name="sGender" value="other"> Other </spr:option> --%>
  
<%--  COURSE :: <spr:select name="sCourse" > --%>
<%--  <spr:option value="">--select-- </spr:option> --%>
<%--  <spr:option value="JAVA">core java </spr:option> --%>
<%--  <spr:option value="jdbc,servlet,jsp">ADV VAJA </spr:option> --%>
<%--  <spr:option value=" SPRING,SPRING BOOT">SPRING </spr:option> --%>
<%--  <spr:option value=" microservice,Spring boot">MICROSERVICE</spr:option> --%>
<%--  <spr:option value="html css javascript">HTML </spr:option> --%>
<%--  <spr:option value="git,maven,svn..">TOOLS</spr:option> --%>
<%--  <spr:option value=" oracle,mysql.subsql,mongodb.. ">DATABACE</</spr:option> --%>
<%--  </spr:select> --%>
<input type="submit" value="update">



</spr:form>
</body>
</html>