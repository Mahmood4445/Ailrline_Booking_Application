package com.Mahmood.airline_booking_system.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String username;
    private String password;
    private String role;
    private String email;
    private String phoneNumber;

    // Add this line to ensure you have the bookings collection properly set
    @OneToMany(mappedBy = "user")
    private Collection<Booking> bookings;

    // If you don't use Lombok, add this getter manually
    public Collection<Booking> getBookings() {
        return bookings;
    }
}

