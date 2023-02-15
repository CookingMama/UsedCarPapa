package com.usedcar.dev.domain.request;

import lombok.*;

@Getter @Setter @ToString
@AllArgsConstructor @NoArgsConstructor
public class PutCarRequest {
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
    private Integer buyYear;
    private Integer buyMonth;
    private Integer price;
}
