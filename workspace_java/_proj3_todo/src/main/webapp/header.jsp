<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
header div {
	display: inline-block;
	border: 1px solid black;
}
</style>
</head>
<body>
<header>
	<div>
		로고
	</div>
	<div>
		메뉴1, 메뉴2
	</div>
	<div>
		${param.id }님
	</div>
</header>
</body>
</html>