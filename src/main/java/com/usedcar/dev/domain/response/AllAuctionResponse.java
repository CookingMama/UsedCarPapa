package com.usedcar.dev.domain.response;

import com.usedcar.dev.domain.dto.ActionList;
import com.usedcar.dev.domain.dto.SellingList;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @ToString
@RequiredArgsConstructor
public class AllAuctionResponse {
    private Integer startingPrice;
    private Integer biddingPrice;
    private String  sellerName;
    private String dealerName;
    public AllAuctionResponse(ActionList actionList){
        this.startingPrice = actionList.getStartingPrice();
        this.biddingPrice = actionList.getBiddingPrice();
        this.sellerName = actionList.getSellerName();
        this.dealerName = actionList.getDealerName();
    }
}
