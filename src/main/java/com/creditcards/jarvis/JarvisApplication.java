package com.creditcards.jarvis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class JarvisApplication {
	public static void main(String[] args) {
		SpringApplication.run(JarvisApplication.class, args);
	}
}
