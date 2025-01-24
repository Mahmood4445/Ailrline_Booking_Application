package com.Mahmood.airline_booking_system.model;

import lombok.Data;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Setter
    private Date bookingDate;
    private String flightName;
    private String destination;
    private Double price;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;  // Ensure this is present to represent the many-to-one relationship
}


