package com.hma.hotel.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hma.hotel.entity.Booking;

public interface BookingRepo extends JpaRepository<Booking,Long> {

    Optional<Booking> findByBookingConfirmationCode(String confirmationCode);


}
