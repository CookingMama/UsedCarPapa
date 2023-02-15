package com.usedcar.dev.service;

import com.usedcar.dev.domain.dto.Dealers;
import com.usedcar.dev.domain.request.DealerLoginRequest;
import com.usedcar.dev.domain.request.DealerSignupRequest;
import com.usedcar.dev.domain.response.DealersResponse;
import com.usedcar.dev.repository.DealersRepository;
import com.usedcar.dev.security.DealerSecurityService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class DealersService {
    private final DealersRepository dealersRepository;

    private final DealerSecurityService dealerSecurityService;

    public DealersResponse dealerLoginService(DealerLoginRequest request) {
        Dealers loginDealer = dealersRepository.login(request);
        if (loginDealer.getDealerId()!=null) {
            String token = dealerSecurityService.createToken(loginDealer);
            return new DealersResponse(
                    loginDealer.getId(),
                    loginDealer.getName(),
                    loginDealer.getPhoneNumber(),
                    loginDealer.getLocale(),
                    loginDealer.getNickName(),
                    loginDealer.getEmail(),
                    loginDealer.getCompanyName(),
                    loginDealer.getPosition(),
                    loginDealer.getMatchCount(),
                    token
            );
        }
        return null;
    }
    public DealersResponse dealerSignupService(DealerSignupRequest request) {
        Integer insertId = dealersRepository.signup(request);
        if (insertId !=0) {
            DealerLoginRequest dealerLoginRequest = new DealerLoginRequest(request.getDealerId(), request.getDealerPw());
            return dealerLoginService(dealerLoginRequest);
        }
        return null;
    }
}
