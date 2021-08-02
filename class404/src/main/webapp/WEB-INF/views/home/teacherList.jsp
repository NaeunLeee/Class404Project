<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<script>
	function getRecord(n) {
		frm.id.value = n;
		frm.submit();
	}
</script>
</head>
<body>
<body>
	<h4>강사신청</h4>
	<c:if test="${ author == 'ADMIN' }">
	<div>
		<table>
			<tr>
				<th>아이디</th>
				<th>강사이름</th>
				<th>강좌분야</th>
				<th>신청일</th>
			</tr>
			<c:forEach var="list" items="${list}">
				<tr onmouseover="this.style.background='#f2f2f2'"
					onmouseout="this.style.background='white'"
					onclick="getRecord('${list.id}')">
					<td>${list.id}</td>
					<td>${list.name}</td>
					<td>${list.field}</td>
					<td>${list.tDate}</td>
				</tr>
			</c:forEach>
		</table>
		<div>
			<form id="frm" action="teacherSelect.do" method="post">
				<input type="hidden" id="id" name="id">
			</form>
		</div>
	</div>
	</c:if>
	<br>
	<div>
		<button type="button" onclick="location.href='teacherAdd.do'">신청등록</button>
	</div>
</body>
</html>