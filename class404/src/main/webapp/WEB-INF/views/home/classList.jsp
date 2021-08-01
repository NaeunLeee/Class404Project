<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>클래스 목록</title>
<script>
	function getRecord(n) {
		frm.clId.value = n;
		frm.submit();
	}
	function paragraph_onmouseover() {
		paragraph.style.color="lightpink";
	}
	function paragraph_onmouseout() {
		paragraph.style.color="black";
	}
</script>
</head>
<body>
	<div align="center">
		<div>
			<table border="1">
				<tr>
					<th>강좌번호</th>
					<th>강좌</th>
					<th>강사</th>
					<th>날짜</th>
					<th>장소</th>
					<th>최대인원</th>
				</tr>
				<c:forEach var="list" items="${list}">
					<tr onclick="getRecord(${list.clId})">
						<td>${list.clId}</td>
						<td>${list.clName}</td>
						<td>${list.clTeacher}</td>
						<td>${list.clDate}</td>
						<td>${list.clPlace}</td>
						<td>${list.clMax}</td>
					</tr>
				</c:forEach>
			</table>
		</div>
		<div>
			<form id="frm" action="classSelect.do" method="post">
				<input type="hidden" id="clId" name="clId">
			</form>
		</div>
	</div>
</body>
</html>