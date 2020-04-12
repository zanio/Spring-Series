package com.example.demo.springIn5Steps.springBoot;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
//@Qualifier("bubble")
public class BubbleSortAlgorithm implements SortAlgorithm {

    @Override
    public String displayMessage() {
        return String.format("%s", "I am just trying something new.");
    }
}
