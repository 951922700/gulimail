package com.lyl.gulimall;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.lyl.gulimall.dao")
public class GulimailCouponApplication {

    public static void main(String[] args) {
        SpringApplication.run(GulimailCouponApplication.class, args);
    }

}
