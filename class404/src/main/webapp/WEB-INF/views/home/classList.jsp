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
					<tr>
						<td>${ list.clId }</td>
						<td>${ list.clName }</td>
						<td>${ list.clTeacher }</td>
						<td>${ list.clDate }</td>
						<td>${ list.clPlace }</td>
						<td>${ list.clMax }</td>
					</tr>
				</c:forEach>
			</table>
		</div>
	</div>
</body>
</html>