package com.exampleasd.asddemo22;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController


public class Asddemo22Application {

    @GetMapping("/message")
    public String message(){
        return "Congrats you app deployed successfully in Azure !";
    }

    public static void main(String[] args) {
        SpringApplication.run(Asddemo22Application.class, args);
    }

}
