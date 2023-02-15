package com.usedcar.dev.security;

import io.jsonwebtoken.Claims;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class DealerTokenInfo {
    private Integer id;
    private String name;
    private String phoneNumber;
    private String local; //지역
    private String nickName;
    private String email;
    private String companyName;
    private String position;
    private Integer matchCount;
    public DealerTokenInfo parseToken(Claims claims) {
        Integer id = (Integer) claims.get("id");
        String name = (String) claims.get("name");
        String phone_number = (String) claims.get("phoneNumber");
        String local = (String) claims.get("local");
        String nick_name = (String) claims.get("nickName");
        String email = (String) claims.get("email");
        String company_name = (String) claims.get("companyName");
        String position = (String) claims.get("position");
        Integer match_count = (Integer) claims.get("nickName");

        return new DealerTokenInfo(id,name,phone_number,local,nick_name,email,company_name,position,match_count);
    }
}
