package com.fescar.demo.eurake;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author Neel
 * @date 2018/6/6
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaCenter {

    public static void main(String[] args) {
        SpringApplication.run(EurekaCenter.class, args);
    }

}
