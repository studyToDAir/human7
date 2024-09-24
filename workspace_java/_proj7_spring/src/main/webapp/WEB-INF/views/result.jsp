<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
당신이 입력한 내용<br>
<%-- id : ${dto.userID }<br> --%>
<%-- pw : ${dto.userPW } --%>
id : ${memberDTO.userID }<br>
pw : ${memberDTO.userPW }
</body>
</html>