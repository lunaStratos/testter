<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Redis get and set Test</title>
</head>
<body>
	<h1>Redis get and set Test</h1>

	<h3>Redis insert</h3>

	<form action="redis" method="post">
		<p>
			id: <input name="id" type="text">
		</p>
		<p>
			pw: <input name="pw" type="password">
		</p>
		<p>
			Submit: <input type="submit">
		</p>
	</form>

	<h3>Redis get</h3>
	<form action="redisConfirm" method="post">
		<p>
			id?: <input name="id" type="text">
		</p>
		<p>
			pw?: <input name="pw" type="password">
		</p>
		<p>
			Submit: <input type="submit">
		</p>
	</form>
	
	<p><a href = "./redisListPush">Listpush!</a></p>

</body>
</html>