package com.CabInvoiceGenerator;

public class Rides {
	double Time;
	double Distance;

	public Rides(double time, double distance) {
		super();
		Time = time;
		Distance = distance;
	}

	public double getTime() {
		return Time;
	}

	/*
	 * public void setTime(double time) { Time = time; }
	 */

	public double getDistance() {
		return Distance;
	}

	/*
	 * public void setDistance(double distance) { Distance = distance; }
	 */

}
