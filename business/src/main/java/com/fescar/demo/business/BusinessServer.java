package com.fescar.demo.business;


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
public class BusinessServer {



	public static void main(String[] args) {
		SpringApplication.run(BusinessServer.class, args);
	}

}
