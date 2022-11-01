package com.example.openapiquirks.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.DiscriminatorMapping;
import io.swagger.v3.oas.annotations.media.Schema;

@JsonTypeName("animal")
@JsonTypeInfo(property = "awesomeTypeInfoAndDiscriminator", use = JsonTypeInfo.Id.NAME)
@JsonSubTypes({
        @JsonSubTypes.Type(value = Mammal.class),
        @JsonSubTypes.Type(value = Fish.class),
})
@Schema(
        subTypes = {
                Mammal.class, Fish.class
        },
        discriminatorProperty = "awesomeTypeInfoAndDiscriminator",
        discriminatorMapping = {
                @DiscriminatorMapping(schema = Mammal.class, value = "mammal"),
                @DiscriminatorMapping(schema = Fish.class, value = "fish")
        }
)
public interface Animal {
    @JsonProperty
    String label();
}
