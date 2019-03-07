package com.freedompop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(value="com.freedompop")
public class EjercicioApplication {

	public static void main(String[] args) {
		SpringApplication.run(EjercicioApplication.class, args);
	}

}
