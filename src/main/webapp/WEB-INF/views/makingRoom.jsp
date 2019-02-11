<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<head>
	<title>채팅방</title>
</head>
<body>
<h1>
	Room List
</h1>
	<form action="writeRoom" method="post">
	<table>
	<tr>
	<th>방제목</th><td><input type="text" name="title"></td>
	</tr>
	</table>
	<input type="submit" value="작성완료"><br>
	</form>
	
	<a href="rList">목록으로 돌아가기</a>
	
	
	
	
	

</body>
</html>
