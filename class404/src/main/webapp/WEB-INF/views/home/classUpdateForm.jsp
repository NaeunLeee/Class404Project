<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>강좌 수정</title>
</head>
<body>
	<div align="center">
		<form id="frm" name="frm" action="classUpdate.do" method="post">
			<table>
				<tr>
					<th align="center" width="100" bgcolor="f2f2f2">강좌명</th>
					<td width="70"><input type="text" id="clName" name="clName"
						value="${list.clName}" placeholder value required></td>
					<th align="center" width="100" bgcolor="f2f2f2">날 짜</th>
					<td width="150" ><input type="date"
						value="${list.clDate}" min="2021-07-01" max="2021-12-31"
						id="clDate" name="clDate" placeholder value required></td>
				</tr>
				<tr>
					<th align="center" width="70" bgcolor="f2f2f2">장 소</th>
					<td width="150" align="center"><input type="text" id="clPlace"
						name="clPlace" value="${list.clPlace}" placeholder value required></td>
					<th align="center" width="70" bgcolor="f2f2f2">최대인원</th>
					<td width="70"><input type="number" id="clMax" name="clMax"
						value="${list.clMax}" placeholder value required></td>
				</tr>
				<tr>
					<td colspan="4"><textarea rows="5" cols="110">${list.clDetail}</textarea>
					</td>
				</tr>
			</table>
		<div>
			<button type="submit">수 정</button>
			&nbsp;
			<button type="button" onclick="location.href='classDelete.do'">삭
				제</button>
		</div>
		</form>
	</div>
</body>
</html>