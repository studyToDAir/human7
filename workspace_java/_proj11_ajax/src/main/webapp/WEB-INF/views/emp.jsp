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
			<form id="frm" method="get" action="emp0">
				<select name="searchType">
					<option value="1" ${searchType == 1 ? " selected='selected' " : "" } >이름</option>
					<option value="2" ${searchType == 2 ? " selected='selected' " : "" } >직책</option>
					<option value="3" ${searchType == 3 ? " selected='selected' " : "" } >이름+직책</option>
					<option value="4" ${searchType == 4 ? " selected='selected' " : "" } >연봉(이하)</option>
				</select>
				
				<input type="text" name="keyword" placeholder="검색어를 입력하세요" value="${keyword }">
				<input type="submit" value="검색">
			
			
			<input type="hidden" name="orderType" value="${orderType }">
			<table border="1">
				<caption>회원 목록 표시 : display:none으로 감춰놓자</caption>
				<thead>
					<tr>
						<th>선택</th>
						<th id="empno">empno
							<c:if test='${orderType == "desc" }'>↓</c:if>
							<c:if test='${orderType eq "asc" }'>↑</c:if>
						</th>
						<th>ename</th>
						<th>job</th>
						<th>sal</th>
						<th>hireDate</th>
						<th>삭제</th>
					</tr>
				</thead>
				<tbody id="list">
					
				</tbody>
			</table>
			</form>
		</article>	
	</section>
</main>
<footer>휴먼</footer>

<script>

	window.addEventListener("load", function(){
		let url = "listEmp";
		
		const xhr = new XMLHttpRequest();
		xhr.open("get", url);
		xhr.send();
		
		xhr.onload = function(){
			
			console.log(xhr.responseText)
			
			try{
				const empList = JSON.parse(xhr.responseText);
				
				let html = "";
				for(let i=0; i<empList.length; i++){
// 					console.log(empList[i].ename)

// 					html += '<tr>';
// 					html += '	<td>';
// 					html += '		<input type="checkbox" name="check" value="${dto.empno }">';
// 					html += '	</td>';
// 					html += '	<td>'+ empList[i].empno +'</td>';
// 					html += '	<td><a href="emp0?cmd=detail&empno=${dto.empno }">'+ empList[i].ename +'</a></td>';
// 					html += '	<td>${dto.job }</td>';
// 					html += '	<td>${dto.sal }</td>';
// 					html += '	<td>';
// 					html += '		<fmt:formatDate value="${dto.hireDate }" pattern="yyyy년 MM월 dd일 hh시 mm분 ss초" />';
// 					html += '	</td>';
// 					html += '</tr>';
				
				const hiredate = new Date(empList[i].hireDate)
				
				const y = hiredate.getFullYear()
				let m = hiredate.getMonth() + 1
				if(m < 10){
					m = "0" + m
				}
				const d = hiredate.getDate()
				
				html += `
						<tr>
							<td>
								<input type="checkbox" name="check" value="\${empList[i].empno }">
							</td>
							<td>\${empList[i].empno}</td>
							<td><a href="emp0?cmd=detail&empno=\${empList[i].empno }">\${empList[i].ename }</a></td>
							<td>\${empList[i].job}</td>
							<td>\${empList[i].sal}</td>
							<td>
								\${y}년 \${m}월 \${d}일
							</td>
							<td>
								<button type="button" data-empno="\${empList[i].empno }" class="btnDel" id="btn_\${empList[i].empno }">삭제</button>
							</td>
						</tr>
					`;
				
				}
				
				document.querySelector("#list").innerHTML = html;
				
				const delBtnList = document.querySelectorAll("[id^=btn_]")
// 				const delBtnList = document.querySelectorAll(".btnDel")
				for(let btn of delBtnList){
					btn.addEventListener("click", function(event){
// 						console.log(this)
						console.log(event.target)
						
						const id = event.target.getAttribute("id")
						// btn_7788 : substring, split...
						const empno = event.target.getAttribute("data-empno")
						console.log("empno", empno)
						
						url = "deleteEmp"
						const xhr2 = new XMLHttpRequest();
						xhr2.open("delete", url);
						xhr2.send();
						
						xhr.onload = function(){
							
							console.log(xhr.responseText)
						}
					})
				}
				
				
			}catch(e){
				console.log("ERROR : url :", url, e);
			}
		}
		
	})


	document.querySelector("#empno").addEventListener("click", function(){
		const orderType = document.querySelector("[name=orderType]");
		
		// '' > 'desc' > 'asc' > '' 처럼 세개의 값을 순환하게 만들기
		console.log(orderType.value, orderType.value == '');
		if(orderType.value == ''){
			orderType.value = 'desc'
		} else if(orderType.value == 'desc'){
			orderType.value = 'asc'
		} else if(orderType.value == 'asc'){
			orderType.value = ''
		}
		
		const frm = document.querySelector("#frm");
		frm.submit();
		
	})

</script>

</body>
</html>





