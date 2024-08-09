<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
	
	
</body>
</html>