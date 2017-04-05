<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


<%@ include file="bootstrap.jsp" %>

	<div class="container">
		<div class="header clearfix">
        	<nav>
	          		<ul class="nav nav-pills pull-right">
	            		<li role="presentation"><a href="list.html">Scores</a></li>
	            		<li role="presentation"><a href="newScore.html">New Score</a></li>
	            		<li role="presentation"><a href="/logout">Logout</a></li>
	          		</ul>
        	</nav>
        	<h3 class="text-muted">Student Scores</h3>
    	</div>
		<div class="jumbotron">		
			<h3>Welcome ${dateAndTime}</h3>
		</div>    		
    </div>
