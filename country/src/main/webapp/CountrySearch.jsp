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

    <a href="Country.jsp" <span  class="p-3 mb-2 bg-primary text-white">CountryForm</span></a>
    <a href="index.jsp" <span  class="p-3 mb-2 bg-primary text-white">Home</span></a>
    <a href="CountrySearch.jsp" <span  class="p-3 mb-2 bg-primary text-white">CountrySearch</span></a>


  </div>
</nav>

<form action="search" method="post">

<div class="d-flex justify-content-center mt-3 mb-2 align-items-center vh-80">
<div class="card" style="width: 50rem;">
  <div class="card-body">
   <center> <h5 class="card-title">CountryForm</h5></center>
    <div class="form-group">
        <label for="exampleInputEmail1">Country Name</label>
        <input type="text" class="form-control" id="name" name="name"  placeholder="Enter Country Name">

      </div>


      <div>
      <button type="submit" class="btn btn-primary">Submit</button>
      </div>

  </div>
</div>
</div>


</form>

<div class="d-flex justify-content-center mt-3 mb-2 align-items-center vh-80">
<div class="card" >
  <div class="card-body">
    <strong style="color:green;">Search result for , ${countryName}</strong>
<table class="table">
  <thead>
    <tr>
      <th scope="col">ID</th>
      <th scope="col">Country Name </th>
      <th scope="col">Country city </th>
      <th scope="col">Country population</th>
      <th scope="col">Country states</th>
      <th scope="col">Edit</th>
    </tr>
  </thead>
  <tbody>
       <c:forEach items="${listOfCountryName}" var="country">
              <tr>
              <td>${country.id}</td>
              <td>${country.name}</td>
              <td>${country.city}</td>
              <td>${country.population}</td>
              <td>${country.states}</td>
              <td><a href="country-edit?pk=${country.id}">Edit</a></td>
              </tr>


       </c:forEach>

  </tbody>
</table>


</body>
</html>

