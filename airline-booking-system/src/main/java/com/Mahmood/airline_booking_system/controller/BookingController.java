package com.Mahmood.airline_booking_system.controller;



import com.Mahmood.airline_booking_system.model.Booking;
import com.Mahmood.airline_booking_system.model.User;
import com.Mahmood.airline_booking_system.service.BookingService;
import com.Mahmood.airline_booking_system.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/booking")
public class BookingController {

    @Autowired
    private BookingService bookingService;

    @Autowired
    private UserService userService;

    @PostMapping("/book")
    public Booking bookFlight(@RequestParam Long userId, @RequestParam String flightName, @RequestParam String destination, @RequestParam Double price) {
        return bookingService.bookFlight(userId, flightName, destination, price);
    }

    @GetMapping("/list")
    public List<Booking> getUserBookings(@RequestParam Long userId) {
        User user = userService.findById(userId);  // Fetch the user by ID
        return (List<Booking>) user.getBookings();  // Now calling getBookings() will work
    }


    @DeleteMapping("/cancel/{bookingId}")
    public String cancelBooking(@PathVariable Long bookingId) {
        bookingService.cancelBooking(bookingId);
        return "Booking canceled successfully!";
    }
}

