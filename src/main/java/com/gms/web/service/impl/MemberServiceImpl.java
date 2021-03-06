package com.gms.web.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gms.web.domain.MemberDTO;
import com.gms.web.repository.MemberDAO;
import com.gms.web.service.MemberService;
@Service  //싱글톤 패턴
public class MemberServiceImpl implements MemberService {
	@Autowired MemberDAO memberDAO;
	@Override
	public void add(MemberDTO p) {
		memberDAO.insert(p);
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
	public MemberDTO retrieve(MemberDTO p) {
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
	public void remove(MemberDTO p) {
		memberDAO.remove(p);
	}

	@Override
	public boolean login(Map<?, ?> p) {
		// TODO Auto-generated method stub
		return false;
	}

}
