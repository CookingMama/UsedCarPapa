package com.usedcar.dev.domain.response;

import com.usedcar.dev.security.TokenInfo;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class UsersResponse {
    private Integer id;
    private String name;
    private String phoneNumber;
    private String local; //지역
    private String nickName;
    private String email;
    private String token;
    public UsersResponse(String token, TokenInfo tokenInfo) {
        this.id = tokenInfo.getId();
        this.name = tokenInfo.getName();
        this.phoneNumber = tokenInfo.getPhoneNumber();
        this.local = tokenInfo.getLocal();
        this.nickName = tokenInfo.getNickName();
        this.email = tokenInfo.getEmail();
        this.token = token;
    }
}
