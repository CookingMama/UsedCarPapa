package com.usedcar.dev.domain.dto;

import lombok.*;

@Getter @Setter @ToString
@AllArgsConstructor
@NoArgsConstructor
public class ActionList {
    private Integer startingPrice;
    private Integer biddingPrice;
    private String  sellerName;
    private String dealerName;

}
