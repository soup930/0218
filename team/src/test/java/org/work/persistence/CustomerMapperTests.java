package org.work.persistence;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.work.mapper.CustomerMapper;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class CustomerMapperTests {

	@Setter(onMethod_ = @Autowired)
	private CustomerMapper CustomerMapper;
	
	@Test
	public void testGetTime() {
		CustomerMapper.getListCustomer().forEach(customer -> log.info(customer));
	
	}
}
