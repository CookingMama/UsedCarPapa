package com.usedcar.dev.controller;


import com.usedcar.dev.domain.dto.ActionList;
import com.usedcar.dev.domain.request.PutCarOnAuctionRequest;
import com.usedcar.dev.domain.response.AllSellingResponse;
import com.usedcar.dev.service.AuctionService;
import com.usedcar.dev.service.SellingCarServiceImpl;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/auction")
public class AuctionController {

    private final AuctionService auctionService;

    @PostMapping("/upload")
    public Integer putCarOnActionPost(@RequestBody PutCarOnAuctionRequest request){
        return auctionService.putCarOnAuction(request);
    }

    @GetMapping("/list")
    public List<ActionList> findAllActionList () {
        return auctionService.findAllActionList();
    }




}
