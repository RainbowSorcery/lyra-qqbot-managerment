package com.lyra.lyrabotmananger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class LyrabotManangerApplication {

    public static void main(String[] args) {
        SpringApplication.run(LyrabotManangerApplication.class, args);
    }


}
