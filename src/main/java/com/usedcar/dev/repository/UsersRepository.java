package com.usedcar.dev.repository;


import com.usedcar.dev.domain.request.SignupRequest;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UsersRepository {

   Integer signup (SignupRequest request) ;
}
