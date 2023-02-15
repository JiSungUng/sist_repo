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
    <style>
    img.mainimg{
    	width:120px;
    	height:160px;
    	border: 1px solid gray;
    }
    img.mainimg:hover{
    width:200px;
    height:260px;
    border:5px solid orange;
    cursor: pointer;
    }
    
    table.mainimg{
    	width:650px;
    	
    }
    </style>
</head>
<body>
<!-- 배열선언 없이 일련번호인 이미지 20개를 4행 5열로 출력해주세요 이미지나 테이블 크기 모두 자유입니다 -->


	<table class ="maintb">
	<%
	int n=0;
	for(int row=1;row<=4;row++){%>
		<tr>
		<%
		for(int col=1;col<=5;col++){n++;%>
			<td>
			<img  src="../image/<%=n%>.jpg" class="mainimg">
			</td>
			
		<%}
		%>
		</tr>
	<%}
	%>	
	</table>
</body>
</html>