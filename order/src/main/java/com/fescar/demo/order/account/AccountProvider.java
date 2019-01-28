package com.fescar.demo.order.account;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author crazier.huang
 * @date 2019/1/24
 */
@FeignClient(value = "account-server", path = "/")
public interface AccountProvider {

    @RequestMapping(value = "/debit/{userId}/{money}",method = RequestMethod.POST)
    String debit(@PathVariable(value = "userId") String userId,  @PathVariable(value = "money")  int money);
}
