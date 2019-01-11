<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<jsp:include page="/jsp/comm/top.jsp" flush="false" ></jsp:include>
<link rel="stylesheet" type="text/css" href="/Kocofarm/css/module/notice.css" />

	<div class="cont_wrap">
		<!-- SubTitle Area -->
		<div class="sub_title">
			<div class="sub_title_top">
				<div class="sub_title_inner">
					<h2>Notice <span>공지사항을 확인할 수 있습니다.</span></h2>
					<ul class="sub_nav">
						<li>홈 > </li>
						<li class="on">공지 사항</li>
					</ul>
				</div>
			</div>
		</div>
	
		<!-- Contents Area -->
		<div class="contents_wrap">
			<!-- sch_top -->
			<div class="sch_wrap">
				<p class="tit">검색</p>
				<div class="sch_slide_btn">
					<img id="slideBtnImg" class="upBtn" src="/Kocofarm/img/comm/list_up_btn.png" alt="메뉴 접기" />
				</div>
				<div class="sch_toggle_wrap">
					<div class="sch_box_wrap">
						<div class="right">
							<select name="schType" id="schType">
								<option value="">전체</option>
								<option value="title">제목</option>
								<option value="contents">내용</option>
							</select>
							<input type="text" name="schWord" id="schWord" placeholder="검색어를 입력 해 주세요" />
							<input type="button" class="schBtn" id="schBtn" value="검색" />
						</div>
					</div>
				</div>
			</div>

			<!-- list -->
			<div class="contents">
				<!-- 목록 -->
				<table class="contents_tb" id="contTb">
					<colgroup>
						<col width="5.45454%">
						<col width="74.5454%">
						<col width="10.90909%">
						<col width="*">
					</colgroup>
					<thead>
						<tr>
							<th scope="col">NO</th>
							<th scope="col">제목</th>
							<th scope="col">글쓴이</th>
							<th scope="col">등록 일</th>
						</tr>
					</thead>
					<tbody id="contentsTbBody">
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