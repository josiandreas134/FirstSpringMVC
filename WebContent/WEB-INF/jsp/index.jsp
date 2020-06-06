<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
<title>Spring Page Redirection</title>
</head>

<body>
	<h1>${message}</h1>
	<h1>What would you like to do?</h1>

	<h2>Spring Page Redirection</h2>
	<p>Click below button to redirect the result to new page</p>

	<form:form method="GET" action="/FirstSpringMVCProject/redirect">
		<table>
			<tr>
				<td><input type="submit" value="Redirect Page" /></td>
			</tr>
		</table>
	</form:form>

	<h2>Spring Landing Page</h2>
	<p>Click below button to get a simple HTML page</p>

	<form:form method="GET" action="/FirstSpringMVCProject/staticPage">
		<table>
			<tr>
				<td><input type="submit" value="Get HTML Page" /></td>
			</tr>
		</table>
	</form:form>

	<form:form method="GET" action="/FirstSpringMVCProject/staticPage2">
		<table>
			<tr>
				<td><input type="submit" value="Get HTML Page2" /></td>
			</tr>
		</table>
	</form:form>

	<h2>Student Controller</h2>
	<p>Click below button to get student page</p>
	<form:form method="GET" action="/FirstSpringMVCProject/student">
		<table>
			<tr>
				<td><input type="submit" value="Go to Student" /></td>
			</tr>
		</table>
	</form:form>

	<a href="empform">Add Employee</a>
	<a href="viewemp/1">View Employees</a>

	<a href="uploadform">Upload Image</a>

</body>

</html>