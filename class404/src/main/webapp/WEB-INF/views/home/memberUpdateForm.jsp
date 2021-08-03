<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 정보 수정 폼</title>
</head>
<body>
	<div align="center">
		<div>
			<h3>회원 정보 수정</h3>
		</div>
		<form id="frm" name="frm" action="memberUpdate.do" method="post">
			<table>
				<tr>
					<th bgcolor="f2f2f2">아 이 디</th>
					<td><input type="text" id="id" name="id" value="${member.id}"
						placeholder value required></td>
				</tr>
				<tr>
					<th bgcolor="f2f2f2">이 름</th>
					<td><input type="text" id="name" name="name"
						value="${member.name}" placeholder value required></td>
				</tr>
				<tr>
					<th bgcolor="f2f2f2">나 이</th>
					<td><input type="text" id="age" name="age"
						value="${member.age}" placeholder value required></td>
				</tr>
				<tr>
					<th bgcolor="f2f2f2">권 한</th>
					<td><select id="author" name="author">
							<option value="USER" selected="selected">USER</option>
							<option value="TEACHER">TEACHER</option>
					</select></td>
				</tr>
			</table>
			<div>
				<input type="hidden" id="formerId" name="formerId"
					value="${member.id}">
			</div>
			<div>
				<button type="submit">수 정</button>
				&nbsp;&nbsp;
				<button type="button" onclick="location.href='memberList.do'">목
					록</button>
			</div>
		</form>
	</div>
</body>
</html>