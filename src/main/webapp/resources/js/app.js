"use strict";
var app = app || {};
app = {
		init : x =>{	
			console.log("step1");
			app.session.context(x);
			app.onCreate(x);
		},
		onCreate : ()=>{
			console.log("step3");
			app.setContentView();
			/* join */
			$('#join').click(()=>{
				alert('Join Page');
				location.href = app.x()+"/move/join/member/add";
			});
			$('#join_bth').click(()=>{
				alert('join_btn');
				$('#joinForm').attr({
				    action:app.x()+"/member/add",
				    method:"POST"
				}).submit();
			});
			/* search */
			$('#search').click(()=>{
				alert('Search Page');
				location.href = app.x()+"/move/search/member/search_navi";
			});
			/* login */
			$('#login').click(()=>{
				alert('Login Page');
				location.href = app.x()+"/move/login/member/login";
			});
			$('#login_btn').click(()=>{
				alert('Login Succes!!!');
				location.href = app.x()+"/member/login/"
				+document.loginForm.memberId.value
				+"/"
				+document.loginForm.pass.value;
			});
			/* logout */
			$('#logout').click(()=>{
				alert('logout...');
				location.href = app.x()+"/member/logout";
			});
			
			/* update */
			$('#moveUpdateForm').click(()=>{
				alert('Update Page');
				location.href = app.x()+"/member/modify/"+app.user.get('user');
			});
			/* remove */
			$('#moveRemoveForm').click(()=>{
				alert('remove page');
				location.href = app.x()+"/move/remove/member/remove";
			});
			$('#remove_btn').click(()=>{
				alert('remove_btn');
				$('#removeForm').attr({
				    action:app.x()+"/member/remove/"+app.user.get('user'),
				    method:"POST"
				}).submit();
			});
			
		},
		setContentView : ()=>{
			console.log("step4 : "+ app.j());
		}
};
app.user = {
		set : x=>{
			sessionStorage.setItem("user",x);
		},
		get : x=>{
			return sessionStorage.getItem(x);
		}
},
app.session = {
		context : x=>{
			console.log("step2 : "+x);
			sessionStorage.setItem("context",x);
			sessionStorage.setItem("css",x+"/resources/css");
			sessionStorage.setItem("img",x+"/resources/img");
			sessionStorage.setItem("js",x+"/resources/js");
		},
		path : x=>{
			return sessionStorage.getItem(x);
		}
};
app.x = ()=>{
	return app.session.path('context');
};
app.j = ()=>{
	return app.session.path('js');
};
app.c = ()=>{
	return app.session.path('css');
};
app.i = ()=>{
	return app.session.path('img');
};