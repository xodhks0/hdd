<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div class="container">
		<table class="table">
			<tr>
				<td>번호</td>
				<td>이름</td>
				<td>아이디</td>
				<td>생성일</td>
			</tr>
			<c:forEach items="${users}" var="user">
				<tr>
				<td>${users.uiNum}</td>
				<td>${users.uiName}</td>
				<td>${users.uiId}</td>
				<td>${users.credat}</td>
				</tr>
			</c:forEach>
		</table>
	</div>
</body>
</html>