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
	<div class="container-fluid justify-content-center">
		<div class="row pt-5 m-auto">
			<c:choose>
				<c:when test="${! empty tire }">
					<form action="editTire.do" method="POST">
						<ul></ul>
						<input type="text" value="${tire.name }" name="name" /> <br>
						<input type="text" value="${tire.productDescription }"
							name="productDescription" /> <br> <input type="date"
							value="${tire.manufacturedDate }" name="manufacturedDate" /><br>
						<input type="number" value="${tire.size }" name="size" /> <br>
						<input type="number" value="${tire.purchasePrice }"
							name="purchasePrice" /> <br> <input type="text"
							value="${tire.originCountryCode }" name="originCountryCode" /> <br>
						<input type="hidden" name="tireId" value="${tire.id }" /> <br>
						<input type="hidden" name="tire" value="${tire }" />
						<div class="container-fluid justify-content-center">
							<input class="btn btnResult btn-primary" type="submit"
								value="Edit" />
						</div>
					</form>
					<br>
					<br>
					<br>

					<div class="container-fluid ">
						<form action="deleteTire.do" method="POST" name="removed">
							<input type="hidden" name="tireId" value="${tire.id }" /> <input
								class="btn btnResult btn-primary" type="submit" value="DELETE" />

						</form>
					</div>
				</c:when>

			</c:choose>

		</div>
	</div>
	<jsp:include page="../bootstrapFoot.jsp"></jsp:include>
</body>
</html>