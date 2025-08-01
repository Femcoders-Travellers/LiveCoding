package org.example.dto.videogame.developer;

import org.example.models.Developer;
import org.example.models.Videogame;
import org.springframework.stereotype.Component;

@Component
public interface DeveleporMapper {
    Developer dtoToEntity(DeveloperRequest dto, Videogame videogame);
    DeveloperResponse EntityToDto(Developer developer);
}
