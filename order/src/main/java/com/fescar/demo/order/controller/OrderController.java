package com.fescar.demo.order.controller;

import com.fescar.demo.order.account.AccountProvider;
import com.fescar.demo.order.repo.OrderRepo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author crazier.huang
 * @date 2019/1/24
 */
@Slf4j
@RestController
public class OrderController {
    @Autowired
    OrderRepo repo;
    @Autowired
    private AccountProvider accountProvider;

    @RequestMapping(value = "/create/{userId}/{commodityCode}/{orderCount}",method = RequestMethod.POST)
    public String create(@PathVariable String userId, @PathVariable String commodityCode,
                         @PathVariable int orderCount) {
        int orderMoney = calculate(commodityCode, orderCount);
        accountProvider.debit(userId,orderMoney);
        int flag = repo.create(userId,commodityCode,orderCount, orderMoney);
        return "OK";
    }

    private int calculate(String commodityId, int orderCount) {
        return 200 * orderCount;
    }
}
