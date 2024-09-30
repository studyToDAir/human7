<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	#side {
		display: inline-block;
		width: 30%;
		border: 1px solid green;
		vertical-align: top;
	}
	#content {
		display: inline-block;
		width: 69%;
		border: 1px solid black;
	}
</style>

</head>
<body>

<!-- header -->
<div>
<%-- <%@ import %> --%>
<%-- <jsp:include page=""></jsp:include> --%>

	<tiles:insertAttribute name="header" />

</div>

<!-- side -->
<div id="side">
	<tiles:insertAttribute name="side" />
</div>

<!-- content -->
<div id="content">
	<tiles:insertAttribute name="content" />
</div>

<!-- footer -->
<div>
	<tiles:insertAttribute name="footer" />
</div>

${serverTime }

</body>
</html>