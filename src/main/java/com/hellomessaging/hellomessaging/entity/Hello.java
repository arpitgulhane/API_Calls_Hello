package com.hellomessaging.hellomessaging.entity;

import org.springframework.stereotype.Component;

@Component
public class Hello {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
