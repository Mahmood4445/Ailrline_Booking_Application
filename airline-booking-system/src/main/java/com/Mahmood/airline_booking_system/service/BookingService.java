package com.Mahmood.airline_booking_system.service;


import com.Mahmood.airline_booking_system.model.Booking;
import com.Mahmood.airline_booking_system.model.User;
import com.Mahmood.airline_booking_system.repository.BookingRepository;
import com.Mahmood.airline_booking_system.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class BookingService {

    @Autowired
    private BookingRepository bookingRepository;

    @Autowired
    private UserRepository userRepository;

    public Booking bookFlight(Long userId, String flightName, String destination, Double price) {
        User user = userRepository.findById(userId).orElseThrow(() -> new RuntimeException("User not found"));
        Booking booking = new Booking();
        booking.setBookingDate(new Date());
        booking.setFlightName(flightName);
        booking.setDestination(destination);
        booking.setPrice(price);
        booking.setUser(user);
        return bookingRepository.save(booking);
    }

    public void cancelBooking(Long bookingId) {
        bookingRepository.deleteById(bookingId);
    }
    public void setBookingDate(Date bookingDate) {
        this.bookingDate = bookingDate;
    }
}

