<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>수강신청</title>
<script src="js/confetti_v2.js"></script>
<style>
	canvas{z-index:10;pointer-events: none;position: fixed;top: 0;transform: scale(1.1);}
</style>
</head>
<body>
<br><br>
<div class="buttonContainer" align="right">
	<button class="canvasBtn" id="stopButton">Stop Confetti</button>
	&nbsp;<button class="canvasBtn" id="startButton">Drop Confetti</button>
</div>
<canvas id="canvas"></canvas>
<br>
<div align="center">
		<h3>${message}</h3>
		<br> <a href="home.do">홈으로</a>
	</div>
	<br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>
</body>
</html>