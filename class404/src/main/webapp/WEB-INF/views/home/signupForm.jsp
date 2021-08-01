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
		<form id="frm" name="frm" action="" method="post">
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
			<div>
				<label for="hobbies">관심분야</label> 
					<label><input type="checkbox" name="hobbies" value="공예">공예</label>
					<label><input type="checkbox" name="hobbies" value="요리">요리</label>
					<label><input type="checkbox" name="hobbies" value="음악">음악</label>
					<label><input type="checkbox" name="hobbies" value="운동">운동</label>
					<label><input type="checkbox" name="hobbies" value="사진">사진</label>
					<label><input type="checkbox" name="hobbies" value="글쓰기">글쓰기</label>
					<label><input type="checkbox" name="hobbies" value="디자인">디자인</label>
			</div>
			<br>
			<div>
				<button type="submit">회원가입</button>
			</div>
		</form>
	</div>
</body>
</html>