package com.freedompop.login.facade;

import com.freedompop.login.facade.dto.TokenDto;
import com.freedompop.login.facade.dto.UserDto;

public interface ILoginService {
	
	public TokenDto singin(UserDto user);

}
