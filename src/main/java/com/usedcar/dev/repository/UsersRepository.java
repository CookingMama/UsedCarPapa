package com.usedcar.dev.repository;


import com.usedcar.dev.domain.dto.Users;
import com.usedcar.dev.domain.request.LoginRequest;
import com.usedcar.dev.domain.request.SignupRequest;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UsersRepository {

   Users login (LoginRequest request) ;

   Integer signup (SignupRequest request) ;
}
