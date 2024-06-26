<%@ page  isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
<title>Index</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
</head>

<body>
<nav class="p-3 mb-2 bg-primary text-white">
  <div class="container-fluid">


    <a href="index.jsp" <span  class="p-3 mb-2 bg-primary text-white">Home</span></a>
     <a href="SignupForm.jsp" <span  class="p-3 mb-2 bg-primary text-white">SignupForm</span></a>


  </div>
</nav>
<span style="color:green;">${name}</span>
<strong style="color:green">${message}</strong>
<strong style="color:green">${error}</strong>

<form action="signin" method="post">

<div class="d-flex justify-content-center mt-3 mb-3 align-items-center vh-80">
<div class="card" style="width: 45rem;>
  <div class="card-body">
   <center> <h5 class="card-title">SignIn Form</h5></center>

    <div class="form-group">
        <label for="exampleInputPassword1"> Email ID</label>
        <input type="email" class="form-control" id="email" name="email"  placeholder="Enter  Email ID" value=${dto.email}>
      </div>

      <div class="mb-3">
          <label for="exampleInputPassword1" class="form-label">Password</label>
          <input type="password" class="form-control" placeholder="Enter  password" id="password" name="password">
        </div>

      <div>
      <input type="submit" class="btn btn-primary" value="SignIn"/>
      </div>

  </div>
</div>
</div>


</form>


</body>
</html>

