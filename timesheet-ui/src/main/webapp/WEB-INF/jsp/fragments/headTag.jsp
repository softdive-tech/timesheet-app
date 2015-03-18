<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<jsp:include page="../home/context.jsp" />

<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport"
 content="width=device-width, initial-scale=1, maximum-scale=1.0, user-scalable=no">
<meta http-equiv="X-UA-Compatible" content="IE=edge">



<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">

<meta name="author" content="Madpiggy">
<script>var CONTEXT = "${TIMESHEET_CTX}"</script>


 <spring:url value="/assets/css/style.css" var="styleCss" />
 	<link href="${styleCss}" rel="stylesheet">
 <spring:url value="/assets/materialize/css/materialize.min.css" var="materialize" />
	<link href="${materialize}" rel="stylesheet">
 <spring:url value="/assets/materialize/css/ghpages-materialize.css" var="ghpages" />
	<link href="${ghpages}" rel="stylesheet">
	
<spring:url var="jqueryMinJs" value="/assets/js/jquery-2.1.1.min.js"/>
<script src="${jqueryMinJs}"></script>

<spring:url var="materializeJs" value="/assets/materialize/js/materialize.min.js"/>
<script src="${materializeJs}"></script>

<spring:url var="initJs" value="/assets/materialize/js/init.js"/>
<script src="${initJs}"></script>

<script src="${materializeJs}"></script>

<spring:url var="initJs" value="/assets/js/init.js" />
<script src="${initJs}"></script>
</head>