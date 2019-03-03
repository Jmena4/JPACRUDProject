<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!-- TODO: Add the @taglib for form -->
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<jsp:include page="../bootstrapHead.jsp"></jsp:include>
<title>Tire</title>
</head>
<h5>${tire.name}</h5>
<body>
	<div class="container-fluid">
		<div class = "row pt-5 m-auto">
		<c:choose>
		<c:when test ="${! empty tire }">
		 <ul>
			<li><p><strong>Name:</strong> ${tire.name} </p></li>
			<li><p><strong>Description:</strong> ${tire.productDescription}</p></li>
			<li><p><strong>Manufactured Date:</strong> ${tire.manufacturedDate}</p></li>
			<li><p><strong>Size:</strong> ${tire.size}</p></li>
			<li><p><strong>Origin Country Code:</strong> ${tire.originCountryCode}</p></li>
		</ul> 
		
		</c:when>
		</c:choose>
		<form action= "editTire.do" method="GET" modelAttribute="tire">
			<input type="hidden" name="tireId" value="${tire.id }"/>
			<input class="btn btnResult btn-primary" type="submit" value="EDIT"/>
		</form>
		<form action= "deleteTire.do" method="GET">
			<input type="hidden" name="tireId" value="${tire.id }"/>
			<input class="btn btnResult btn-primary" type="submit" value="DELETE"/>
		</form>
	</div>
	</div>
	<jsp:include page="../bootstrapFoot.jsp"></jsp:include>
</body>
</html>