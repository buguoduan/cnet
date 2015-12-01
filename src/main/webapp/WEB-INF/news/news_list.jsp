<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html lang="en">
<head>
<title>数据表格页面_后台管理系统模板CNET</title>
<meta charset="utf-8"  />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
</head>
<body>

	<jsp:include page="/WEB-INF/include/head.jsp" />
	<div id="content">
		<div id="content-header">
			<div id="breadcrumb">
				<a href="#" title="Go to Home" class="tip-bottom"><i
					class="icon-home"></i> Home</a> <a href="#" class="current">Tables</a>
			</div>
			<h1>Tables</h1>
		</div>
		<div class="container-fluid">
			<hr>
			<div class="row-fluid">
				<div class="span12">



					<div class="widget-box">
						<div class="widget-title">
							<span class="icon"><i class="icon-th"></i></span>
							<h5>Data table</h5>
						</div>
						<div class="widget-content nopadding">
							<table class="table table-bordered data-table">
								<thead>
									<tr>
										<th><input type="checkbox" id="title-table-checkbox"
											name="title-table-checkbox" /></th>
										<th>标题</th>
										<th>创建时间</th>
										<th>作者</th>
										<th>状态</th>
										<th>操作</th>
									</tr>
								</thead>
								<tbody>
									<c:forEach items="${news}" var="n">
										<tr class="gradeX">
											<td><input type="checkbox" name="check_user" /></td>
											<td><a href="findDetail?newId=${n.ID}">${n.TITLE}</a></td>
											<td>
											<fmt:formatDate value="${n.CREATE_DATE}" pattern="yyyy-M-d" />
											</td>
											<td>${n.AUTHOR}</td>
											<td class="center">${n.STATUS}</td>
											<td>
											 	<div class="fm">
											 		 	<input type="button" value="Edit" class="btn btn-primary btn-mini"
														onclick="location.href='publish?newId=${n.ID}';" />
											 		<c:choose>
											 			<c:when test="${n.STATUS==0}">
														 	<input type="button" value="发布" class="btn btn-success btn-mini"
														onclick="location.href='publish?newId=${n.ID}';" />
														</c:when>
														<c:when	test="${n.STATUS==1}">
														    <input type="button" value="草稿" class="btn btn-success btn-mini"
														onclick="location.href='draft?newId=${n.ID}';"  />
														</c:when>
													</c:choose>
													    <input type="button" value="Delete" class="btn btn-danger btn-mini"
														onclick="location.href='delete?newId=${n.ID}';"  />
											    </div>
										    </td>
										</tr>
									</c:forEach>
								</tbody>
							</table>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	<!--Footer-part-->
	<div class="row-fluid">
		<div id="footer" class="span12">2013 &copy; MatAdmin.</div>
	</div>
	<!--end-Footer-part-->
	<link rel="stylesheet" href="${pageContext.request.contextPath}/css/uniform.css" />
	<link rel="stylesheet" href="${pageContext.request.contextPath}/css/select2.css" />
	<jsp:include page="/WEB-INF/include/css.jsp" />
	<jsp:include page="/WEB-INF/include/js.jsp" />
	<script src="${pageContext.request.contextPath}/js/jquery.dataTables.min.js"></script>
	<script src="${pageContext.request.contextPath}/js/matrix.tables.js"></script>
</body>
</html>
