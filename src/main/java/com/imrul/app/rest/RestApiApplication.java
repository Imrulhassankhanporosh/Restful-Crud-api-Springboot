package com.imrul.app.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

//@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
@SpringBootApplication
@EnableJpaRepositories(basePackages="com.imrul.app.rest.Repo")
public class RestApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestApiApplication.class, args);
	}

}
