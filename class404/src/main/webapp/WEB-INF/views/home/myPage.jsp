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
	<div align="center">
		<h3>마이페이지</h3>
		<br>
		<div align="left">
			<c:if test="${ empty name }">
			로그인 정보가 존재하지 않습니다. <a href="loginForm.do">로그인</a>
			</c:if>
			<c:if test="${ not empty name }">
				<form id="frm" name="frm" action="myPageUpdate.do" method="post">
					<div>
						<table>
							<tr>
								<th>아 이 디</th>
								<td><input type="text" id="id" name="id"
									value="${member.id}" required="required"></td>
							</tr>
							<tr>
								<th>비밀번호</th>
								<td><input type="password" id="password" name="password"
									value="${member.password}" required="required"></td>
							</tr>
							<tr>
								<th>이 름</th>
								<td><input type="text" id="name" name="name"
									value="${member.name}" required="required"></td>
							</tr>
							<tr>
								<th>나 이</th>
								<td><input type="text" id="age" name="age"
									value="${member.age}" required="required"></td>
							</tr>
							<tr>
								<th>권 한</th>
								<td><input type="text" id="author" name="author"
									value="${member.author}" required="required"
									disabled="disabled"></td>
							</tr>
							<tr>
								<th>수강신청한 강좌</th>
								<td><input type="text" id="clId" name="clId"
									value="${member.clName}" required="required"
									disabled="disabled"></td>
							</tr>
						</table>
					</div>
					<div>
						<button type="submit">수정</button>
					</div>
				</form>
			</c:if>
		</div>
	</div>
	<br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>
</body>
</html>