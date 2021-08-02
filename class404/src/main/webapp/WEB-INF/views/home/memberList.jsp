<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 리스트</title>
<script>
	function getRecord(n) {
		frm.id.value = n;
		frm.submit();
	}
</script>
</head>
<body>
	<div align="center">
		<h3>회원 목록</h3>
		<div>
			<table>
				<tr>
					<th>아이디</th>
					<th>이 름</th>
					<th>나 이</th>
					<th>권 한</th>
					<th></th>
				</tr>
				<c:forEach var="list" items="${list}">
					<tr>
						<td>${list.id}</td>
						<td>${list.name}</td>
						<td>${list.age}</td>
						<td>${list.author}</td>
						<td><button onclick="getRecord('${list.id}')">수정</button></td>
					</tr>
				</c:forEach>
			</table>
				<form id="frm" name="frm" action="memberUpdateForm.do" method="post">
					<input type="hidden" id="id" name="id">
				</form>
		</div>

	</div>
</body>
</html>