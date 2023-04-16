<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@include file = "menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Lead|Create</title>
</head>
<body>
<h2>Billing|Create</h2>
	<form action="saveBill"method="post">
			<pre>
			First Name<input type="text" name="firstName" value= "${contact.firstName }"/>
			Last Name<input type="text" name="lastName" value= "${contact.lastName }"/>
			Lead Source:<select name="leadSource" >
					  <option value="radio">Radio Channel</option>
					  <option value="online">Online</option>
					</select>
			Email<input type="email" name="email" value= "${contact.email }"/>
			Mobile<input type="number" name="mobile" value= "${contact.mobile }"/>
			Vehicle Name<input type="text" name= "vehicle"/>
			Amount <input type= "text" name = "amount"/>
			Spare Part<input type= "text" name = "sparepart"/>
			<input type= "submit" value="generate bill"/>
			</pre>
	</form>
</body>
</html>