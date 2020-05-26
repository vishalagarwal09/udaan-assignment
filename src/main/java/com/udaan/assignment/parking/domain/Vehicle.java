package com.udaan.assignment.parking.domain;

import java.io.Serializable;

import com.udaan.assignment.parking.enums.VehicleType;

import lombok.Data;

@Data
public class Vehicle implements Serializable {
	
	private static final long serialVersionUID = 2217833025153633699L;
	
	private String registrationNo;
	private String name;
	private String color;
	private VehicleType vehicleType;
	
}
