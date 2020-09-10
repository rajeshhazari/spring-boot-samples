package com.example.test.springjdbcsample1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jdbc.repository.config.EnableJdbcRepositories;

@SpringBootApplication
@EnableAutoConfiguration
@EnableJdbcRepositories
public class SpringjdbcsampletestApp {

	public static void main(String[] args) {
		SpringApplication.run(SpringjdbcsampletestApp.class, args);
	}

}
