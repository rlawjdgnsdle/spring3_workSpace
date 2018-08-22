"use strict"; // 엄격한 문법을 적용하세요(근엄) 틀리면 에러처리하라는 명령어(진지)
var app = app  || {}; 
app = {
		init : x =>{
			alert('step 1');
			app.session.context(x);  // 저장장소 각자 사용자의 모니터 세션에다가 제일 먼저 저장해야하는 것 : 경로
			app.onCreate();
			
		},
		onCreate : ()=>{//
			alert('step 3');
			app.setContentView();
		},
		setContentView : ()=>{
			alert('step 4 : '+app.session.path('js'));
		}
		
};
app.session = {
		context : x=>{
			alert('step 2 : '+x);
			sessionStorage.setItem('context',x);
			sessionStorage.setItem('js',x+'/resources/js');
			sessionStorage.setItem('css',x+'/resources/css');
			sessionStorage.setItem('img',x+'/resources/img');
		},
		path : x=>{
			return sessionStorage.getItem(x);
		}
}; // 객체 기반 생성… 