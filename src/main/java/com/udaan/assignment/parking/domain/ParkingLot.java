package com.udaan.assignment.parking.domain;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import lombok.Data;

@Data
public class ParkingLot implements Serializable{

	private static final long serialVersionUID = -6779590195436546110L;
	
	//Can act as tenant id to support multiple parking lots
	private int parkingLotId;
	
	Set<ParkingSpot> vacantSpots = new HashSet<ParkingSpot>(10);
	
	Set<ParkingSpot> occuiedSpots = new HashSet<ParkingSpot>(0);
	
	
	
}
