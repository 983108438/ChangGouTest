package com.changgou;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * 包名: com.changgou
 * 类名: GoodsApplication
 * 用户名: Administrator
 * 当前时间: 2020/5/9 0009 下午 11:14
 * 项目名: changgou
 */
@SpringBootApplication
@EnableEurekaClient
//组件扫描，将包下的所有接口产生代理类交给spring管理
@MapperScan(basePackages = "com.changgou.goods.dao")
//@MapperScan(basePackages = {"com.changgou.goods.dao"})
public class GoodsApplication {
    public static void main(String[] args) {
        SpringApplication.run(GoodsApplication.class);
    }
}