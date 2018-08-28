package com.gms.web.service.impl;

import java.util.List;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gms.web.domain.MemberDTO;
import com.gms.web.repository.MemberDAO;
import com.gms.web.service.MemberService;

@Service
public class MemberServiceImpl implements MemberService {
	@Autowired
	MemberDAO memberDAO;

	@Override
	public void add(MemberDTO p) {
		System.out.println("==add Retrieve==");
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
		System.out.println("==서비스retrieve== MemberDTO로 갈 : " + p.get("MEMID"));
		return memberDAO.selectOne(p);
	}

	@Override
	public int count(Map<?, ?> p) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void modify(Map<?, ?> p) {
		// TODO Auto-generated method stub

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
