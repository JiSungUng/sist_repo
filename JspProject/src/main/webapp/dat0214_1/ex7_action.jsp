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
	String name=request.getParameter("sang");
	String color[]=request.getParameterValues("scolor");
	String size=request.getParameter("ssize");
	String chuga=request.getParameter("schuga");

%>

<h2>상품명: <%=name %></h2>
<h2>색상: <% for(int i=0;i<color.length;i++){%>
		[<%=color[i] %>]&nbsp;
<%}

%></h2>



<h2>사이즈: <%=size %></h2>
<h2>추가 상품: <%=chuga %></h2>

</body>
</html>