package com.Mahmood.airline_booking_system.model;



import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
public class Flight {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String flightName;
    private String origin;
    private String destination;
    private Date departureDate;
    private Double price;
}

