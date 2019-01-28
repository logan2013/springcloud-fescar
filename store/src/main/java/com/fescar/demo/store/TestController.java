package com.fescar.demo.store;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author crazier.huang
 * @date 2019/1/24
 */
@Slf4j
@RestController
@RequestMapping("/test")
public class TestController {

    @GetMapping
    public String test(){
        return "ok";
    }
}
