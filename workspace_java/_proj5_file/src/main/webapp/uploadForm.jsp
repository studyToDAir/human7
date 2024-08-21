<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!--
	파일 첨부 시 주의할 점
	method는 post여야 함
	enctype는 원래 한글 깨짐 방지에 사용하는 속성인데
	enctype에 multipart/form-data 적어줘야 함
	이 경우 한글 깨짐 방지를 위해 accept-charset 속성을 사용할 수 있다
 -->
<form
	method="post"
	action="upload.do"
	enctype="multipart/form-data"
	accept-charset="utf-8"
>
제목 : <input type="text" name="title"><br>
내용 : <input type="text" name="content"><br>
첨부파일 : <input type="file" name="file1"><br>
<input type="submit" value="등록">

</form>

<img src="download.do?fileName=b.jpg">


</body>
</html>