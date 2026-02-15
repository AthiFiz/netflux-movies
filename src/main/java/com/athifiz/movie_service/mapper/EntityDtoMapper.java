package com.athifiz.movie_service.mapper;

import com.athifiz.movie_service.dto.MovieDto;
import com.athifiz.movie_service.entity.Movie;

public class EntityDtoMapper {

    public static MovieDto toMovieDto(Movie movie){

        return new MovieDto(movie.getId(),
                movie.getTitle(),
                movie.getReleaseYear(),
                movie.getGenre());
    }
}
