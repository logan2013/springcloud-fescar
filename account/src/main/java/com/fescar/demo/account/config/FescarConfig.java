package com.fescar.demo.account.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.fescar.rm.datasource.DataSourceProxy;
import com.alibaba.fescar.spring.annotation.GlobalTransactionScanner;
import com.ctrip.framework.apollo.Config;
import com.ctrip.framework.apollo.spring.annotation.ApolloConfig;
import com.ctrip.framework.apollo.spring.annotation.EnableApolloConfig;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.BeanPostProcessor;
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

    @Value("${spring.datasource.url}")
    private String url ;
    @Value("${spring.datasource.username}")
    private String username ;
    @Value("${spring.datasource.password}")
    private String password ;
    @Value("${spring.datasource.druid.driver-class-name}")
    private String driverClassName;

    @Value("${spring.application.name}")
    private String appId;


    @Bean
    public DruidDataSource druidDataSource() {
        DruidDataSource datasource = new DruidDataSource();
        datasource.setUrl(url);
        datasource.setUsername(username);
        datasource.setPassword(password);
        datasource.setDriverClassName(driverClassName);
        return datasource;
    }


    @Bean(name = "accountDataSourceProxy")
    @ConditionalOnMissingBean(DruidDataSource.class)
    public DataSourceProxy initProxy(@Qualifier("druidDataSource")DataSource dataSource) {
        return new DataSourceProxy((DruidDataSource) dataSource);
    }

    @Bean
    public GlobalTransactionScanner initGlobalTransactionScanner() {
        return new GlobalTransactionScanner(appId, "my_test_tx_group");
    }

}

