
<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
	<meta charset="utf-8">
	<title>2018과제</title>
	
	<script src="http://code.jquery.com/jquery-3.4.1.min.js"></script>
	<script type="text/javascript">
		$(document).ready(function(){
			
		})
	</script>
</head>
<body>
	<table>
		<tr>
			<td><input type="text" id="text_value" name="text_value"/></td>
			<td><button id="search" name="search">조회</button></td>
			<td><button id="add" name="add">추가</button></td>
			<td><button id="storage" name="storage">저장</button></td>
			<td><button id="prev" name="prev">이전</button></td>
			<td><button id="next" name="next">이후</button></td>
		</tr>
	</table>
	<table>
		<tr>
			<td>고객 ID </td>
			<td><input type="text" id="cus_id" name="cus_id"/></td>
		</tr>
		<tr>
			<td>고객 PW </td>
			<td><input type="text" id="cus_pw" name="cus_pw"/></td>
		</tr>
		<tr>
			<td>고객이름 </td>
			<td><input type="text" id="cus_name" name="cus_name"/></td>
		</tr>
	</table>
</body>
</html>
