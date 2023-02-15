package com.usedcar.dev.domain.response;

import com.usedcar.dev.domain.dto.SellingList;
import lombok.*;

@Getter @Setter @ToString
@RequiredArgsConstructor
public class OneSellingResponse {
    private String seller;
    private String manufacturer;
    private String model;
    private String detailModel;
    private String carType;
    private String buyDate; // buyYear + buyMonth
    private String color;
    private String fuel;
    private String driveType;
    private Integer mileage;
    private Integer price;
    private String location;

    public OneSellingResponse(SellingList sellingList){
        this.seller = sellingList.getSeller();
        this.manufacturer = sellingList.getManufacturer();
        this.model = sellingList.getModel();
        this.detailModel = sellingList.getDetailModel();
        this.carType = sellingList.getCarType();
        this.buyDate = sellingList.getBuyDate();
        this.color = sellingList.getColor();
        this.fuel = sellingList.getFuel();
        this.driveType = sellingList.getDriveType();
        this.mileage = sellingList.getMileage();
        this.price = sellingList.getPrice();
        this.location = sellingList.getLocation();
    }
}
