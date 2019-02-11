<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<head>
	<title>회원가입</title>
</head>
<body>
<h1>
	회원가입
</h1>
	<form action="registerInfo" method="post">
	아이디: <input type="text" name="id"><br>
	비밀번호:<input type="password" name="pw"><br>
	이름 :<input type="text" name="name"><br>
	<input type="submit" value="가입하기">
	</form>
	

</body>
</html>
