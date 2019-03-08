package com.freedompop.login.bussiness.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.freedompop.login.bussiness.ILoginServiceInt;
import com.freedompop.login.bussiness.dto.TokenDtoInt;
import com.freedompop.login.bussiness.dto.UserDtoInt;
import com.freedompop.login.dao.ILoginServiceDAO;

@Component("loginServiceIntImpl")
public class LoginServiceIntImpl  implements ILoginServiceInt{
	
	@Autowired
	@Qualifier("loginServiceDAO")
	private ILoginServiceDAO loginServiceDAO;

	@Override
	public TokenDtoInt singing(final UserDtoInt user) {
		TokenDtoInt out=loginServiceDAO.singing(user);
		return out;
	}
	
	
}
