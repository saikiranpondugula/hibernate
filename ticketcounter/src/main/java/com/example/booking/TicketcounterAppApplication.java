package com.example.booking;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.booking.domain.Ticket;
import com.example.booking.service.TicketService;

@SpringBootApplication
public class TicketcounterAppApplication  implements CommandLineRunner{
	
	 @Autowired
	    private TicketService service;
	public static void main(String[] args) {
		SpringApplication.run(TicketcounterAppApplication.class, args);
	}
	

	@Override
	public void run(String... args) throws Exception {
		Ticket ticket = new Ticket();
        ticket.setPassengerName(" saikiran  pondugula");
        ticket.setEmail("saikiran622@gmail.com");
        ticket.setSourceStation("Hyderabad-23");
        ticket.setDestinationStation("vijayawada-34");
        ticket.setBookingDate(new Date());
        service.createTicket(ticket);
       
	}
}
