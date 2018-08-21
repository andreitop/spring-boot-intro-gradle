package com.andreitop.springbootgradle;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class SpringBootIntroGradleApplication extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder applicationBuilder) {
        return applicationBuilder.sources(SpringBootIntroGradleApplication.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringBootIntroGradleApplication.class, args);
    }

    @RestController
    class SimpleController {

        @RequestMapping("/call")
        String callMe() {
            return "Hello, friend!";
        }
    }
}
