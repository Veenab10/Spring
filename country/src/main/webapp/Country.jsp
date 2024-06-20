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
${countryDto}
<form action="save" method="post">
<input type="hidden" name="id" value="${countryDto.id}"/>
<div class="d-flex justify-content-center mt-3 mb-2 align-items-center vh-80">
<div class="card" style="width: 50rem;">
  <div class="card-body">
   <center> <h5 class="card-title">CountryForm</h5></center>
    <div class="form-group">
        <label for="exampleInputEmail1">Country Name</label>
        <input type="text" class="form-control" id="name" name="name"  placeholder="Enter Country Name" value="${countryDto.name}"/>

      </div>

      <div class="form-group">
        <label for="exampleInputPassword1">Capital City</label>
        <input type="text" class="form-control" id="city" name="city" placeholder="Enter Capital City" value="${countryDto.city}"/>
      </div>

      <div class="form-group">
          <label for="exampleInputPassword1">Population</label>
          <input type="text" class="form-control" id="population" name="population" placeholder="Enter Population" value="${countryDto.population}"/>
        </div>

        <div class="form-group">
            <label for="exampleInputPassword1">No of states</label>
            <input type="text" class="form-control" id="states" name="states" placeholder="Enter No of States" value="${countryDto.states}"/>
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

