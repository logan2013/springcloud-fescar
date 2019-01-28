package com.fescar.demo.business.provider.store;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author crazier.huang
 * @date 2019/1/28
 */
@FeignClient(value = "store-server", path = "/")
public interface StoreProvider {

    @RequestMapping(value = "/deduct/{commodityCode}/{orderCount}",method = RequestMethod.POST)
    public String deduct( @PathVariable(value = "commodityCode") String commodityCode,
                         @PathVariable(value = "orderCount") int orderCount);


}
