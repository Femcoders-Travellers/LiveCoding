package org.example.dto.videogame;

public record VideogameRequest (
        String name,
        String category,
        Boolean isAdult,
        String platform,
        int year
){
}
