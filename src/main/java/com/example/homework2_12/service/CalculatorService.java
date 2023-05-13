package com.example.homework2_12.service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {
    public int plus (int a, int b){
        return a + b;
    }
    public int minus (int a, int b){
        return a - b;
    }
    public int multiply (int a, int b){
        return a * b;
    }
    public double divide (int a, int b){
        if (a == 0 || b == 0) {
            throw new IllegalArgumentException("IllegalArgumentException");
        }
        return a /(double) b;
    }
}
