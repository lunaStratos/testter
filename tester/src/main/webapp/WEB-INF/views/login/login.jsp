<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>로그인</title>
<script src="//code.jquery.com/jquery.min.js"></script>
<script type="text/javascript">
	$(document).ready(function() {
		$('#button').click(function() {
			var id = $('#login_id').val();
			var pw = $('#login_pw').val();

			if (id.length <= 0) {
				$('#result').text("아이디를 입력해 주세요.");
				return false;
			}
			console.log(id);
			console.log(pw);

			var form = $("#formok");
			form.submit();
		});
	});
</script>
</head>
<body>
	<form action="login" method="post" id="formok">
		<p>
			<input type="text" name="id" id="login_id" value="">
		<p>
			<input type="password" name="pw" id="login_pw" value="">
		<p>
			<a href="#" id="button">로그 인(이미지로 들어갈수있다.)</a>
	</form>
	<p>결과
	<div id="result"></div>
</body>

</html>