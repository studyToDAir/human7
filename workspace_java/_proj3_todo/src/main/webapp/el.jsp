<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	\${ 10 + 1 } : ${ 10 + 1 }<br>
	\${ "10" + 1 } : ${ "10" + 1 } : el은 계산할때 문자를 숫자로 바꿔서 계산한다
	<br>
<%-- 	\${ "a" + 1 } : ${ "a" + 1 }<br> --%>
<%-- 	\${ "a" + "b" } : ${ "a" + "b" }<br> --%>
	\${ "a" += 1 } : ${ "a" += 1 }<br>
	\${ null + 1 } : ${ null + 1 }<br>
	
	\${ 10 / 3 } : ${ 10 / 3 }<br>
	\${ 10 div 3 } : ${ 10 div 3 }<br>
	
	\${ 10 % 3 } : ${ 10 % 3 }<br>
	\${ 10 mod 3 } : ${ 10 mod 3 }<br>
	<hr>
	\${ 10 == 10 } : ${ 10 == 10 }<br>
	\${ "10" == "10" } : ${ "10" == "10" }<br>
	\${ "10" eq "10" } : ${ "10" eq "10" }<br>

	\${ 10 != 10 } : ${ 10 != 10 }<br>
	\${ 10 ne 10 } : ${ 10 ne 10 }<br>
	
	\${ 100 > 10 } : ${ 100 > 10 }<br>
	\${ 100 gt 10 } : ${ 100 gt 10 }<br>
	\${ "bc" gt "ba" } : ${ "bc" gt "ba" }<br>
	
	\${ 100 < 10 } : ${ 100 < 10 }<br>
	\${ 100 lt 10 } : ${ 100 lt 10 }<br>
	
	\${ 100 >= 10 } : ${ 100 >= 10 }<br>
	\${ 100 ge 10 } : ${ 100 ge 10 }<br>

	\${ 100 <= 10 } : ${ 100 <= 10 }<br>
	\${ 100 le 10 } : ${ 100 le 10 }<br>
	
	\${ (100 gt 10) eq "true"  } : ${ (100 gt 10) eq "true"  }
<hr>
	\${ (100 gt 10) && (100 gt 10) } : ${ (100 gt 10) && (100 gt 10) }<br>
	\${ (100 gt 10) and (100 gt 10) } : ${ (100 gt 10) and (100 gt 10) }<br>
	
	\${ (100 gt 10) || (100 gt 10) } : ${ (100 gt 10) || (100 gt 10) }<br>
	\${ (100 gt 10) or (100 gt 10) } : ${ (100 gt 10) or (100 gt 10) }<br>
	
	\${ !(100 gt 10) } : ${ !(100 gt 10) }<br>
	\${ not(100 gt 10) } : ${ not(100 gt 10) }<br>
<hr>
	출력할 꺼리가 <strong>있으면</strong> empty는 false<br>
	출력할 꺼리가 <strong>없으면</strong> empty는 true<br>
	\${ empty "글씨" } : ${ empty "글씨" }<br>
	\${ empty null } : ${ empty null }<br>
	\${ empty "" } : ${ empty "" }<br>
<hr>
	\${ param.a } : ${ param.a }<br>
	\${ paramValues.a } : ${ paramValues.a }<br>
	\${ paramValues.a[0] } : ${ paramValues.a[0] }<br>
	\${ paramValues.a[1] } : ${ paramValues.a[1] }<br>
	\${ paramValues.a[100] } : ${ paramValues.a[100] }<br>
</body>
</html>


















