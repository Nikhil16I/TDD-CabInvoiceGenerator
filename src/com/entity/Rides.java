package com.entity;

public class Rides {
	double time;
	double distance;

	public Rides(double distance, double time) {
		super();
		this.time = time;
		this.distance = distance;
	}

	public double getTime() {
		return time;
	}

	public double getDistance() {
		return distance;
	}

}
