<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
<%@ page import="java.util.Date" %>
<%@ page import="java.text.SimpleDateFormat" %>
<!DOCTYPE html>
<html>
<head>
<%! int count = 1;
	Date now = new Date();
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");
%>
<meta charset="UTF-8">
<title>JSP KADAI</title>
</head>
<body>
	<h1>訪問回数: <%= count++ %></h1>
	<p>今日の日付: <%= sdf.format(now) %></p>
</body>
</html>