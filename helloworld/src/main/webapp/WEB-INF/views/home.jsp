<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Hello world!  
</h1>

<P>  The time on the server is ${serverTime}. </P>
<h3>Persons List</h3>
<c:if test="${!empty listPlayer}">
	<table class="tg">
	<tr>
		<th width="80">Person ID</th>
		<th width="120">Person Name</th>
		<th width="120">Person Country</th>
		<th width="60">Edit</th>
		<th width="60">Delete</th>
	</tr>
	<c:forEach items="${listPlayer}" var="player">
		<tr>
			<td>${player.idplayer}</td>
			<td>${player.name}</td>

		</tr>
	</c:forEach>
	</table>
</c:if>
</body>
</html>
