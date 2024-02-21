package com.example.DeplyEnviroment;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerEnviroment {
    @Value("${welcomeMsg}")
    String welcomeMsg;
    @GetMapping("/get")
    public String getProperty() {
        return welcomeMsg;
    }
}
