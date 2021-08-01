<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>마이페이지</title>
</head>
<body>
	<div align="left">
		<h3>마이페이지</h3>
		<c:if test="${ empty name }">
			로그인 정보가 존재하지 않습니다. <a href="loginForm.do">로그인</a>
		</c:if>
		<c:if test="${ not empty name }">
			<form id="frm" name="frm" action="myPageUpdate.do" method="post">
					<div>
						<label for="id">아 이 디</label> <input type="text" id="id" name="id"
							value="${member.id}" required="required">
					</div>
					<div>
						<label for="password">비밀번호</label> <input type="password"
							id="password" name="password" value="${member.password}"
							required="required">
					</div>
					<div>
						<label for="name">이 름</label> <input type="text" id="name"
							name="name" value="${member.name}" required="required">
					</div>
					<div>
						<label for="age">나 이</label> <input type="text" id="age"
							name="age" value="${member.age}" required="required">
					</div>
					<br />
			관심분야
			<select id="hobbies" name="hobbies">
						<option value="a" selected="selected">A</option>
						<option value="b">B</option>
						<option value="c">C</option>
						<option value="d">D</option>
					</select>
					<br>
					<div>
						<button type="submit">수정</button>
					</div>
			</form>
		</c:if>

	</div>
</body>
</html>