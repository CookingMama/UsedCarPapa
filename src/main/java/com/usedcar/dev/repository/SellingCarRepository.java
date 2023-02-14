package com.usedcar.dev.repository;

import com.usedcar.dev.domain.request.PutCarRequest;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface SellingCarRepository {
    Integer putCar (PutCarRequest request);
}
