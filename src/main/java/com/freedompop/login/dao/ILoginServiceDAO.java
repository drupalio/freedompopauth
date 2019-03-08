package com.freedompop.login.dao;

import com.freedompop.login.bussiness.dto.TokenDtoInt;
import com.freedompop.login.bussiness.dto.UserDtoInt;

public interface ILoginServiceDAO {
	public TokenDtoInt singing(final UserDtoInt user);
}
