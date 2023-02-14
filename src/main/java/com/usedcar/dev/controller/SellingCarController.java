package com.usedcar.dev.controller;

import com.usedcar.dev.domain.request.PutCarRequest;
import com.usedcar.dev.domain.response.AllSellingResponse;
import com.usedcar.dev.domain.response.OneSellingResponse;
import com.usedcar.dev.service.SellingCarServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor // NonNull
@RequestMapping("/selling")
public class SellingCarController {
    private final SellingCarServiceImpl sellingCarService;

    @PostMapping
    public Integer putCarPost(@RequestBody PutCarRequest request){
        return sellingCarService.putCar(request);
    }

    @GetMapping
    public List<AllSellingResponse> findAllSelling(){
        return sellingCarService.findAllSellingList();
    }

    @GetMapping("/{id}")
    public OneSellingResponse findOneSellingById(@PathVariable("id") Integer id) {
        return sellingCarService.findOneSellingById(id);
    }
}
