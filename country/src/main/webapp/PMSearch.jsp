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

    <a href="PM.jsp" <span  class="p-3 mb-2 bg-primary text-white">PMForm</span></a>
    <a href="index.jsp" <span  class="p-3 mb-2 bg-primary text-white">Home</span></a>
    <a href="PMSearch.jsp" <span  class="p-3 mb-2 bg-primary text-white">PMSearch</span></a>


  </div>
</nav>

<form action="search2" method="post">

<div class="d-flex justify-content-center mt-3 mb-2 align-items-center vh-80">
<div class="card" style="width: 50rem;">
  <div class="card-body">
   <center> <h5 class="card-title">PMForm</h5></center>

    <div class="form-group">
                       <label for="Country Name">Select Country</label>
                       <select class="form-control" name="countryName" id="countryName">
                       <option ${dto.countryName==null ? 'selected' : ''}  selected value=" ">Select College</option>
                           <option value="India" ${dto.countryName eq 'India' ? 'selected' : ''}>India</option>
                           <option value="America"  ${dto.countryName eq 'America' ? 'selected' : ''}>America</option>
                           <option value="Canada"  ${dto.countryName eq 'Canada' ? 'selected' : ''}>Canada</option>
                           <option value="Australia"  ${dto.countryName eq 'Australia' ? 'selected' : ''}>Australia</option>

                       </select>

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
    <strong style="color:green;">Search result for , ${pmName}</strong>
<table class="table">
  <thead>
    <tr>
      <th scope="col">ID</th>
      <th scope="col">PM Name </th>
      <th scope="col">PM countryName </th>
      <th scope="col">PM dob</th>
      <th scope="col">PM alive</th>
    </tr>
  </thead>
  <tbody>
       <c:forEach items="${listOfPmName}" var="pm">
              <tr>
              <td>${pm.id}</td>
              <td>${pm.name}</td>
              <td>${pm.countryName}</td>
              <td>${pm.dob}</td>
              <td>${pm.alive}</td>
              </tr>
       </c:forEach>

  </tbody>
</table>


</body>
</html>

