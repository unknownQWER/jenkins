package com.wanggang.service;

import org.springframework.stereotype.Service;

@Service
public class FactorialProviderService {
    public Integer createFactorial(Integer factorA,Integer factorB) {
        return null;
    }


    public Integer math(Integer a, Integer b) {
        System.out.println("a="+a+";b="+b);
        return a+b;
    }
}
