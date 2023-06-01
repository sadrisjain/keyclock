package com.keyclock;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@SpringBootApplication

//@SpringBootApplication(exclude = {SecurityAutoConfiguration.class, SecurityFilterAutoConfiguration.class})

public class KeyclockApplication {

	public static void main(String[] args) {
		SpringApplication.run(KeyclockApplication.class, args);
	}
	

}
