package com.sparta.memo.ioc;

import lombok.Getter;

@Getter
public class Ingredient {
    private String name;

    public Ingredient(String name) {
        this.name = name;
    }
}
