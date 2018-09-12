package com.rambo.dubbotest;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:/dubbo.xml")
public class ProviderApplication {

    public static void main(String[] args){
        SpringApplication.run(ProviderApplication.class,args);
    }
}