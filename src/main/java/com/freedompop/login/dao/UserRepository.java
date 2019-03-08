package com.freedompop.login.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.freedompop.login.entities.UserEntity;

@Repository
public interface UserRepository extends CrudRepository<UserEntity,Integer> {}