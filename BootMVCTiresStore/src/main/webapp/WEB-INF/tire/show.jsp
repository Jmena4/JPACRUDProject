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
<a href="home.do">Home page</a>
<title>Tire</title>
</head>
<h2>${tire.name}</h2>
<body>
	<div class="container-fluid">
		<div class="row pt-5 m-auto">
			<c:choose>
				<c:when test="${! empty tire }">
					<form action="editTire.do" method="POST">

						<input type="text" value="${tire.name }" name="name"/> 
						<input
							type="text" value="${tire.productDescription }"
							name="productDescription"/> 
							<input type="date"
							value="${tire.manufacturedDate }" name="manufacturedDate"/>
						<input type="number" value="${tire.size }" name="size"/> 
						<input type="number" value="${tire.purchasePrice }" name="purchasePrice"/> 
						
						<input

							type="text" value="${tire.originCountryCode }"
							name="originCountryCode"/> 
						<input type="hidden"
							name="tireId" value="${tire.id }" /> 
						<input type="hidden"
							name="tire" value="${tire }" /> <input
							class="btn btnResult btn-primary" type="submit" value="Edit" />
					</form>
					
					<form action="deleteTire.do" method="POST" name="removed">
						<input type="hidden" name="tireId" value="${tire.id }" /> <input
							class="btn btnResult btn-primary" type="submit" value="DELETE" />
					</form>
				</c:when>
			</c:choose>
		</div>
	</div>
	<jsp:include page="../bootstrapFoot.jsp"></jsp:include>
</body>
</html>