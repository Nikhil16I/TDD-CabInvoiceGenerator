package com.services;

import com.entity.InvoiceData;
import com.entity.Rides;

public class CabInvoiceGenerator {

	private static final double CostPerMIN = 1.0;
	private static final double CostPerKM = 10.0;
	private static final double MinimumFare = 5.0;

	public double CalculateFare(double distance, int time) {
		// TODO Auto-generated method stub
		double totalFare = distance * CostPerKM + time * CostPerMIN;
		if (totalFare < 5.0) {
			return MinimumFare;
		}
		return totalFare;

	}

	public InvoiceData CalculateFareMultipleRides(Rides[] rides) {
		// TODO Auto-generated method stub
		double totalFare = 0;
		for (int i = 0; i < rides.length; i++) {
			Rides ride = rides[i];
			double newfare = ride.getDistance() * CostPerKM + ride.getTime() * CostPerMIN;
			System.out.println(newfare);
			totalFare += newfare;

		}
		return new InvoiceData(rides.length, totalFare);
	}

}