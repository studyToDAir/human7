<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!--
	action의 기본값 : 내 주소
	method의 기본값 : get 
 -->
<form action="calcResult.jsp">
	<input type="number" name="num1">
	<input type="number" name="num2">
	<button type="submit">SEND</button>
</form>

<form action="calcResult.jsp" method="post">
	<input type="number" name="num1">
	<input type="number" name="num2">
	<button type="submit">SEND-post</button>
</form>

</body>
</html>