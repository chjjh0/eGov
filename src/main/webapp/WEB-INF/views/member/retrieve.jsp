<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<script> 
String s = "${user.memberId}";
session.setAttribute("usert", s);
</script>
<div id="content-box">
<html>
<head>
<script src="${context}/resources/js/app.js"></script>
</head>
<body>
	<table>
		<tr>
			<td rowspan="3">
				<img id="profile" src="${img}${profile}" />
			</td>
			<td>아이디</td>
			<td id="retrieveMemberId" colspan="2">${user.memberId}</td>
		</tr>
		<tr>
			<td>이름</td>
			<td colspan="2">${user.name}</td>
		</tr>
		<tr>
			<td><a>비밀번호</a></td>
			<td colspan="2">**********</td>
		</tr>
		<tr>
			<td>나이</td>
			<td>${user.age}</td>
			<td><a>팀명</a></td>
			<td>${user.teamId}</td>
		</tr>
		<tr>
		<td>성별</td>
		<td>${user.gender}</td>
		<td><a>역활</a></td>
		<td>${user.roll}</td>
		</tr>
	</table>
		<a id="moveUpdateForm">정보수정</a> &nbsp; &nbsp; &nbsp;
		<a id="moveRemoveForm">회원탈퇴</a> &nbsp; &nbsp; &nbsp;
		<a id="logout">로그아웃</a>
</div>
<script>
app.user.set('${user.memberId}');
</script>
</body>
</html>