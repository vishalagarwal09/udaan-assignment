package com.udaan.assignment.parking.exception;

public class ParkingLotNotFoundException extends Exception {

	private static final long serialVersionUID = 5457015326824922551L;
	
	public static final String DEFAULT_MESSAGE = "Parking lot could not be found.";

	public ParkingLotNotFoundException(String message) {
		super(message);
	}
}