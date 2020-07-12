<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>사용자 상세정보</title>
</head>
<body>
	<h2>사용자 상세정보</h2>
	<table>
		<tr>
			<td>아이디 : </td>
			<td>${user.userId}</td>
			<th>&nbsp;</th>
		</tr>
		<tr>
			<td>이름 : </td>
			<td>${user.name}</td>
			<th>&nbsp;</th>
		</tr>
		<tr>
			<td>성별 : </td>
			<td>${user.gender}</td>
			<th>&nbsp;</th>
		</tr>
		<tr>
			<td>거지주 : </td>
			<td>${user.city}</td>
			<th>&nbsp;</th>
		</tr>
		<tr>
			<td><a href="updateUserForm.do?id=${user.userId}">수정</a></td>
			<td><a href="deleteUser.do/${user.userId}">삭제</a></td>
			<td><a href="getUserList.do">목록으로</a></td>
		</tr>
	</table>
</body>
</html>