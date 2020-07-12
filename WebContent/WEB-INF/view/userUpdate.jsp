<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>사용자 수정</title>
</head>
<body>
	<h2>사용자 수정</h2>
	<form method="post" action="updateUser.do">
		<table>
			<tbody>
				<tr>
					<td>아이디 : </td>
					<td>
						${map.user.userId}
						<input type="hidden" name="userId" value="${map.user.userId}" />
					</td>
				</tr>
				<tr>
					<td>이름 : </td>
					<td><input type="text" name="name"  value="${map.user.name}" /></td>
				</tr>
				<tr>
					<td>성별 : </td>
					<td>
						<c:forEach var="genderName" items="${map.genderList}">
							<input type="radio" name="gender" value="${genderName}" <c:if test="${genderName eq map.user.gender}">checked</c:if> /> ${genderName}
						</c:forEach>
					</td>
				</tr>
				<tr>
					<td>거주지 : </td>
					<td>
						<select name="city">
							<c:forEach var="cityName" items="${map.cityList}">
								<option value="${cityName}" <c:if test="${cityName eq map.user.city}">selected</c:if>>${cityName}</option>
							</c:forEach>
						</select>
					</td>
				</tr>
				<tr>
					<td colspan="2">
						<input type="submit" value="수정" />
					</td>
				</tr>
				<tr>
					<td colspan="2">
						<a href="getUserList.do">목록으로</a>
					</td>
				</tr>
			</tbody>
		</table>
	</form>
	
	
</body>
</html>