package com.example.demo.springIn5Steps.springBootScope;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DemoApplication {

    private static Logger LOGGER = LoggerFactory.getLogger(DemoApplication.class);

    public static void main(String[] args) {
        ConfigurableApplicationContext configurableApplicationContext =
                SpringApplication.run(DemoApplication.class, args);
        PersonDAO personDAO = configurableApplicationContext.getBean(PersonDAO.class);
        PersonDAO personDAO1 = configurableApplicationContext.getBean(PersonDAO.class);
//         On instance per of personDao application context is created here. The same hashCode for personDAO1 is produced
        LOGGER.info("{}", personDAO);
//        New bean instance is produced whenever the dependency of the bean is requested.
        LOGGER.info("{}", personDAO.getJdbcConnection());
        LOGGER.info("{}", personDAO.getJdbcConnection());

        LOGGER.info("{}", personDAO1);
//        New bean instance is produced whenever the dependency of the bean is requested
        LOGGER.info("{}", personDAO1.getJdbcConnection());


    }

}
