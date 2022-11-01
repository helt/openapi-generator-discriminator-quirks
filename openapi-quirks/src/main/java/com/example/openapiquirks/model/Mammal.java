package com.example.openapiquirks.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import io.swagger.v3.oas.annotations.media.Schema;

@JsonSubTypes({
        @JsonSubTypes.Type(value = Cat.class),
        @JsonSubTypes.Type(value = Dog.class),
})
public interface Mammal extends Animal {
    @Schema(required = true)
    @JsonProperty
    String classTypicalBreedingSize();
}
