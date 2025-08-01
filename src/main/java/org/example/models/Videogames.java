package org.example.models;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "videogames")
@NoArgsConstructor @AllArgsConstructor
@Getter @Setter
@Builder
public class Videogames {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String category;

    @Column(nullable = false)
    private Boolean isAdult;

    @Column(nullable = false)
    private String platform;

    @Column(nullable = false)
    private Long year;
}
