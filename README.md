# Ailrline_Booking_Application

This is the backend implementation of an Airline Booking System built using the **Spring Framework**. The project provides APIs for managing user registrations, flight bookings, and admin operations. It includes Spring Security for authentication and authorization, and data is stored in a MySQL database.

---

## Table of Contents

- [Features](#features)
- [Technologies Used](#technologies-used)
- [Getting Started](#getting-started)
- [API Endpoints](#api-endpoints)
- [Database Schema](#database-schema)
- [Future Enhancements](#future-enhancements)
- [License](#license)

---

## Features

### User Features
- **Registration**: Users can sign up for an account.
- **Login**: Secure login with encrypted passwords.
- **Flight Search**: Search for available flights based on source and destination.
- **Booking Management**: Users can book flights, view their bookings, and cancel bookings.
- **Profile Management**: Update user profile details such as email and phone number.

### Admin Features
- **Flight Management**: Admins can add, update, or delete flight details.
- **User Management**: View and manage registered users.

### Security
- **Spring Security**: Secure endpoints with role-based access control (`USER` and `ADMIN` roles).
- **JWT Authentication**: Token-based authentication for API requests.

---

## Technologies Used

- **Backend Framework**: Spring Boot
- **Database**: MySQL
- **Security**: Spring Security with JWT
- **ORM**: Hibernate (JPA)
- **Tools**: Maven, IntelliJ IDEA

---

## Getting Started

### Prerequisites
- Java 17+
- Maven 3.6+
- MySQL 8.0+
- Postman (optional, for API testing)

### Installation

1. **Clone the Repository**
   ```bash
   git clone https://github.com/your-username/airline-booking-system.git
   cd airline-booking-system
