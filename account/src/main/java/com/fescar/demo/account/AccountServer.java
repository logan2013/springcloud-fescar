package com.fescar.demo.account;


import com.ctrip.framework.apollo.spring.annotation.EnableApolloConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;


/**
 * @author Neel
 * @date 2018/6/6
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
@EnableApolloConfig("tis.Edgware.SR3")
public class AccountServer {



	public static void main(String[] args) {
		SpringApplication.run(AccountServer.class, args);
	}

}
