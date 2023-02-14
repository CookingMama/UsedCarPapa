package com.usedcar.dev.domain.response;

import com.usedcar.dev.domain.dto.SellingList;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @ToString
@RequiredArgsConstructor
public class AllSellingResponse {
    private String seller;
    private String manufacturer;
    private String model;
    private String detailModel;
    private String carType;
    private String buyDate; // buyYear + buyMonth
    private Integer mileage;
    private Integer price;
    private String location;

    public AllSellingResponse(SellingList sellingList){
        this.seller = sellingList.getSeller();
        this.manufacturer = sellingList.getManufacturer();
        this.model = sellingList.getModel();
        this.detailModel = sellingList.getDetailModel();
        this.carType = sellingList.getCarType();
        this.buyDate = sellingList.getBuyDate();
        this.mileage = sellingList.getMileage();
        this.price = sellingList.getPrice();
        this.location = sellingList.getLocation();
    }

}
