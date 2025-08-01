package org.example.dto.videogame.developer;

import jakarta.validation.constraints.NotBlank;

public record DeveloperRequest(
        @NotBlank(message = "Name is required")
        String name
) {
}
