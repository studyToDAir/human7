<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1>emp2 사원추가</h1>
<!-- 상대주소인 join을 사용했을때 주소가 어떻게 되는지 확인 필요 -->
<!-- 절대주소로 바꾼다면 어떻게 적어야 하는가? -->
<form method="post" action="join">
	empno : <input type="text" name="empno"><br>
	ename : <input type="text" name="ename"><br>
	sal : <input type="text" name="sal"><br>
	deptno : <input type="text" name="deptno"><br>
	<input type="submit" value="추가">
</form>


</body>
</html>