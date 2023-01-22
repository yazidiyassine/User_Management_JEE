<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<jsp:useBean id="u" class="useMngt.user" scope="request"/>
<%@page import="java.util.*,useMngt.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>All users</title>
</head>
<body>
<a href="home.jsp">Home</a>
<table  border="2" width="800px">
<tr><th>Id</th><th>Name</th><th>Email</th><th>Mobile</th>
<th>DOB</th><th>City</th><th>Gender</th><th>Edit</th><th>Delete</th></tr>

	<% List<user> lu = Doa.getAll(); 
	
	
	for(user us : lu){
		%><tr>
		<td><%= us.getId() %></td>
		<td><%= us.getName() %></td>
		<td><%= us.getEmail() %></td>
		<td><%= us.getMobile() %></td>
		<td><%= us.getDob() %></td>
		<td><%= us.getCity() %></td>
		<td><%= us.getGender() %></td>
		<td><a href="editserv?id=<%= us.getId()%>">Edit</a></td>
		<td><a href="delete?id=<%= us.getId()%>">Delete</a></td>
		<tr>
	<%}%>
	
	</table>
</body>
</html>
