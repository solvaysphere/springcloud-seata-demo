package com.solvay.springcloud.alibaba.config;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @Author solvay
 * @Since 2020/3/18 21:13
 */
@Configuration
@MapperScan({"com.solvay.springcloud.alibaba.dao"})
public class MyBatisConfig {


}
