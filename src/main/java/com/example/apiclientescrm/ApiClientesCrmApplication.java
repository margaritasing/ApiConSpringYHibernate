package com.example.apiclientescrm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ApiClientesCrmApplication {

    public static void main(String[] args) {
        SpringApplication.run(ApiClientesCrmApplication.class, args);
    }

    @GetMapping
    public String saludar(){return "hola";}

}
