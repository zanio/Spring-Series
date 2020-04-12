package com.example.demo.springApplicationContextDriver;

import com.example.demo.springApplicationContext.XmlPersonDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;


@Configuration
@ComponentScan("com.example.demo.springApplicationContext")
public class springApplicationContextDriver {
    private static final Logger logger = LoggerFactory.getLogger(springApplicationContextDriver.class);
    public static void main(String[] args) {
        try (ClassPathXmlApplicationContext classPathXmlApplicationContext =
                     new ClassPathXmlApplicationContext("applicationContext.xml")) {
            XmlPersonDAO xmlPersonDAO = classPathXmlApplicationContext.getBean(XmlPersonDAO.class);
            logger.info("{}",xmlPersonDAO);
            logger.info("{}",xmlPersonDAO.getXmlJdbcConnection());
        }

    }
}
