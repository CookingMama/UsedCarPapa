package com.usedcar.dev.domain.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class DealerLoginRequest {
    private String dealerId;
    private String dealerPw;
}
