<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="resources/css/style.css">


<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css"
	integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO"
	crossorigin="anonymous">
<script
	src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"
	integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy"
	crossorigin="anonymous"></script>
<a href="home.do">Home page</a>
<title>Insert title here</title>
</head>
<body>
<h3>Add New Tire</h3>
	<form action="addTire.do" method="POST">
		<div class="form-group">
			<label class="searchlabel" for="search">Name:</label> <input
				type="text" class="form-control" required name="name"
				placeholder="name"> 
			<label class="searchlabel"
				for="manufactured_date">Manufactured Date:</label> <input
				type="date" class="form-control" required name="manufacturedDate"
				placeholder="manufactured date" />
			<label class="searchlabel" for="search">Size:</label> <input
				type="number" class="form-control" required name="size"
				placeholder="size">
			<label class="searchlabel" for="search">Purchased Price:</label> <input
				type="text" class="form-control" required name="purchasePrice"
				placeholder="purchase price">
			<label class="searchlabel" for="search">Product Description:</label> <input
				type="text" class="form-control" required name="productDescription"
				placeholder="product description">
			<label class="searchlabel" for="search">Origin Country Code:</label> <input
				type="text" class="form-control" required name="originCountryCode"
				placeholder="originCountryCode">
			<button type="submit" class="addfilmBtn submit btn btn-primary">Add
				Film</button>
			<a href="index.jsp"></a>

		</div>
	</form>
</body>
</html>