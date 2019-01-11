<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<jsp:include page="/jsp/comm/top.jsp" flush="false" ></jsp:include>
<link rel="stylesheet" type="text/css" href="/Kocofarm/css/module/notice.css" />

	<div class="cont_wrap">
		<!-- SubTitle Area -->
		<div class="sub_title">
			<div class="sub_title_top">
				<div class="sub_title_inner">
					<h2>Notice <span>공지사항을 등록 할 수 있습니다.</span></h2>
					<ul class="sub_nav">
						<li>홈 > 공지사항 > </li>
						<li class="on">등록</li>
					</ul>
				</div>
			</div>
		</div>
	
		<!-- Contents Area -->
		<div class="contents_wrap">
			<div class="contents">
				<!-- 등록 -->
				<table class="contents_tb wr" id="contTb">
					<colgroup>
						<col width="20%">
						<col width="*">
					</colgroup>
					<tbody id="contentsTbBody">
						<tr>
							<th scope="col">제목</th>
							<td class="left">
								<input type="text" name="title" id="title" />
							</td>
						</tr>
						<tr>
							<th scope="col" colspan="2">내용</th>
						</tr>
						<tr>
							<td colspan="2">
								<textarea name="contents" id="contents"></textarea>
							</td>
						</tr>
					</tbody>
				</table>
			</div>
			<!-- btn -->
			<div class="btn_wrap">
				<div class="flt_r">
					<input type="button" class="list_btn" value="목록" />
					<input type="button" class="view_btn" value="상세보기" />
					<input type="button" class="write_btn" value="등록" />
					<input type="button" class="edit_btn" value="수정" />
					<input type="button" class="del_btn" value="삭제" />
				</div>
			</div>
		</div>
	</div>
<script type="text/javascript" src="/Kocofarm/js/module/notice.js"></script>
<jsp:include page="/jsp/comm/bottom.jsp" flush="false" ></jsp:include>