package com.ajaz.SpringWebMvcProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan(basePackages = {"com.ajaz", "src.main"})
public class SpringWebMvcProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringWebMvcProjectApplication.class, args);
	}

}
