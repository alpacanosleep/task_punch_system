package com.acm.dataservice;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


// Generated by https://start.springboot.io
// 优质的 spring/boot/data/security/cloud 框架中文文档尽在 => https://springdoc.cn
@MapperScan(basePackages = "com.acm.dataservice.mapper")
@SpringBootApplication
@EnableDubbo
public class TaskManageSysDataserviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(TaskManageSysDataserviceApplication.class, args);
    }

}