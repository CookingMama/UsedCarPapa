package com.usedcar.dev.service;

import com.usedcar.dev.domain.request.PutCarRequest;
import com.usedcar.dev.domain.response.AllSellingResponse;
import com.usedcar.dev.domain.response.OneSellingResponse;

import java.util.List;

public interface SellingCarService {
    Integer putCar(PutCarRequest request);
    List<AllSellingResponse> findAllSellingList();
    OneSellingResponse findOneSellingById(Integer id);
}
