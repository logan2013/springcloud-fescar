package com.fescar.demo.business.provider.order;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author crazier.huang
 * @date 2019/1/28
 */
@FeignClient(value = "order-server", path = "/")
public interface OrderProvider {

    @RequestMapping(value = "/create/{userId}/{commodityCode}/{orderCount}",method = RequestMethod.POST)
    String create(@PathVariable(value = "userId") String userId,
                  @PathVariable(value = "commodityCode") String commodityCode,
                  @PathVariable(value = "orderCount") int orderCount);
}
