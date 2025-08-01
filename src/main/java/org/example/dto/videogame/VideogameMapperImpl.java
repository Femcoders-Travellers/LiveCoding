package org.example.dto.videogame;

import org.example.models.Developer;
import org.example.models.Videogame;
import org.springframework.stereotype.Component;

@Component
public class VideogameMapperImpl implements VideogameMapper {

    @Override
    public Videogame dtoToEntity(VideogameRequest dto, Developer developer) {
        return Videogame.builder()
                .name(dto.name())
                .category(dto.category())
                .isAdult(dto.isAdult())
                .platform(dto.platform())
                .year(dto.year())
                .developer(developer)
                .build();
    }

    @Override
    public VideogameResponse entityToDto(Videogame videogame) {
        return null;
    }
}
