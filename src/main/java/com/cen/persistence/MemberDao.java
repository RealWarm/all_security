package com.cen.persistence;

import com.cen.domain.MemberVO;

public interface MemberDao {

	public MemberVO read(String userid);
	
}//end interface
