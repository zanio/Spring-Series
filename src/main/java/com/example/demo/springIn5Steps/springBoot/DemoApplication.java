package com.example.demo.springIn5Steps.springBoot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

//Import and use the following package if you wish to use springframework without spring boot.
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.ApplicationContext;


@SpringBootApplication
public class DemoApplication {
    public static void main(String[] args) {


        ConfigurableApplicationContext applicationContext =
                SpringApplication.run(DemoApplication.class);

        Container container =
                applicationContext.getBean(Container.class);
        System.out.println(container.calculate());
    }
}
