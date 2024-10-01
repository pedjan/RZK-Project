package com.projekat.rzk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class OnlineProdajaServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(OnlineProdajaServiceApplication.class, args);
	}

}
