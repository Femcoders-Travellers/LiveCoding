package org.example.dto.videogame.developer;

import java.util.List;

public record DeveloperResponse(
        Long id,
        String name,
        List<String> videogame
) {
}
