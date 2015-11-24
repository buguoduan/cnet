<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="zh-CN" ng-app="myApp">

<head lang="en">
    <meta charset="utf-8" name="viewport" content="width=device-width, initial-scale=1" />
    <title>bootstrap</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/bootstrap.min.css" />
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/my.css" />
    
   
</head>

<body>
    <nav class="navbar navbar-inverse" role="navigation">
        <div>
            <div class="navbar-header">
                <a class="navbar-brand" href="#">CLASSNET</a>
            </div>
            <div class="collapse  navbar-collapse">
                <ul class="nav navbar-nav" id="mytab">
                    <li class="active"><a href="#">新闻</a></li>
                    <li><a href="#">课程</a></li>
                    <li><a href="#">文档</a></li>
                    <li><a href="#">论坛</a></li>
                </ul>
                <form class="navbar-form navbar-left" role="search">
                    <div class="form-group">
                        <input type="text" class="form-control" placeholder="搜索">
                    </div>
                    <button type="submit" class="btn btn-default">搜索</button>
                </form>
                <ul class="nav navbar-nav navbar-right">
                    <li><a href="">登录</a></li>
                    <li class="dropdown">
                        <a href="#" class="dropdown-toggle" data-toggle="dropdown"><span class="caret"></span></a>
                        <ul class="dropdown-menu" role="menu">
                            <li><a href="#">用户名</a></li>
                            <li><a href="#">个人中心</a></li>
                            <li><a href="#">退出</a></li>
                        </ul>
                    </li>
                </ul>

            </div>
        </div>

    </nav>
    <div class="container-fluid">
    		<!-- 页头 -->
            <div class="page-header text-center">
			  <h1 >Example page header <small>Subtext for header</small></h1>
			  <!-- 标签 -->
			  	<span class="label label-primary">Primary</span>
				<span class="label label-success">Success</span>
				<span class="label label-info">Info</span>
				<span class="label label-warning">Warning</span>
				<span class="label label-danger">Danger</span>
			</div>
			<!-- 页面类容 -->
			<div>
				<span>Quill is a free, </span>
				<a href="https://github.com/quilljs/quill/">open source</a>
				<span> WYSIWYG editor built for the modern web. With its </span>
				<a href="http://quilljs.com/docs/modules/">extensible architecture</a>
				<span> and a </span>
				<a href="http://quilljs.com/docs/api/">expressive API</a>
				<span> you can completely customize it to fulfill your needs. Some built in features include:</span>
			</div>
			
    </div>


    <script src="http://cdn.bootcss.com/jquery/1.11.2/jquery.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/angular.min.js"></script>
    <script src="${pageContext.request.contextPath}/js/app.js"></script>
	<script src="${pageContext.request.contextPath}/js/services.js"></script>
	<script src="${pageContext.request.contextPath}/js/controllers.js"></script>
	<script src="${pageContext.request.contextPath}/js/filters.js"></script>
	<script src="${pageContext.request.contextPath}/js/directives.js"></script>
	<script>
        $("#mytab a").click(function(e) {
            e.preventDefault;
            $(this).tab("show");
        })
    </script>
</body>

</html>
