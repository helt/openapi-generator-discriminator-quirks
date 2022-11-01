package com.example.openapiquirks.model;

import com.fasterxml.jackson.annotation.JsonTypeName;

@JsonTypeName("fish")
public class Fish implements Animal {
    private final String id = "" + Math.ceil(Math.random() * 1000);

    @Override
    public String label() {
        return "fish " + id;
    }
}
