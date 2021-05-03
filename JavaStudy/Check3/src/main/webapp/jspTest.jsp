<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="css/style.css">
<title>Insert title here</title>
</head>
<body>

<!-- header -->
<%@ include file="header.jsp" %>
<!-- main -->
<!-- name、idの入力エリアを作成しなさい -->
<div class="main">
	<div class="table-input-group">
		<table>
			<tr>
				<td align="center">name</td>	<td><input></td>
			</tr>
			<tr>
				<td align="center">id</td> <td><input></td>
			</tr>
		</table>
	</div>
</div>
<!-- footer -->
<%@ include file="footer.jsp" %>

</body>
</html>