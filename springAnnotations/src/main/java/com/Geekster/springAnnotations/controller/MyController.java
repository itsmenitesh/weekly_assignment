package com.Geekster.springAnnotations.controller;

import com.Geekster.springAnnotations.CustomConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @Autowired // Injects the MyObject bean
    private CustomConfiguration myObject;

    @GetMapping("/my-object") // Handles GET requests
    public CustomConfiguration getMyObject() {
        return myObject; // Returns the injected MyObject
    }
}
