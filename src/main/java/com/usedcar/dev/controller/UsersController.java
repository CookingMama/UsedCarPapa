package com.usedcar.dev.controller;

import com.usedcar.dev.domain.request.LoginRequest;
import com.usedcar.dev.domain.request.SignupRequest;
import com.usedcar.dev.domain.response.UsersResponse;
import com.usedcar.dev.security.SecurityService;
import com.usedcar.dev.service.UsersService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/users")
public class UsersController {
    private final UsersService usersService;
    private final SecurityService securityService;

    @PostMapping("/login")
    public UsersResponse login (@RequestBody LoginRequest loginRequest) {
        return usersService.loginService(loginRequest);
    }

    @PostMapping("/signup")
    public UsersResponse signup (@RequestBody SignupRequest signupRequest) {
        return usersService.signupService(signupRequest);
    }

}
