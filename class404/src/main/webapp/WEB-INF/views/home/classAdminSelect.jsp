<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>강좌 수정 및 삭제</title>
</head>

<body>
	<div align="center">
		<div>
			<h3>강의 수정</h3>
		</div>
		<div>
			<form id="frm" name="frm" action="classAdminUpdate.do" method="post">
				<table class="bodys">
					<tr>
						<th align="center" width="100" bgcolor="f2f2f2">강좌명</th>
						<td width="70"><input type="text" id="clName" name="clName"
							value="${list.clName}"></td>
						<th align="center" width="100" bgcolor="f2f2f2">날 짜</th>
						<td width="150"><input type="date" value="${list.clDate}"
							min="2021-07-01" max="2021-12-31" id="clDate" name="clDate"></td>
					</tr>
					<tr>
						<th align="center" width="70" bgcolor="f2f2f2">장 소</th>
						<td width="150" align="center"><input type="text"
							id="clPlace" name="clPlace" value="${list.clPlace}"></td>
						<th align="center" width="70" bgcolor="f2f2f2">최대인원</th>
						<td width="70"><input type="number" id="clMax" name="clMax"
							value="${list.clMax}"></td>
					</tr>
					<tr>
						<td colspan="4"><textarea rows="5" cols="110" id="clDetail"
								name="clDetail">${list.clDetail}</textarea></td>
					</tr>
				</table>
				<div>
					<button type="submit">수 정</button>
					&nbsp;
					<button type="button" onclick="location.href='classAdminDelete.do'">삭
						제</button>
					&nbsp;
					<button type="button" onclick="location.href='classAdminList.do'">목 록</button>
				</div>
				<div>
					<input type="hidden" id="clId" name="clId" value="${list.clId}">
				</div>
			</form>
		</div>
	</div>
	<br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>
</body>
</html>