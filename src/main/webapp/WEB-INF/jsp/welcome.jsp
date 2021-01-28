<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<link href="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<html>
<head>
<script src="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.0.8/css/all.css">
<title>${name}'s Home Page</title>
</head>
<div class="card-body">
<p class="text-success text-center">Welcome ${name}</p>
</div>
<div>
<p class="text-center"><a href="login" class="btn btn-danger">Log out</a></p>
</div>
</html>