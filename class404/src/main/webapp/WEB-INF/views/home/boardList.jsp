<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>공지사항</title>
</head>
<body>
<div align="center">
	<div>
		<table>
			<tr>
				<th>순번</th>
				<th>작성자</th>
				<th>제목</th>
				<th>작성일자</th>
				<th>댓글수</th>
			</tr>
		<c:forEach var="list" items="${list}">
				<tr>
					<td>${ list.bId }</td>
					<td>${ list.bWriter }</td>
					<td>${ list.bTitle }</td>
					<td>${ list.bDate }</td>
					<td>${ list.bHit }</td>
				</tr>
			</c:forEach>			
		</table>
	</div>
</div>
</body>
</html>