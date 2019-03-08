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
	<div class="container-fluid ">
		<div class="row pt-5 m-auto">
			<c:choose>
				<c:when test="${! empty tire }">
					<form action="editTire.do" method="POST">
						Tire Name: <br> <input type="text" value="${tire.name }"
							name="name" /> <br> Product Description: <br> <input
							type="text" value="${tire.productDescription }"
							name="productDescription" /> <br> Manufactured Date: <br>
						<input type="date" value="${tire.manufacturedDate }"
							name="manufacturedDate" /><br> Size: <br> <input
							type="number" value="${tire.size }" name="size" /> <br>
						Purchase Price: <br> <input type="number"
							value="${tire.purchasePrice }" name="purchasePrice" /> <br>
						Origin Country Code:<br> <input type="text"
							value="${tire.originCountryCode }" name="originCountryCode" /> <br>
						<input type="hidden" name="tireId" value="${tire.id }" /> <br>
						<input type="hidden" name="tire" value="${tire }" />
						<div class="container-fluid justify-content-center">
							<input class="btn btnResult btn-primary" type="submit"
								value="Save Edit" />
						</div>
					</form>
					<br>

					<div class="container-fluid justify-content-center">
						<form action="deleteTire.do" method="POST" name="removed">
							<input type="hidden" name="tireId" value="${tire.id }" /> <input
								class="btn btn-danger btn-sm" type="submit" value="DELETE THIS TIRE" />

						</form>
					</div>

				</c:when>
				<c:when test="${removed}">
					<div class="col-12">
						<h3>
							<i class="fas fa-check" style="font-size: 34px; color: green"></i>
							Tire is removed
						</h3>
						<br>
					</div>
					<div class="row">
						<a href="index.jsp">Return to Main Menu</a>
					</div>

				</c:when>
				<c:otherwise>
					<div class="col-12">


						<h3>
							<i class="fa fa-exclamation-triangle" aria-hidden="true"
								style="font-size: 34px; color: red"></i> No Tire found
						</h3>
						<br />
					</div>
					<div class="row">
						<a href="index.jsp">Return to Main Menu</a>
					</div>

				</c:otherwise>
			</c:choose>

		</div>
	</div>
	<jsp:include page="../bootstrapFoot.jsp"></jsp:include>
</body>
</html>