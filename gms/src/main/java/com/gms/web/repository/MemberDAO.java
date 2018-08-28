package com.gms.web.repository;

import java.util.List;
import java.util.Map;

import com.gms.web.domain.MemberDTO;

public interface MemberDAO {
	public void add(MemberDTO p);
	public List<?> selectlist(Map<?, ?>p);
	public List<?> selectSome(Map<?, ?>p);
	public MemberDTO selectOne(Map<?, ?>p);
	public int count(Map<?, ?>p);
	public void update(Map<?, ?>p);
	public void delete(Map<?, ?>p);
	public MemberDTO login(Map<?, ?>p);
}
