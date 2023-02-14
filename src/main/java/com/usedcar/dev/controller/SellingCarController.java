package com.usedcar.dev.controller;

import com.usedcar.dev.domain.request.PutCarRequest;
import com.usedcar.dev.service.SellingCarServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor // NonNull
@RequestMapping("/selling")
public class SellingCarController {
    private final SellingCarServiceImpl sellingCarService;

    @PostMapping
    public Integer login(@RequestBody PutCarRequest request){
        return sellingCarService.putCar(request);
    }
}
