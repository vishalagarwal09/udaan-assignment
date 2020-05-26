package com.udaan.assignment.parking.domain;

import java.io.Serializable;
import java.util.Calendar;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ParkingTicket implements Serializable{

	private static final long serialVersionUID = 8380094726265982914L;
	 
	private int ticketID;
	private Vehicle vehicle;
	private ParkingSpot parkingSpot;
	private Calendar startTime;
	private Calendar endTime;
	
}
