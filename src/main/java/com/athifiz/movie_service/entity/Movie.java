package com.athifiz.movie_service.entity;

import com.athifiz.movie_service.domain.Genre;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Movie {

    @Id
    private Integer id;
    private String title;
    private Integer releaseYear;

    @Enumerated(EnumType.STRING)
    private Genre genre;

}
