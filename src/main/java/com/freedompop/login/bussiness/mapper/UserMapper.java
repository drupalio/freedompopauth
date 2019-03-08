package com.freedompop.login.bussiness.mapper;

import org.springframework.stereotype.Component;

import com.freedompop.login.bussiness.dto.UserDtoInt;
import com.freedompop.login.commons.Mapper;
import com.freedompop.login.facade.dto.UserDto;

@Component("user-mapper")
public class UserMapper implements Mapper<UserDtoInt, UserDto>{

	@Override
	public UserDtoInt mapToInner(UserDto outter) {
		UserDtoInt inner=null;
		if(outter!=null) {
			inner=new UserDtoInt();
			inner.setUserName(outter.getUserName());
			inner.setPassword(outter.getPassword());
		}
		return inner;
	}

	@Override
	public UserDto mapToOutter(UserDtoInt inner) {
		UserDto outer=null;
		if(inner!=null) {
			outer=new UserDto();
			outer.setUserName(inner.getUserName());
			outer.setPassword(inner.getPassword());
		}
		return outer;
	}

}
