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

    <a href="Contact.jsp" <span  class="p-3 mb-2 bg-primary text-white">ContactForm</span></a>
    <a href="index.jsp" <span  class="p-3 mb-2 bg-primary text-white">Home</span></a>
    <a href="ContactSearch.jsp" <span  class="p-3 mb-2 bg-primary text-white">ContactSearch</span></a>


  </div>
</nav>

<form action="send" method="post">

<div class="d-flex justify-content-center mt-3 mb-2 align-items-center vh-80">
<div class="card" style="width: 50rem;">
  <div class="card-body">
   <center> <h5 class="card-title">CountryForm</h5></center>
    <div class="form-group">
        <label for="exampleInputEmail1">Contact Name</label>
        <input type="text" class="form-control" id="name" name="name"  placeholder="Enter Contact Name">

      </div>

      <div class="form-group">
        <label for="exampleInputPassword1"> Email ID</label>
        <input type="email" class="form-control" id="email" name="email" placeholder="Enter Contact Email ID">
      </div>

      <div class="form-group">
          <label for="exampleInputPassword1"> Phone Number</label>
          <input type="text" class="form-control" id="number" name="number" placeholder="Enter Phone Number">
        </div>

       <div class="form-floating">
         <textarea class="form-control" placeholder="Leave a comment here" id="comment" name="comment"></textarea>
         <label for="floatingTextarea">Comments</label>
       </div>


      <div>
      <button type="submit" class="btn btn-primary">Submit</button>
      </div>

  </div>
</div>
</div>


</form>


</body>
</html>

