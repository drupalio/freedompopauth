package com.freedompop.login.dao;

import org.springframework.data.repository.CrudRepository;

import com.freedompop.login.entities.TokenEntity;

public interface TokenRepository extends CrudRepository<TokenEntity,Integer> {

}
