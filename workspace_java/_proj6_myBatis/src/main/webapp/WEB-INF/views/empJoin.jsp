<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%-- <c:if test="${cmd == "detail" }"> --%>
<!-- <h1>회원상세</h1> -->
<%-- </c:if> --%>

<c:choose>
	<c:when test='${cmd == "detail" }'>
		<h1>회원상세</h1>
	</c:when>
	<c:when test='${cmd == "edit" }'>
		<h1>회원수정</h1>
	</c:when>
	<c:otherwise>
		<h1>회원가입</h1>
	</c:otherwise>
</c:choose>


<form method="post" action="emp0">
	사원번호 :
	 	<c:choose>
			<c:when test='${ (cmd == "detail") or (cmd == "edit") }'>
				${empDTO.empno }
			</c:when>
			<c:otherwise>
				<input type="text" name="empno">
			</c:otherwise>
		</c:choose>
	<br>
	ename : 
		<c:choose>
			<c:when test='${cmd == "detail" }'>
				<span id="ename">${empDTO.ename }</span>
			</c:when>
			<c:when test='${cmd == "edit" }'>
				<input type="text" name="ename" value="${empDTO.ename }">
			</c:when>
			<c:otherwise>
				<input type="text" name="ename">
			</c:otherwise>
		</c:choose>
	<br>
	hireDate :
		<c:choose>
			<c:when test='${cmd == "detail" }'>
				${empDTO.hireDate }
			</c:when>
			<c:when test='${cmd == "edit" }'>
				<input type="date" name="hireDate" value="${empDTO.hireDate }">
			</c:when>
			<c:otherwise>
				<input type="date" name="hireDate">
			</c:otherwise>
		</c:choose>
	<br>
		<c:choose>
			<c:when test='${cmd == "detail" }'>
				<a href="emp0?cmd=edit&empno=${empDTO.empno }">수정하기</a>
			</c:when>
			<c:when test='${cmd == "edit" }'>
				<a href="emp0?cmd=detail&empno=${empDTO.empno }">취소</a>
				
				<input type="hidden" name="cmd" value="edit">
				<input type="hidden" name="empno" value="${empDTO.empno }">
				<input type="submit" value="수정하기">
			</c:when>
			<c:otherwise>
				<input type="submit" value="가입하기">
			</c:otherwise>
		</c:choose>
	
</form>

</body>
</html>