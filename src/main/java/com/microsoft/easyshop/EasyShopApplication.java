package com.microsoft.easyshop;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.microsoft.easyshop.mapper")
public class EasyShopApplication {

    public static void main(String[] args) {
        SpringApplication.run(EasyShopApplication.class, args);
    }

}
