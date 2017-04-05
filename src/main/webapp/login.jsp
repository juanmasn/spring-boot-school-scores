<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
	<head>
		<title>Login to Studen Scores</title>
		<%@ include file="/public/bootstrap.jsp" %>
	</head>		

<body>
	
	<div class="container">
		<div class="header clearfix">
        	<nav>
          		<ul class="nav nav-pills pull-right">
            		<!-- li role="presentation" class="active"><a href="#">Home</a></li>
            		<li role="presentation"><a href="#">About</a></li>
            		<li role="presentation"><a href="#">Contact</a></li -->
          		</ul>
        	</nav>
        	<h3 class="text-muted">Student Scores</h3>
    	</div>
		<div class="jumbotron">
				
			<c:url value="/students/home.html" var="loginUrl"/>
			
			<c:if test="${param.error != null}">
				<p>Bad username/password</p>
			</c:if>
			
			<form:form id="myForm" action="${loginUrl}" method="post">
			<div class="form-group">
				<label>Username</label>
				<input class="form-control"  type="text" name="username" value="juanmasn"/>				
				<label>Password</label>
				<input class="form-control"  type="text" name="password" value="12345"/>
			</div>
			<p><a class="btn btn-lg btn-success" href="#" role="button"
				onclick="document.getElementById('myForm').submit();">Login</a></p>
				
				
			</form:form>
			
		</div>    		
    </div>						
</body>
</html>