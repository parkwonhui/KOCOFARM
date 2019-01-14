<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:choose>
	<c:when test="${0 < re}">
		 <script>
		 	alert("작업에 성공 했습니다.");
		 	location.href="noticeList.do";
		 </script>
		 
	</c:when>
	<c:otherwise>
		<script>
		 	alert("작업에 실패 했습니다.");
		 	location.href="noticeList.do";
		 </script>
	</c:otherwise>
</c:choose>
