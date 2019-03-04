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
<jsp:include page="bootstrapHead.jsp"></jsp:include>
<title>Insert title here</title>
</head>
<body>
	<div class="container-fluid">
		<div class="row pt-5 m-auto">
			<div class="searchForm">
			<c:if test="${not empty editTire }">
				<form:form action="${editTire }" method="POST" ></form:form>
				<div class="form-group">
					<div>
						<p>
							<strong>Edit Tire:</strong> ${editTire.name}
						</p>
						<label class="searchlabel" for="search">Name:</label>
						<input type="text" class="form-control" required name="name" 
							placeholder="name" />
						<label class="searchlabel" for="search">Product Description:</label>
						<input type="text" class="form-control" required
							name="product description"  placeholder="product description" />
						<label class="searchlabel" for="search">Manufactured Date:</label>
						<input type="text" class="form-control" required
							name="manufactured_date"  placeholder="YYYY-MM-DD" />
						<label class="searchlabel" for="search">Size:</label>
						<input type="text" class="form-control" required name="size" 
							placeholder="size" />
						 <label class="searchlabel" for="search">Origin Country Code:</label>
						<input type="text" class="form-control" required
							name="origin_country_code"   placeholder="origin country code" />
						
						<button type="submit" class="btn btn-primary">Submit 
							Tire</button>
					</div>
				</div>
				</c:if>
			</div>
		</div>
	</div>
	<jsp:include page="bootstrapFoot.jsp"></jsp:include>
</body>
</html>