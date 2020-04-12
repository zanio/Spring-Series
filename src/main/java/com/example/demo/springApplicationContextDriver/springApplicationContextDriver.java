package com.example.demo.springApplicationContextDriver;

import com.example.demo.springApplicationContext.XmlPersonDAO;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@Configuration
@ComponentScan("com.example.demo.springApplicationContext")
public class springApplicationContextDriver {
    public static void main(String[] args) {
        try (ClassPathXmlApplicationContext classPathXmlApplicationContext =
                     new ClassPathXmlApplicationContext("applicationContext.xml")) {
            XmlPersonDAO xmlPersonDAO = classPathXmlApplicationContext.getBean(XmlPersonDAO.class);
            System.out.println(xmlPersonDAO);
            System.out.println(xmlPersonDAO.getXmlJdbcConnection());
        }

    }
}
