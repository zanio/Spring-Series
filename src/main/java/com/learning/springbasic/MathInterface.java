package com.learning.springbasic;

import java.security.SecureRandom;

public interface MathInterface {
    int x = 10;
    int y = 20;
    SecureRandom secureRandom = new SecureRandom();
    int guess = 1+secureRandom.nextInt(100);

    public int multiply();
}
