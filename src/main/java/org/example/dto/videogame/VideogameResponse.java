package org.example.dto.videogame;

import jakarta.persistence.Column;

public record VideogameResponse (
        Long id,
        String name,
        String category,
        Boolean isAdult,
        String platform,
        int year
){
}
