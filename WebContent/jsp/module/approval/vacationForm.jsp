<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="/Kocofarm/css/common.css" />
<link rel="stylesheet" type="text/css" href="/Kocofarm/css/approval.css" />
<link rel="stylesheet" href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
  <link rel="stylesheet" href="/resources/demos/style.css">
  <script src="https://code.jquery.com/jquery-1.12.4.js"></script>
  <script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
  <script>
  $( function() {
    $( "#Startdatepicker" ).datepicker();
  } );
  
  $( function() {
	    $( "#Enddatepicker" ).datepicker();
	  } );
  </script>
</head>
<body>
	<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<style>
	td {
		text-align: center;
	}
	h1{
		text-align : center;
	}

	.flt_r{
	float:right;

	}
</style>
<form action= "apprInsertDraft.do" method = "post" >
<div class = "vacation_wrap">
	<div class = "title">
		<h1>휴 가 신 청 서</h1>
	</div>
		<!-- vacation table 시작 -->
		<div class="vac_table">
			<table width= 1200 border=1 cellpadding=0 cellspacing=0 align="center">
				<tr>
	
					<td rowspan="3">기안서 정보</td>
					<td>기안서 번호</td>
					<td colspan="3"><input type="text" name="draft_id" size = 65></td>
					<td>기안서 이름</td>
					<td colspan="3"><input type="text" name="draft_name" size = 65></td>
		
				</tr>
				<tr>
					<!-- 기안서 정보  -->
					<td>기안서 제목</td>
					<td colspan="3"><input type="text" name="draft_title" size = 65></td>
					<td>등록 날짜</td>
					<td colspan="3">draft_date</td>
					
		
				</tr>
				<tr>
					<!-- 기안서 정보 -->
					<td>기안서 양식</td>
					<td colspan="3">
					<select name="schType" value="schType">
							<option value = "all">지출명세서</option>
							<option value = "2">히잇</option>
							<option value = "3">헤엣</option>
							<option value = "4">휴가신청서</option>
							<option value = "5">유급휴가신청서</option>
		
					</select></td>
					<td>보존년한</td>
					<td colspan="3"><input type="text" name="draft_year"></td>
					
		
				</tr>
		
				<tr>
					<td rowspan="3">인적 사항</td>
					<td>소속 부서 </td>
					<td colspan="7">소속이름</td>
				</tr>
				<tr>
		
					<td>직위</td>
					<td colspan="7">직위이름</td>
				</tr>
				<tr>
		
					<td>성명</td>
					<td colspan="7">emp_name</td>
				</tr>
				<tr>
					<td rowspan="4">신청내용</td>
					<td rowspan="3">휴가신청</td>
					<td>휴가종류</td>
					<td colspan = "6">
					 <input type="radio" checked name="radio"> 병가
		  			 <input type="radio" name="radio"> 오전 반차
		   			<input type="radio" name="radio"> 오후 반차
		   			<input type="radio" name="radio"> 연차
					</td>
			
				
				</tr>
				<tr>
					<!-- 신청내용   -->
					<!-- 휴가신청   -->
					<td>휴가 일정</td>
					<td>시작날짜</td>
					<td><input type="text" id ="Startdatepicker"> 
					<td>끝 날짜</td>
					<td><input type="text" id ="Enddatepicker"> 
					<td>총 일 수</td>
					<td>계산 어떠케 하지..</td>
				</tr>
				<tr>
					<!-- 신청내용   -->
					<!-- 휴가신청   -->
					<td>대체근무자</td>
					<td>부서</td>
					<td><input type="text" value ="replace_dep"> 
					<td>이름</td>
					<td><input type="text" value ="replace_name"> 
					<td>직위</td>
					<td><input type="text" value ="replace_deg"> 
				</tr>
				<tr>
					<!-- 신청내용   -->
					<td>신 청 사 유 <Br>(세부 내용 기재)	</td>
					<!-- 세부내용기재   -->
					<td colspan = "7"> 
						<textarea rows="6" cols="120" name="vacation_reason">
						세부 내용 기재
						</textarea>
					 </td>
		
				</tr>
				
		
			</table>
		</div> <!-- vacation table 끝 -->
			
			<div class = "flt_r">
				<br><br>
				<!-- <input type = "submit" value = "저장하기" > -->
				<input type = "submit" value = "제출" >
			</div>
		</div>
	</form>
</body>
</html>
</body>
</html>