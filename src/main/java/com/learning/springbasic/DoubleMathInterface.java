package com.learning.springbasic;

import org.springframework.stereotype.Component;

@Component
public class DoubleMathInterface implements MathInterface {
    @Override
    public int multiply() {

        System.out.println(guess);
        return (x*y)*(x*y)*guess;
    }
}
