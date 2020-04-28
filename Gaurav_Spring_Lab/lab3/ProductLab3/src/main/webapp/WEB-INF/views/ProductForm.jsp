<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Enter New Product</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
</head>
<body>

<div class="panel-body">
<div class="container text-center justify-content-center bg-light">
    <br>
    <h2 class="text-success text-center"> Add Product Details</h2>
    <br>
	<form action="/addProduct" class="form-horizontal">
		<div class="form-group">
			<label for="id" class="control-label text-info">ID</label>
			
				<input type="text" name="id" class="form-control"><br><br>
			
		</div>

		<div class="form-group">
			<label for="name" class="control-label text-info">Name</label>
			
				<input type="text" name="name" class="form-control"><br><br>
			
		</div>

		<div class="form-group">
			<label for="price" class="control-label text-info">Cost</label>
			
				<input type="text" name="price" class="form-control"><br><br>
			
		</div>

		<div class="form-group">
			<br>
				<input type="submit" value="Submit" class="btn btn-success">
			<br>
		</div>
	</form>
</div>
</div>

</body>
</html>