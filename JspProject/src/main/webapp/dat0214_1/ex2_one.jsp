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
<h3>ex2_two.jsp include하기</h3>

<jsp:include page="ex2_twoInclude.jsp">
<jsp:param value="안녕하세요!!!" name="msg"/>
<jsp:param value="../image/1.jpg" name="imgname"/>
</jsp:include>
</body>
</html>