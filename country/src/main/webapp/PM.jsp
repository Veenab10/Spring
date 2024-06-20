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

<form action="submit" method="post">

<div class="d-flex justify-content-center mt-3 mb-2 align-items-center vh-80">
<div class="card" style="width: 50rem;">
  <div class="card-body">
   <center> <h5 class="card-title">CountryForm</h5></center>
    <div class="form-group">
        <label for="exampleInputEmail1">PM Name</label>
        <input type="text" class="form-control" id="name" name="name"  placeholder="Enter Contact Name">

      </div>

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

      <div class="form-group">
          <label for="exampleInputPassword1"> Date of Birth</label>
          <input type="text" class="form-control" id="dob" name="dob" placeholder="Enter Date of Birth">
        </div>

        <div>
             <label>Alive</label>
             <div class="form-check">
               <input class="form-check-input position-static" type="radio" name="alive" id="alive"     value="yes" ${dto.alive eq 'yes' ? 'checked' : ''} aria-label="...">yes
               </div>

             <div class="form-check">
                    <input class="form-check-input position-static" type="radio" name="alive" id="alive"     value="no" ${dto.alive eq 'no' ? 'checked' : ''} aria-label="...">no
              </div>
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

