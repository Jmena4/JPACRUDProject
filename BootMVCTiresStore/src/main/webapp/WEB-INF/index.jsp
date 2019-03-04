<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib
	uri="http://jakarta.apache.org/taglibs/standard/permittedTaglibs"
	prefix=""%><%@ page language="java"
	contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>MVC Tire Store</title>
<jsp:include page="bootstrapHead.jsp"></jsp:include>
</head>
<h1>Welcome to Tire Store!</h1>
<body>
	<div class="container-fluid">
		<form action="${tire }" method="GET">
			Tire ID: <input type="text" name="tid" /> <input type="submit"
				value="Show Tire" class="btn btn-primary" />
		</form>
		<form action="addTire" method="POST">
			 <input type="submit"
				value="Add Tire" class="btn btn-primary" />
		</form>
		</div>
		<c:if test="${not empty allTires }">
			<dl>
				<c:forEach var='t' items="${allTires }">
					<dt>
						<a href="getTire.do?tid=${t.id }">${t.name }</a>

					</dt>
					<dd>${t.productDescription }</dd>


				</c:forEach>

			</dl>

		</c:if>
		<jsp:include page="bootstrapFoot.jsp"></jsp:include>
</body>
</html>
<!-- <a href="https://truckfreighter.com/wp-content/uploads/2018/06/best-drive-tires-for-semi-truck.jpg"></a>  -->