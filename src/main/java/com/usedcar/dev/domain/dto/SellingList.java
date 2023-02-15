package com.usedcar.dev.domain.dto;

import lombok.*;

@Getter @Setter @ToString
@AllArgsConstructor @NoArgsConstructor
public class SellingList {
    private String seller;
    private String manufacturer;
    private String model;
    private String detailModel;
    private String carType;
    private String buyDate;
    private String color;
    private String fuel;
    private String driveType;
    private Integer mileage;
    private Integer price;
    private String location;

}
