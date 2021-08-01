<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>클래스 상세보기</title>
</head>
<body>
	<div>
		수강번호 : ${list.clId}<br>
		강좌 : ${list.clName}<br>
		강사 : ${list.clTeacher}<br>
		
		<form id="frm" name="frm" action="classApplyConfirm.do" method="post">
			<input type="submit" value="수강신청"><br>
			<a href="home.do">홈으로</a>
		</form>
	</div>
</body>
</html>