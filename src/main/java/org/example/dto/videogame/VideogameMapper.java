package org.example.dto.videogame;

import org.example.models.Developer;
import org.example.models.Videogame;

public interface VideogameMapper {
    Videogame dtoToEntity(VideogameRequest dto, Developer developer);
    VideogameResponse entityToDto(Videogame videogame);
}
