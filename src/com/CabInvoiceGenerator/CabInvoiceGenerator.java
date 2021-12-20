package com.CabInvoiceGenerator;

import java.util.Iterator;

public class CabInvoiceGenerator {
	
	static int  MinimumFare = 5;

	static final double CostPerKM = 10.0;
	static final double CostPerMIN = 1;
	
	public double CalculateFare(double Distance, double Time) {

		double TotalFare = ((Distance * CostPerKM) + (Time * CostPerMIN));
		if (TotalFare < 5) {
			System.out.println("Minimun Fare Should not less than Rs.5 ");
			return MinimumFare;
		}
		return TotalFare;
	}

	public double CalculateFareMultipleRides(Rides[] rides) {
		// TODO Auto-generated method stub
		double TotalFare =0;
		for (int i = 0; i < rides.length; i++) {
			Rides rides2=rides[i];
			double newFare=((rides2.getDistance()*CostPerKM)+(rides2.getTime()*CostPerMIN));
			TotalFare += newFare;
		} 
		return TotalFare;
	}
}
