package com.example.int3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.example.int3")
public class Int3Application {

	public static void main(String[] args) {
		SpringApplication.run(Int3Application.class, args);
	}

}
