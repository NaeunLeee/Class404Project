<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>강좌 수정</title>
</head>
<body>
	<div>
		<div align="center">강좌 수정</div>
		<form id="frm" name="frm" action="classUpdate.do" method="post">
			<div>
				<label for="clName">강좌 이름</label> <input type="text" id="clName"
					name="clName" value="${list.clName}" placeholder value required>
			</div>
			<div>
				<label for="clDate">날 짜</label> <input type="date"
					value="${list.clDate}" min="2021-07-01" max="2021-12-31" id="clDate"
					name="clDate" placeholder value required>
			</div>
			<div>
				<label for="clPlace">장 소</label> <input type="text" id="clPlace"
					name="clPlace" value="${list.clPlace}" placeholder value required>
			</div>
			<div>
				<label for="clMax">최대인원</label> <input type="number" id="clMax"
					name="clMax" value="${list.clMax}" placeholder value required>
			</div>
			<br>
			<div>
				<button type="submit">수 정</button>&nbsp;
				<button type="button" onclick="location.href='classDelete.do'">삭 제</button>
			</div>
		</form>
	</div>
</body>
</html>