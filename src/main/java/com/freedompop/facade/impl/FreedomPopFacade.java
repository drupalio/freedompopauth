package com.freedompop.facade.impl;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.freedompop.facade.IFredomPopFacade;

@RestController
public class FreedomPopFacade implements IFredomPopFacade {
	
	@RequestMapping("/")
	public String index() {
		return "Greetings from Spring Boot!";
	}

}
