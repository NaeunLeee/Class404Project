<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>마이페이지</title>
</head>
<body>
	<div align="right">
		<h1>마이페이지</h1>
		<c:if test="${ empty name }">
			로그인 정보가 존재하지 않습니다. <a href="loginForm.do">로그인</a>
		</c:if>
		<c:if test="${ not empty name }">
			${name}, ${id}
		</c:if>
	</div>
</body>
</html>