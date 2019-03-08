package com.freedompop.login.bussiness;

import com.freedompop.login.bussiness.dto.TokenDtoInt;
import com.freedompop.login.bussiness.dto.UserDtoInt;

public interface ILoginServiceInt {
	public TokenDtoInt singing(UserDtoInt user);
}
