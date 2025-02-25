package com.moviebooking.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.moviebooking.demo.model.Theater;
import com.moviebooking.demo.repository.TheaterRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class TheaterService 
{
    private final TheaterRepository theaterRepository;

    public List<Theater> getAllTheaters()
    {
        return theaterRepository.findAll();
    }
}
