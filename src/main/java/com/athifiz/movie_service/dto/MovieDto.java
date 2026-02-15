package com.athifiz.movie_service.dto;

import com.athifiz.movie_service.domain.Genre;

public record MovieDto(Integer id,
                       String title,
                       Integer releaseYear,
                       Genre genre) {
}
