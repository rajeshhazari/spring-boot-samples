package com.example.test.springjdbcsample1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jdbc.repository.config.EnableJdbcRepositories;

@SpringBootApplication
@EnableAutoConfiguration
@EnableJdbcRepositories
public class springjdbcsampletest1 {

	public static void main(String[] args) {
		SpringApplication.run(springjdbcsampletest1.class, args);
	}

}
