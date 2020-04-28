<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Products</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
</head>
<body>

<div class="container">
<h1 class="text-success text-center  ">List of Some Famous Guns (Garv)</h1>
<div class="justify-content-center text-center">
<input type="button" value="Add Product" onclick="window.location.href='showAddProduct'" class="btn btn-primary rounded info text-center" /><br>
</div>
<br/>
</div>
<div class="container">
<table class="table table-hover table-striped table-bordered ">
<tr>
<th> Gun ID
</th>
<th> Gun Name
</th>
<th> Gun Cost
</th>
</tr>
<tr>
<td> 1
</td>
<td> Benelli Black Eagle
</td>
<td> 600000
</td>
</tr>
<c:forEach items="${lists}" var="product">
    <tr>
    <td> ${product.pId}     </td>
    <td> ${product.pName}   </td>
    <td>  ${product.pPrice} </td>
    </tr>
</c:forEach>
</table>
</div>
</body>
</html>