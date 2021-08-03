<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>공지사항</title>
<meta name="viewport"
	content="width=device-width, initial-scale=1, user-scalable=no" />
<link rel="stylesheet" href="assets/css/main.css" />
<link href="https://fonts.googleapis.com/css?family=Nanum+Gothic:400,700,800&amp;subset=korean" rel="stylesheet">
</head>
<script>
	function getRecord(n) {
		frm.bId.value = n;
		frm.submit();
	}
</script>
<body>
	<div align="center">
	<br>
		<h2>공 지 사 항</h2>
		<div>
			<c:if test="${ empty name }">
				<a href="loginForm.do">로그인/회원가입</a>
			</c:if>
			<c:if test="${ not empty name }">
				<table class="bodys">
					<tr>
						<th>순번</th>
						<th>작성자</th>
						<th>제목</th>
						<th>작성일자</th>
						<th>조회수</th>
					</tr>
					<c:forEach var="list" items="${list}">
						<tr onmouseover="this.style.background='lightpink'"
							onmouseout="this.style.background='white'"
							onclick="getRecord('${list.bId}')">
							<td>${ list.bId }</td>
							<td>${ list.bWriter }</td>
							<td>${ list.bTitle }</td>
							<td>${ list.bDate }</td>
							<td>${ list.bHit }</td>
						</tr>
					</c:forEach>
				</table>
				<c:if test="${ author == 'ADMIN' }">
					<div align="right">
						<button type="button" onclick="location.href='boardAdd.do'">글작성</button>
					</div>
				</c:if>
			</c:if>
		</div>
		<div>
			<form id="frm" action="boardSelect.do" method="post">
				<input type="hidden" id="bId" name="bId">
			</form>
		</div>
	</div>
	
	<br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>
	<!-- Scripts -->
	<script src="assets/js/jquery.min.js"></script>
	<script src="assets/js/browser.min.js"></script>
	<script src="assets/js/breakpoints.min.js"></script>
	<script src="assets/js/util.js"></script>
	<script src="assets/js/main.js"></script>
</body>
</html>