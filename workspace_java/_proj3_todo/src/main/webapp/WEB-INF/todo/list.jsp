<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>List Page</h1>
	
	${ list1 }
	<hr>
	${ list1[0] }
	<hr>
	${ list1[0].title }
	<hr>
	${ list1[0]["title"] }
	<hr>
	123${null }456
	<hr>
	<style>
		div {
			border: 1px solid red;
			padding: 10px;
			margin: 10px;
		}
	</style>
	<c:forEach var="a" items="${list1 }">
		<div>
			제목2 : <a href="/_proj3_todo/todo/read?tno=${a.tno }">${ a.title }</a>, 시간 : ${a.dueDate }
		</div>
	</c:forEach>
</body>
</html>