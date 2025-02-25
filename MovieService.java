package com.moviebooking.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.moviebooking.demo.model.Movie;
import com.moviebooking.demo.repository.MovieRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class MovieService 
{
    private final MovieRepository movieRepository;

    public List<Movie> getAllMovies() {
        return movieRepository.findAll();
    }
}
