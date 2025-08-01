package org.example.dto.videogame.developer;

import org.example.models.Developer;
import org.example.models.Videogame;

import java.util.List;


public class DeveloperMapperImpl implements DeveleporMapper{
    @Override
    public Developer dtoToEntity(DeveloperRequest dto, Videogame videogame) {
        return Developer.builder()
                .name(dto.name())
                .build();
    }

    @Override
    public DeveloperResponse EntityToDto(Developer developer) {
        List<String> videogames = developer.getVideogame().stream()
                .map(videogame -> videogame.getName())
                .toList();
        return new DeveloperResponse(
                developer.getId(),
                developer.getName(),
                videogames
        );
    }
}
