package com.guessinggame.guessinggame;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
//@EnableJpaRepositories(basePackages="com.guessinggame.guessinggame")
public class GuessingGameApplication {

    public static void main(String[] args) {
        SpringApplication.run(GuessingGameApplication.class, args);
    }

}
