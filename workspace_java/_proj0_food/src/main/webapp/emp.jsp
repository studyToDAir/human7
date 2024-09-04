<%@ page 
	language="java" 
	contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="java.util.List"
    %>
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
<%
// java 주석
System.out.println("사실 java");

List list2 = (List)request.getAttribute("empList");

for(int i=0; i <list2.size(); i++) {
	
//	out.write( list2.get(i)+"<br>" );
	
%>
	
	<span>이름 : <%= list2.get(i) %></span><br>
	
<%
}
// response.getWriter().println(list2);
out.println(request.getAttribute("empList"));
%>
<hr>
<%= request.getAttribute("empList") %>
<hr>
오늘2024-09-04 연습 파트
<hr>
${empList }
<hr>
${empList[0] }
<hr>
<c:forEach var="str" items="${empList }">
	<c:if test="${str != 'KING' }">
		${str }<br>
	</c:if>
</c:forEach>
<hr>
<form method="post" action="emp2">
	empno : <input type="text" name="empno"><br>
	ename : <input type="text" name="ename"><br>
	<br>
	<input type="submit" value="수정">
</form>

<script>
	console.log(123)
</script>
</body>
</html>