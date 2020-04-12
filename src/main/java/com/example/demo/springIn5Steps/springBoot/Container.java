package com.example.demo.springIn5Steps.springBoot;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
// @Component tell spring to create a bean
 @Component
// Different instance of beans would be created when the below code is used.
public class Container {

     private static final Logger logger = LoggerFactory.getLogger(Container.class);

// The sortAlgorithm is a dependency of of the Container class. The Container class needs the sortAlgorithm.
//  when there are @Component on more than  one type of file you can do autowiring by name
    @Autowired
    SortAlgorithm sortAlgorithm;
    public Container(SortAlgorithm sortAlgorithm) {
        this.sortAlgorithm = sortAlgorithm;

    }
    @PostConstruct
    public void postConstruct(){
//        lifecycle of a bean 1
        logger.info("PostConstruct is called just after the bean dependency is created");
    }

    @PreDestroy
    public void preDestroy() {
//        Life cycle of a bean 2
        logger.info("Pre-destroy is called just before the dependency" +
                " bean is destroyed from the application context");
    }
    public int calculate(){
        return this.sortAlgorithm.firstNumber * this.sortAlgorithm.secondNumber;
    }


}
