<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<div id="content-box">
	<table>
		<tr>
			<td rowspan="3">
				<img id="profile" src="${img}${profile}" />
			</td>
			<td>아이디</td>
			<td id="memberId" colspan="2"></td>
		</tr>
		<tr>
			<td>이름</td>
			<td id="namet" colspan="2"></td>
		</tr>
		<tr>
			<td><a>비밀번호</a></td>
			<td colspan="2">**********</td>
		</tr>
		<tr>
			<td>나이</td>
			<td id="age"></td>
			<td><a>팀명</a></td>
			<td id="teamId"></td>
		</tr>
		<tr>
		<td>성별</td>
		<td id="gender"></td>
		<td><a>역활</a></td>
		<td id="roll"></td>
		</tr>
	</table>
		<a id="moveUpdateForm">정보수정</a> &nbsp; &nbsp; &nbsp;
		<a id="moveRemoveForm">회원탈퇴</a> &nbsp; &nbsp; &nbsp;
		<a id="logout">로그아웃</a>
</div>
<script>
$(memberId).text("${user.memberId}");
$(namet).text("${user.name}");
$(age).text("${user.age}");
$(teamId).text("${user.teamId}");
$(gender).text("${user.gender}");
$(roll).text("${user.roll}");
app.user.set('${user.memberId}');
</script>
