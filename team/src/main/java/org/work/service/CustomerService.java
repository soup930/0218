package org.work.service;

import java.util.List;

import org.work.dto.CustomerDTO;

public interface CustomerService {

	//레지스터
	public void register(CustomerDTO customer);
	
	//전체 조회하기
	public List<CustomerDTO> getList();
	
	//조회하기
	public CustomerDTO get(String ID);
}
