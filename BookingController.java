	package com.moviebooking.demo.controller;
	
	import org.springframework.web.bind.annotation.PostMapping;
	import org.springframework.web.bind.annotation.RequestBody;
	import org.springframework.web.bind.annotation.RequestMapping;
	import org.springframework.web.bind.annotation.RestController;
	
	import com.moviebooking.demo.model.Booking;
	import com.moviebooking.demo.service.BookingService;
	
	import lombok.RequiredArgsConstructor;
	
	@RestController
	@RequestMapping("/bookings")
	@RequiredArgsConstructor
	public class BookingController {
	    private final BookingService bookingService = new BookingService();
	
	    @PostMapping
	    public Booking bookTicket(@RequestBody Booking booking) {
	        return bookingService.bookTicket(booking);
	    }
	}
