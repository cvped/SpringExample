package com.cvped.spring.ex.mvc.repository;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserRepository {

	
	public int insertUser(
			@Param("name")String name
			,@Param("birthday")String birthday
			,@Param("email")String email
			,@Param("introduce")String introduce);
}
