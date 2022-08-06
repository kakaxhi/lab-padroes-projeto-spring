package com.digitalinnovationone.springnboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication

public class SpringnbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringnbootApplication.class, args);
	}

}
