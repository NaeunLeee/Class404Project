<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div align="center">
		<div>
			<h3>신청등록</h3>
		</div>
		<div>
			<form id="frm" name="frm" action="teacherInsert.do" method="post">
				<table class="bodys">
					<tr>
						<th width="100" >아이디</th>
						<td width="70" ><input type="text" id="id"
							name="id" required="required" value="${id}"></td>
						<th width="70">강사이름</th>
						<td width="150"><input type="text" id="name"
							name="name" required="required" value="${name}"></td>
						<th width="70" >강좌분야</th>
						<td width="100"><input type="text" id="field"
							name="field" required="required"></td>
					</tr>
					<tr>
						<th width="100" height="50" align="center">자격증</th>
						<td colspan="5"><input type="text" id="license"
							name="license" placeholder="보유한 자격증을 입력하세요 (ex) 정보처리기사 / 210821 취득, .."  ></td>
					</tr>
					<tr>
						<th width="100" >경력사항</th>
						<td colspan="5"><textarea rows="5" cols="110" id="career"
							name="career" placeholder="관련된 경력사항을 입력하세요 (ex) 2021.02.01 ~ 12.01 네이버사 엔지니어팀 근무"></textarea></td>
					</tr>
				</table>
				<br />
				<div>
					<button type="button" onclick="location.href='teacherList.do'">목록</button>
					&nbsp;&nbsp;
					<button type="submit" >등록</button>
				</div>
			</form>
		</div>
	</div>
	<br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>
</body>
</html>