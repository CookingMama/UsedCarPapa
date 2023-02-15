package com.usedcar.dev.domain.request;

import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class DealerSignupRequest {
    private String dealerId;
    private String dealerPw;
    private String name;
    private String phoneNumber;
    private String locale; // 지역
    private String nickName; //닉네임
    private String email; //이메일 주소
    private String companyName;
    private String position;
    private Integer matchCount;

}
