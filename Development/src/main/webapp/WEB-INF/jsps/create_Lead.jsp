<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome</title>
</head>
<body style="background-colour: grey;">
	<h2>Validation</h2>

	<div>${emailError}</div>

	<div class="row mt-5"></div>
	<div class="col md-4 offset-md-4"></div>
	<form action="DevLead" method="post">
		<pre>
First Name <input type="text" name="firstName" />
Last Name <input type="text" name="LastName" />
Email <input type="email" name="email" />
mobile <input type="number" name="mobile" />
Gender:<select name="gender">
 <option value="Male">Male</option>
  <option value="Female">Female</option>
    <option value="Transgender">Transgender</option>
</select>
Date<input type="date" name="date" />
Language:<select name="language">
 <option value="English">English</option>
  <option value="Hindi">Hindi</option>
    <option value="Bhojpuri">Bhojpuri</option>
</select>
State:<select name="state">
 <option value="Bihar">Bihar</option>
   <option value="Jharkhand">Jharkhand</option>
  <option value="MadhyaPardesh">MadhyaPardesh</option>
  <option value="Delhi">Delhi</option>
  <option value="rajasthan">Rajasthan</option>
    <option value="Punjab">Punjab</option>
      <option value="Others">Others</option>
    </select>  
 Qualification:<select name="qualification">  
    <option value="matric">matric</option>
   <option value="intermidiate">intermidiate</option>
  <option value="graduate">graduate</option>
      <option value="Others">Others</option>
</select>
<input type="submit" value="save" />

</pre>



	</form>
</body>
</html>