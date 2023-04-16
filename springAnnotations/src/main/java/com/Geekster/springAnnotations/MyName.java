package com.Geekster.springAnnotations;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyName {

    @Bean
    public CustomConfiguration myObject() {
        return new CustomConfiguration("Geekster!!!");
    }
}
