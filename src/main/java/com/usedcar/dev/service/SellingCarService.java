package com.usedcar.dev.service;

import com.usedcar.dev.domain.request.PutCarRequest;
import com.usedcar.dev.domain.request.SuccessDealRequest;
import com.usedcar.dev.domain.response.AllSellingResponse;
import com.usedcar.dev.domain.response.OneSellingResponse;
import io.swagger.v3.oas.models.security.SecurityScheme;

import java.util.List;

public interface SellingCarService {
    Integer putCar(PutCarRequest request);
    List<AllSellingResponse> findAllSellingList();
    OneSellingResponse findOneSellingById(Integer id);
    Integer successDeal(SuccessDealRequest request);
}
