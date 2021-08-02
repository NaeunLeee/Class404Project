<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>강좌 등록</title>
</head>
<body>
	<div>
		<div align="center">강좌 등록</div>
		<form id="frm" name="frm" action="classInsert.do" method="post">
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
				<label for="birth">생년월일</label> <input type="date"
					value="1990-01-01" min="1920-01-01" max="2020-12-31" id="birth"
					name="birth" placeholder value required>
			</div>

			<br/>
			관심분야
			<select id ="hobbies" name="hobbies"> 
				<option value="a" selected="selected">A</option>
				<option value="b">B</option>
				<option value="c">C</option>
				<option value="d">D</option>
			</select> <br>
			<div>
				<button type="submit" >회원가입</button>
			</div>
		</form>
	</div>
</body>
</html>