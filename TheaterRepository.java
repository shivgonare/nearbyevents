package com.moviebooking.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.moviebooking.demo.model.Theater;

@Repository
public interface TheaterRepository extends JpaRepository<Theater, Long> 
{
	
}
