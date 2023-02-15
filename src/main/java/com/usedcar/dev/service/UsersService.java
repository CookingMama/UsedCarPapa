package com.usedcar.dev.service;


import com.usedcar.dev.domain.dto.Users;
import com.usedcar.dev.domain.request.LoginRequest;
import com.usedcar.dev.domain.request.SignupRequest;
import com.usedcar.dev.domain.response.UsersResponse;
import com.usedcar.dev.repository.UsersRepository;
import com.usedcar.dev.security.SecurityService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UsersService {
    private final UsersRepository usersRepository;
    private final SecurityService securityService;
    public UsersResponse loginService(LoginRequest request) {
        Users loginUser = usersRepository.login(request);
        if (loginUser.getUserId()!=null) {
            String token = securityService.createToken(loginUser);
            return new UsersResponse(
                    loginUser.getId(),
                    loginUser.getName(),
                    loginUser.getPhoneNumber(),
                    loginUser.getLocale(),
                    loginUser.getNickName(),
                    loginUser.getEmail(),
                    token
            );
        }
        return null;
    }
    public UsersResponse signupService(SignupRequest request) {
        Integer insertId = usersRepository.signup(request);
        if (insertId != 0) {
            LoginRequest loginRequest = new LoginRequest(request.getUserId(), request.getUserPw());
            return loginService(loginRequest);
        }
        return null;
    }
}
