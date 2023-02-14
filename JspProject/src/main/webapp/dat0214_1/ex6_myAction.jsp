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
	String city1=request.getParameter("city");
	String [] city2=request.getParameterValues("city2");

%>

<h2>희망지역 1: <%=city1 %></h3>
<h2>희망지역 2 : <%
	if(city2==null){%>
		<font color="red">지역선택 안함</font>
	<%}else{
		for(int i=0;i<city2.length;i++){%>
			[<%=city2[i] %>]&nbsp;		
		<%}%>
		<b>총 <%=city2.length %>개 지역 선택함</b>
		
	<%}
%></h3>
</body>
</html>