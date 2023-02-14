package com.usedcar.dev.service;

import com.usedcar.dev.domain.dto.SellingList;
import com.usedcar.dev.domain.request.PutCarRequest;
import com.usedcar.dev.domain.request.SuccessDealRequest;
import com.usedcar.dev.domain.response.AllSellingResponse;
import com.usedcar.dev.domain.response.OneSellingResponse;
import com.usedcar.dev.repository.SellingCarRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class SellingCarServiceImpl implements SellingCarService{
    private final SellingCarRepository sellingCarRepository;

    @Override
    public Integer putCar(PutCarRequest request) {
        return sellingCarRepository.putCar(request);
    }

    @Override
    public List<AllSellingResponse> findAllSellingList() {
        List<AllSellingResponse> allSellingResponses = new ArrayList<>();
        List<SellingList> sellingLists = sellingCarRepository.findAllSelling();
        for (SellingList sellingList : sellingLists) {
            AllSellingResponse allSellingResponse = new AllSellingResponse(sellingList);
            if (allSellingResponse.getBuyDate().length()==5){
                allSellingResponse.setBuyDate(allSellingResponse.getBuyDate().substring(0,4) + "0" +
                        allSellingResponse.getBuyDate().substring(4));
            }
            allSellingResponses.add(allSellingResponse);
        }
        return allSellingResponses;
    }

    @Override
    public OneSellingResponse findOneSellingById(Integer id) {
        SellingList sellingList = sellingCarRepository.findOneSellingById(id);
        OneSellingResponse oneSellingResponse = new OneSellingResponse(sellingList);
        if (oneSellingResponse.getBuyDate().length()==5){
            oneSellingResponse.setBuyDate(oneSellingResponse.getBuyDate().substring(0,4) + "0" +
                    oneSellingResponse.getBuyDate().substring(4));
        }
        return oneSellingResponse;
    }

    @Override
    public Integer successDeal(SuccessDealRequest request) {
        return sellingCarRepository.successDeal(request);
    }


}
