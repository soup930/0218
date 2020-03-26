package org.work.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.work.dto.CustomerDTO;

public interface CustomerMapper {
	
	//조회
	//@Select("select * from customers")
	public List<CustomerDTO> getListCustomer();
	
	
}
