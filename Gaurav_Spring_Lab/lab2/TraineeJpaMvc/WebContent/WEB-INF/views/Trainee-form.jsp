<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
    
<!DOCTYPE html>
<html lang="en">
<head>
  <title>Bootstrap Example</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>
</head><body>
<div   style="background-image: url(https://www.wallpaperup.com/uploads/wallpapers/2016/06/24/991640/24d24526389da7b23e893cb4cc5a69bc-700.jpg);">
<div class="container " id="addUser" name="addUser" >  
                    <div class="row h-100 justify-content-center align-items-center">
                      <div class="col-10 col-md-8 col-lg-6">
                    <h2> <strong class="text-white" >Add Cadet Details</strong> <i class="fa fa-hand-o-left" style="font-size:48px;color:red"></i> </h2>
                    <br>
<span class ="container" >
<form:form action="saveEmployee" style="opacity: 0.8" class="form-horizontal horizontal-form bg-light" method="post" modelAttribute="trainee" >
<form:hidden path="id"/>
<div class="form-group">
<label for="Name" class="col-md-3 control-label">Name</label>
<div class="col-md-5">
<form:input path="Name" class="form-control" />
</div>
</div>

<div class="form-group">
<label for="Salary" class="col-md-3 control-label">Salary</label>
<div class="col-md-5">
<form:input path="sal" class="form-control" />
</div>
</div>

<div class="form-group">
<label for="Department" class="col-md-3 control-label">Location</label>
<div class="col-md-5">
<form:input path="dept" class="form-control" />
</div>
</div>

<div class="form-group">
<div class="col-md-offset-3 col-md-9">
<form:button class="btn btn-primary">Submit</form:button>
<br>
</span>
</div>
</div>
</form:form>
</div>
</div>
</div>

</div>




</div>
</body>
</html>