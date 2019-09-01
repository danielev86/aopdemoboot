package com.danielev86.aopdemoboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.danielev86")
public class AopdemobootApplication {

	public static void main(String[] args) {
		SpringApplication.run(AopdemobootApplication.class, args);
	}

}
