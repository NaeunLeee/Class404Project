<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>수강신청 폼</title>
</head>
<body>
	<div>
		수강번호 : ${list.clId}<br>
		강좌 : ${list.clName}<br>
		강사 : ${list.clTeacher}<br>
		
		<form id="frm" name="frm" action="classApplyConfirm.do" method="post">
			<button type="submit">수강신청</button>
			<button type="button">홈으로</button>
		</form>
	</div>
</body>
</html>