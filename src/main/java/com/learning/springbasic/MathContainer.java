package com.learning.springbasic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class MathContainer {

    private int multiplicationResult;

    @Autowired
    MathInterface singleMathInterface;

    public MathContainer(MathInterface singleMathInterface) {
        this.singleMathInterface = singleMathInterface;
    }

    @PostConstruct
    public void postConstructor() {
        setMultiplicationResult(3);
        System.out.println(getMultiplicationResult());
//        This method is used to tell spring to executes this method once the dependency is injected.
        System.out.println("Post constructor: This method is called after the dependency is injected in the application" +
                "context");
    }

    @PreDestroy
    public void preDestroy() {
        System.out.println(getMultiplicationResult());
//        This method is used to free resources and memory leaks.

        System.out.println("Pre Destroy: This method is called just before the dependency is removed from the " +
                "application context");
    }

    public int getMultiplicationResult() {

        return multiplicationResult;
    }

    public void setMultiplicationResult(int multiplicationResult) {
        this.multiplicationResult = multiplicationResult * this.singleMathInterface.multiply();
    }
}
