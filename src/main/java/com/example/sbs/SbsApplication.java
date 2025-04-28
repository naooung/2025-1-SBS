package com.example.sbs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class SbsApplication {

  public static void main(String[] args) {
    SpringApplication.run(SbsApplication.class, args);
  }

}
