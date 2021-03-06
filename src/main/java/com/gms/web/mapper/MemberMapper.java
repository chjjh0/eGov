package com.gms.web.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.gms.web.domain.MemberDTO;
import com.gms.web.repository.MemberDAO;
@Repository //템플릿 패턴역활
public class MemberMapper implements MemberDAO{
	@Autowired SqlSessionFactory factory;
	private static final String ns =
			"com.gms.web.mapper.MemberMapper";
	
	@Override
	public void insert(MemberDTO p) {
		System.out.println("MemberMapper_insert");
		SqlSession sqlSession = factory.openSession();
		sqlSession.insert(ns+".insert",p);
		System.out.println("MemberMapper_insert_complete");
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
	public MemberDTO selectOne(MemberDTO p) {
		System.out.println("MemberMapper_selectOne");
		SqlSession sqlSession = factory.openSession();
		return (MemberDTO) sqlSession.selectOne(ns+".selectOne",p);
	}

	@Override
	public int count(Map<?, ?> p) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void update(Map<?, ?> p) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remove(MemberDTO p) {
		System.out.println("MemberMapper_remove");
		System.out.println("memberId : "+p.getMemberId());
		SqlSession sqlSession = factory.openSession();
		sqlSession.delete(ns+".delete",p);
		System.out.println("MemberMapper_remove_complete");
	}

	@Override
	public boolean login(Map<?, ?> p) {
		// TODO Auto-generated method stub
		return false;
	}

}
