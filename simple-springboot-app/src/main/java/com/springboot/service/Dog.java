package com.springboot.service;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Qualifier;

@Service
@Qualifier("dog")
public class Dog implements Animal {

    @Override
    public String characteristics() {
        return "Bark";
    }
}
