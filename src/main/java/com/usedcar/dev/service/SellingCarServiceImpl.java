package com.usedcar.dev.service;

import com.usedcar.dev.domain.request.PutCarRequest;
import com.usedcar.dev.repository.SellingCarRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class SellingCarServiceImpl implements SellingCarService{
    private final SellingCarRepository sellingCarRepository;

    @Override
    public Integer putCar(PutCarRequest request) {
        return sellingCarRepository.putCar(request);
    }
}
