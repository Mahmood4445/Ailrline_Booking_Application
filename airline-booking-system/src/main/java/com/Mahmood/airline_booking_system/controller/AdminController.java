package com.Mahmood.airline_booking_system.controller;


import com.Mahmood.airline_booking_system.model.Flight;
import com.Mahmood.airline_booking_system.service.FlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private FlightService flightService;

    @PostMapping("/addFlight")
    public Flight addFlight(@RequestBody Flight flight) {
        return flightService.addFlight(flight);
    }

    @DeleteMapping("/deleteFlight/{flightId}")
    public String deleteFlight(@PathVariable Long flightId) {
        flightService.deleteFlight(flightId);
        return "Flight deleted successfully!";
    }

    @GetMapping("/searchFlights")
    public List<Flight> searchFlights(@RequestParam String origin, @RequestParam String destination) {
        return flightService.searchFlights(origin, destination);
    }
}

