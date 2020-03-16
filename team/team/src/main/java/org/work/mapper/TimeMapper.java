package org.work.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface TimeMapper {

	//조회
	@Select("SELECT ID,PW,NAME FROM CUSTOMERS")
	public String getCustomer();
	
	//저장
	@Insert("")
	public int addCustomer();
	
	//수정
	@Update("")
	public int updateCustomer();
	
	
}
