<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<div align="left">
	<form id="frm" name="frm" action="myPageUpdate.do" method="post">
					<div>
						<label for="id">아 이 디</label> <input type="text" id="id" name="id"
							value="${member.id}" required="required">
					</div>
					<div>
						<label for="name">이 름</label> <input type="text" id="name"
							name="name" value="${member.name}" required="required">
					</div>
					<div>
						<label for="age">나 이</label> <input type="text" id="age"
							name="age" value="${member.age}" required="required">
					</div>
			관심분야
			<select id ="hobbies" name="hobbies"> 
				<option value="베이킹" selected="selected">베이킹</option>
				<option value="디자인/공예">디자인/공예</option>
				<option value="컴퓨터/공학">컴퓨터/공학</option>
				<option value="여행">여행</option>
				<option value="요리">요리</option>
				<option value="인테리어/소품">인테리어/소품</option>
				<option value="언어">언어</option>
			</select> 
					<div>
						<label for="author">권 한</label> <input type="text" id="author"
							name="author" value="${member.author}" required="required">
					</div>
					<br>
					<div>
						<button type="submit">수정</button>
					</div>
			</form>
</div>
<br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>
</body>
</html>