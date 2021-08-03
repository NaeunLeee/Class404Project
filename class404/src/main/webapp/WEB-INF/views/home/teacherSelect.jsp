<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script>
	function getRecord(n ,e) {
		frm.id.value = n;
		frm.name.value = e;
		frm.submit();
	}
</script>
</head>
<body>
<div align="center">
		<div><h3>신청 상세보기</h3></div>
		<div>
			<table class="bodys">
				<tr>
					<th width="100" bgcolor="f2f2f2">아이디</th>
					<td width="70" align="center">${ vo.id } </td>
					<th width="100" bgcolor="f2f2f2">강사이름</th>
					<td width="150" align="center">${ vo.name }</td>
					<th width="100" bgcolor="f2f2f2">신청일자</th>
					<td width="150" align="center">${ vo.tDate }</td>
					<th width="70" bgcolor="f2f2f2">강좌분야</th>
					<td width="100" align="center">${ vo.field }</td>
				</tr>
				<tr>
					<th width="100" bgcolor="f2f2f2">자격증</th>
					<td colspan="7">${ vo.license }</td>
				</tr>
				<tr>
					<th width="100" bgcolor="f2f2f2">경력사항</th>
					<td colspan="7">
					<textarea rows="5" cols="110" disabled>${ vo.career }</textarea></td>
				</tr>
			</table>
		</div>
		<br />
		<div>
			<button type="button" onclick="location.href='teacherList.do'">목록</button>&nbsp;&nbsp;
			<button type="button" onclick="getRecord('${ vo.id }','${ vo.name }')">권한부여</button>
		</div>
		<div>
			<form id="frm" name="frm" action="authorUpdate.do" method="post">
				<input type="hidden" id="id" name="id" >
				<input type="hidden" id="name" name="name" >
			</form>
			
		</div>
	</div>
</body>
</html>