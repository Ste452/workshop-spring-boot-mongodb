package com.steve.workshopmongo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories(basePackages = "com.steve.workshopmongo.repository")
public class WorkshopmongoApplication {
    public static void main(String[] args) {
        SpringApplication.run(WorkshopmongoApplication.class, args);
    }
}
	