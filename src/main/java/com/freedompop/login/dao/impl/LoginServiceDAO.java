package com.freedompop.login.dao.impl;

import org.springframework.stereotype.Component;

import com.freedompop.login.bussiness.dto.UserDtoInt;
import com.freedompop.login.dao.ILoginServiceDAO;

@Component("loginServiceDAO")
public class LoginServiceDAO  implements ILoginServiceDAO{

	@Override
	public String singing(UserDtoInt user) {
		return "holaa";
	}

}
