package com.medilaboFront;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class MedilaboFrontApplication {

	public static void main(String[] args) {
		SpringApplication.run(MedilaboFrontApplication.class, args);
	}

}
