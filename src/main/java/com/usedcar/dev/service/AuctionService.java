package com.usedcar.dev.service;

import com.usedcar.dev.config.A;
import com.usedcar.dev.domain.dto.ActionList;
import com.usedcar.dev.domain.dto.SellingList;
import com.usedcar.dev.domain.request.PutCarOnAuctionRequest;
import com.usedcar.dev.domain.response.AllAuctionResponse;
import com.usedcar.dev.domain.response.AllSellingResponse;
import com.usedcar.dev.repository.AuctionRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class AuctionService {
    private final AuctionRepository actionRepository;

    public Integer putCarOnAuction(PutCarOnAuctionRequest request) {
        return actionRepository.putCarOnAuction(request);
    }

    public List<ActionList> findAllActionList() {
        List<ActionList> actionLists = actionRepository.findAllAuction();
        return actionLists;


    }

}
