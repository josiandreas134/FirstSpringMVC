<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<h1>Employees List</h1>
<table border="2" width="70%" cellpadding="2">
	<tr>
		<th>Id</th>
		<th>Name</th>
		<th>Salary</th>
		<th>Designation</th>
		<th>Edit</th>
		<th>Delete</th>
	</tr>
	<c:forEach var="emp" items="${msg}">
		<tr>
			<td>${emp.id}</td>
			<td>${emp.name}</td>
			<td>${emp.salary}</td>
			<td>${emp.designation}</td>
			<td><a href="/FirstSpringMVCProject/editemp/${emp.id}">Edit</a></td>
			<td><a href="/FirstSpringMVCProject/deleteemp/${emp.id}">Delete</a></td>
		</tr>
	</c:forEach>
</table>
<br />
<a href="/FirstSpringMVCProject/empform">Add New Employee</a>

<a href="/FirstSpringMVCProject/viewemp/1">1</a>
<a href="/FirstSpringMVCProject/viewemp/2">2</a>
<a href="/FirstSpringMVCProject/viewemp/3">3</a>
