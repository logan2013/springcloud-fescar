package com.fescar.demo.account.repo;

import com.fescar.demo.account.entity.Account;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

import javax.transaction.Transactional;

/**
 * @author crazier.huang
 * @date 2019/1/24
 */
public interface AccountRepo extends PagingAndSortingRepository<Account, Long> {
    @Transactional
    @Modifying(clearAutomatically = true)
    @Query(nativeQuery = true,value = "update account_tbl set money = money - ? where user_id = ?")
    int debit( int money,String userId);
}
