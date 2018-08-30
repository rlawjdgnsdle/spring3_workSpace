package com.gms.web.service.impl;

import java.text.SimpleDateFormat;
import java.util.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gms.web.domain.MemberDTO;
import com.gms.web.mapper.MemberMapper;
import com.gms.web.service.MemberService;

@Service
public class MemberServiceImpl implements MemberService {
	@Autowired
	MemberMapper memberDAO;
	private static final Logger logger = LoggerFactory.getLogger(MemberServiceImpl.class);
	@Override
	public void add(MemberDTO p) {
		logger.info("==ServiceImpl==");
		String ssn = p.getSsn();
		System.out.println("ssn : "+ssn);
		System.out.println(""+new SimpleDateFormat("yyyy").format(new Date()));
		String gender = String.valueOf(ssn.charAt(7));
		if(Integer.parseInt(gender)+2%2==1) {
			gender = "남자";
		}else {
			gender = "여자";
		}
		System.out.println("담겨야 할 gender값은? : "+gender);
		System.out.println("담겨야 할 age 값은? : "+String.valueOf(
				Integer.parseInt(new SimpleDateFormat("yyyy").format(new Date()))+ 1
				- (Integer.parseInt(ssn.substring(0,2)) + 1900)));
		
		p.setAge(String.valueOf(
				Integer.parseInt(new SimpleDateFormat("yyyy").format(new Date())) + 1
				- Integer.parseInt(("19" + (ssn.substring(0,2))))));
		/*p.setAge(String.valueOf(
				Integer.parseInt(new SimpleDateFormat("yyyy").format(new Date()))+ 1
				- (Integer.parseInt(ssn.substring(0,2)) + 1900)));*/
		p.setGender(gender);
		memberDAO.add(p);
			
	}

	@Override
	public List<?> list(Map<?, ?> p) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<?> search(Map<?, ?> p) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MemberDTO retrieve(Map<?, ?> p) {
		System.out.println("==서비스retrieve== MemberDTO로 갈 : " + p.get("memid"));
		return memberDAO.selectOne(p);
	}

	@Override
	public int count(Map<?, ?> p) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void modify(MemberDTO member) {
		memberDAO.update(member);
	}

	@Override
	public void remove(Map<?, ?> p) {
		// TODO Auto-generated method stub

	}

	@Override
	public MemberDTO login(Map<?, ?> p) {
		System.out.println("==서비스 login== MemberDTO로 갈 " + p.get("MEMID"));
		return memberDAO.login(p);
	}

}
