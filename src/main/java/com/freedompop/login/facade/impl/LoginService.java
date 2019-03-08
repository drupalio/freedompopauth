package com.freedompop.login.facade.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.freedompop.login.bussiness.ILoginServiceInt;
import com.freedompop.login.bussiness.dto.UserDtoInt;
import com.freedompop.login.commons.BussinesServiceException;
import com.freedompop.login.commons.Mapper;
import com.freedompop.login.facade.ILoginService;
import com.freedompop.login.facade.dto.UserDto;

@RestController
public class LoginService implements ILoginService {

	@Autowired
	@Qualifier("loginServiceIntImpl")
	private ILoginServiceInt iLoginServiceInt;
	
	@Autowired
	@Qualifier("user-mapper")
	private Mapper<UserDtoInt, UserDto> userMapper;
	
	
	@Override
	@RequestMapping(value = "/", method = RequestMethod.POST)
	public void singin(UserDto user) {
		if(user!=null) {
			UserDtoInt innerUser=userMapper.mapToInner(user);
			
		}
		else {
			throw new BussinesServiceException("Payload de entrada NULO");
		}
	}
	


}
