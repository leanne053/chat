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
	<form action="chattingList" method="get">
	<c:forEach var="Room" items="${rList}">
	<table>
		<tr>
		<th width="10">no.</th><th width="150">방제목</th><th width="50">방장</th><th width="50">개설일</th>
		</tr>
		<tr>
		<td>${Room.roomseq}</td>
		<td style="text-align:center"><a href="enterRoom?roomseq=${Room.roomseq}">${Room.title}</a></td><td style="text-align:center">${Room.id}</td><td>${Room.indate}</td>
		</tr>	
	</table>
	</c:forEach>
	</form>
	
	<br>
	
	<a href="makeRoom">방만들기</a>
	<a href="home">로그아웃</a>
	
	
	
	

</body>
</html>
