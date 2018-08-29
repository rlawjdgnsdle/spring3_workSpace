package com.gms.web.mapper;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.gms.web.domain.MemberDTO;
import com.gms.web.repository.MemberDAO;

@Repository
public class MemberMapper implements MemberDAO{
@Autowired SqlSessionFactory factory;
private static final String ns = "com.gms.web.mapper.MemberMapper"; // mapper.xml 의 namespace에서 온 것
	@Override
	public void add(MemberDTO p) {
		System.out.println("==MemberDTO add=="+"///=="+ns+".add");
		factory.openSession().insert(ns+".add",p);
	}
	
	@Override
	public List<?> selectList(Map<?, ?> p) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<?> selectSome(Map<?, ?> p) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public MemberDTO selectOne(Map<?, ?> p) {
		SqlSession sqlSession = factory.openSession();
		System.out.println("==MemberDTO selectOne== 서비스 retrieve 에서 받아온 "+p.get("MEMID"));
		return (MemberDTO) sqlSession.selectOne(ns+".selectOne",p);
	}
//
	@Override
	public int count(Map<?, ?> p) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void update(MemberDTO p) {
		
	}

	@Override
	public void delete(MemberDTO p) {
		// TODO Auto-generated method stub
	}

	@Override
	public MemberDTO login(Map<?, ?> p) {
		SqlSession sqlSession = factory.openSession();
		System.out.println("===========MemberDTO login============="+p.get("MEMID"));
		return sqlSession.selectOne(ns+"login",p);
	}
}
