package com.narrative.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages = "com.narrative.application.repository")
@SpringBootApplication
public class NarrativeApiProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(NarrativeApiProjectApplication.class, args);
	}

}
