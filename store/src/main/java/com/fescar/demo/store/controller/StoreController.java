package com.fescar.demo.store.controller;

import com.fescar.demo.store.repo.StorageRepo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author crazier.huang
 * @date 2019/1/24
 */
@Slf4j
@RestController
public class StoreController {
    @Autowired
    StorageRepo repo;

    @RequestMapping(value = "/deduct/{commodityCode}/{orderCount}",method = RequestMethod.POST)
    public String deduct(@PathVariable(value = "commodityCode") String commodityCode,
                         @PathVariable(value = "orderCount") int orderCount) {
        int flag = repo.deduct(commodityCode,orderCount);
        return "OK";
    }
}
