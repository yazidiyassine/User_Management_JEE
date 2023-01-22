<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home</title>
</head>
<body>
	<form action="register" method="post">
	<h2>Registration form</h2>
	<table>
		<tr>
		  <td>Name</td>
		  <td><input type="text" name="userName" required>
		  </td>
		</tr>
		<tr>
		  <td>Email</td>
		  <td><input type="email" name="email" required>
		  </td>
		</tr><tr>
		  <td>Mobile</td>
		  <td><input type="tel" name="mobile" required>
		  </td>
		</tr><tr>
		  <td>DOB</td>
		  <td><input type="date" name="dob" required>
		  </td>
		</tr><tr>
		  <td>City</td>
		  <td><select name="city">
		  <option value="Beni Mellal">Beni Mellal</option>
		  <option value="Casa">Casa</option>
		  <option value="Rabat">Rabat</option>
		  <option value="Tangier">Tangier</option>
		  </select>
		  </td>
		</tr><tr>
		  <td>Gender</td>
		  <td><input type="radio" name="gender" value="male" required checked>Male &nbsp;
		  	  <input type="radio" name="gender" value="female" required>Female
		  </td>
		</tr><tr>
		  <td><input type="submit" value="Register"></td>
		  <td><input type="reset" value="Cancel"></td>
		  <td><h4 ><a href=showAll.jsp>show</a></h4></td>
		</tr>
	</table>
	</form>
</body>
</html>