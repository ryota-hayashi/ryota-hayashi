<%@ page import="practice.FortuneBean"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<% FortuneBean fortuneBean =
(FortuneBean)request.getAttribute("FORTUNE"); %>
<meta charset="UTF-8">
<title>Fortune Result</title>
</head>
<body>
<%
	if(fortuneBean != null){
		out.println("<h1>↓" + fortuneBean.getToday() + "↓</h1>");
		out.println("<h1>" + fortuneBean.getFortune() + "</h1>");
	}
%>
</body>
</html>