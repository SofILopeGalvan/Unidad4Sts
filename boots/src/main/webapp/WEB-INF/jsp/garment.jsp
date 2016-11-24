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
					<li><a href="new-garment">Manage Garment</a></li>
					<li><a href="all-garments">All Garment</a></li>
				</ul>
			</div>
		</div>
	</div>

	<c:choose>
		<c:when test="${mode == 'MODE_GARMENTS'}">
			<div class="container text-center" id="garmentDiv">
				<h3> Registered</h3>
				<hr />
				<div class="table-responsive">
					<table class="table table-striped table-bordered">
						<thead>
							<tr>
								<th>Id</th>
								<th>Color</th>
								<th>Type</th>
								<th>Size</th>
								
								
								<th>Edit</th>
								<th>Delete</th>
							</tr>
						</thead>
						<tbody>
							<c:forEach var="garment" items="${garments}">
								<tr>
									<td>${garment.id}</td>
									<td>${garment.color}</td>
									<td>${garment.type}</td>
									<td>${garment.size}</td>
								
									
									<td><a href="update-garment?id=${garment.id}"> <span
											class="glyphicon glyphicon-pencil"></span>
									</a></td>
									<td><a href="delete-garment?id=${garment.id}"> <span
											class="glyphicon glyphicon-trash"></span>
									</a></td>
								</tr>
							</c:forEach>
						</tbody>
					</table>
				</div>
			</div>
		</c:when>
		<c:when test="${mode == 'MODE_NEW' || mode == 'MODE_UPDATE'}">
			<div class="container text-center">
				<h3>Manager Garment !! </h3>
				<hr />
				<form class="form-horizontal" method="POST" action="save-garment">
					<input type="hidden" name="id" value="${garment.id}" />
					<div class="form-group">
						<label class="control-label col-md-3">Color</label>
						<div class="col-md-7">
							<input type="text" class="form-control" value="${garment.color}"
								name="color" />
						</div>
					</div>

					<div class="form-group">
						<label class="control-label col-md-3">Type</label>
						<div class="col-md-7">
							<input type="type" class="form-control"
								value="${garment.type}" name="type" />
						</div>
					</div>

					<div class="form-group">
						<label class="control-label col-md-3">Size</label>
						<div class="col-md-7">
							<input type="text" class="form-control" value="${garment.size}"
								name="size" />
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