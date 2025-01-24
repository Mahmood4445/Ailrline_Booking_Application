package com.Mahmood.airline_booking_system.service;


import com.Mahmood.airline_booking_system.model.Flight;
import com.Mahmood.airline_booking_system.repository.FlightRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FlightService {

    @Autowired
    private FlightRepository flightRepository;

    public List<Flight> searchFlights(String origin, String destination) {
        return flightRepository.findByOriginAndDestination(origin, destination);
    }

    public Flight addFlight(Flight flight) {
        return flightRepository.save(flight);
    }

    public void deleteFlight(Long flightId) {
        flightRepository.deleteById(flightId);
    }
}

