package com.Mahmood.airline_booking_system.repository;



import com.Mahmood.airline_booking_system.model.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingRepository extends JpaRepository<Booking, Long> {
}

