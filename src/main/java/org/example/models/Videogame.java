package org.example.models;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "videogames")
@NoArgsConstructor @AllArgsConstructor
@Getter @Setter
@Builder
public class Videogame {
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

    @ManyToOne
    @JoinColumn(name = "developer_id", nullable = false)
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Developer developer;
}
