package org.mugil.starter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan("org.mugil")
@EnableJpaRepositories("org.mugil")
@EntityScan("org.mugil")
public class MainClass {
    public static void main(String[] args) {
        SpringApplication.run(MainClass.class,args);
    }
}
