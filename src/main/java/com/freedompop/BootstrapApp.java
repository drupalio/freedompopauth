package com.freedompop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@ComponentScan(value = "com.freedompop")
@EnableSwagger2
@EnableJpaRepositories("com.freedompop.login.dao")
@EntityScan("com.freedompop.login.entities")
public class BootstrapApp {


	public static void main(String[] args) {
		SpringApplication.run(BootstrapApp.class, args);
	}

}
