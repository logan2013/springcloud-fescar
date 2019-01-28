package com.fescar.demo.order.repo;

import com.fescar.demo.order.entity.Order;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

import javax.transaction.Transactional;

/**
 * @author crazier.huang
 * @date 2019/1/24
 */
public interface OrderRepo extends PagingAndSortingRepository<Order, Long> {
    @Transactional
    @Modifying(clearAutomatically = true)
    @Query(nativeQuery = true,value = "insert into order_tbl (user_id, commodity_code, count, money) values ({}, {}, {}, {})")
    int create(String userId, String commodityCode, int orderCount, int money);
}
