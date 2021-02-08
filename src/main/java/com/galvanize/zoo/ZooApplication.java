package com.galvanize.zoo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties
public class ZooApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZooApplication.class, args);
    }

}
