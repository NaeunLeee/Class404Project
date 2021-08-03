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
				<table>
					<tr>
						<th>강좌명</th>
						<td><input type="text" id="clName" name="clName" placeholder
							value required></td>
					</tr>
					<tr>
						<th>날 짜</th>
						<td><input type="date" value="2021-08-03" min="2021-07-01"
							max="2021-12-31" id="clDate" name="clDate" placeholder value
							required></td>
					</tr>
					<tr>
						<th>장 소</th>
						<td><input type="text" id="clPlace" name="clPlace"
							placeholder value required></td>
					</tr>
					<tr>
						<th>최대인원</th>
						<td><input type="number" id="clMax" name="clMax" placeholder
							value required></td>
					</tr>
					<tr>
						<th>설 명</th>
						<td><textarea rows="10" cols="110" id="clDetail" name="clDetail"></textarea></td>
					</tr>
				</table>
			</div>
			<div align="right">
				<button type="submit">등 록</button>
			</div>
		</form>
	</div>
	<br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>
</body>
</html>