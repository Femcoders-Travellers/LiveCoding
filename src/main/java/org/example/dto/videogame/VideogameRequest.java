package org.example.dto.videogame;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record VideogameRequest (
        @NotBlank(message = "Name is required")
        String name,

        @NotBlank(message = "Category is required")
        String category,

        @NotBlank(message = "isAdult is required")
        Boolean isAdult,

        @NotBlank(message = "Platform is required")
        String platform,

        @NotBlank(message = "Year is required")
        int year
){
}
