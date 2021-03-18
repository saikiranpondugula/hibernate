package com.example.booking.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.booking.domain.Ticket;

public interface TicketBookingDao
 extends JpaRepository<Ticket, Integer> {

}

