package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		System.out.println("Hello World");
		System.out.println("Hello World 2");
		System.out.println("TestOne");
		SpringApplication.run(DemoApplication.class, args);
	}

}
