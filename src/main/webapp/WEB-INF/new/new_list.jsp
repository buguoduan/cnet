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
			<div class="container-fluid navbar navbar-inverse tabbable tabs-left" id="sub_navbar" style="border: none; background-color: rgba(70, 187, 235, 1); height: 80px; padding: 16px 6px 0 8px; border-radius:0;">
				<ul id="home_tab" class="container nav nav-tabs" style="border-bottom: none; height: 64px;">
				<li class="col-xs-4 active">
				<a href="#" data-uicontrol="click_tab-team-productivity_home-page" data-toggle="tab" data-action="tab-click" data-target="tab-team-productivity">Personal Productivity<span class="hidden-xs"> (Free)</span></a>
				</li>
				<li class="col-xs-4">
				<a href="#" data-uicontrol="click_tab-financial-services_home-page" data-toggle="tab" data-action="tab-click" data-target="tab-financial-services">Financial Services</a>
				</li>
				<li class="col-xs-4">
				<a href="#" data-uicontrol="click_tab-business-and-enterprise_home-page" data-toggle="tab" data-action="tab-click" data-target="tab-business-and-enterprise">Business &amp; Enterprise</a>
				</li>
				</ul>
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
