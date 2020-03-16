package org.work.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.work.dto.CustomerDTO;

public interface TimeMapper {

	//조회
	@Select("SELECT ID,PW,NAME FROM CUSTOMERS")
	public String getCustomer();
	
	//저장
	@Insert("INSERT INTO CUSTOMERS2 (ID,PW,NAME) VALUES ( #{cus_id}, #{cus_pw}, #{cus_name}) ")
	public void addCustomer(CustomerDTO dto);

	//수정
	@Update("")
	public int updateCustomer();
	
	
}
