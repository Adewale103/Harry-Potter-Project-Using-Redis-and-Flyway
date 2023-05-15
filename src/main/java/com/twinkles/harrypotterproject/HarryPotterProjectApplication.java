package com.twinkles.harrypotterproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class HarryPotterProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(HarryPotterProjectApplication.class, args);
	}

}
