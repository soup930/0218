package org.work.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface TimeMapper {

	//��ȸ
	@Select("SELECT ID,PW,NAME FROM CUSTOMERS")
	public String getCustomer();
	
	//����
	@Insert("")
	public int addCustomer();
	
	//����
	@Update("")
	public int updateCustomer();
	
	
}
