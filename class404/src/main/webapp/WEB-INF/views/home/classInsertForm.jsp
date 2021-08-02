<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>강좌 등록</title>
</head>
<body>
	<div>
		<div align="center">
			<h3>강좌 등록</h3>
		</div>
		<form id="frm" name="frm" action="classInsert.do" method="post">
			<div>
				<label for="clName">강좌명</label> <input type="text" id="clName"
					name="clName" placeholder value required>
			</div>
			<br>
			<div>
				<label for="clDate">날 짜</label> <input type="date"
					value="2021-08-03" min="2021-07-01" max="2021-12-31" id="clDate"
					name="clDate" placeholder value required>
			</div>
			<br>
			<div>
				<label for="clPlace">장 소</label> <input type="text" id="clPlace"
					name="clPlace" placeholder value required>
			</div>
			<br>
			<div>
				<label for="clMax">최대인원</label> <input type="number" id="clMax"
					name="clMax" placeholder value required>
			</div>
			<br>
			<div>
				<button type="submit">등 록</button>
			</div>
		</form>
	</div>
</body>
</html>