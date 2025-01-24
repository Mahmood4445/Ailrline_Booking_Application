package com.Mahmood.airline_booking_system.repository;



import com.Mahmood.airline_booking_system.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}

