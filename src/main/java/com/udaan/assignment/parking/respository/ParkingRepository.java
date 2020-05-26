package com.udaan.assignment.parking.respository;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import com.udaan.assignment.parking.domain.ParkingLot;
import com.udaan.assignment.parking.domain.ParkingTicket;

public class ParkingRepository {
	
	public static Map<Integer, ParkingLot> availableParkingLots = new ConcurrentHashMap<Integer, ParkingLot>();
	
	public static Map<String, List<ParkingTicket>> vehicleTicketMap = new ConcurrentHashMap<String, List<ParkingTicket>>();
}
