package com.example;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@EnableAutoConfiguration
@SpringBootApplication
@ComponentScan("com.example.service")
@MapperScan("com.example.mapper")
@ComponentScan("com.example.controller")
public class SpringbootWebApplication {
 
	public static void main(String[] args) {
		SpringApplication.run(SpringbootWebApplication.class, args);
	}

}
