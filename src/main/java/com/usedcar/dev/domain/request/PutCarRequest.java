package com.usedcar.dev.domain.request;

import lombok.*;

import java.time.LocalDateTime;

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
    private String buyDate; // 0000Y00M
    private Integer price;
}
