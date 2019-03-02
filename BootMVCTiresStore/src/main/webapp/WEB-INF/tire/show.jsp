<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<jsp:include page="../bootstrapHead.jsp"></jsp:include>
<title>Tire</title>
</head>
<body>
	<div class="container-fluid">
		<h5>${tire.name}</h5>
		<ul>
			<li><p><label>Name:</label> ${tire.name} </p></li>
			<li><p><label>Description:</label> ${tire.productDescription}</p></li>
		</ul>
	</div>
	<jsp:include page="../bootstrapFoot.jsp"></jsp:include>
</body>
</html>