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
		<h1>�� �� �� û ��</h1>
	</div>
		<!-- vacation table ���� -->
		<div class="vac_table">
			<table width= 1200 border=1 cellpadding=0 cellspacing=0 align="center">
				<tr>
	
					<td rowspan="3">��ȼ� ����</td>
					<td>��ȼ� ��ȣ</td>
					<td colspan="3"><input type="text" name="draft_id" size = 65></td>
					<td>��ȼ� �̸�</td>
					<td colspan="3"><input type="text" name="draft_name" size = 65></td>
		
				</tr>
				<tr>
					<!-- ��ȼ� ����  -->
					<td>��ȼ� ����</td>
					<td colspan="3"><input type="text" name="draft_title" size = 65></td>
					<td>��� ��¥</td>
					<td colspan="3">draft_date</td>
					
		
				</tr>
				<tr>
					<!-- ��ȼ� ���� -->
					<td>��ȼ� ���</td>
					<td colspan="3">
					<select name="schType" value="schType">
							<option value = "all">�������</option>
							<option value = "2">����</option>
							<option value = "3">�쿧</option>
							<option value = "4">�ް���û��</option>
							<option value = "5">�����ް���û��</option>
		
					</select></td>
					<td>��������</td>
					<td colspan="3"><input type="text" name="draft_year"></td>
					
		
				</tr>
		
				<tr>
					<td rowspan="3">���� ����</td>
					<td>�Ҽ� �μ� </td>
					<td colspan="7">�Ҽ��̸�</td>
				</tr>
				<tr>
		
					<td>����</td>
					<td colspan="7">�����̸�</td>
				</tr>
				<tr>
		
					<td>����</td>
					<td colspan="7">emp_name</td>
				</tr>
				<tr>
					<td rowspan="4">��û����</td>
					<td rowspan="3">�ް���û</td>
					<td>�ް�����</td>
					<td colspan = "6">
					 <input type="radio" checked name="radio"> ����
		  			 <input type="radio" name="radio"> ���� ����
		   			<input type="radio" name="radio"> ���� ����
		   			<input type="radio" name="radio"> ����
					</td>
			
				
				</tr>
				<tr>
					<!-- ��û����   -->
					<!-- �ް���û   -->
					<td>�ް� ����</td>
					<td>���۳�¥</td>
					<td><input type="text" id ="Startdatepicker"> 
					<td>�� ��¥</td>
					<td><input type="text" id ="Enddatepicker"> 
					<td>�� �� ��</td>
					<td>��� ��� ����..</td>
				</tr>
				<tr>
					<!-- ��û����   -->
					<!-- �ް���û   -->
					<td>��ü�ٹ���</td>
					<td>�μ�</td>
					<td><input type="text" value ="replace_dep"> 
					<td>�̸�</td>
					<td><input type="text" value ="replace_name"> 
					<td>����</td>
					<td><input type="text" value ="replace_deg"> 
				</tr>
				<tr>
					<!-- ��û����   -->
					<td>�� û �� �� <Br>(���� ���� ����)	</td>
					<!-- ���γ������   -->
					<td colspan = "7"> 
						<textarea rows="6" cols="120" name="vacation_reason">
						���� ���� ����
						</textarea>
					 </td>
		
				</tr>
				
		
			</table>
		</div> <!-- vacation table �� -->
			
			<div class = "flt_r">
				<br><br>
				<!-- <input type = "submit" value = "�����ϱ�" > -->
				<input type = "submit" value = "����" >
			</div>
		</div>
	</form>
</body>
</html>
</body>
</html>