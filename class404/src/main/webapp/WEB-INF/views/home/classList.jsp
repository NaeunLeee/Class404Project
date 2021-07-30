<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>강좌 클래스</title>
</head>
<body>
<div align="center">
	<div><h1>강좌 리스트</h1></div>
	<hr>
	<br/>
	<div>
		<table border="1">
			<tr>
				<th>강좌번호</th>
				<th>강좌</th>
				<th>강좌티쳐</th>
				<th>강좌날짜</th>
				<th>강좌장소</th>
				<th>수강인원</th>
			</tr>
			<c:forEach var="class" items="${list}">
				<tr>
					<td>${ class.clId }</td>
					<td>${ class.clName }</td>
					<td>${ class.clTeacher }</td>
					<td>${ class.clDate }</td>
					<td>${ class.clPlace }</td>
					<td>${ class.clStudent }</td>
				</tr>
			</c:forEach>			
		</table>
	</div>
</div>
</body>
</html>