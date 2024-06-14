<%@ page  isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
<title>Index</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
<script  src="/uniforms/js/collageUniform.js"></script>
</head>

<body>
<nav class="navbar navbar-light bg-info">
  <div class="container-fluid">

    <a href="index.jsp" <span  class="navbar-brand mb-0 h1">Home</span></a>

  </div>
</nav>
<div class="d-flex justify-content-center mt-3 mb-2 align-items-center vh-80">
<div class="card" style="width: 50rem;">
  <div class="card-body">
  <center><h4>CollegeUniformForm</h4></center>

<span style="color:red;">
  <c:forEach items="${errors}" var="objectError">
  ${objectError.defaultMessage}</br>
  </c:forEach>
  </span>

   <form action="send" method="post">
   <strong style="color:red;">${dto}</strong>
     <div class="form-group">
       <label for="exampleInputEmail1"> Student Name</label>
       <input type="text" value="${dto.name}" class="form-control" id="name" name="name" onblur="nameValidation()" aria-describedby="emailHelp" placeholder="Enter Student Name">
       <span id="nameError"></span>

     </div>
     <div class="form-group">
       <label for="exampleInputPassword1">Student Roll Number</label>
       <input type="text" value="${dto.rollNo}" class="form-control" name="rollNo" id="rollNo" onblur="rollNoValidation()" placeholder="Enter Student Roll Number">
       <span id="rollNoError"></span>
     </div>
     <div class="form-group">
             <label for="collegeName">Select College</label>
             <select class="form-control" name="collegeName" id="collegeName" onblur="collegeNameValidation()">
                 <option selected value="">Select College</option>
                 <option value="JSS">JSS</option>
                 <option value="SMI">SMI</option>
                 <option value="GIT">GIT</option>
                 <option value="BIT">BIT</option>
                 <option value="GMIT">GMIT</option>
             </select>
             <span id="collegeNameError"></span>
         </div>




     <div>
     <label>Gender</label>
     <div class="form-check">
       <input class="form-check-input position-static" type="radio" name="gender" id="gender"  onblur="validateForm()" value="${dto.gender}" id="gender" value="male" aria-label="...">Male
       </div>

     <div class="form-check">
            <input class="form-check-input position-static" type="radio" name="gender" id="gender"  onblur="validateForm()" value="${dto.gender}" id="gender" value="female" aria-label="...">Female
      </div>
     </div>
     <span id="genderError"></span>

     <div class="form-check">

       <input type="checkbox" class="form-check-input" name="check" id="check"  onblur="validateForm()" value="${dto.check}" value="check">
       <label class="form-check-label" for="exampleCheck1">Have you entered correct information</label>
     </div>
      <span id="checkboxError"></span>


     <div>
     <button type="submit" id="submitBtn" class="btn btn-primary" disabled>Submit</button>
     </div>

   </form>

    </div>
  </div>
</div>

</body>
</html>
