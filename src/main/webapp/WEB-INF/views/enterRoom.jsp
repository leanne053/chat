<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<html>
<head>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js">
	
</script>
<title>chatting room</title>
</head>
<script>
	function ready() {
		document.getElementById("message").focus();
	}
	setInterval(
			
	function ajaxTest() {

		$.ajax({
			url : "selectChat",
			data : {"roomseq" : ${roomseq}},
			type : "get",
			success : function(data) {
				
				var content="";
				
				for (var i = 0; i > data.length; i++) {
					content+=data[i].visitorId+":"+data[i].message+"<br>";
					alert(data[i].message);
				}
				document.getElementById("messageList").innerHTML=content;
			}

		});

	}
	,1000
	);
</script>
<body onload="javascript:ready()">
	<h1>Hello buddy!</h1>
	<button onclick="ajaxTest(${roomseq})">테스트</button>
	<div id="messageList">
		
	
	</div>
	
	<form action="insertChat" method="post">
		<input type="hidden" name="roomseq" value="${roomseq}">
		MESSAGE:<input type="text" id="message" name="message"> <input
			type="submit" value="전송">
	</form>

	<a href="chattingList">채팅방나가기</a>

</body>
</html>
