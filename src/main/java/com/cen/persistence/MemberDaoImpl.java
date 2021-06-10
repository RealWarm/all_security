package com.cen.persistence;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.cen.domain.MemberVO;

import lombok.extern.log4j.Log4j;


@Log4j
@Repository
public class MemberDaoImpl implements MemberDao{
		
	@Inject
	private SqlSession session;
	
	private static final String namespace="com.cen.mapper.MemberMapper";

	@Override
	public MemberVO read(String userid) {
		log.info("MemberDaoImpl :: read() invoked!!!!!!!!!!!!!!!!!!");		
		return session.selectOne(namespace+".read", userid);
	}//read

}//end class
