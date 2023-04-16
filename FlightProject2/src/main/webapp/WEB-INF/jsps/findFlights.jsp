<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>FlightSearch</title>
</head>
<body>
	<h2>Find Flights</h2>
	<form action="findFlights" method="post">
		from:<input type="text" name="from" /> to:<input type="text" name="to" />
		<input type="Submit" Value="Search" />
	</form>
</body>
</html>