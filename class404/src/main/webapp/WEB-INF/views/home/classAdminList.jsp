<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>관리자 강좌관리</title>
<script>
	function getRecord(n) {
		frm.clId.value = n;
		frm.submit();
	}
</script>
</head>
<body>
	<div align="center">
		<div>
			<h2>클래스 404</h2>
		</div>
		<div>
			<table border="1" class="bodys">
				<thead>
					<tr>
						<th>강좌번호</th>
						<th>강좌</th>
						<th>강사</th>
						<th>날짜</th>
					</tr>
				</thead>
				<c:forEach var="list" items="${list}">
					<tr onmouseover="this.style.background='lightpink'"
						onmouseout="this.style.background='white'"
						onclick="getRecord('${list.clId}')">
						<td>${list.clId}</td>
						<td>${list.clName}</td>
						<td>${list.clTeacher}</td>
						<td>${list.clDate}</td>
					</tr>
				</c:forEach>
			</table>
		</div>
		<div>
			<form id="frm" action="classAdminSelect.do" method="post">
				<input type="hidden" id="clId" name="clId">
			</form>
		</div>
	</div>
	<br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>
</body>
</html>