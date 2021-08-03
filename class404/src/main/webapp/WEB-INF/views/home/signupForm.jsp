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
		<div align="center"><h3>회원가입</h3></div>
		<form id="frm" name="frm" action="signup.do" method="post">
			<div>
				<table>
					<tr>
						<th>아 이 디</th>
						<td><input type="text" id="id" name="id"
							placeholder="아이디를 입력하세요" required></td>
					</tr>
					<tr>
						<th>비밀번호</th>
						<td><input type="password" id="password" name="password"
							placeholder="비밀번호를 입력하세요" required></td>
					</tr>
					<tr>
						<th>이 름</th>
						<td><input type="text" id="name" name="name"
							placeholder="이름를 입력하세요" required></td>
					</tr>
					<tr>
						<th>생년월일</th>
						<td>&nbsp;&nbsp;<input type="date" value="1990-01-01" min="1920-01-01"
							max="2020-12-31" id="birth" name="birth" required></td>
					</tr>
					<tr>
						<th>관심분야</th>
						<td><select id="hobbies" name="hobbies">
								<option value="" selected="selected">선택</option>
								<option value="베이킹">베이킹</option>
								<option value="디자인/공예">디자인/공예</option>
								<option value="컴퓨터/공학">컴퓨터/공학</option>
								<option value="여행">여행</option>
								<option value="요리">요리</option>
								<option value="인테리어/소품">인테리어/소품</option>
								<option value="언어">언어</option>
								<option value="기타">기타</option>
						</select></td>
					</tr>
				</table>
			</div>
			<div align="right">
				<button type="submit">회원가입</button>
			</div>

			<!-- 
			<div>
				<label for="hobbies">관심분야</label> 
					<label><input type="checkbox" name="hobbies" value="공예">공예</label>
					<label><input type="checkbox" name="hobbies" value="요리">요리</label>
					<label><input type="checkbox" name="hobbies" value="음악">음악</label>
					<label><input type="checkbox" name="hobbies" value="운동">운동</label>
					<label><input type="checkbox" name="hobbies" value="사진">사진</label>
					<label><input type="checkbox" name="hobbies" value="글쓰기">글쓰기</label>
					<label><input type="checkbox" name="hobbies" value="디자인">디자인</label>
			</div>  -->
		</form>
	</div>
</body>
</html>