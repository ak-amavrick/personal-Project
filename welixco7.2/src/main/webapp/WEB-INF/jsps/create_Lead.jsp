<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Lead|Create</title>
</head>
<body>
 <h2>Lead|create</h2>
 <div>
 ${emailError}
 </div>
 <form action = "savelead" method= "post" >
 <pre>
 First Name<input type="text" name="firstName"/>
 Last Name<input type="text" name="lastName"/>
  leadSource:<select name="LeadSource">
			  <option value="radio">Radio Channel</option>
			  <option value="newspaper">News paper</option>
			  <option value="tv">TV</option>
			  <option value="online">online</option>
			</select>
   email<input type="email" name="email"/>
    mobile<input type="text" name="Mobile"/>
    <input type= "submit" value= "save"/>
 
 </pre>
 
 </form>
</body>
</html>