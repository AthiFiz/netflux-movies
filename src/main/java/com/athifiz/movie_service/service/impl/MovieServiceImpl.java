package com.athifiz.movie_service.service.impl;


import com.athifiz.movie_service.domain.Genre;
import com.athifiz.movie_service.dto.MovieDto;
import com.athifiz.movie_service.mapper.EntityDtoMapper;
import com.athifiz.movie_service.repository.MovieRepository;
import com.athifiz.movie_service.service.MovieService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MovieServiceImpl implements MovieService {

    private final MovieRepository movieRepository;

    @Override
    public List<MovieDto> getAllMovies(){

        return movieRepository.findAll()
                .stream()
                .map(EntityDtoMapper::toMovieDto)
                .toList();

    }

    @Override
    public List<MovieDto> getAllMovies(Genre genre){

        return movieRepository.findByGenre(genre)
                .stream()
                .map(EntityDtoMapper::toMovieDto)
                .toList();
    }

}
