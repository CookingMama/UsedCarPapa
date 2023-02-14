package com.usedcar.dev.repository;

import com.usedcar.dev.domain.dto.SellingList;
import com.usedcar.dev.domain.request.PutCarRequest;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SellingCarRepository {
    Integer putCar (PutCarRequest request);
    List<SellingList> findAllSelling();
    SellingList findOneSellingById(Integer id);
}
