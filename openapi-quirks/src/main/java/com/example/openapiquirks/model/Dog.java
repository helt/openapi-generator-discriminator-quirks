package com.example.openapiquirks.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;

@JsonTypeName("dog")
public class Dog implements Mammal {

    private final String id = "" + Math.ceil(Math.random() * 1000);

    @Override
    public String label() {
        return "dog " + id;
    }

    @Override
    public String classTypicalBreedingSize() {
        return "dogs";
    }

    @Schema(required = true)
    @JsonProperty
    public String followsCommands() {
        return "yes";
    }
}
