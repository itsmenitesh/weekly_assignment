package com.Geekster.springAnnotations;


import org.springframework.stereotype.Component;

@Component
public class CustomConfiguration {
    private String name;
    public CustomConfiguration(){
        System.out.println("MyName called from Spring framework-1");
    }
    public CustomConfiguration(String name) {

        this.name = name;
        System.out.println("MyName called from Spring framework-2 : " + this.name);

    }

    public String getName() {
        return name;

    }

    public void setName(String name) {

        this.name = name;
    }
}
