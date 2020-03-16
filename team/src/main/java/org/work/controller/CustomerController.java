package org.work.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.work.dto.CustomerDTO;
import org.work.mapper.TimeMapper;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;

@Controller
@RequestMapping("/customer/*")
@AllArgsConstructor
@Log4j
public class CustomerController {
	// 각자 기능 구현.
	private HttpServletRequest request;
	private final TimeMapper mapper;

	@GetMapping("/insert")
	public String insert(CustomerDTO dto) {
		log.info("saving....10%");

		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		String name = request.getParameter("name");

		dto.setCus_id(id);
		dto.setCus_pw(pw);
		dto.setCus_name(name);
		
		log.info(dto.getCus_id());
		log.info(dto.getCus_pw());
		log.info(dto.getCus_name());
		
		mapper.addCustomer(dto);
		
		log.info("saving....20%");

		
		return "/customer";
	}
}
