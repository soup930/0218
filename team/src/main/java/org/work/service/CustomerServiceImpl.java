package org.work.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.work.dto.CustomerDTO;
import org.work.mapper.CustomerMapper;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;

@Log4j
@Service
@AllArgsConstructor
public class CustomerServiceImpl implements CustomerService{
	
	private CustomerMapper mapper;

	@Override
	public void register(CustomerDTO customer) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<CustomerDTO> getList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CustomerDTO get(String ID) {
		// TODO Auto-generated method stub
		return null;
	}

}
