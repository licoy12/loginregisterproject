package com.springboot.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
//@ComponentScan({"com.springboot.web"})
//@EnableJpaRepositories("com.springboot.web")

public class SpringbootFirstwebappApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootFirstwebappApplication.class, args);
	}
}
