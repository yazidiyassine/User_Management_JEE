<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <jsp:useBean id="u" class="useMngt.user" scope="request" />
    <%@page import="useMngt.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit User</title>
</head>
<body>
	<form action="update" method="post">
	<table>
		
		<tr>
		  <td>Name</td>
		  <td><input type="hidden" name="id" value="<%= u.getId()%>">
		  <input type="text" name="userName" value="<%= u.getName()%>" required>
		  </td>
		</tr>
		<tr>
		  <td>Email</td>
		  <td><input type="email" name="email" value="<%= u.getEmail() %>" required>
		  </td>
		</tr><tr>
		  <td>Mobile</td>
		  <td><input type="tel" name="mobile" value="<%= u.getMobile() %>" required>
		  </td>
		</tr><tr>
		  <td>DOB</td>
		  <td><input type="date" name="dob" value="<%= u.getDob() %>" required>
		  </td>
		</tr><tr>
		  <td>City</td>
		  <td><select name="city">
		  
		  <option value="<%= u.getCity()%>"><%= u.getCity()%></option>
		  <option value="Beni Mellal">Beni Mellal</option>
		  <option value="Casa">Casa</option>
		  <option value="Rabat">Rabat</option>
		  <option value="Tangier">Tangier</option>
		  </select>
		  </td>
		</tr><tr>
		  <td>Gender</td>
		  
		  <td><%
		  if(u.getGender().equals("male")){%>
			  <input type="radio" name="gender" value="male" checked required>Male &nbsp;
			  <input type="radio" name="gender" value="female" required>Female
		  <%}
		  else{%>
		  <input type="radio" name="gender" value="male" required>Male &nbsp;
		  <input type="radio" name="gender" value="female" checked required>Female
		  	  <%}%>
		  </td>
		</tr><tr>
		  <td><input type="submit" value="Update"></td>
		  <td><input type="reset" value="Cancel"></td>
		</tr>
	</table>
	</form>
</body>
</html>