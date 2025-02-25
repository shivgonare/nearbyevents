package com.moviebooking.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.moviebooking.demo.model.Movie;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Long> 
{
	
}

