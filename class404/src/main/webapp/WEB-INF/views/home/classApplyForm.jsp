<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>수강신청 폼</title>
<script>
	function getId(n){
		frm.clId.value = n;
		frm.submit(); 
	}
</script>
</head>
<body>
	<div>
		수강번호 : ${list.clId}<br>
		강좌 : ${list.clName}<br>
		강사 : ${list.clTeacher}<br>
		
		<button onclick="getId('${list.clId}')">수강신청</button>
			<a href="home.do">홈으로</a>
		
		<form id="frm" name="frm" action="classApplyConfirm.do" method="post">
			<input type="hidden" id="clId" name="clId"><br>
		</form>
	</div>
	<br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>
</body>
</html>