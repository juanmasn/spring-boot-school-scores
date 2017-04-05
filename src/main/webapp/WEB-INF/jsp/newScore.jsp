<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
<%@ include file="bootstrap.jsp" %>
</head>
<body>

	<div class="container">
		<div class="header clearfix">
        	<nav>
	          		<ul class="nav nav-pills pull-right">
	            		<li role="presentation"><a href="list.html">Scores</a></li>
	            		<li role="presentation" class="active"><a href="newScore.html">New Score</a></li>
	            		<li role="presentation"><a href="/logout">Logout</a></li>
	          		</ul>
        	</nav>
        	<h3 class="text-muted">Student List</h3>
    	</div>
		<div class="jumbotron">		
		    <form:form id="myForm" modelAttribute="form">
		        <form:errors path="" element="div" />
		        <div>
					<div class="form-group">
						<label>Name</label>
						<form:input class="form-control" type="text" path="name"/>				
						<label>Score</label>
						<form:input class="form-control number" type="text" path="score"/>		
					</div>
		            <form:errors path="name" />
		        </div>
		        <div>
		        	<p><a class="btn btn-lg btn-success" href="#" role="button"
					onclick="document.getElementById('myForm').submit();">Save</a></p>
		        </div>
		    </form:form>
		</div>    		
    </div>        

</body>
</html>
