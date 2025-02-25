package com.moviebooking.demo.service;

import org.springframework.stereotype.Service;

import com.moviebooking.demo.model.Booking;
import com.moviebooking.demo.repository.BookingRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class BookingService 
{
    private final BookingRepository bookingRepository;

    public Booking bookTicket(Booking booking) 
    {
        return bookingRepository.save(booking);
    }
}
