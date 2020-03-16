<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
<meta charset="utf-8">
	<title>Home</title>
	

<script src="http://code.jquery.com/jquery-1.10.2.js"></script>
<script type="text/javascript">
	$(document).ready(function(){
		console.log('document loded')
			$('#btn_insert').click(function(){
				console.log('clicked!')
				$.ajax({
					type : "get",
					async : true,
					url : "http://localhost:8080/customer/insert",
					data : {
						id : $('#id').val(),
						pw : $('#pw').val(),
						name : $('#name').val()
					},
					success : 
						 function(data, textStatus) {
						$('#message').append(data);
						console.log("탔음");
					},
					error: function(e) {
		
			            alert(e);
		
			         }
/* 				complete : function(data, textStatus) {
					alert("작업을 완료했습니다.");
				} */
				});
		})
	})
</script>
</head>
<body>
<table>
	<tr>
		<td><input type="text" id="textValue" name="textValue"/></td>
		<td><input type="button" id="search" name="search" onclick="" value="조회"/></td>
		<td><input type="button" id="add" name="add" onclick="" value="추가"/></td>
		<td><input id="btn_insert" type="button" id="storage" name="storage" onclick="" value="저장"/></td>
		<td><input type="button" id="prev" name="prev" onclick="" value="이전"/></td>
		<td><input type="button" id="next" name="next" onclick="" value="이후"/></td>
		</tr>
		<tr><td>id: <input id="id" type="text" value=""></td></tr>
		<tr><td>pw: <input id="pw" type="text" value=""></td></tr>
		<tr><td>name: <input id="name" type="text" value=""></td></tr>
	
</table>
</body>
</html>
