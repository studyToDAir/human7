<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>할일 작성 - 할일 관리</title>
</head>
<body>
<a href="list">목록으로</a><br>
<form method="post" action="modify">

	title : <input type="text" name="title" value="${dto.title }"><br>
	duedate : <input type="date" name="dueDate" value="${dto.dueDate }"><br>
	finished : 
	<c:if test="${dto.finished }">
		<input type="radio" name="finished" value="N"> 미완료
		<input type="radio" name="finished" value="Y" checked="checked"> 완료
	</c:if>

	<c:if test="${not dto.finished }">
		<input type="radio" name="finished" value="N" checked="checked"> 미완료
		<input type="radio" name="finished" value="Y"> 완료
	</c:if>

	<br>
	
	<input type="hidden" name="tno" value="${dto.tno }">
	<input type="submit" value="수정">
</form>

</body>
</html>