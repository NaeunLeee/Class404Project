<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	canvas{z-index:10;pointer-events: none;position: fixed;top: 0;transform: scale(1.1);}
</style>
</head>
<body>
<script src="js/confetti_v2.js"></script>
<div class="buttonContainer" align="right">
	<button class="canvasBtn" id="stopButton">Stop Confetti</button>
	&nbsp;<button class="canvasBtn" id="startButton">Drop Confetti</button>
</div>

<canvas id="canvas"></canvas>
<h3>회원가입에 성공하였습니다!!</h3>

<script>
$(document).ready(function(){  
  //티스토리 공감버튼 이벤트
  function reAction(){
  	// $("#startButton").trigger("click");
  	setTimeout(function(){
  	},6000);
  }
  
 // $(".uoc-icon").on('click', function(){
      reAction();
 // }); 
});
</script>
</body>
</html>