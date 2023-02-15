package com.usedcar.dev.controller;

import com.usedcar.dev.domain.request.DealerLoginRequest;
import com.usedcar.dev.domain.request.DealerSignupRequest;
import com.usedcar.dev.domain.response.DealersResponse;
import com.usedcar.dev.security.SecurityService;
import com.usedcar.dev.service.DealersService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/dealers")
public class DealerController {
    private final DealersService dealersService;
    private final SecurityService securityService;

    @PostMapping("/login")
    public DealersResponse login (@RequestBody DealerLoginRequest loginRequest) {
        return dealersService.dealerLoginService(loginRequest);
    }

    @PostMapping("/signup")
    public DealersResponse signup (@RequestBody DealerSignupRequest signupRequest) {
        return dealersService.dealerSignupService(signupRequest);
    }
}
