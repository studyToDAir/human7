<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<button id="doGet">doGet</button><br>
<button id="doPost">doPost</button><br>
<button id="doPut">doPut</button><br>
<button id="doDelete">doDelete</button><br>

<div id="console"></div>


<script>

	document.querySelector("#doGet").addEventListener("click", function(){
		ajax('get');
	})
	document.querySelector("#doPost").addEventListener("click", function(){
		ajax('post');
	})
	document.querySelector("#doPut").addEventListener("click", function(){
		ajax('put');
	})
	document.querySelector("#doDelete").addEventListener("click", function(){
		ajax('delete');
	})
	
	function ajax(method){
		
		if(!method) method = 'get';
		// if(method != null && method != undefined && method != 0)
		
		let url = 'ajax';
		if(method == 'get'){
			url += '?id=idid';
		}
		
		let xhr = new XMLHttpRequest();
		
		xhr.open(method, url);
		
		if(method == 'get'){
			xhr.send();
		} else {
			xhr.setRequestHeader("Content-Type", "application/x-www-form-urlencoded");
			xhr.send( "id=your_id&pw=1234" );
		}
		
		xhr.onload = function(){
			console.log( xhr.responseText );
			
			document.querySelector("#console").innerHTML = xhr.responseText;
			
			try{
				let json = JSON.parse(xhr.responseText);
				console.log(json)
			} catch (e){
				console.log(e)
			}
		}
		
		
	}

</script>
</body>
</html>