package com.example.demo_master;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import util.IdWorker;

import javax.persistence.Basic;

@SpringBootApplication
public class DemoMasterApplication {

    public static void main(String[] args) {

        SpringApplication.run(DemoMasterApplication.class, args);
    }

    @Bean
    public IdWorker idWorker(){
        return new IdWorker(1,1);
    }

}
