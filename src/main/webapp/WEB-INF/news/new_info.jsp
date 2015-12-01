<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html lang="en">
<head>
<title>插件页面_漂亮的响应式Bootstrap后台管理系统模板MatAdmin - JS代码网</title>
<meta charset="UTF-8" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
</head>
<body>

<!--Header-part-->
<jsp:include page="/WEB-INF/include/head.jsp" />
<!--sidebar-menu-->

<!--main-container-part-->
<div id="content">
  <div id="content-header">
    <div id="breadcrumb"> <a href="#" title="Go to Home" class="tip-bottom"><i class="icon-home"></i> Home</a> <a href="#" class="current">Widgets</a> </div>
    <h1>Widgets</h1>
  </div>
  <div class="container-fluid">
    <hr>
    <div class="row-fluid">
      <div class="span12">
        <div class="widget-box">
          <div class="widget-title"> <span class="icon"> <i class="icon-file"></i> </span>
            <h5>Recent Posts</h5>
          </div>
          <div class="widget-content nopadding">
            <ul class="recent-posts">
              <h2 style="text-align:center">${new.TITLE}</h2>
              <div class="widget-content" >
			    <p style="text-align:center">
			        <span itemprop="datePublished" class=""><fmt:formatDate value="${new.CREATE_DATE}" pattern="yyyy-M-d" /></span>   
			        <span id="editor_baidu" class="lh-36">责任编辑：${new.AUTHOR}</span>
			        <span >点击量：</span>
			        <span>
			        <a target="_blank" ref="nofollow">${new.VIEW_COUNT}</a></span>
			    </p>
			   </div>
			  </div>
          <div class="widget-content"> ${new.DESCRIPTION}
           <img src="img/demo/demo-image1.jpg" alt="demo-image"/>
           </div>
        </div>
            </ul>
          </div>
        </div>
     
      </div>
    
    </div>
    <hr>
  </div>
</div>
<!--main-container-part-->

<!--Footer-part-->
<div class="row-fluid">
  <div id="footer" class="span12"> 2013 &copy; MatAdmin </div>
</div>
<!--end-Footer-part-->
<jsp:include page="/WEB-INF/include/css.jsp" /> 
<script src="${pageContext.request.contextPath}/js/jquery.min.js"></script> 
<script src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script> 
<script src="${pageContext.request.contextPath}/js/jquery.ui.custom.js"></script> 
<script src="${pageContext.request.contextPath}/js/matrix.js"></script>
</body>
</html>
