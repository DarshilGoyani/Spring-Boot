package com.example.Spring.Boot.Properties;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootPropertiesApplication {

	public static void main(String[] args) {

		ApplicationContext Context = SpringApplication.run(SpringBootPropertiesApplication.class, args);

	}

}
