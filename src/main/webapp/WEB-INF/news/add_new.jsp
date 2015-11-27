<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html lang="en">
<head>
<title>数据表格页面_后台管理系统模板CNET</title>
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<meta charset="UTF-8">
</head>
<body>

<jsp:include page="/WEB-INF/include/head.jsp" />

<!--close-left-menu-stats-sidebar-->

<div id="content">
<div id="content-header">
  <div id="breadcrumb"> <a href="index.html" title="Go to Home" class="tip-bottom"><i class="icon-home"></i> Home</a> <a href="#" class="tip-bottom">Form elements</a> <a href="#" class="current">Common elements</a> </div>
  <h1>Common Form Elements</h1>
</div>
<div class="container-fluid">
  <hr>
  <div class="row-fluid">

      <div class="widget-box">
        <div class="widget-title"> <span class="icon"> <i class="icon-align-justify"></i> </span>
          <h5>Personal-info</h5>
        </div>
        <div class="widget-content nopadding">
          <form action="publishNew" method="get" class="form-horizontal">
            <div class="control-group">
              <label class="control-label">title :</label>
              <div class="controls">
                <input type="text" id="title" name="title" class="span11" placeholder="title" />
              </div>
            </div>
            <div class="control-group">
              <label class="control-label">Author Name :</label>
              <div class="controls">
                <input type="text" id="author" name="author" placeholder="Author Name" />
              </div>
            </div>
			 <div class="control-group">
              <label class="control-label">Date Picker (mm-dd)</label>
              <div class="controls">
                <div  data-date="12-02-2012" class="input-append date datepicker">
                  <input type="text" id="date" name="date"  value="12/02/2012"  data-date-format="mm-dd-yyyy" class="span11" >
                  <span class="add-on"><i class="icon-th"></i></span> </div>
              </div>
            </div>
			<div class="control-group">
              <label class="control-label">radio</label>
              <div class="controls">
                <label>
                  <input type="radio" name="status" id="fabu" value="0" checked="checked"/>
                  	草稿  </label><label>
                  <input type="radio" name="status" id="caogao" value="1"/>
                  	发布</label>
              </div>
            </div>
            <div class="control-group">
              <label class="control-label">File upload input</label>
              <div class="controls">
                <input type="file" />
              </div>
            </div>
            <div class="row-fluid">
         <div class="widget-content">
        <div class="control-group">
            <div >
              <textarea class="textarea_editor span12" id="description" name="description" rows="6" placeholder="Enter text ..."></textarea>
            </div>
        </div>
  </div>
  </div>
             <div class="form-actions">
              <button type="submit" class="btn btn-success">Save</button>
              <button type="submit" class="btn btn-primary">Reset</button>
              <button type="submit" class="btn btn-info">Edit</button>
              <button type="submit" class="btn btn-danger">Cancel</button>
            </div>
          </form>
        </div>
      </div> 
   
  </div>
 
</div></div>
<!--Footer-part-->
<div class="row-fluid">
  <div id="footer" class="span12"> 2013 &copy; MatAdmin.</div>
</div>
<!--end-Footer-part-->
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/colorpicker.css" />
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/datepicker.css" />
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/bootstrap-wysihtml5.css" />
<jsp:include page="/WEB-INF/include/css.jsp" /> 
<jsp:include page="/WEB-INF/include/js.jsp" /> 
<script src="${pageContext.request.contextPath}/js/bootstrap-colorpicker.js"></script> 
<script src="${pageContext.request.contextPath}/js/bootstrap-datepicker.js"></script> 
<script src="${pageContext.request.contextPath}/js/jquery.toggle.buttons.html"></script> 
<script src="${pageContext.request.contextPath}/js/masked.js"></script> 
<script src="${pageContext.request.contextPath}/js/matrix.form_common.js"></script> 
<script src="${pageContext.request.contextPath}/js/wysihtml5-0.3.0.js"></script> 
<script src="${pageContext.request.contextPath}/js/jquery.peity.min.js"></script> 
<script src="${pageContext.request.contextPath}/js/bootstrap-wysihtml5.js"></script> 
<script>
	$('.textarea_editor').wysihtml5();
</script>
</body>
</html>
