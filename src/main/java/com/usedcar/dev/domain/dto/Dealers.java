package com.usedcar.dev.domain.dto;

import com.usedcar.dev.domain.request.DealerSignupRequest;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Dealers {
    private Integer id;
    private String dealerId;
    private String dealerPw;
    private String name;
    private String phoneNumber;
    private String locale; //지역
    private String nickName;
    private String email;
    private String companyName;
    private String position;
    private Integer matchCount;

    public Dealers(Integer id, DealerSignupRequest request) {
        this.id = id;
        this.dealerId = request.getDealerId();
        this.dealerPw = request.getDealerPw();
        this.name = request.getName();
        this.phoneNumber = request.getPhoneNumber();
        this.locale = request.getLocale();
        this.nickName = request.getNickName();
        this.email = request.getEmail();
        this.companyName = request.getCompanyName();
        this.position = request.getPosition();
        this.matchCount = request.getMatchCount();
    }
}
