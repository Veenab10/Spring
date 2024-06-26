<%@ page  isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
<title>Index</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
<script  src="/issue-management/js/SignUpForm.js"></script>
</head>

<body>
<nav class="p-3 mb-2 bg-primary text-white">
  <div class="container-fluid">

    <a href="index.jsp" <span  class="p-3 mb-2 bg-primary text-white">Home</span></a>

  </div>
</nav>
<span style="color:green;">${name}</span>


<form action="signup" method="post">


<div class="d-flex justify-content-center mt-3 mb-3 align-items-center vh-80">
<div class="card" style="width: 45rem;>
  <div class="card-body">
   <center> <h5 class="card-title">Signup Form</h5></center>

    <div class="form-group">
        <label for="exampleInputEmail1">First Name</label>
        <input type="text" class="form-control" id="fname" name="fname" onblur="firstNameValidation()"   placeholder="Enter First Name" value=${dto.fname} >
        <span id="nameError"></span>

      </div>

      <div class="form-group">
              <label for="exampleInputEmail1">Last Name</label>
              <input type="text" class="form-control" id="lname" name="lname"   placeholder="Enter Last Name" value=${dto.lname}>

            </div>

      <div class="form-group">
        <label for="exampleInputPassword1"> Email ID</label>
        <input type="email" class="form-control" id="email" name="email"  placeholder="Enter  Email ID" value=${dto.email}>
      </div>

      <div class="form-group">
          <label for="exampleInputPassword1"> Contact Number</label>
          <input type="text" class="form-control" id="number" name="number"  placeholder="Enter Contact Number" value=${dto.number}>
        </div>

        <div class="form-group">
                  <label for="exampleInputPassword1"> Alternative Contact Number</label>
                  <input type="text" class="form-control" id="alternativeNumber" name="alternativeNumber"  placeholder="Enter Alternative Contact Number" value=${dto.alternativeNumber}>
                </div>

       <div class="form-floating">
         <textarea class="form-control" placeholder="Enter address here" id="address" name="address" >${dto.address}</textarea>
         <label for="floatingTextarea">Address</label>
       </div>

       <div class="mb-3 form-check">
           <input type="checkbox" class="form-check-input" id="agree" name="agree">
           <label class="form-check-label" for="exampleCheck1">Agree</label>
         </div>


      <div>
      <input type="submit" class="btn btn-primary" value="Signup"/>
      </div>

  </div>
</div>
</div>


</form>


</body>
</html>

