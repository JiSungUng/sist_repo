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
<!--  include: 다른페이지의 결과페이지를 현재파일에 포함
	  forward: 다른파일로 이동 -->
<h2>다른 폴더의 파일 include하기</h2>
<h4>오전 예제 5번 불러오기</h4>
<jsp:include page="../day0214/listAddEx5.jsp"></jsp:include>
<hr>

<h4>오전 예제 7번 불러오기</h4>
<jsp:include page="../day0214/quizImageArr.jsp"></jsp:include>
</body>
</html>