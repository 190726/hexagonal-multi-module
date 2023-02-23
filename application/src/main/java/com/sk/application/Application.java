package com.sk.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = "org.adapter")
@EntityScan("org.adapter.db.out")
@EnableJpaRepositories(basePackages = {"org.adapter.db.out"})
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}