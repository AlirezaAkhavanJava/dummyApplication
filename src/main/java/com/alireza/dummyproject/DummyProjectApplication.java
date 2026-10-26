package com.alireza.dummyproject;

import com.alireza.dummyproject.service.Dum;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;


@SpringBootApplication
public class DummyProjectApplication {

    static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(DummyProjectApplication.class, args);
        System.out.println(context.getClass().getName());
        context.getBean(Dum.class);
    }

}
