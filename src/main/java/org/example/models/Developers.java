package org.example.models;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "developers")
@NoArgsConstructor @AllArgsConstructor
@Getter  @Setter
@Builder
public class Developers {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;
}
