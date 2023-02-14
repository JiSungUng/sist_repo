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
	<h2>Jsp는 Html5구조에 자바코드를 사용할 수 있는 서버언어이다</h2>
	<h2>Servlet은 확장자가 java이며 자바크랠스 구조에 <br> html,css,js도 사용할 수 있는 서버 언어이다.</h2>
	<hr>
	<h4>jsp는 두가지의 주석이 가능하다.</h4>
	<!-- 주석1: hrml기본주석: 소스보기에서 보인다. -->
	<%--jsp주석: 소스보기에서 안보인다. 안에 자바코드가 있으면 이 주석은 비실행 --%>
	<%!
	//선언문
	//이곳에서 선언한 변수나 메서드는 클래스의 멤버변수나 메소드로 등록된다.
	//위치가 어디에있던 관계가 없다.
	%>
	
	<h4>java코드를 쓰려면 scriptlet 영역을 표시 후 코딩</h4>
	
	<%
	//스크립트릿
	//여기서 선언하는 변수는 지역변수로 등록
	//여기서 선언하게되면 사용은 선언한 곳보단느 아래서 사용해야 한다.
	int age=20;
	String name="송혜교";
	%>
	
	<h4>문자열이나 변수출력은 표현식을 이용해서 출력을 한다.</h4>
	<b>이름: </b><%=name %><br>
	<b>나이: </b><%=age  %>세<br>
</body>
</html>