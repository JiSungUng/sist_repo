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
 <form action="ex1_action.jsp" method="post">
 
 <table class="table table-striped" style="width:400px;">
 <tr>
 <th width="100">이름</th>
 <td>
 	 	<input type="text" name="name" class="form-control" required="required">
 </td>
 </tr>
  <tr>
 <th width="100">생년월일</th>
 <td>
	<input type="date" name="birth">
 </td>
 </tr>
 
  <tr>
 <th width="100">취미</th>
 <td>
		<input type="checkbox" name="hobby" value="게임">게임
	 	<input type="checkbox" name="hobby" value="공부">공부
	 	<input type="checkbox" name="hobby" value="여행">여행
	 	<input type="checkbox" name="hobby" value="코딩">코딩
 </tr>

<tr>
		<td colspan="2" align="center">
		<button type="submit" class="btn btn-info btn-lg">서버로전송</button>
		</td>
		</tr>
 
 
 </table>
 </form>
</body>
</html>