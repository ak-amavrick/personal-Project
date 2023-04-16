<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>	
    <%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Lead|Result</title>
</head>
<body>
 <a href= "viewCreateLead">Create new lead</a>
<h2>Search result...</h2>
<table>
<tr>
<th>First Name </th>
<th>Last Name</th>
<th>LeadSource</th>
<th>email</th>
<th>mobile</th>
</tr>
<c:forEach items= "${leads }" var= "lead">
<tr>
<td><a href="leadInfo?id=${lead.id}">${lead.firstName}</a></td>
<td>${lead.firstName}</td>
<td>${lead.lastName}</td>
<td>${lead.leadSource}</td>
<td>${lead.email}</td>
<td>${lead.mobile}</td>
</tr>
</c:forEach>
</table>
</body>
</html>