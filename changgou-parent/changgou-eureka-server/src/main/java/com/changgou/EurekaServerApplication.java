package com.changgou;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 启动类
 * 包名: com.changgou
 * 类名: EurekaServerApplication
 * 用户名: Administrator
 * 当前时间: 2020/5/9 0009 下午 11:04
 * 项目名: changgou
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaServerApplication{
    public static void main(String[] args) {
        SpringApplication.run(EurekaServerApplication.class,args);
    }
}
