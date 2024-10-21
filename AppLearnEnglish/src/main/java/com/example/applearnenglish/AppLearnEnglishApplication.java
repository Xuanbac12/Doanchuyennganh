package com.example.applearnenglish;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EntityScan(basePackages = "com.example.models")
@EnableJpaRepositories(basePackages = "com.example.repositories")
@ComponentScan(basePackages = {"com.example", "com.example.Dtos"})
public class AppLearnEnglishApplication {

    public static void main(String[] args) {
        SpringApplication.run(AppLearnEnglishApplication.class, args);
    }

}
