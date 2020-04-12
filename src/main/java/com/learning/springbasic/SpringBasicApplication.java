package com.learning.springbasic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringBasicApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext configurableApplicationContext =
                SpringApplication.run(SpringBasicApplication.class, args);

        MathContainer mathContainer = configurableApplicationContext.getBean(MathContainer.class);

        configurableApplicationContext.close();

        System.out.println(mathContainer);
    }

}
