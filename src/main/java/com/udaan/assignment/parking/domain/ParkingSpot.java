package com.udaan.assignment.parking.domain;

import java.io.Serializable;

import com.udaan.assignment.parking.enums.VehicleType;

import lombok.Data;

@Data
public class ParkingSpot implements Serializable {

	private static final long serialVersionUID = 7781864929176881787L;
	 
	int spotId;
	int parkingLotId;
	private VehicleType vehicleType;
	private ParkingTicket currentParking;
	
}
