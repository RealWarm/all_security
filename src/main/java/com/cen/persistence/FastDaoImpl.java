package com.cen.persistence;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.cen.controller.CommonController;

import lombok.extern.log4j.Log4j;
import lombok.extern.slf4j.Slf4j;

//@Log4j
@Slf4j
@Repository
public class FastDaoImpl implements FastDao {
	
	@Inject
	private SqlSession session;
	
	private static final String namespace="com.cen.mapper.BoardMapper";

	@Override
	public String create() throws Exception {
		return session.selectOne(namespace + ".create");
	}//create
	
}//end class
