<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<jsp:include page="../fragments/headTag.jsp"/>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Timesheet</title>
</head>
<link rel="icon" href="${TIMESHEET_CTX}/assets/img/timesheet.jpg" type="image/ico" sizes="16x16">
<body id="minovate" class="rightbar-hidden scheme-lightred lightred-scheme-color header-fixed aside-fixed">
  <header>
     <jsp:include page="../fragments/leftPanel.jsp" />
     <jsp:include page="../fragments/header.jsp" />
</header>  
<main>
  <div class="container"	 >
      <div class="page page-dashboard ng-scope">
        <div class="pageheader">
          <div class="page-bar" style="background-color:transparent !important;">
            <ul class="page-breadcrumb">
            </ul>
          </div>
        </div>
     <h3>TIMESHEET</h3>
 	 <form id="login_form" action="${TIMESHEET_CTX}/login" method="post">
	 <input type="text" name="username" id="userId" autofocus>
	 <input type="password" name="password" id="password">
	 <div class="input-field col s6">
        <input id="first_name" type="text" class="validate">
        <label for="first_name">First Name</label>
      </div>
    <button type="submit" class="waves-effect waves-light btn red darken-1 col s6 offset-s3" id="login">Login</button>
	</form>
	</div> 
  </div>
</main>
</body>
</html>