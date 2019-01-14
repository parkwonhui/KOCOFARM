
<%@ page import="kosta.model.module.vo.ScheduleCategory" %>
<%@ page import="kosta.model.module.vo.ScheduleCalender" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<jsp:include page="/jsp/comm/top.jsp" flush="false" ></jsp:include>
<%@ page import ="java.util.ArrayList"%>
<%@ page import ="java.util.List"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<title>jQuery dropMe Plugin Examples</title>
<!-- 아래 css 경로를 찾지 못함 확인할 것 -->
<link href="/Kocofarm/css/module/schedule.css" rel="stylesheet" type="text/css">
<link href="http://www.jqueryscript.net/css/jquerysctipttop.css" rel="stylesheet" type="text/css">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-alpha.2/css/bootstrap.min.css" integrity="sha384-y3tfxAZXuh4HwSYylfB+J125MxIs6mR5FOHamPBG064zB+AFeWH94NdvaCBm8qnd" crossorigin="anonymous">
</head>

<body>

<jsp:useBean id="categoryList" type="java.util.List<kosta.model.module.vo.ScheduleCategory>" scope="request"/>
<jsp:useBean id="calenderList" type="java.util.List<kosta.model.module.vo.ScheduleCalender>" scope="request"/>
<jsp:setProperty name="categoryList" property="*"/>
<jsp:setProperty name="calenderList" property="*"/>


<div class="con">
     <c:forEach var="category" items="${categoryList}">
	   	<ul class="li_common_style li1">
	    <li class="claender_info">${ category.category_name }<button type="button" class="btn btn-primary" id="calenderWriteBtn">+</button>
	    <!-- 클릭한 calenderWriteBtn 버튼 밑의 input type -->
	   	<input type="hidden" class="this_category_id" value="${ category.category_id }" />
	    <input type="hidden" class="this_project_id" value="${ category.project_id }" />
	    </li>
	     <c:forEach var="calender" items="${calenderList}">
	     <c:if test="${category.category_id == calender.category_id}">
	     <c:if test="${calender.title != null}">
	     	<li id="${calender.calender_id}">${calender.title}<br>
	     	시작일: ${calender.start_dt }<br>
	     	종료일: ${calender.start_dt }
	     	</li>
	     </c:if>
	     </c:if>
	     </c:forEach>
		</ul>
     </c:forEach>
</div>

<!-- 일정추가 창 -->
<div id="myModal" class="modal">

  <!-- Modal content -->
  <div class="modal-content">
    <span class="close">&times;</span>
  
<!-- <form> -->
 <div class="form-group">
    <label>새 일정 추가</label>
    <input type="text" name="write"></input>
  </div>
	<div><button type="button" class="btn btn-success">날짜 선택</button></div>
	<div><label>칼라 입력</label></div>
	<input type="text" name="color"></input>
	<div><label>완료도 설정</label></div>
	<input type="text" name="completion_per"></input>
	<div><button class="btn btn-warning" name="tag">태그 선택</button></div>
	<div><button class="btn btn-secondary" name="worker_list">작업자 선택</button></div>
<!--  <div class="form-check">-->
  <Button class="btn btn-primary" id="calender_add">일정 추가</Button>
<!--    </div>-->
  
<!--</form> -->
</div>
  
</div>
<script src="http://code.jquery.com/jquery-1.12.2.min.js"></script> 
<script src="/Kocofarm/js/module/schedule.js"></script>
</body>
</html>
