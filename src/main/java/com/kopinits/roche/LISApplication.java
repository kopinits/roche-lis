package com.kopinits.roche;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
@EnableAutoConfiguration
public class LISApplication {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(LISApplication.class, args);
	}

}
