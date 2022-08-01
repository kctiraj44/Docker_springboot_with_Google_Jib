package com.example.dockergooglejib;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringBootDockerGoogleJibApplication {

    @GetMapping("/get")
    public String getMs1(){
        return "*---Welcome to javaTechie---- i added this*";
    }


    public static void main(String[] args) {
        SpringApplication.run(SpringBootDockerGoogleJibApplication.class, args);
    }

}
