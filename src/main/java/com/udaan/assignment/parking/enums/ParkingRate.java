package com.udaan.assignment.parking.enums;

public enum ParkingRate {
	
	CAR_RATE(VehicleType.SMALL_CAR, 20.00D),
	TWO_WHEELER_RATE(VehicleType.TWO_WHEELER, 10.00D);
	
	private VehicleType vehicleType;
	
	private Double ratePerHour;
	
	public Double getRatePerHour() {
		return ratePerHour;
	}

	private ParkingRate(VehicleType type, Double ratePerHour) {
		this.vehicleType = type;
		this.ratePerHour = ratePerHour;
	}
	
	public static Double getRateByVehicleType(VehicleType vehicleType) {
		Double result = null;
		for(ParkingRate parkingRate : ParkingRate.values()) {
			if(parkingRate.vehicleType.equals(vehicleType)) {
				result = parkingRate.getRatePerHour();
			}
		}
		
		return result;
	}
}
