package com.example.myluckyblog;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.myluckyblog.dao")
public class MyluckyblogApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyluckyblogApplication.class, args);
	}
}
