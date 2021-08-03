<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Editorial by HTML5 UP</title>
<meta charset="utf-8" />
<meta name="viewport"
	content="width=device-width, initial-scale=1, user-scalable=no" />
<link rel="stylesheet" href="assets/css/main.css" />
<link href="https://fonts.googleapis.com/css?family=Nanum+Gothic:400,700,800&amp;subset=korean" rel="stylesheet">
</head>
<body class="is-preload">

	<!-- Wrapper -->
	<div id="wrapper">

		<!-- Main -->
		<div id="main">
			<div class="inner">
			<c:if test="${not empty name}">
				<br>
				<h3>${name}님, 환영합니다.</h3>
				<br>
			</c:if>
			<c:if test="${empty name}">
				<br>
			</c:if>
				<!-- Banner -->
				<section id="banner">
					<div class="content">
						<header>
							<h1>
								배우며 함께 성장하는<br> Class 404 입니다
							</h1>
							<p>Established by &nbsp;&nbsp; Lee naeun, Kwon sumin</p>
						</header>
						<p>클래스 404는 모든 사람이 사랑하는 일을 하며 살 수 있도록 세상을 바꾸고자 합니다.
						다양한 콘텐츠로 자신만의 취미에 맞는 클래스를 선택하여 맞춤식 강좌를 들으실 수 있습니다.
						프로못지 않은 다양한 강사진들의 경력과 노하우를 강좌에서 아낌없이 배울실 수 있습니다!
						</p>

						
						<ul class="actions">
							<li><a href="classList.do" class="button big">Learn More</a></li>
						</ul>
					</div>
					<span class="image object"> <img src="images/logo.png"
						alt="" />
					</span>
				</section>

				<!-- Section -->
				<section>
					<header class="major">
						<h2>인기 강좌</h2>
					</header>
					<div class="posts">
						<article>
							<a href="#" class="image"><img src="images/pic01.jpg" alt="" /></a>
							<h3>일러스트 입문</h3>
							<p>시선을 사로잡는 마법의 색, 앤디와 함께하는 캐릭터 일러스트 입문</p>
							<ul class="actions">
								<li><a href="classList.do" class="button">More</a></li>
							</ul>
						</article>
						<article>
							<a href="#" class="image"><img src="images/pic02.jpg" alt="" /></a>
							<h3>레진 아트 초급</h3>
							<p>내 공간을 빛내줄 '레진 인테리어 소품' 만들기</p>
							<ul class="actions">
								<li><a href="classList.do" class="button">More</a></li>
							</ul>
						</article>
						<article>
							<a href="#" class="image"><img src="images/pic03.jpg" alt="" /></a>
							<h3>PPT 활용 고급</h3>
							<p>내일 당장 실무에 써먹는 상위 1% 광고인의 PPT 신공</p>
							<ul class="actions">
								<li><a href="classList.do" class="button">More</a></li>
							</ul>
						</article>
						<article>
							<a href="#" class="image"><img src="images/pic04.jpg" alt="" /></a>
							<h3>라이트룸 입문</h3>
							<p>사진 입문자를 위한 쉽게 배우고 빨리 써먹는 사진과 라이트룸</p>
							<ul class="actions">
								<li><a href="classList.do" class="button">More</a></li>
							</ul>
						</article>
						<article>
							<a href="#" class="image"><img src="images/pic05.jpg" alt="" /></a>
							<h3>직장인 요리교실</h3>
							<p>혼자서도 잘해요! 예담쉐프와 함께하는 직장인 혼밥 요리교실</p>
							<ul class="actions">
								<li><a href="classList.do" class="button">More</a></li>
							</ul>
						</article>
						<article>
							<a href="#" class="image"><img src="images/pic06.jpg" alt="" /></a>
							<h3>영어 고급 회화 기술</h3>
							<p>220문장으로 토익부터 회화까지! 비즈니스 영어 완성</p>
							<ul class="actions">
								<li><a href="classList.do" class="button">More</a></li>
							</ul>
						</article>
					</div>
				</section>


				<!-- Section -->
				<section>
					<header class="major">
						<h2>Class 404 철학</h2>
					</header>
					<div class="features">
						<article>
							<span class="icon fa-gem"></span>
							<div class="content">
								<h3>일 잘하는 사람의 경험을 공유하세요</h3>
								<p>현업에 도움되는 스킬부터 마인드셋까지 직무교육도 온라인으로 트렌디하게</p>
							</div>
						</article>
						<article>
							<span class="icon solid fa-paper-plane"></span>
							<div class="content">
								<h3>개인의 성장이 곧 회사의 성장입니다</h3>
								<p>자신이 관심있는 분야를 언제 어디서나 스스로 탐구하고 경험할 수 있도록</p>
							</div>
						</article>
						<article>
							<span class="icon solid fa-rocket"></span>
							<div class="content">
								<h3>업무의 창의성은 딴짓에서 시작합니다</h3>
								<p>말랑말랑한 조직문화를 위해 구성원이 함께 즐길 수 있는 콘텐츠로</p>
							</div>
						</article>
						<article>
							<span class="icon solid fa-signal"></span>
							<div class="content">
								<h3>구성원들은 자유롭게 선택해요</h3>
								<p>원하는 클래스를 무제한 수강해요. 앱과 웹으로 원할때 어디서나 즐겨요. 온라인으로 편하게 질문해요.</p>
							</div>
						</article>
					</div>
				</section>



			</div>
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