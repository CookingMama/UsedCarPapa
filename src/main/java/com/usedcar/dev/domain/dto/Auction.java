package com.usedcar.dev.domain.dto;
import lombok.*;

@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Auction {
    private Integer id;
    private Integer sellingCarId;
    private Integer startPrice;
    private Integer dealerId;
    private Integer bettingPrice;
    private Integer auctionCheck;

}
