<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*" %>
<%@ page import="java.util.Calendar"%>
<%@ page import="java.text.SimpleDateFormat"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="style.css">
<title>Insert title here</title>
</head>
<body>

<header>
	<div class="header-group">
		<label class="header-titleLabel">login</label>
		<label class="header-dateLabel">
			<%	Date currentDate = new Date();
				SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
				String formattedDateString = sdf.format(currentDate);%>
			<%=formattedDateString %>
		</label>
	</div>
</header>

</body>
</html>