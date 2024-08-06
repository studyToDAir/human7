<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h1>num1 : ${      param.num1 }</h1>
	<h1>num2 : ${param.num2 }</h1>

<%-- 	<h1>SUM : ${ param.num1 + param.num2 }</h1> --%>
	${ 100 }<br>
	${ "한글" }<br>
<%-- 	${ 100 + "한글" }<br> --%>
	
</body>
</html>