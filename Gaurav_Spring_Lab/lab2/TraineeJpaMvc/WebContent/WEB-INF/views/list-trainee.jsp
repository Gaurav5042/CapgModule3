<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html lang="en">
<head>
  <title>JPA MVC EXAMPLE1</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>
</head>
<body>



<div   style="background-image: url(https://www.wallpaperup.com/uploads/wallpapers/2016/06/24/991640/24d24526389da7b23e893cb4cc5a69bc-700.jpg);">
        <div class="full-bg-img ">
          <div class="container flex-center">
            <div class="row pt-5 mt-3 w-100">
              <div class="col-md-12">
                <div class="text-center">
                  <h2 class="h1 h1-reponsive white-text font-up font-bold mb-3 wow fadeInDown" data-wow-delay="0.3s"><strong style="color:white ;background-color:#424949;opacity:0.8"> GC Management </strong></h2>
                  <hr class="hr-light mt-4 wow fadeInDown" data-wow-delay="0.4s">
                 <input type="button" value="Add Trainee" onclick="window.location.href='showForm'" class="btn btn-success btn-block" /><br>
               
                  <a data-toggle="tooltip" title="Yeah ! Add Me. " href="#addUser"  color="white" outline="true" class="wow fadeInDown waves-light border border-danger " style="background-color:#E74C3C;color:white" background-color="#F39C12" data-wow-delay="0.4s"
                  mdbWavesEffect> <span class="fa fa-plus"></span>&nbsp;ADD Cadet&nbsp; </a> &nbsp;&nbsp;&nbsp;&nbsp;
                <a  data-toggle="tooltip" title="To refresh sorted table " color="white" outline="true" class="wow fadeInDown waves-light border border-danger " style="background-color:#E74C3C;color:white" data-wow-delay="0.4s" (click)="ngOnInit()"
                  mdbWavesEffect > <span class="fas fa-stroopwafel fa-spin"></span>  REFRESH &nbsp;</a>
           

                  <!----------------------------------------  TABLE 1 -------------------------------------- TABLE 1---------------------------------------------->


                  <div class="container" >
                    <h3 class="card-header text-center font-weight-bold text-uppercase py-4"><span class="text-white bg-#E5E7E9">All Cadet Records</span></h3>
                    
                    <table class="table table-bordered text-white table-responsive-md table-striped text-center" style="opacity: 0.8;">
                      <tr class="bg-dark">
                        <th class="text-center ">Id </th>
                        <th class="text-center ">Name</th>
                        <th class="text-center ">Salary</th>
                        <th class="text-center">Location</th>
                        <th class="text-center">Edit / Delete</th>
                        
                      </tr>
                      
<c:forEach var="tempTrainee" items="${ trainees }">
<c:url var="updateLink" value="/Trainee/updateForm">
<c:param name="traineeId" value="${ tempTrainee.id }"></c:param>
</c:url>


<c:url var="deleteLink" value="/Trainee/delete">
<c:param name="traineeId" value="${ tempTrainee.id }"></c:param>
</c:url>

<tr>
<td>${tempTrainee.id}</td>
<td>${tempTrainee.name}</td>
<td>${tempTrainee.sal}</td>

<td>${tempTrainee.dept}</td>

<td>

<a href="${ updateLink }">Update</a>
<a href="${ deleteLink }" onclick="if (!(confirm('Are you sure you want to delete ${tempTrainee.name} s details ?'))) return false">Delete</a>
</td>
</tr>
</c:forEach>
                      
                      
                      
                      
                    </table>
                  </div>
               
               </div>
               </div>
               </div>
               </div>
               </div>
               </div>

</body>
</html>