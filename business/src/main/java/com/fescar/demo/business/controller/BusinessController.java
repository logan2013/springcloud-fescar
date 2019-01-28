package com.fescar.demo.business.controller;

import com.fescar.demo.business.service.BusinessService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author crazier.huang
 * @date 2019/1/28
 */
@Slf4j
@RestController
public class BusinessController {

    @Autowired
    private BusinessService businessService;

    @PostMapping("/purchase/{userId}/{commodityCode}/{orderCount}")
    public String purchase(@PathVariable(value = "userId") String userId,
                           @PathVariable(value = "commodityCode") String commodityCode,
                           @PathVariable(value = "orderCount") int orderCount){
        return businessService.purchase(userId,commodityCode,orderCount);
    }
}
