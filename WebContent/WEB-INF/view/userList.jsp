<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>사용자 리스트</title>
</head>
<body>
	<h2>사용자 리스트</h2>
	<table>
		<thead>
			<tr>
				<th>아이디</th>
				<th>이름</th>
				<th>성별</th>
				<th>거주지</th>
				<th>&nbsp;</th>
				<th>&nbsp;</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="user" items="${userList}" >
				<tr>
					<td><a href="getUser.do?id=${user.userId}">${user.userId}</a></td>
					<td>${user.name}</td>
					<td>${user.gender}</td>
					<td>${user.city}</td>
					<td><a href="updateUserForm.do?id=${user.userId}">수정</a></td>
					<td><a href="deleteUser.do/${user.userId}">삭제</a></td>
				</tr>
			</c:forEach>
			
			<tr>
				<td colspan="7">
					<a href="insertUserForm.do">사용자 등록</a>
				</td>
			</tr>
		</tbody>
	</table>
</body>
</html>