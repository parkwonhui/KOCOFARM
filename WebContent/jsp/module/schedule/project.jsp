<%@ page import="kosta.model.module.vo.schedule.Category" %>
<%@ page import="kosta.model.module.vo.schedule.Calender" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<jsp:include page="/jsp/comm/top.jsp" flush="false" ></jsp:include>
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

<div class="con">
     <c:forEach var="category" items="${categoryList}">
	   	<ul class="li_common_style li1">
	    <li>${ category.category_name }<button type="button" class="btn btn-primary">+</button></li>
	     <c:forEach var="calender" items="${calenderList}">
	     <c:if test="${category.category_id == calender.category_id}">
	     <c:if test="${calender.title != null}">
	     	<li>${calender.title}<br>
	     	시작일: ${calender.start_dt }<br>
	     	종료일: ${calender.start_dt }
	     	</li>
	     </c:if>
	     </c:if>
	     </c:forEach>
		</ul>
     </c:forEach>
</div>
<script src="http://code.jquery.com/jquery-1.12.2.min.js"></script> 
<script src="/Kocofarm/js/module/schedule.js"></script>
<!-- js 위치를 못찾아서 js 적용이 안됨 임시로 같은 폴더에 js 놔둠 -->

<script>
$('.dropme').dropme('enable');
$('.exclude').dropme({
				items: ':not(.disabled)'
			});
			$('.li_common_style').dropme({
				linkTo: '.li_common_style'
			});
</script>
</body><script type="text/javascript">

  var _gaq = _gaq || [];
  _gaq.push(['_setAccount', 'UA-36251023-1']);
  _gaq.push(['_setDomainName', 'jqueryscript.net']);
  _gaq.push(['_trackPageview']);

  (function() {
    var ga = document.createElement('script'); ga.type = 'text/javascript'; ga.async = true;
    ga.src = ('https:' == document.location.protocol ? 'https://ssl' : 'http://www') + '.google-analytics.com/ga.js';
    var s = document.getElementsByTagName('script')[0]; s.parentNode.insertBefore(ga, s);
  })();

</script>
</html>
