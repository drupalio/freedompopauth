package com.freedompop.login.bussiness.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.freedompop.login.bussiness.ILoginServiceInt;
import com.freedompop.login.dao.ILoginServiceDAO;

@Component("loginServiceIntImpl")
public class LoginServiceIntImpl  implements ILoginServiceInt{
	
	@Autowired
	@Qualifier("loginServiceDAO")
	private ILoginServiceDAO loginServiceDAO;
}
