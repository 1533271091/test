package com.example.config;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;



@Configuration
@MapperScan({"mapper","com.example.mapper"})
public class MyBatisConfig {
}
