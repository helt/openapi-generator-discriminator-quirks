package com.example.openapiquirks.model;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/boundary")
public class Boundary {

    @Operation(
            operationId = "list-animals",
            summary = "Finds all animals",
            description = "Retrieves all animals",
            responses = {
                    @ApiResponse(responseCode = "200", content = @Content(array = @ArraySchema(schema = @Schema(implementation = Animal.class)))),
            })
    @GetMapping("/")
    public List<Animal> get() {
        return List.of(new Fish(), new Cat(), new Dog());
    }
}
