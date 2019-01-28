package com.fescar.demo.account.repo;

import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

/**
 * @author crazier.huang
 * @date 2019/1/28
 */
@Slf4j
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class AccountRepoTest {
    @Autowired
    private AccountRepo accountRepo;

    @Test
    public void debit(){
        int count = accountRepo.debit(10,"U100001");
        Assert.assertEquals(1,count);
    }

}