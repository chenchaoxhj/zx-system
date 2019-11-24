package com.zx.warehouse;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Description
 * @Date 2019/11/19 10:31
 * @Created by cc
 */

@SpringBootApplication
@MapperScan(value = "com.zx.warehouse.mapper")
public class WarehouseApplication {

    public static void main(String[] args){
        SpringApplication.run(WarehouseApplication.class,args);
    }
}
