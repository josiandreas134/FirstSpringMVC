<%@page contentType = "text/html;charset = UTF-8" language = "java" %>
<%@page isELIgnored = "false" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<html>
   <head>
      <title>Spring MVC Form Handling</title>
   </head>

   <body>
      <h2>Submitted Student Information</h2>
      <table>
         <tr>
            <td>Name: </td>
            <td>${name}</td>
         </tr>
		<tr>
			<td>Age:</td>
			<td>${age}</td>
		</tr>
		<tr>
			<td>ID:</td>
			<td>${id}</td>
		</tr>
		<tr>
			<td>Hobby:</td>
			<td>${studentHobby}</td>
		</tr>
		<tr>
			<td>Student Mobile:</td>
			<td>${studentMobile}</td>
		</tr>

		<tr>
			<td>Student DOB:</td>
			<td>${studentDOB}</td>
		</tr>
		<tr>
			<td>Student Skills:</td>
			<td>${studentSkills}</td>
		</tr>
	</table>  
   </body>
   
</html>