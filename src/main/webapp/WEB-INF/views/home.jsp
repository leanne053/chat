<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Hello world!  
</h1>
	<form action="login" method="post">
	아이디: <input type="text" name="id"><font color="red">${warning}</font><br>
	비밀번호:<input type="password" name="pw"><br>
	<input type="submit" value="login">
	</form>
	
	<a href="register">회원가입</a>

</body>
</html>
