package com.aswani.personal;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HomeBudgetRestApplication {
	private static final Logger log = LoggerFactory.getLogger(HomeBudgetRestApplication.class);
	public static void main(String[] args) {
		log.info("Application starting ...");
		SpringApplication.run(HomeBudgetRestApplication.class, args);
		
	}
}
