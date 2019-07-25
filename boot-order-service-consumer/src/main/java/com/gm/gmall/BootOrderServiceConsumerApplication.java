package com.gm.gmall;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubbo
public class BootOrderServiceConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootOrderServiceConsumerApplication.class, args);
	}

}