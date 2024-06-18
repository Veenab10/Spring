<%@ page  isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
<title>Index</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
</head>

<body>
<nav class="navbar navbar-light bg-info">
  <div class="container-fluid">

    <a href="index.jsp" <span  class="navbar-brand mb-0 h1">Home</span></a>


  </div>
</nav>
<div class="d-flex justify-content-center mt-3 mb-2 align-items-center vh-80">
<div class="card" style="width: 25rem;">
  <div class="card-body">
    <strong style="color:green;">Search result for , ${collegeName}</strong>

       ${listOfCollegeUniform}
    </div>
  </div>
</div>

</body>
</html>
