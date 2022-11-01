package com.example.openapiquirks.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;

@JsonTypeName("cat")
public class Cat implements Mammal {

    private final String id = "" + Math.ceil(Math.random() * 1000);

    @Override
    public String classTypicalBreedingSize() {
        return "4";
    }

    @Override
    public String label() {
        return "cat" + id;
    }

    @Schema(required = true)
    @JsonProperty
    public boolean eatsBirds() {
        return true;
    }
}
