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
</head>
<body>
	<!-- Sidebar -->
	<div id="sidebar">
		<div class="inner">

			<!-- Search -->
			<section id="search" class="alt">
				<form method="post" action="classList.do">
					<input type="text" name="query" id="query" placeholder="Class Search" />
				</form>
			</section>

			<!-- Menu -->
			<nav id="menu">
				<header class="major">
					<h2>Menu</h2>
				</header>
				<ul>
					<li class="listFont"><a href="home.do">홈</a></li>
					<c:if test="${ empty name }">
					<li class="listFont"><a href="loginForm.do">로그인/회원가입</a></li>
					</c:if>
					<c:if test="${ not empty name }">
					<li class="listFont"><a href="logout.do">로그아웃</a></li>
					</c:if>
					<li class="listFont"><a href="boardList.do">공지사항</a></li>
					<li class="listFont"><a href="classList.do">클래스</a></li>
					<c:if test="${ not empty name }">
					<!--  
					<li class="listFont"><a href="classApply.do">수강신청</a></li>
					-->
					<li class="listFont"><a href="teacherList.do">강사신청</a></li>
					</c:if>
 					<c:if test="${ author == 'ADMIN' }">					
						<li class="listFont"><a href="memberList.do">회원관리</a></li>
						<li class="listFont"><a href="classManage.do">강좌관리</a></li>
					</c:if>					
					<c:if test="${ author == 'TEACHER' }">					
						<li class="listFont"><a href="classInsertForm.do">강좌등록</a></li>
						<li class="listFont"><a href="classUpdateForm.do">강좌관리</a></li>
					</c:if>					
				</ul>
			</nav>

			<!-- Section -->
			<section>
				<header class="major">
					<h2>Class 404</h2>
				</header>
				<p>클래스 404는 배움을 나누며 함께 성장하는 세상을 꿈꿉니다.</p>
				<ul class="contact">
					<li class="icon solid fa-envelope"><a href="#">ask@yedam.ac</a></li>
					<li class="icon solid fa-phone">(053) 421-2460</li>
					<li class="icon solid fa-home">대구광역시 중구 국채보상로 537<br />
						Fax:053-356-3939
					</li>
				</ul>
			</section>

			<!-- Footer -->
			<footer id="footer">
				<p class="copyright">
				</p>
			</footer>

		</div>
	</div>

	<!-- Scripts -->
	<script src="assets/js/jquery.min.js"></script>
	<script src="assets/js/browser.min.js"></script>
	<script src="assets/js/breakpoints.min.js"></script>
	<script src="assets/js/util.js"></script>
	<script src="assets/js/main.js"></script>


</body>
</html>