package com.learning.springbasic;

import org.springframework.stereotype.Component;

@Component
public class SingleMathInterface implements MathInterface {

    @Override
    public int multiply() {
        return (x * y*guess);
    }
}
