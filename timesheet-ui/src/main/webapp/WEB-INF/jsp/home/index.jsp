<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<jsp:include page="context.jsp"/>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>I DID IT</h1>
  <form id="login_form" action="${TIMESHEET_CTX}/login" method="post">
	 <input type="text" name="username" id="userId" autofocus>
	 <input type="password" name="password" id="password">
	 <input type="submit"  id="login">
</form>
</body>
</html>