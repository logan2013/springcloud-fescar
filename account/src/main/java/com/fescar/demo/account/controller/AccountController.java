package com.fescar.demo.account.controller;

import com.fescar.demo.account.repo.AccountRepo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author crazier.huang
 * @date 2019/1/24
 */
@Slf4j
@RestController("/")
public class AccountController  {
    @Autowired
    AccountRepo accountRepo;

    @RequestMapping(value = "/debit/{userId}/{money}",method = RequestMethod.POST)
    public String debit(@PathVariable(value = "userId") String userId,
                        @PathVariable(value = "money") int money) {
        int flag = accountRepo.debit(money,userId);
        return "OK";
    }
}
