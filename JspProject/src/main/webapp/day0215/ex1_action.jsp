<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
    <script src="https://code.jquery.com/jquery-3.6.3.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>
<%
	String name=request.getParameter("name");
	String birth=request.getParameter("birth");
	String hobby []=request.getParameterValues("hobby");

%>
<h2>이름: <%=name %></h2>
<h2>생년월일: <%=birth %></h2>

<h2>취미: <% for(int i=0;i<hobby.length;i++){%>
		[<%=hobby[i] %>]&nbsp;
<%}

%></h2>



</body>
</html>