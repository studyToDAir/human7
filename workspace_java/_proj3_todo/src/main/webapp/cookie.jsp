<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	.popup {
		width: 200px;
		height: 300px;
		border: 1px solid black;
	}
	.hide {
		display: none;
	}
</style>
</head>
<body>

<div class="popup">

	공지사항입니다.<br>
	
	<input type="checkbox" id="popupShow"> 10초 동안 보이지 않기

</div>

<script>
	popupNoShow();
	function popupNoShow(){
		// 모든 쿠키 가져오기 : return은 String
		console.log(document.cookie);	// a=a1; b=b1; popupNoShow=true
		// 쿠키별로 배열로 만들기
		const aCookie = document.cookie.split("; ");
		for(let i=0; i<aCookie.length; i++){
			// 쿠키의 이름과 값을 구분하기
			const cookie = aCookie[i].split("=")
			const name = cookie[0];
			const value = cookie[1];
			
			// 내가 원하는 이름과 값인지 판별
			if(name == "popupNoShow" && value == "true"){
				document.querySelector(".popup").classList.add("hide");
			}
		}
	}

	document.querySelector("#popupShow").addEventListener("click", function(event){
	
		let checked = event.target.checked;
		console.log("체크 여부 : "+ checked);
		document.cookie = 'a=a1';
		document.cookie = 'b=b1';
		console.log(document.cookie);
		console.log(new Date())
		
		if(checked){
			// 10초 뒤 시간 가져오기
			const now = new Date();		// 현재시간
			console.log(now.toGMTString())
			// getSeconds : 지금 시간의 초를 가져오기
			const after_10s = now.getSeconds() + 10;	// 10초 뒤 시간
			now.setSeconds(after_10s);	// 초단위 재설정
			console.log(now.toGMTString());
			
			document.cookie = "popupNoShow=true;expires="+now.toGMTString()
		}
		
		
		
	})
	

</script>

</body>
</html>