package com.udaan.assignment.parking.exception;

public class ParkingSpotNotFoundException extends Exception {

	private static final long serialVersionUID = -9043928928650471293L;
	
	public static final String DEFAULT_MESSAGE = "Parking spot could not be found.";

	public ParkingSpotNotFoundException(String message) {
		super(message);
	}
}