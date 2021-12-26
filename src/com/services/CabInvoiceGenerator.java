package com.services;

import java.util.HashMap;
import java.util.Map;

import com.entity.InvoiceData;
import com.entity.Rides;

public class CabInvoiceGenerator {

	public static final double MinimumFare = 5.0;

	public static final double CostPerMIN = 1.0;
	public static final double CostPerKM = 10.0;

	/* Calulating Fare */
	public double CalculateFare(double distance, int time) {
		// TODO Auto-generated method stub
		double totalFare = distance * CostPerKM + time * CostPerMIN;
		if (totalFare < 5.0) {
			return MinimumFare;
		}
		return totalFare;

	}

	/* Calculating Fare For Multiple Rides */
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

	/* Creating an Invoice summary for every User */

	public InvoiceData calculate_summary_forUser(int Userid) {
		// TODO Auto-generated method stub
		Map<Integer, Rides[]> map = new HashMap<>();//Using Hashmap to create unique key value for every user.
		Rides[] rides1 = { new Rides(3.0, 4), new Rides(0.1, 1) };
		Rides[] rides2 = { new Rides(3.0, 4), new Rides(0.1, 1) };
		
		map.put(1, rides1);
		map.put(2, rides2);
		
		for (Map.Entry<Integer, Rides[]> entry : map.entrySet()) {
			if (Userid == entry.getKey()) {
				Rides[] data = entry.getValue();
				return CalculateFareMultipleRides(data);
			}
		}
		return null;
	}
}