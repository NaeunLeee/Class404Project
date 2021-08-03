<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<title>Editorial by HTML5 UP</title>
<meta charset="utf-8" />
<meta name="viewport"
	content="width=device-width, initial-scale=1, user-scalable=no" />
<link rel="stylesheet" href="assets/css/main.css" />
<script type="text/javascript">
	funtion getFrm(n){
		frm.id.value = n; // 선택한 행을 넘겨주는 동작부분
		frm.submit();
	}
</script>
</head>
<body>
	<!-- Header -->
	<header id="header">
		<a href="home.do" class="logo"><strong>&nbsp;&nbsp;Home</strong></a>
		<a style="text-decoration-line: none;" href="home.do">
		<img class="classLogo" src="images/classlogo.jpg" alt="AVATAR">
		</a>
		<ul class="icons">
			<c:if test="${ empty name }">
				<li><a href="loginForm.do" class="brands"><span class="label">로그인</span></a></li>
				<li><a href="signupForm.do" class="brands"><span class="label">회원가입</span></a></li>
			</c:if>
			<c:if test="${ not empty name }">
			<li><a href="myPage.do" class="brands"><span class="label">My Page</span></a></li>
				<li><a href="logout.do" class="brands"><span class="label">로그아웃</span></a></li>
			</c:if>
			<li><a href="https://twitter.com/?lang=ko" class="icon brands fa-twitter"><span class="label">Twitter</span></a></li>
			<li><a href="https://ko-kr.facebook.com/" class="icon brands fa-facebook-f"><span class="label">Facebook</span></a></li>
			<li><a href="https://www.instagram.com/" class="icon brands fa-instagram"><span class="label">Instagram</span></a></li>
		</ul>
	</header>
</body>
</html>