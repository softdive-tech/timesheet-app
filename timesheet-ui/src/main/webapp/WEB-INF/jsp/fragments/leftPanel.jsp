<%@page import="java.util.Collection"%>
<jsp:include page="../home/context.jsp"/>

<ul id="nav-mobile" class="side-nav fixed">
         <li class="logo">
	        <a id="logo-container" href="${TIMESHEET_CTX}/" class="brand-logo">
	        	<img src="${TIMESHEET_CTX}/assets/img/timesheet.jpg" style="border: none" border="0" height="45" class="CToWUd">
	        </a>
        </li> 
        
       <%--  <%
        	Collection<Link> dashboardLinks = RoleBasedUIResolver.getDashboardLinks();
        	if(dashboardLinks != null && dashboardLinks.size() > 0) {
        		for(Link link: dashboardLinks) {
		%>
				<li class="bold" id="<%=link.getId() %>">
		        	<a href="${MADPIGGY_CTX}/<%=link.getUri() %>" style="text-decoration:none;"> 
		        		<span><%=link.getDisplayName() %></span>
		        		<i class="<%=link.getIconClass() %>" style="float: right;margin-right: 10px;" name="<%=link.getDisplayName() %>"></i>
		        	</a>
		        </li>
		<%			        			
        		}
        	}
        %>  --%>
</ul>
      