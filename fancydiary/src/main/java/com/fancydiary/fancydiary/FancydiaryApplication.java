package com.fancydiary.fancydiary;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FancydiaryApplication {

	public static void main(String[] args) {
		System.out.println("스프링 부트!");
		SpringApplication.run(FancydiaryApplication.class, args);
	}

}
