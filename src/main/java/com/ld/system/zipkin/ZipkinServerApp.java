package com.ld.system.zipkin;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import zipkin2.server.internal.EnableZipkinServer;

/**
 * 链路追踪服务
 *
 * @author 王海龙
 */
@SpringBootApplication
@EnableEurekaClient
@EnableZipkinServer
public class ZipkinServerApp {

    public static void main(String[] args) {
        SpringApplication.run(ZipkinServerApp.class, args);
    }

}

