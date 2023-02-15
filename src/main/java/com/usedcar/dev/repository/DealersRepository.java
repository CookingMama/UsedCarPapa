package com.usedcar.dev.repository;

import com.usedcar.dev.domain.dto.Dealers;
import com.usedcar.dev.domain.request.DealerLoginRequest;
import com.usedcar.dev.domain.request.DealerSignupRequest;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface DealersRepository {
    Dealers login (DealerLoginRequest request);
    Integer signup (DealerSignupRequest request);
}
