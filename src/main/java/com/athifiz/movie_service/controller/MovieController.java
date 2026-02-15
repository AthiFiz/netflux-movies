package com.athifiz.movie_service.controller;

import com.athifiz.movie_service.domain.Genre;
import com.athifiz.movie_service.dto.MovieDto;
import com.athifiz.movie_service.service.MovieService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/movies")
@RequiredArgsConstructor
public class MovieController {

    private final MovieService movieService;

    @GetMapping
    public List<MovieDto> getAllMovies(){
        return movieService.getAllMovies();
    }

    @GetMapping("/{genre}")
    public List<MovieDto> getAllMoviesByGenre(@PathVariable Genre genre){
        return movieService.getAllMovies(genre);
    }

}
