<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인 폼</title>
</head>
<body>
	<div align="center">
		<div><h1>로그인폼입니다!!!</h1></div>
		<div>
			<form id="frm" name = "frm" action="loginForm.do" method="post">
				<table  border="1" rules="all">
					<tr>
						<th>아 이 디</th>
						<td>
							<input type="text" id="id" name="id" placeholder="아이디를 입력하세요"> 						
						</td>
					</tr>
					<tr>
						<th>패스워드</th>
						<td>
							<input type="password" id="password" name="password" placeholder="비밀번호를 입력하세요"> 						
						</td>
					</tr>
				</table>
				<br>
				<div>
					<button type="submit">로그인</button>
				</div>
			</form>
		</div>		
	</div>
</body>
</html>