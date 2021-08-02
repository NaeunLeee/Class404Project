<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>수강신청</title>
<script>
	function getId(n) {
		frm.clId.value = n;
		frm.submit();
	}
</script>
</head>
<body>

	<div align="center">
		<div>

			<table border="1">
				<tr>
					<th>강좌 번호</th>
					<th>강좌</th>
					<th>강사</th>
					<th>날짜</th>
					<th>장소</th>
					<th>신청 인원</th>
					<th>최대 인원</th>
					<th></th>
				</tr>
				<c:forEach var="list" items="${list}">
					<tr>
						<td>${ list.clId }</td>
						<td>${ list.clName }</td>
						<td>${ list.clTeacher }</td>
						<td>${ list.clDate }</td>
						<td>${ list.clPlace }</td>
						<td>${ list.clStudent }</td>
						<td>${ list.clMax }</td>
						<td>
							<button onclick="getId('${list.clId}')">수강신청</button>
						</td>
					</tr>
				</c:forEach>
			</table>
			<form id="frm" name="frm" action="classApplyForm.do" method="post">
				<input type="hidden" id="clId" name="clId">
			</form>
		</div>
	</div>
</body>
</html>