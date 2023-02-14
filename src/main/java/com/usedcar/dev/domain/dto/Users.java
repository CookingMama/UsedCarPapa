package com.usedcar.dev.domain.dto;

import com.usedcar.dev.domain.request.SignupRequest;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Users {
    private Integer id;
    private String userId;
    private String userPw;
    private String name;
    private String phoneNumber;
    private String local; //지역
    private String nickName;
    private String email;

    public Users(Integer id, SignupRequest request) {
        this.id = id;
        this.userId = request.getUserId();
        this.userPw = request.getUserPw();
        this.name = request.getName();
        this.phoneNumber = request.getPhoneNumber();
        this.local = request.getLocale();
        this.nickName = request.getNickName();
        this.email = request.getEmail();
    }
}
