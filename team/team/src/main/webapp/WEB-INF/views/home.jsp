<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
<meta charset="utf-8">
	<title>Home</title>
	
	<script src="https://code.jquery.com/jquery-3.4.1.min.js"></script>
	<script type="text/javascript"></script>
</head>
<body>
<table>
	<tr>
		<td><input type="text" id="textValue" name="textValue"/></td>
		<td><input type="button" id="search" name="search" onclick="" value="조회"/></td>
		<td><input type="button" id="add" name="add" onclick="" value="추가"/></td>
		<td><input type="button" id="storage" name="storage" onclick="" value="저장"/></td>
		<td><input type="button" id="prev" name="prev" onclick="" value="이전"/></td>
		<td><input type="button" id="next" name="next" onclick="" value="이후"/></td>
	</tr>
</table>
</body>
</html>
