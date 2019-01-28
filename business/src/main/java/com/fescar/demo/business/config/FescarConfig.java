package com.fescar.demo.business.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.fescar.rm.datasource.DataSourceProxy;
import com.alibaba.fescar.spring.annotation.GlobalTransactionScanner;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

/**
 * @author crazier.huang
 * @date 2019/1/25
 */
@Configuration
public class FescarConfig {

    @Value("${spring.application.name}")
    private String appId;



    @Bean
    public GlobalTransactionScanner initGlobalTransactionScanner() {
        return new GlobalTransactionScanner(appId, "my_test_tx_group");
    }

}

