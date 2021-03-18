package com.example.booking.domain;


import java.util.Date;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="ticket")
public class Ticket {
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="ticket_id")
    private Integer TicketId;
    
    @Column(name="passenger_name", nullable = false)
    private String passengerName;
    
    @Column(name="source_station")
    private String sourceStation;
    
    @Column(name="destination_station")
    private String destinationStation;
    
    @Column(name="booking_date")
    private Date bookingDate;
    
    @Column(name="email")
    private String email;
    
    @Column(name="phone_number")
    private String phoneNumber;
    public Integer getTicketId() {
        return TicketId;
    }
    
    public void setTicketId(Integer ticketId) {
        TicketId = ticketId;
    }

    public String getPassengerName() {
        return passengerName;
    }

    public void setPassengerName(String passengerName) {
        this.passengerName = passengerName;
    }

    public String getSourceStation() {
        return sourceStation;
    }

    public void setSourceStation(String sourceStation) {
        this.sourceStation = sourceStation;
    }

    public String getDestinationStation() {
        return destinationStation;
    } 

    public void setDestinationStation(String destinationStation) {
        this.destinationStation = destinationStation;
    }

    public Date getBookingDate() {
        return bookingDate;
    }

    public void setBookingDate(Date date) {
        this.bookingDate = date;
    }
 
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    } 
}
