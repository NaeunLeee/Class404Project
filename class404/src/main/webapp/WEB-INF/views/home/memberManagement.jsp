<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script>
	function getRecord(n) {
		frm.name.value = n;
		frm.submit();
	}
</script>
</head>
<body>
<div align="center">
	<div><h3>회원관리</h3></div>
	<div>
		<table>
			<tr>
				<th>아이디</th>
				<th>이름</th>
				<th>나이</th>
				<th>취미</th>
				<th>권한</th>
				<th></th>
			</tr>
			<c:forEach var="list" items="${list}">
			<tr>
				<td>${list.id}</td>
				<td>${list.name}</td>
				<td>${list.age}</td>
				<td>${list.hobby}</td>
				<td>${list.author}</td>
				<td><button onclick="getRecord('${list.name}')">권한수정</button></td>
			</tr>
			</c:forEach>
		</table>
		<form id="frm" action="memberUpdate.do" method="post">
				<input type="hidden" id="name" name="name">
			</form>
		<div align="right">
			<input type="text" size="50">
			<button>검색</button>
		</div>
	</div>
</div>
</body>
</html>