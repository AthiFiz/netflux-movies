package com.athifiz.movie_service.service;

import com.athifiz.movie_service.domain.Genre;
import com.athifiz.movie_service.dto.MovieDto;

import java.util.List;

public interface MovieService {

    List<MovieDto> getAllMovies();

    List<MovieDto> getAllMovies(Genre genre);
}
