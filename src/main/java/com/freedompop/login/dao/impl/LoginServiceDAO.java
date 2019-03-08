package com.freedompop.login.dao.impl;

import java.util.Base64;
import java.util.UUID;

import javax.sql.DataSource;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.freedompop.login.bussiness.dto.TokenDtoInt;
import com.freedompop.login.bussiness.dto.UserDtoInt;
import com.freedompop.login.commons.BussinesServiceException;
import com.freedompop.login.dao.ILoginServiceDAO;
import com.freedompop.login.dao.TokenRepository;
import com.freedompop.login.dao.UserRepository;
import com.freedompop.login.entities.TokenEntity;
import com.freedompop.login.entities.UserEntity;

@Transactional
@Repository("loginServiceDAO")
public class LoginServiceDAO implements ILoginServiceDAO {

	@Autowired
	DataSource dataSource;

	@Autowired
	UserRepository userRepositorory;
	
	@Autowired
	TokenRepository  tokenRepository;

	@Override
	public TokenDtoInt singing(UserDtoInt user) {
		UUID random= UUID.randomUUID();
		Iterable<UserEntity> systemlist = userRepositorory.findAll();
		TokenDtoInt response=new TokenDtoInt();
		for (UserEntity userdb : systemlist) {
			if(StringUtils.equalsIgnoreCase(user.getUserName(), userdb.getUsername())) {
				if(StringUtils.equalsIgnoreCase(user.getPassword(), userdb.getPassword())){
					byte[] encoded=Base64.getEncoder().encode(String.format("%s%s%s",user.getUserName(),user.getPassword(),random).getBytes());
					String token=new String(encoded);
					response.setToken(token);
					TokenEntity tokenentity =new TokenEntity();
					tokenentity.setUsername(user.getUserName());
					tokenentity.setToken(token);
					tokenRepository.save(tokenentity);
					return response;
				}
			}
		}
		throw new BussinesServiceException("No existe el usuario");
	}

}
