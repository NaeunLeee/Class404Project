<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<title>회원가입</title>
</head>
<body>
	<div>
		<div align="center">회원가입</div>
		<div>
			<label for="id">아 이 디</label> <input type="text" id="id" name="id"
				placeholder value required>
		</div>
		<div>
			<label for="password">비밀번호</label> <input type="password"
				id="password" name="password" placeholder value required>
		</div>
		<div>
			<label for="name">이 름</label> <input type="text" id="name"
				name="name" placeholder value required>
		</div>
		<div>
			<label for="age">나 이</label> <input type="text" id="age" name="age"
				placeholder value required>
		</div>
		<div>
			<label for="hobby">취 미</label> <input type="text" id="hobby"
				name="hobby" placeholder value required>
		</div>
		<br>
		<div>
			<button type="submit">로그인</button>
		</div>
	</div>
</body>
</html>