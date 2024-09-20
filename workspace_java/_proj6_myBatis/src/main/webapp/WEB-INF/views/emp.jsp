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

<header>
	Logo
	<nav>emp > 회원 목록</nav>
</header>
<main>
	<a href="emp0?cmd=join">회원가입</a>
	<section>
		<article>
		
			<table border="1">
				<caption>회원 목록 표시 : display:none으로 감춰놓자</caption>
				<thead>
					<tr>
						<th>empno</th>
						<th>ename</th>
						<th>sal</th>
						<th>hireDate</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="dto" items="${empList }">
						<tr>
							<td>${dto.empno }</td>
							<td><a href="emp0?cmd=detail&empno=${dto.empno }">${dto.ename }</a></td>
							<td>${dto.sal }</td>
							<td>
								<fmt:formatDate value="${dto.hireDate }" pattern="yyyy년 MM월 dd일 hh시 mm분 ss초" />
							</td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
			
		</article>	
	</section>
</main>
<footer>휴먼</footer>
</body>
</html>