package com.auto.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.auto.server.*","com.auto.consumer.*","com.iauto.provider.service.*"})
public class ServerApplication {


    public static void main(String[] args) {
        SpringApplication.run(ServerApplication.class,args);
    }


}
