package com.freedompop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@ComponentScan(value="com.freedompop")
@EnableSwagger2
public class BootstrapApp {

	public static void main(String[] args) {
		SpringApplication.run(BootstrapApp.class, args);
	}

}
