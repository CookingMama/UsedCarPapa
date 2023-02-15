package com.usedcar.dev.domain.request;


import lombok.*;

@Getter @Setter @ToString
@AllArgsConstructor
@NoArgsConstructor
public class PutCarOnAuctionRequest {
    private Integer sellingCarId;
    private Integer startPrice;
    private Integer dealerId;
    private Integer bettingPrice;
    private Integer auctionCheck;

}
