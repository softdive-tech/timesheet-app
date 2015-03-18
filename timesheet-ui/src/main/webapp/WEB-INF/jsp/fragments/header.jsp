 <style>
 li.li-no-hover:hover {
    background-color: transparent;
}
 </style>
 <nav class="top-nav" style="top:0px; position: relative; z-index:2;background:rgb(213,15,37); ">
        <div class="container noPrint">
          <div class="right" style="margin-right:1%">
          <ul >
				<%-- <li class="li-no-hover"><span style="color: rgb(231, 206, 206);">${user.activeProfile.profileId}</span></li> --%>
				<li class="li-no-hover"><a a href="${TIMESHEET_CTX}/logout" style="margin-left:1px;cursor:pointer">Sign out</a></li>
			</ul>
          </div>
        </div>
      </nav>
      <div class="container"><a href="#" data-activates="nav-mobile" class="button-collapse top-nav full"><i class="mdi-navigation-menu noPrint"></i></a></div>