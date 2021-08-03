<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="js/confetti_v2.js"></script>
<style>
	canvas{z-index:10;pointer-events: none;position: fixed;top: 0;transform: scale(1.1);}
</style>
</head>
<body>
<script src="js/confetti_v2.js"></script>
<br><br>
<div class="buttonContainer" align="right">
	<button class="canvasBtn" id="stopButton">Stop Confetti</button>
	&nbsp;<button class="canvasBtn" id="startButton">Drop Confetti</button>
</div>
<canvas id="canvas"></canvas>
<br>
<div align="center">
<h2>회원가입에 성공하였습니다!!</h2>
<a href="loginForm.do">로그인</a>
</div>
</body>
</html>