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
		<br>
			<h3>새 글 작성</h3>
		</div>
		<div>
			<form id="frm" name="frm" action="insertBoard.do" method="post">
				<div>
					<table border="1" rules="all" class="bodys">
						<tr>
							<th width="100" bgcolor="f2f2f2">작성자</th>
							<td width="200">
							<input type="text" id="bWriter"	name="bWriter" required="required" placeholder="작성자 입력"></td>
							<th width="100" bgcolor="f2f2f2">작성일자</th>
							<td width="150">
							<input type="date" id="bDate" name="bDate">
							</td>
						</tr>
						<tr>
							<th width="100" bgcolor="f2f2f2" >글제목</th>
							<td colspan="3"><input type="text" id="bTitle" size="60"
								name="bTitle" required="required" placeholder="제목을 입력하세요"></td>
						</tr>
						<tr>
							<th width="100" bgcolor="f2f2f2">내 용</th>
							<td colspan="3"><textarea rows="7" cols="65" id="bContent"
									name="bContent" required="required" placeholder="내용을 입력하세요.."></textarea></td>
						</tr>
					</table>
				</div>
				<br />
				<div>
					<button type="submit" >등록</button>
					&nbsp;&nbsp;
					<button type="reset">취소</button>
					&nbsp;&nbsp;
					<button type="button" onclick="location.href='boardList.do'">목록</button>
				</div>
			</form>
		</div>
	</div>
</body>
</html>