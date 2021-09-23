package com.springboot.leaseHouse;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author 秦野
 * 开启包扫描
 */
@MapperScan("com.springboot.leaseHouse.mapper")
@SpringBootApplication
public class LeaseHouseApplication {

    public static void main(String[] args) {
        SpringApplication.run(LeaseHouseApplication.class, args);
    }

}
