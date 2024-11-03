package com.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.service.Animal;

@RestController
@RequestMapping("/autowire")
public class AutowiredController {

    private Animal animal;

    // Active Setter Injection with @Qualifier
    @Autowired
    public void setAnimal(@Qualifier("dog") Animal animal) {
        this.animal = animal;
    }

    @GetMapping
    public String fetchDogCharacteristics() {
        return animal.characteristics();
    }
}
