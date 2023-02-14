package com.usedcar.dev.domain.dto;

import lombok.*;

@Getter @Setter
@AllArgsConstructor @NoArgsConstructor
@Builder
public class SellingCar {
    private Integer id;
    private Integer sellerId;
    private Integer manufacturerId;
    private Integer modelId;
    private String carType;
    private Integer detailModelId;
    private String color;
    private String fuel;
    private String driveType;
    private Integer mileage;
    private String location;
    private Integer buyTear;
    private Integer buyMonth;
    private Integer price;
    private Integer buyerId;
    private Integer buyCheck;
}
