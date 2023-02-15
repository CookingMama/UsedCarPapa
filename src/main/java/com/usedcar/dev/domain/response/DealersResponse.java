package com.usedcar.dev.domain.response;

import com.usedcar.dev.security.DealerTokenInfo;
import com.usedcar.dev.security.TokenInfo;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class DealersResponse {
    private Integer id;
    private String name;
    private String phoneNumber;
    private String local; //지역
    private String nickName;
    private String email;
    private String companyName;
    private String position;
    private Integer matchCount;
    private String token;

    public DealersResponse(String token, DealerTokenInfo tokenInfo) {
        this.id = tokenInfo.getId();
        this.name = tokenInfo.getName();
        this.phoneNumber = tokenInfo.getPhoneNumber();
        this.local = tokenInfo.getLocal();
        this.nickName = tokenInfo.getNickName();
        this.email = tokenInfo.getEmail();
        this.companyName = tokenInfo.getCompanyName();
        this.position = tokenInfo.getPosition();
        this.matchCount = tokenInfo.getMatchCount();

        this.token = token;
    }


}
