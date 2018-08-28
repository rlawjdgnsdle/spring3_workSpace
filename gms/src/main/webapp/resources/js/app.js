"use strict"; // 엄격한 문법을 적용하세요(근엄) 틀리면 에러처리하라는 명령어(진지)
var app = app  || {}; 
app = {
		init : x =>{
			console.log('step 1');
			app.session.context(x);  // 저장장소 각자 사용자의 모니터 세션에다가 제일 먼저 저장해야하는 것 : 경로
			app.onCreate();
			
		},
		onCreate : ()=>{
			console.log('step 3');
			app.setContentView();
			$('#login_btn').click(()=>{ //로그인버튼
				location.href = app.x()+'/move/auth/member/login';
			}); 
			$('#login_submit').click(()=>{ // 제출버튼
				location.href = app.x()+'/member/login/'
				+document.loginForm.memid.value+'/'
				+document.loginForm.pass.value;
			}); 
			
			$('#join_btn').click(()=>{
				location.href = app.x()+"/move/auth/member/add";
			});
			
			$('#joinBth').click(function(){
				alert('joinBth click');
				$('#joinBth')
				.attr({
					action:app.x()+'member/add',
					method:"POST"
				})
				.submit();
				location.href = app.x()+"/move/auth/member/add";
			/*	옛날방식
			 	$('#joinBth')
				.click(()=>{
						var form = document.getElementById('joinForm');
						form.action = x.context+"/member/add";
						form.method = "POST"; 
						form.submit();
					});*/
				
				
			});
			
			$('#logout_btn').click(()=>{
				location.href = app.x()+'/member/logout';
			});
		
			
		},		
		setContentView : ()=>{
			
			console.log('step 4 : '+app.j());
		}
		
};
app.session = {
		context : x=>{
			console.log('step 2 : '+x);
			sessionStorage.setItem('context',x);
			sessionStorage.setItem('js',x+'/resources/js');
			sessionStorage.setItem('css',x+'/resources/css');
			sessionStorage.setItem('img',x+'/resources/img');
		},
		path : x=>{
			return sessionStorage.getItem(x);
		}
}; // 객체 기반 생성… 

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
