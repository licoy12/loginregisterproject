<link
	href="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	rel="stylesheet" id="bootstrap-css">
<html>
<head>
<script
	src="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
<script
	src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<link rel="stylesheet"
	href="https://use.fontawesome.com/releases/v5.0.8/css/all.css">
<title>Login Page</title>
</head>

<div class="container h-40" align='center'>
	<article class="card-body">
		<h4 class="card-title text-center mb-4 mt-1">Sign in</h4>
		<hr>
		<p class="text-success text-center">Please provide your login</p>
		<form action='' method='POST'>
			<div class="form-group">
				<div class="input-group">
					<div class="input-group-prepend">
						<span class="input-group-text"> <i class="fa fa-user"></i>
						</span>
					</div>
					<input name="username" class="form-control" placeholder="username"
						type="text">
				</div>
				<!-- input-group.// -->
			</div>
			<!-- form-group// -->
			<div class="form-group">
				<div class="input-group">
					<div class="input-group-prepend">
						<span class="input-group-text"> <i class="fa fa-lock"></i>
						</span>
					</div>
					<input name='password' class="form-control" placeholder="******"
						type="password">
				</div>
				<!-- input-group.// -->
			</div>
			<!-- form-group// -->
			<div class="form-group">
				<button type="submit" class="btn btn-primary btn-block">
					Login</button>
			</div>
			<!-- form-group// -->
			<p>Don't have account yet?</p>
			<p class="text-center">
		<a href="register" class="btn">Sign Up</a>
			</p></form>
		<div>${error}</div>
	</article>
</div>
<!-- card.// -->
</html>