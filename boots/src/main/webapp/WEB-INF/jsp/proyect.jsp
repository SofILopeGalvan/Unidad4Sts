<%@page language="java" contentType="text/html; charset=ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
<title>Bootstrap sample| Home</title>
<link href="/static/css/bootstrap.min.css" rel="stylesheet"
	type="text/css" />
<link href="/static/css/styles.css" rel="stylesheet" type="text/css" />
</head>
<body>
	<div role="navigation">
		<div class="navbar navbar-inverse">
			<a href="/" class="navbar-brand">Home</a>
			<div class="nav navbar-nav">
				<ul class="nav navbar-nav">
					<li><a href="new-proyect">Manage Proyect</a></li>
					<li><a href="all-proyects">All Proyects</a></li>
				</ul>
			</div>
		</div>
	</div>

	<c:choose>
		<c:when test="${mode=='MODE_PROYECTS'}">
			<div class="container text-center" id="proyectDiv">
				<h3>My proyect</h3>
				<hr />
				<div class="table-responsive">
					<table class="table table-striped table-bordered">
						<thead>
							<tr>
								<th>Id</th>
								<th>schedule</th>
								<th>Presentation</th>
								<th>principle</th>
								<th>Description</th>
								<th></th>
								<th></th>
							</tr>
						</thead>
						<tbody>
							<c:forEach var="proyect" items="${proyects}">
								<tr>
									<td>${proyect.id}</td>
									<td>${proyect.schedule}</td>
									<td>${proyect.presentation}</td>
									<td>${proyect.description}</td>
									<td>${proyect.principle}</td>									
									<td><a href="update-proyect?id=${proyect.id}"> <span
											class="glyphicon glyphicon-pencil"></span>
									</a></td>
									<td><a href="delete-proyect?id=${proyect.id}"> <span
											class="glyphicon glyphicon-trash"></span>
									</a></td>
								</tr>
							</c:forEach>
						</tbody>
					</table>
				</div>
			</div>
		</c:when>
		<c:when test="${mode== 'MODE_NEW' || mode=='MODE_UPDATE'}">
			<div class="container text-center">
				<h3>Manager Proyect</h3>
				<hr />
				<form class="form-horizontal" method="POST" action="save-proyect">
					<input type="hidden" name="id" value="${proyect.id}" />
					<div class="form-group">
						<label class="control-label col-md-3">Schedule</label>
						<div class="col-md-7">
							<input type="text" class="form-control" value="${proyect.schedule}"
								name="schedule" />
						</div>
					</div>

					<div class="form-group">
						<label class="control-label col-md-3">Presentation</label>
						<div class="col-md-7">
							<input type="text" class="form-control"
								value="${proyect.presentation}" name="presentation" />
						</div>
					</div>
					
					<div class="form-group">
						<label class="control-label col-md-3">Principle</label>
						<div class="col-md-7">
							<input type="text" class="form-control"
								value="${proyect.principle}" name="principle" />
						</div>
					</div>
					
					<div class="form-group">
						<label class="control-label col-md-3">Description </label>
						<div class="col-md-7">
							<input type="text" class="form-control" name="description" 
								value="${proyect.description}"/>
						</div>
					</div>
					
					

					<div class="form-group">
						<input type="submit" class="btn btn-primary" value="Save" />
					</div>
				</form>
			</div>
		</c:when>
	</c:choose>
	<script type="text/javascript" src="/static/js/bootstrap.min.js">
	</script>
	<script type="text/javascript" src="/static/js/jquery-3.1.1.min.js">
	</script>

</body>
</html>