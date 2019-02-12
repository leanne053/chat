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
	
	function formSubmit(){
		 $.ajax({     
			 url: "insertChat",
			 data: { "roomseq": ${roomseq},
				         "message":document.getElementById("message").value},
			 type: "post",
			 success:function(){
				 document.getElementById("message").focus();
				 document.getElementById("message").value;
			 }
		 });
		}
	
</script>
<body>
	<h1>Hello buddy!</h1>
	<div id="messageList">
	
	</div>
	
		<input type="hidden" name="roomseq" value="${roomseq}">
		MESSAGE:<input type="text" id="message" name="message"> 
		<input type="button" onclick="formSubmit()" value="전송">
	<!-- </form> -->

	<a href="chattingList">채팅방나가기</a>

</body>
</html>
