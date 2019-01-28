package com.fescar.demo.business.service;

import com.alibaba.fescar.spring.annotation.GlobalTransactional;
import com.fescar.demo.business.provider.order.OrderProvider;
import com.fescar.demo.business.provider.store.StoreProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author crazier.huang
 * @date 2019/1/28
 */
@Component
public class BusinessServiceImpl implements BusinessService {
    @Autowired
    private OrderProvider orderProvider;
    @Autowired
    private StoreProvider storeProvider;

    @Override
    @GlobalTransactional
    public String purchase(String userId, String commodityCode, int orderCount) {
        storeProvider.deduct(commodityCode,orderCount);
        orderProvider.create(userId,commodityCode,orderCount);
        return "ok";
    }
}
