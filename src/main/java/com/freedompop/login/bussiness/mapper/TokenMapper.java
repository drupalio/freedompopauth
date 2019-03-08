package com.freedompop.login.bussiness.mapper;

import org.springframework.stereotype.Component;

import com.freedompop.login.bussiness.dto.TokenDtoInt;
import com.freedompop.login.commons.Mapper;
import com.freedompop.login.facade.dto.TokenDto;

@Component("token-mapper")
public class TokenMapper implements Mapper<TokenDtoInt, TokenDto>{

	@Override
	public TokenDtoInt mapToInner(TokenDto outter) {
		TokenDtoInt inner=null;
		if(outter!=null) {
			inner=new TokenDtoInt();
			inner.setToken(outter.getToken());
		}
		return inner;
	}

	@Override
	public TokenDto mapToOutter(TokenDtoInt inner) {
		TokenDto outter=null;
		if(inner!=null) {
			outter=new TokenDto();
			outter.setToken(inner.getToken());
		}
		return outter;
	}

}
