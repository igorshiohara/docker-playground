package com.igorshiohara;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class App {

    @GetMapping("/{name}")
    public String hello(@PathVariable("name") final String name) {
        return "Hello " + name;
    }


    public static void main(String[] args) {
        SpringApplication.run(App.class);
    }

}
