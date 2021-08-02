<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>강사신청목록</title>
</head>
<body>
<body class="is-preload">

	<!-- Wrapper -->
	<div id="wrapper">
		<!-- Main -->
		<div id="main">
			<div class="inner">

				<!-- Content -->
				<section>
					<h3 align="left">강사신청</h3>
					<table border="1">
						<tr>
							<th>아이디</th>
							<th>강사이름</th>
							<th>강좌분야</th>
							<th>신청일</th>
						</tr>
						<c:forEach var="list" items="${list}">
							<tr onmouseover="this.style.background='#f2f2f2'"
								onmouseout="this.style.background='white'"
								onclick="getRecord('${list.id}')">
								<td>${list.id}</td>
								<td>${list.name}</td>
								<td>${list.field}</td>
								<td>${list.tDate}</td>
							</tr>
						</c:forEach>
					</table>

				</section>



			</div>
		</div>

		<!-- Scripts -->
		<script src="assets/js/jquery.min.js"></script>
		<script src="assets/js/browser.min.js"></script>
		<script src="assets/js/breakpoints.min.js"></script>
		<script src="assets/js/util.js"></script>
		<script src="assets/js/main.js"></script>
	</div>
</body>
</html>