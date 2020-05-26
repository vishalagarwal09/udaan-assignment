package com.udaan.assignment.parking.service;

import java.util.Calendar;
import java.util.Optional;

import com.udaan.assignment.parking.domain.ParkingLot;
import com.udaan.assignment.parking.domain.ParkingSpot;
import com.udaan.assignment.parking.domain.ParkingTicket;
import com.udaan.assignment.parking.domain.Vehicle;
import com.udaan.assignment.parking.exception.ParkingLotNotFoundException;
import com.udaan.assignment.parking.exception.ParkingSpotNotFoundException;
import com.udaan.assignment.parking.respository.ParkingRepository;

public class ParkingService {
	
	private static Integer TICKET_ID_COUNTER = 00001;

	public void parkvehicle(int parkingLotId, Vehicle vehicle) throws ParkingLotNotFoundException, ParkingSpotNotFoundException {
		if (ParkingRepository.availableParkingLots.containsKey(parkingLotId)) {
			ParkingSpot availableSpot = Optional.ofNullable(ParkingRepository.availableParkingLots.get(parkingLotId))
					.map(ParkingLot::getVacantSpots)
					.flatMap(set -> set.stream()
							.filter(spot -> spot.getVehicleType().equals(vehicle.getVehicleType())).findFirst())
					.orElse(null);
			if(null != availableSpot) {
				ParkingRepository.availableParkingLots.get(parkingLotId).getVacantSpots().remove(availableSpot);
				ParkingTicket parkingTicket = new ParkingTicket(TICKET_ID_COUNTER++, vehicle, availableSpot, Calendar.getInstance(), null);
				availableSpot.setCurrentParking(parkingTicket);
				ParkingRepository.availableParkingLots.get(parkingLotId).getOccuiedSpots().add(availableSpot);
				
			} else {
				throw new ParkingSpotNotFoundException(ParkingSpotNotFoundException.DEFAULT_MESSAGE);
			}
		} else {
			throw new ParkingLotNotFoundException(ParkingLotNotFoundException.DEFAULT_MESSAGE);
		}
	}
}
