package com.gms.web.controller;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gms.web.domain.MemberDTO;

@Controller
@RequestMapping("/member")
public class MemberController {
	static final Logger logger = LoggerFactory.getLogger(MemberController.class);
	@Autowired MemberDTO member; 
	// MemberDTO m = new MemberDTO(); ← 최 악 의 코 드 IOC에선 스프링이 객체를 다 만드는데 개발자가 만들이유가 없습니다
	@RequestMapping("/add")
	public void add() {}

	@RequestMapping("/list")
	public void list() {}
	
	@RequestMapping("/search")
	public void search() {}

	@RequestMapping("/retrieve")
	public void retrieve() {}

	@RequestMapping("/count")
	public void count() {}

	@RequestMapping("/modify")
	public void modify() {}

	@RequestMapping("/remove")
	public void remove() {}

	public String login() {
		logger.info("\n --------- MemberController {} !!--------","login()");
		return "login_success";
	}
	@RequestMapping("/logout")
	public String logout() {
		logger.info("\n --------- MemberController {} !!--------","logout()");
		return "redirect:/";
}
	
	@RequestMapping("/fileUpload")
	public void fileUpload() {}
	
}
