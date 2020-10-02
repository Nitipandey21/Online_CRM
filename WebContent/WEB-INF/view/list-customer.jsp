<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<style>
table {
  border-collapse: collapse;
  border-spacing: 0;
  width: 100%;
  border: 1px solid #ddd;
}

th, td {
  text-align: left;
  padding: 16px;
}

tr:nth-child(even) {
  background-color: #f2f2f2;
}
#wrapper {width: 100%; margin-top: 0px; }
#header {width: 70%; background:#00008B; margin-top: 0px; padding:15px 0px 15px 15px;}
#header h2 {width: 100%; margin:auto; color:White;}
#container {width: 100%; margin:auto}
#container h3 {color: #000;}
#container #content {margin-top: 20px;}
.button {
  padding: 15px 25px;
  font-size: 24px;
  text-align: center;
  cursor: pointer;
  outline: none;
  color: #fff;
  background-color: #4CAF50;
  border: none;
  border-radius: 15px;
  box-shadow: 0 9px #999;
}

.button:hover {background-color: #3e8e41}

.button:active {
  background-color: #3e8e41;
  box-shadow: 0 5px #666;
  transform: translateY(4px);
</style>
</head>
<body>

<div id="wrapper">
		<div id="header">
			<h2>CRM - Customer Relationship Manager</h2>
		</div>
	</div>
<br>
<br>

<input type="button" value="Add Customer"
				   onclick="window.location.href='addForm'; return false;"
				   class="button"
			/>
			
			<br><br>		
<table>
  <tr>
    <th>First Name</th>
    <th>Last Name</th>
    <th>Email</th>
  </tr>
  <c:forEach var="t" items="${cs}">

  <tr>
    <td>${t.fname}</td>
    <td>${t.lname}</td>
    <td>${t.mail}</td>
  </tr>
  </c:forEach>
</table>

</body>
</html>