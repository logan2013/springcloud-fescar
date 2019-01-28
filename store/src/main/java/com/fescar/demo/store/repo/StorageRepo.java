package com.fescar.demo.store.repo;

import com.fescar.demo.store.entity.Storage;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

import javax.transaction.Transactional;

/**
 * @author crazier.huang
 * @date 2019/1/24
 */
public interface StorageRepo extends PagingAndSortingRepository<Storage, Long> {
    @Query(nativeQuery = true,value = "update storage_tbl set count = count - ? where commodity_code = ?")
    @Transactional
    @Modifying(clearAutomatically = true)
    int deduct(String commodityCode, int orderCount);

}
