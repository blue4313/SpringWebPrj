<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page isErrorPage="true" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>에러발생</title>
</head>
<body>
	요청처리과정에서 에러가 발생하였습니다. <br>
	빠른시간내에 문제를 해결하도록 하겠습니다.
	<p>
	에러 타입 : <%=exception.getClass().getName() %> <br>
	에러 메시지 : <%=exception.getMessage() %> <br>
	<hr>
	<a href="${pageContext.request.contextPath}">Home</a>
</body>
</html>