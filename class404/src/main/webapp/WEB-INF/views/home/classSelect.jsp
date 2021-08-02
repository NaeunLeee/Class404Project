<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>클래스 상세보기</title>
<script>
	function getId(n) {
		frm.clId.value = n;
		frm.submit();
	}
</script>
</head>
<body>
	<div align="center">
		<div>
			<table>
				<tr align="center">
					<th width="100" bgcolor="f2f2f2">강좌번호</th>
					<td width="70">${list.clId}</td>
					<th width="100" bgcolor="f2f2f2">강 좌</th>
					<td colspan="3" width="500">${list.clName}</td>
					<th width="100" bgcolor="f2f2f2">날 짜</th>
					<td width="150" align="center">${list.clDate}</td>
				</tr>
				<tr align="center">
					<th width="100" bgcolor="f2f2f2">강 사</th>
					<td width="150" align="center">${list.clTeacher}</td>
					<th width="70" bgcolor="f2f2f2">장 소</th>
					<td width="150" align="center">${list.clPlace}</td>
					<th width="70" bgcolor="f2f2f2">최대인원</th>
					<td width="70">${list.clMax}</td>
					<th width="70" bgcolor="f2f2f2">현재인원</th>
					<td width="70">${list.clStudent}</td>
				</tr>
				<tr>
					<td colspan="8"><textarea rows="5" cols="110" disabled>${list.clDetail}</textarea>
					</td>
				</tr>
			</table>
		</div>
		<div>
			<button onclick="getId('${list.clId}')">수강신청</button>
			&nbsp;&nbsp;
			<button onclick="location.href='classList.do'">목록</button>
			&nbsp;&nbsp;
			<button onclick="location.href='home.do'">홈</button>
			<form id="frm" name="frm" action="classApplyConfirm.do" method="post">
				<input type="hidden" id="clId" name="clId"><br>
			</form>
		</div>
	</div>


</body>
</html>