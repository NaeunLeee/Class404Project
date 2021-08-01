<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>공지사항</title>
</head>
<script> 
	function getRecord(n) { 
		frm.bId.value = n;
		frm.submit(); 
	} 
</script>
<body>
	<div align="center">
	<h2>공 지 사 항</h2>
		<br>
		<div>
			<c:if test="${ empty name }">
				<a href="loginForm.do">로그인/회원가입</a>
			</c:if>
			<c:if test="${ not empty name }">
				<table>
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
			</c:if>
		</div>
		<div>
			<form id="frm" action="boardSelect.do" method="post">
				<input type="hidden" id="bId" name="bId">
			</form>
		</div>
	</div>
</body>
</html>