<%@ include file="../common/header.jspf"%>
<%@ include file="../common/navigation.jspf"%>




	
	<h1>Welcome to My First ${name} Page From Saraya Tech
	your password is ${password }</h1>
	

	<p>
		This my wonderfull website....
		and here are a part of my Training:
		${formats}
		<ol style="list-style-type: upper-roman;">

			<c:forEach items="${formats}" var="format">
				<li>${format.name} &nbsp; &nbsp; 
					<a href="/delete.do?formation=${format.name}">Delete</a>
				</li>
			</c:forEach>
		</ol>
		<form action="/formation.do" method="post">
			<input type="text" name = "add">
			<input type="submit" value="Add a Class">
		</form>
	</p>
<%@ include file="../common/footer.jspf"%>