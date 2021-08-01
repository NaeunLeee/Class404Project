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
			<h1>게시글 수정</h1>
		</div>
		<div>
			<form id="frm" name="frm" action="updateBoard.do" method="post">
				<table border="1" rules="all">
					<tr>
						<th width="70" bgcolor="f2f2f2">글번호</th>
						<td width="70" align="center">${ board.bId }</td>
						<th width="100" bgcolor="f2f2f2">작성자</th>
						<td width="150" align="center">${ board.bWriter }</td>
						<th width="100" bgcolor="f2f2f2">작성일자</th>
						<td width="150" align="center">${ board.bDate }</td>
						<th width="70" bgcolor="f2f2f2">조회수</th>
						<td width="70" align="center">${ board.bHit }</td>
					</tr>
					<tr>
						<th width="100" bgcolor="f2f2f2">글제목</th>
						<td colspan="7"><input type="text" id="bTitle" size="60"
							name="bTitle" required="required" value="${ board.bTitle }"></td>
					</tr>
					<tr>
						<th width="100" bgcolor="f2f2f2">내 용</th>
						<td colspan="7"><textarea rows="5" cols="65" id="bContent"
								name="bContent">${ board.bContent }</textarea></td>
						<td><input type="hidden" id="bId" name="bId"
							value="${ board.bId }"></td>
					</tr>
				</table>
				<br />
				<div>
					<button type="button" onclick="location.href='boardList.do'">취소</button>
					&nbsp;&nbsp;
					<button type="submit">수정</button>
				</div>
			</form>
		</div>
	</div>
</body>
</html>