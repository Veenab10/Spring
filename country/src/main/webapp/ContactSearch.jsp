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

<form action="search1" method="post">

<div class="d-flex justify-content-center mt-3 mb-2 align-items-center vh-80">
<div class="card" style="width: 50rem;">
  <div class="card-body">
   <center> <h5 class="card-title">CountryForm</h5></center>
    <div class="form-group">
        <label for="exampleInputEmail1">Contact Name</label>
        <input type="text" class="form-control" id="name" name="name"  placeholder="Enter Contact Name">

      </div>


      <div>
      <button type="submit" class="btn btn-primary">Submit</button>
      </div>

  </div>
</div>
</div>


</form>

<div class="d-flex justify-content-center mt-3 mb-2 align-items-center vh-80">
<div class="card" style="width: 50rem;">
  <div class="card-body">
    <strong style="color:green;">Search result for , ${contactName}</strong>
<table class="table">
  <thead>
    <tr>
      <th scope="col">ID</th>
      <th scope="col">Contact Name </th>
      <th scope="col">Contact Email ID </th>
      <th scope="col">Contact Phone Number</th>
      <th scope="col">Contact Comments</th>
    </tr>
  </thead>
  <tbody>
       <c:forEach items="${listOfContactName}" var="contact">
              <tr>
              <td>${contact.id}</td>
              <td>${contact.name}</td>
              <td>${contact.email}</td>
              <td>${contact.number}</td>
              <td>${contact.comment}</td>
              </tr>


       </c:forEach>

  </tbody>
</table>


</body>
</html>

