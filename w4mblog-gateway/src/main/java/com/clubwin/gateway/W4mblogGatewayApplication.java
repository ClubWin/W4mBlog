package com.clubwin.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

// 网关不需要数据功能，所以使用exclude 功能来过滤掉数据源相关类
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
@EnableDiscoveryClient
public class W4mblogGatewayApplication
{

    public static void main (String[] args)
    {
        SpringApplication.run(W4mblogGatewayApplication.class, args);
    }

}
